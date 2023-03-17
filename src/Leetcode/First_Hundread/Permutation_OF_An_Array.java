package Leetcode.First_Hundread;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/permutations/

public class Permutation_OF_An_Array {
    List<List<Integer>> ans= new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list =new ArrayList<>();

        for(int i:nums){
            list.add(i);
        }
        permutation(list,new ArrayList<>());
        return ans;
    }
    public void permutation(List<Integer> list, List<Integer> range) {
        if (list.size() == 0) {
            ans.add(new ArrayList<>(range));
        }
        for (int i = 0; i < list.size(); i++) {
            List<Integer> newlist = new ArrayList<>(list);
            List<Integer> newrange = new ArrayList<>(range);
            newrange.add(list.get(i));
            newlist.remove(i);
            permutation(newlist, newrange);

        }
    }

    public static void main(String[] args) {
        Permutation_OF_An_Array ob=new Permutation_OF_An_Array();
        int []nums={1,2,3};

        System.out.println(ob.permute(nums));
    }
 }
