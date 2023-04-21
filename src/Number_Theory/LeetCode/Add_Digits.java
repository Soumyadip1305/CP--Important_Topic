package Number_Theory.LeetCode;

import java.util.Scanner;
   //   https://leetcode.com/problems/add-digits/

     /* Amazing Concept  */
public class Add_Digits {
    public static int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        int dr = num % 9;
        return dr == 0 ? 9 : dr;
    }

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println(addDigits(Sc.nextInt()));
    }
}
