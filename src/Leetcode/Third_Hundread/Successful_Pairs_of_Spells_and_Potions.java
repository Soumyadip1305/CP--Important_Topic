package Leetcode.Third_Hundread;

/*  https://leetcode.com/problems/successful-pairs-of-spells-and-potions/*/

import java.util.Arrays;

public class Successful_Pairs_of_Spells_and_Potions {
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[]pairs=new int[spells.length];
        Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            int low = 0, high = potions.length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                long prod = (long) spells[i] * potions[mid];
                if (prod >= success) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            pairs[i] = potions.length - low;
        }
        return pairs;
    }

    public static void main(String[] args) {
       int[] spells = {5,1,3}, potions = {1,2,3,4,5};long success = 7;
        System.out.println(Arrays.toString(successfulPairs(spells,potions,success)));
    }
}
