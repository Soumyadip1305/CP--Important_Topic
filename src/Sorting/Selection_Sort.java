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
}
