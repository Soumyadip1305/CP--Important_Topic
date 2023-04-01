package Codeforces.Nine_Hundred_TO_Thousand;

//   https://codeforces.com/problemset/problem/1353/C

import java.util.Scanner;

public class Board_Moves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            long moves = 0;
            for (int i = 0; i < n; i++) {
                int center = (n - 1) / 2;
                int distance = Math.abs(i - center);
                moves += (long) distance * (n - distance);
            }
            System.out.println(moves*2);
        }
    }
}
