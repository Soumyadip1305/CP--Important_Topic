package Sorting;

import java.util.Scanner;

public class Insertion_Sort {
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter Your array Size : ");
        int size=Sc.nextInt();
        int Array[]=new int[size];
        System.out.println("Enter Your Array Elements ");
        for (int i=0;i< Array.length;i++){
            Array[i]=Sc.nextInt();
        }System.out.print("Your Unsorted Array is ");
        for (int i=0;i< Array.length;i++){
            System.out.print(Array[i]+" ");
        }
        for (int i=1;i< Array.length;i++){
            int Current=Array[i];
            int j=i-1;
            while (j>=0&&Array[j]>Current){
            Array[j+1]=Array[j];
                j--;
            }Array[j+1]=Current;
        }
        System.out.println();
        System.out.print("Your Sorted Array is ");
        for (int i=0;i<Array.length;i++){
            System.out.print(Array[i]+" ");
        }
    }
    
    
    //  InsertionSort using Recursion -_-_-_-_-_-_-_-_-_-
    
     public static void insertionRec(int []arr,int n){
        if (n<=1){
            return;
        }
        int j=n-2;
        int last=arr[n-1];
        while (j>=0&&arr[j]>last){
            arr[j+1]=arr[j];
            j--;
        }arr[j+1]=last;
    }
}
