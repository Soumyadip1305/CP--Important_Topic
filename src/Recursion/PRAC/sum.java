package Recursion.PRAC;

import java.util.ArrayList;
import java.util.List;

public class sum {

    private static void print(int ind, List<Integer> list, int s, int sum, int[] arr, int n) {
        if (ind == n) {
            if (s == sum) {
                System.out.println(list);
            }
            return;
        }
        list.add(arr[ind]);
        s += arr[ind];
        print(ind + 1, list, s, sum, arr, n);
        s -= arr[ind];
        list.remove(list.size() - 1);

        // Not Pick
        print(ind + 1, list, s, sum, arr, n);
    }

    private static boolean print_One(int ind, List<Integer> list, int s, int sum, int[] arr, int n) {
        if (ind == n) {
            if (s == sum) {
                System.out.println(list);return true;
            }
            else return false;
        }
        list.add(arr[ind]);
        s += arr[ind];
        if (print_One(ind + 1, list, s, sum, arr, n)){
            return true;
        }
        s -= arr[ind];
        list.remove(list.size() - 1);

        // Not Pick
        return print_One(ind + 1, list, s, sum, arr, n);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 5;
        int sum = 5;
        List<Integer> list = new ArrayList<>();
    //    print(0, list, 0, sum, arr, n);
        print_One(0, list, 0, sum, arr, n);
    }
}