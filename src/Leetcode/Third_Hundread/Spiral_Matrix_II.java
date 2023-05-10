package Leetcode.Third_Hundread;

import java.util.Arrays;
// https://leetcode.com/problems/spiral-matrix-ii/description/
public class Spiral_Matrix_II {
    public static int[][] generateMatrix(int n) {
        int[][]mat=new int[n][n];
        int rowStart = 0;
        int rowEnd = mat.length-1;
        int colStart = 0;
        int colEnd = mat[0].length-1;int x=1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colStart; i <= colEnd; i++) {
                mat[rowStart][i] = x;
                x++;
            }
            rowStart++;
            for (int i = rowStart; i <= rowEnd; i++) {
                mat[i][colEnd]=x;x++;
            }
            colEnd--;
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    mat[rowEnd][i]=x;x++;
                }
                rowEnd--;
            }
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    mat[i][colStart]=x;x++;
                }
                colStart++;
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(1)));
    }
}
