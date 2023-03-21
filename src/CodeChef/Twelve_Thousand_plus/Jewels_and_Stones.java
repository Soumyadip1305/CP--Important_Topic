package CodeChef.Twelve_Thousand_plus;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Jewels_and_Stones {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int tc = Sc.nextInt();
        while (tc-- > 0) {
            String j = Sc.next();
            String s = Sc.next();
            int count = 0;
            Set<Character> jewelSet = new HashSet<>();
            for (char c : j.toCharArray()) {
                jewelSet.add(c);
            }
            for (char c : s.toCharArray()) {
                if (jewelSet.contains(c)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

