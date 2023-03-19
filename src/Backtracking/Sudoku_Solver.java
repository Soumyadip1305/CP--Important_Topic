package Backtracking;

public class Sudoku_Solver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        if (solved(board)) {
            display(board);
        } else {
            System.out.println("Not solved The Sudoku");
        }
    }

    static boolean solved(int[][] board) {
        int n = board.length;
        int r = -1;
        int c = -1;
        boolean emptyLeft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    r = i;
                    c = j;
                    emptyLeft = false;
                    break;
                }
            }
            if (!emptyLeft) {
                break;
            }
        }
        if (emptyLeft) {
            return true;
        }
        // Sudoku is Solved
        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, r, c, number)) {
                board[r][c] = number;
                if (solved(board)) {
                    return true;
                } else {
                    board[r][c] = 0;
                }
            }
        }
        return false;
    }

    static void display(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] board, int row, int col, int num) {
        for (int i = 0; i < board.length - 1; i++) {
            if (board[row][col] == num) {
                return false;
            }
        }
        for (int[] nums : board) {
            if (nums[col] == num) {
                return false;
            }
        }
        int Sqrt = (int) (Math.sqrt(board.length));

        int rowStart = row - row % Sqrt;
        int colStart = col - col % Sqrt;
        for (int r = rowStart; r < rowStart + Sqrt; r++) {
            for (int c = colStart; c < colStart + Sqrt; c++) {
                if (board[r][c] == num) {
                    return false;
                }
            }
        }
        return true;
    }

}
