package Recursion.PRAC;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {
    private static void arraySubsequence(int index, List<Integer>list, int[]arr, int n){

        if (index==n){
            System.out.print(list+" ");
            return;
        }
        // For pick Condition
        list.add(arr[index] );
        arraySubsequence(index+1,list,arr,n);
        list.remove(list.size()-1);

        // For Not Pick Condition
        arraySubsequence(index+1,list,arr,n);

    }

    private static void stringSubsequence(String old, String now) {
        if (old.isEmpty()) {
            System.out.print(now+" ");
            return;
        }
        char ch = old.charAt(0);
        stringSubsequence(old.substring(1), now + ch);
        stringSubsequence(old.substring(1), now);
    }

    public static void main(String[] args) {
        int []arr={1,2,3};
        int n=3;
        List<Integer>list=new ArrayList<>();
        arraySubsequence(0,list,arr,n);
        stringSubsequence("abc","");
    }
}
