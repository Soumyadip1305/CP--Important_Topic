package Dynamic_Programming;

import java.util.*;

public class Frog_Jump {
    public static int frogJump(int n, int heights[]) {
//       int[]dp=new int[n+1];
//        Arrays.fill(dp,-1);
//        return solve(n-1,heights,dp);



        /*  USing Tabulation Method ::-->>  */
        int[]dp=new int[n];
        Arrays.fill(dp,0);
        dp[0]=0;
        for (int i = 1; i < n; i++) {
            int fs=dp[i-1]+Math.abs(heights[i-1]-heights[i]);
            int ss=Integer.MAX_VALUE;
            if (i>1){
                ss=dp[i-2]=Math.abs(heights[i-2]-heights[i]);
            }
            dp[i]=Math.min(fs,ss);
        }
      return dp[n-1];
    }
    public static int solve(int ind, int []arr, int[]dp){
        if(ind==0){
            return 0;
        }
        if(dp[ind]!=-1){return dp[ind];}
       int left= solve(ind-1,arr,dp)+ Math.abs(arr[ind] - arr[ind - 1]);
        int right=Integer.MAX_VALUE;
        if(ind>1){
             right= solve(ind-2,arr,dp)+ Math.abs(arr[ind] - arr[ind - 2]);
        }
        return dp[ind]=Math.min(left,right);
    }

    public static void main(String[] args) {
        int n=4;int[]h={10 ,50 ,10};
        System.out.println(frogJump(n-1,h));
    }
}
