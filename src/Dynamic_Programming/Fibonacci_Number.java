package Dynamic_Programming;

import java.util.*;

public class Fibonacci_Number {
    static int fibonacci(int n, ArrayList<Integer>dp){
        if (n<=1){
            return n;
        }
        if (dp.get(n)!=-1){
            return dp.get(n);
        }
        int fib = fibonacci(n-1,dp) + fibonacci(n-2,dp);
        dp.set(n, fib);
        return fib;
    }
    static int fib(int n) {
        /* Declare an array to store Fibonacci numbers. */
        int f[] = new int[n+2];

        /* 0th and 1st number of the series are 0 and 1*/
        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i <= n; i++)
        {
       /* Add the previous 2 numbers in the series and store it */
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        ArrayList<Integer>dp=new ArrayList<>(Collections.nCopies(n+1, -1));
        System.out.println(fibonacci(n,dp));

        System.out.println(fib(n));

        // Optimize The space
        int prev=0;
        int prev2=1;
        for (int i = 2; i <=n+1 ; i++) {
            int cur=prev+prev2;
            prev2=prev;
            prev=cur;
        }
        System.out.println(prev);
    }
}
