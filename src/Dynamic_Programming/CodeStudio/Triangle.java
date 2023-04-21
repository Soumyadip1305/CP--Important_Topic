package Dynamic_Programming.CodeStudio;

import java.util.Arrays;

public class Triangle {
    public static int minimumPathSum(int[][] triangle, int n) {
        int[][] dp = new int[n][n];

        /*    Tabulation    */
//        for(int j=0;j<n;j++){
//            dp[n-1][j] = triangle[n-1][j];
//        }
//        for (int i = n-2; i >= 0; i--) {
//            for (int j = i; j >=0; j--) {
//
//                int down = triangle[i][j] +dp[i+1][j];
//                int diagonal = triangle[i][j] + dp[i+1][j+1];
//                 dp[i][j] = Math.min(down, diagonal);
//            }
//        }
//        return dp[0][0];

        /*           Space Optimization      */
        int[] front = new int[n];
        for (int i = 0; i < n; i++) {
            front[i] = triangle[n - 1][i];
        }
        for (int i = n - 2; i >= 0; i--) {
            int []curr=new int[n];
            for (int j = i; j >= 0; j--) {
                int down = triangle[i][j] + front[j];
                int diagonal = triangle[i][j] + front[j + 1];
                curr[j] = Math.min(down, diagonal);
            }
            front=curr;
        }return front[0];
    }

    private static int solve(int i, int j, int[][] triangle, int[][] dp) {
        if (i == triangle.length - 1) {
            return triangle[triangle.length - 1][j];
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int down = triangle[i][j] + solve(i + 1, j, triangle, dp);
        int diagonal = triangle[i][j] + solve(i + 1, j + 1, triangle, dp);
        return dp[i][j] = Math.min(down, diagonal);
    }

    public static void main(String[] args) {
        int[][] triangle = {{1},
                                {2, 3},
                                {3, 6, 7},
                                {8, 9, 6, 10}};
        System.out.println(minimumPathSum(triangle, triangle.length));
    }
}
