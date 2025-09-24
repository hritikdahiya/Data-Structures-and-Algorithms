package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_12;

import java.util.HashMap;
import java.util.Map;

public class LongestPeriodAtMostKDistinct {
    public static int calculateLongestPeriod(String[] bestSellers, int k) {
        if (bestSellers.length == 0 || k == 0) {
            return 0;
        }

        Map<String, Integer> freqMap = new HashMap<>();

        int l = 0, r = 0;
        int maxLen = 0;
        while (r < bestSellers.length) {
            if (freqMap.containsKey(bestSellers[r]) || freqMap.size() < k) {
                freqMap.compute(bestSellers[r], (String key, Integer val) -> val == null ? 1 : val + 1);
                r++;
                maxLen = Math.max(maxLen, r - l);
            } else {
                freqMap.compute(bestSellers[l], (String key, Integer val) -> val == 1 ? null : val - 1);
                l++;
            }
        }

        return maxLen;
    }
}
