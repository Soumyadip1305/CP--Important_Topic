package Recursion.PRAC;

import java.util.ArrayList;
import java.util.Collections;


public class Subset_Sum {
    static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N) {
        ArrayList<Integer> list = new ArrayList<>();
        func(0,0,arr,N,list);
        Collections.sort(list);
        return list;
    }
    static void func(int ind, int sum, ArrayList<Integer> list, int N, ArrayList<Integer> subsetSum) {
        if (ind == N) {
            subsetSum.add(sum);
            return;
        }
        // pick the element
        func(ind + 1, sum + list.get(ind), list, N, subsetSum);

        // Not pick
        func(ind + 1, sum, list, N, subsetSum);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);list.add(2);list.add(1);
        System.out.println(subsetSums(list,list.size()));
    }
}
