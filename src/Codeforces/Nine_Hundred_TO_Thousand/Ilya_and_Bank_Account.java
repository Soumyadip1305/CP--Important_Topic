package Codeforces.Nine_Hundred_TO_Thousand;

import java.util.Scanner;

// https://codeforces.com/problemset/problem/313/A

public class Ilya_and_Bank_Account {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        if (n<0){
            n=Math.abs(n);
           int a=n%10;
           int x=(n-a)/10;
           int y=(x-(x%10))+a;
            System.out.println((-1)*Math.min(x,y));
        }else {
            System.out.println(n);
        }
    }
}