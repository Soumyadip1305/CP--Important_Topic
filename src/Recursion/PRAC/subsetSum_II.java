package Recursion.PRAC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// https://leetcode.com/problems/subsets-ii/

public class subsetSum_II {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>list=new ArrayList<>();
        findSubsetSum(0,nums,new ArrayList<>(),list);
        return list;
    }
    private static void findSubsetSum(int ind, int[] arr, List<Integer> list, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(list));

        for (int i = ind; i < arr.length; i++) {
            if (i > ind && arr[i] == arr[i - 1]) {
                continue;
            }
            list.add(arr[i]);
            findSubsetSum(i + 1, arr, list, ans);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[]arr={1,2,2};
        System.out.println(subsetsWithDup(arr));
    }
}
