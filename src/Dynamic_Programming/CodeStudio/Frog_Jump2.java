package Dynamic_Programming.CodeStudio;

/*      https://atcoder.jp/contests/dp/tasks/dp_b       */

import java.util.Arrays;

public class Frog_Jump2 {
    private static int f(int ind, int[] arr, int k, int[] dp) {
        if (ind == 0) {
            return 0;
        }
        if (dp[ind] != -1) {
            return dp[ind];
        }
        int minStep = Integer.MAX_VALUE;
        for (int i = 1; i <= k; i++) {
            if (ind - i >= 0) {
                int jump = f(ind - i, arr, k, dp) + Math.abs(arr[ind] - arr[ind - i]);
                minStep = Math.min(jump, minStep);
            }
        }
        return dp[ind] = minStep;
    }

    private static int f2(int ind, int[] arr, int k, int[] dp) {
        if (ind == 0) {
            return 0;
        }
        int minStep = Integer.MAX_VALUE;
        for (int i = 1; i <= k; i++) {
            if (ind - i >= 0) {
                int jump = f(ind - i, arr, k, dp) + Math.abs(arr[ind] - arr[ind - i]);
                minStep = Math.min(jump, minStep);
            }
        }
        return minStep;
    }

    /*    Tabulation Method   */
    private static int f1(int n, int[] arr, int k, int[] dp) {
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            int minStep = Integer.MAX_VALUE;
            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    int jump = dp[i - j] + Math.abs(arr[i] - arr[i - j]);
                    minStep = Math.min(jump, minStep);
                }
            }
            dp[i] = minStep;
        }
        return dp[n - 1];
    }

    static int solve(int n, int[] height, int k) {
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        //  return f(n-1, height, k, dp);
        return f1(n, height, k, dp);
        // return f2(n -1, height, k, dp);
    }


    public static void main(String[] args) {

        int[] height = {10, 30, 40, 50, 20};
        int n = height.length;
        int k = 3;
        System.out.println(solve(n, height, k));
    }
}
