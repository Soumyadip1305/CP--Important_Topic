package Dynamic_Programming.CodeStudio;

import java.util.ArrayList;
import java.util.Arrays;

public class Maximum_sum_of_non_adjacent_elements {
    public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
//        int n=nums.size();
//        int[]dp=new int[n];
//        Arrays.fill(dp,-1);
//        return solveUsing_Dp(n-1,nums,dp);

//        /*   <<<<<=====     USing Tabulation   =====>>>>>>   */
//        int n = nums.size();
//        int[] dp = new int[n];
//        dp[0] = nums.get(0);
//        for (int i = 1; i < n; i++) {
//            int take = nums.get(i);
//            if (i > 1) {
//                take += dp[i - 2];
//            }
//            int nonTake = dp[i - 1];
//            dp[i] = Math.max(take, nonTake);
//        }
//        return dp[n - 1];
//

        /*     <<<<<=====    Space Optimization   =====>>>>>           */

        int prev = nums.get(0);
        int prev2 = 0;
        for (int i = 1; i < nums.size(); i++) {
            int take = nums.get(i);
            if (i > 1) {
                take += prev2;
            }
            int notTake = prev;
            int curri = Math.max(take, notTake);
            prev2 = prev;
            prev = curri;
        }
        return prev;
    }

    static int solve(int ind, ArrayList<Integer> nums) {
        if (ind == 0) {
            return nums.get(ind);
        }
        if (ind < 0) {
            return 0;
        }
        int pick = nums.get(ind) + solve(ind - 2, nums);
        int notPick = solve(ind - 1, nums);
        return Math.max(pick, notPick);
    }

    static int solveUsing_Dp(int ind, ArrayList<Integer> nums, int[] dp) {
        if (ind == 0) {
            return nums.get(ind);
        }
        if (ind < 0) {
            return 0;
        }
        if (dp[ind] != -1) {
            return dp[ind];
        }
        int pick = nums.get(ind) + solveUsing_Dp(ind - 2, nums, dp);
        int notPick = solveUsing_Dp(ind - 1, nums, dp);
        return dp[ind] = Math.max(pick, notPick);
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(9);
        System.out.println(maximumNonAdjacentSum(list));
    }
}
