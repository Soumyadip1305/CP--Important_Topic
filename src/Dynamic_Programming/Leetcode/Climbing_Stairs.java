package Dynamic_Programming.Leetcode;

/*          https://leetcode.com/problems/climbing-stairs/description/            */

import java.util.*;

public class Climbing_Stairs {
    public static int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return solveUsingDp_with_Space_Optimization(n);
    }

//    private static int solve(int ind) {
//
//        /*  Simple Recursive Solution  */
//        if (ind == 0) {
//            return 1;
//        }
//        int left = solve(ind - 1);
//        int right = 0;
//        if (ind > 1) {
//            right = solve(ind - 2);
//        }
//        return left + right;
//    }

    private static int solveUsingDp(int ind, int[] dp) {

        /*  Using Dp   */
        if (ind == 0) {
            return 1;
        }
        if (dp[ind] != -1) {
            return dp[ind];
        }
        int left = solveUsingDp(ind - 1, dp);
        int right = 0;
        if (ind > 1) {
            right = solveUsingDp(ind - 2, dp);
        }

        return dp[ind] = left + right;
    }

    private static int solveUsingDp_with_Space_Optimization(int ind) {

        /*   Space Optimization    */
        int prev = 1;
        int prev2 = 1;
        int curi=1;
        for (int i = 2; i <= ind; i++) {
             curi = prev + prev2;
             prev2=prev;
             prev=curi;

        }
        return prev;
    }


    public static void main(String[] args) {
        int n = 3;
        System.out.println(climbStairs(n));
    }
}
