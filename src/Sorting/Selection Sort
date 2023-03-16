package Sorting;

import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter Your Array size :~ ");
        int Size = S.nextInt();
        int[] Array = new int[Size];
        // Input Array elements
        System.out.print("Enter Your Array Elements :~ ");
        for (int i = 0; i < Size; i++) {
            Array[i] = S.nextInt();
        } // Print Unsorted Array
        System.out.print("Your Unsorted Array is :~ ");
        for (int k : Array) {
            System.out.print(k + " ");
        }
        System.out.println();


        // selection Sort
        for (int i=0;i< Array.length-1;i++){
            int min=Array[i];
            int pos=i;
            for (int j=i;j<Array.length;j++){
                if (min>Array[j]){
                    min=Array[j];
                    pos=j;
                }
            } // Swapping
            int temp=Array[i];
            Array[i]= Array[pos];
            Array[pos]=temp;
        }


        System.out.println(); // Print Sorted Array
        System.out.print("Your Sorted Array is :~ ");
        for (int j : Array) {
            System.out.print(j + " ");
        }
    }
    
    // Another Amazing concept _-_-_-_-_-_-_-_-_-_-_
    
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;
            int maxIndex = getMax(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static int getMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
    
    // Using Recursion  -_-_-_-_-_-_-_-_-
    
    public static void SelectionSort(int[] arr, int i, int j) {
        int n = arr.length - 1;
        if (i == n) {
            return;
        }
        if (arr[i] > arr[j]) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        if (j == n) {
            SelectionSort(arr, i + 1, i + 2);
        } else {
            SelectionSort(arr, i, j + 1);
        }
}
