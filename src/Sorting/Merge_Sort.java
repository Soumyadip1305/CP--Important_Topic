package Sorting;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int []Array={2,5,7,9,11,3,4,6,8,10,1};
        Array= marge_sort(Array);
         System.out.println(Arrays.toString(Array));
    }

    public static int[] marge_sort(int []arr){
        if (arr.length==1){
            return arr;
        }int mid=arr.length/2;
        int[] left=marge_sort(Arrays.copyOfRange(arr,0,mid));
        int []right=marge_sort(Arrays.copyOfRange(arr,mid,arr.length));
        return marge(left,right);
    }
    private static int[]marge(int []left,int[]right){
        int[] mix=new int[left.length+right.length];

        int i=0,j=0,k=0;
        while (i< left.length&&j< right.length){
            if (left[i]<right[j]){
                mix[k]=left[i];
                i++;
            }else {
                mix[k]=right[j];
                j++;
            }
            k++;
        }
        while (i< left.length){
            mix[k]=left[i];
            i++;k++;
        }
        while (j< right.length){
            mix[k]=right[j];
            j++;k++;
        }
        return mix;
    }
}
