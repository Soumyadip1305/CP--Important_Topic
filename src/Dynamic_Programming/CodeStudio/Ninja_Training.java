package Dynamic_Programming.CodeStudio;
// https://www.codingninjas.com/codestudio/problems/ninja-s-training_3621003?source=youtube&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dp_videos&leftPanelTab=1
public class Ninja_Training {

            /*  Amazing Concept */


    static int f(int day, int last, int[][] points, int[][] dp) {

        if (dp[day][last] != -1) return dp[day][last];

        if (day == 0) {
            int maxi = 0;
            for (int i = 0; i <= 2; i++) {
                if (i != last)
                    maxi = Math.max(maxi, points[0][i]);
            }
            return dp[day][last] = maxi;
        }

        int maxi = 0;
        for (int i = 0; i <= 2; i++) {
            if (i != last) {
                int activity = points[day][i] + f(day - 1, i, points, dp);
                maxi = Math.max(maxi, activity);
            }

        }

        return dp[day][last] = maxi;
    }

    static int ninjaTraining(int n, int[][] points) {

//        int [][]dp = new int[n][4];
//        for (int[] row: dp)
//            Arrays.fill(row, -1);
//
//        return f(n - 1, 3, points, dp);

        /*         Tabulation Method    */

        int[][] dp = new int[n][4];
        dp[0][0]=Math.max(points[0][1],points[0][2]);
        dp[0][1]=Math.max(points[0][0],points[0][2]);
        dp[0][2]=Math.max(points[0][0],points[0][1]);
        dp[0][3]=Math.max(points[0][0],Math.max(points[0][1],points[0][2]));
        for (int day = 1; day <= n-1; day++) {
            for (int last = 0; last <= 3; last++) {
                for (int i = 0; i <= 2; i++) {
                    if (i != last) {
                        int activity = points[day][i] + dp[day - 1][i];
                        dp[day][last] = Math.max(dp[day][last], activity);
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(dp[i][j]+" " );
            }
            System.out.println();
        }
        return dp[n - 1][3];
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] arr = {{1, 2, 5},
                {3, 1, 1},
                {3, 3, 3}};
        System.out.println(ninjaTraining(n, arr));
    }
}
