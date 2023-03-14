package CodeChef.Twelve_Thousand_plus;

//https://www.codechef.com/problems/TRUEDARE

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Truth_and_Dare {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int tc = Sc.nextInt();
        while (tc-->0){
            int n=Sc.nextInt();
            List<Integer> truth =new ArrayList<>();
            for (int i = 0; i < n; i++) {
                truth.add(Sc.nextInt());
            }
            int m=Sc.nextInt();
            List<Integer>dare=new ArrayList<>();
            for (int i = 0; i < m; i++) {
                dare.add(Sc.nextInt());
            }
            int o=Sc.nextInt();
            List<Integer>  truth2 =new ArrayList<>();
            for (int i = 0; i < o; i++) {
                truth2.add(Sc.nextInt());
            }
            int p=Sc.nextInt();
            List<Integer>dare2=new ArrayList<>();
            for (int i = 0; i < p; i++) {
                dare2.add(Sc.nextInt());
            }boolean ans=true;
            for (int i = 0; i < o; i++) {
                if (!truth.contains(truth2.get(i))) {
                    ans=false;
                }
            }
            for (int i = 0; i < p; i++) {
                if (!dare.contains(dare2.get(i))){
                    ans=false;
                }
            }
            System.out.println(ans?"yes":"no");
        }
    }
}
