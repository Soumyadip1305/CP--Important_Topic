package Recursion.PRAC;

import java.util.ArrayList;
import java.util.List;

//   https://leetcode.com/problems/combination-sum/

public class Combination_Sum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>>ans=new ArrayList<>();
        print(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }


    private static void print(int ind, int[]arr, int target, List<Integer>list, List<List<Integer>> ans){

        if (ind==arr.length){
            if (target==0){
                ans.add(new ArrayList<>(list));
            }return;
        }

        if (arr[ind]<=target){
            list.add(arr[ind]);
            print(ind,arr,target-arr[ind],list,ans);
            list.remove(list.size()-1);
        }
            print(ind+1,arr,target,list,ans);

    }

    public static void main(String[] args) {
        int []arr={2,3,6,7};
        System.out.println(combinationSum(arr,7));
    }
}