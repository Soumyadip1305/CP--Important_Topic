package Codeforces.Nine_Hundred_TO_Thousand;

import java.util.*;

// https://codeforces.com/problemset/problem/43/A


public class Football_ {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Sc.next();
        }
        Map<String, Integer> freqMap = new HashMap<>();
        int maxFreq = 0;
        for (String s : arr) {
            int freq = freqMap.getOrDefault(s, 0) + 1;
            freqMap.put(s, freq);
            maxFreq = Math.max(maxFreq, freq);
        }

      //  List<String> mostFrequent = new ArrayList<>();
        for (String s : freqMap.keySet()) {
            if (freqMap.get(s) == maxFreq) {
                System.out.println(s);break;
            }
        }

//        Collections.sort(mostFrequent);
//        System.out.println(mostFrequent.get(0));
    }
}