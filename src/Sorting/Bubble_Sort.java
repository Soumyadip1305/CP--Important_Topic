package Sorting;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 3, 2, 5};
//        Bubble_sort(arr);
//        System.out.println(Arrays.toString(arr));
        bubbleSort_Using_Rec(arr,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


    static void Bubble_sort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    static void bubbleSort_Using_Rec(int[] array, int endIndex) {
        if (endIndex == 0)
            return;
        for (int i = 0; i < endIndex; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        bubbleSort_Using_Rec(array, endIndex - 1);
    }
}