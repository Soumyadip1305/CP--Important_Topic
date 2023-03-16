package Sorting;

import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 6, 4, 2, 1, 5, 7, 3};
        quick_sort(arr, 0, arr.length - 1);
        System.out.print("Your Sorted Array is ");
        System.out.println(Arrays.toString(arr));
    }
    static void quick_sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int s = low;
        int e = high;
        int mid = s + (e - s) / 2;
        int pivot = arr[mid];
        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        quick_sort(arr, low, e);
        quick_sort(arr, s, high);
    }
}
