package CodeChef;

import java.util.Scanner;

public class X_Jumps {
    public static void main(String[] args) {
        Scanner Sc=new Scanner( System.in);
        int n=Sc.nextInt();
        while (n-->0){
            int x=Sc.nextInt();
            int y=Sc.nextInt();
            if (x<y){
                System.out.println(x);
            } else  {
                if (x%y==0){
                    System.out.println(x/y);
                }else {
                    int r=x/y;
                    int z=x-r*y;
                    System.out.println(r+z);
                }
            }
        }
    }
}
