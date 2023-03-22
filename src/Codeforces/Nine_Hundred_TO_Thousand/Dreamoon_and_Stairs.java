package Codeforces.Nine_Hundred_TO_Thousand;

import java.util.Scanner;

//  https://codeforces.com/problemset/problem/476/A

public class Dreamoon_and_Stairs {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int m = Sc.nextInt();
        int x = n / 2;
        int y = n % 2;

        int ans = -1;
        while (x >= 0) {
            int moves = x + y;
            if (moves % m == 0) {
                ans = moves;
                break;
            }
            x--;
            y += 2;
        }

        System.out.println(ans);
    }
}
