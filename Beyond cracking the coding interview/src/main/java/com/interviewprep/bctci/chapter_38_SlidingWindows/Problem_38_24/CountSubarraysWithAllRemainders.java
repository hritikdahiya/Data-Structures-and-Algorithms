package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_24;

import java.util.HashMap;
import java.util.Map;

public class CountSubarraysWithAllRemainders {
    // find all subarrays and subtract subarrays which do not have all remainder
    // easier to find number of subarrays which have at most 2 remainders (out of 3 i.e. 0, 1, or 2)
    public static int count(int[] arr) {
        int n = arr.length;
        int maximumSubarrays = Math.floorDiv(n * (n + 1), 2);

        return maximumSubarrays - countAtMost2Groups(arr);
    }

    private static int countAtMost2Groups(int[] arr) {
        // holds number of elements which have remainder as 1 , 2, or 3
        Map<Integer, Integer> freqMap = new HashMap<>();

        int l = 0, r = 0, count = 0;
        while (r < arr.length) {
            int numGroups = freqMap.size();
            if (freqMap.containsKey(arr[r] % 3) || numGroups < 2) {
                freqMap.compute(arr[r] % 3, (Integer k, Integer v) -> v == null ? 1 : v + 1);
                r++;
                count += r - l;
            } else {
                freqMap.compute(arr[l] % 3, (Integer k, Integer v) -> v == 1 ? null : v - 1);
                l++;
            }
        }

        return count;
    }
}
