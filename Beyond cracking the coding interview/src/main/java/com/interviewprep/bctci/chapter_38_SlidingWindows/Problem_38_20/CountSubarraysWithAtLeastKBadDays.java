package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_20;

import com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_18.CountSubarraysWithAtMostKBadDays;

public class CountSubarraysWithAtLeastKBadDays {
    public static int countReusingAtMostKSolution(int[] sales, int k) {
        // n * (n + 1) / 2
        int n = sales.length;
        int maxSubArrays = Math.floorDiv(n * (n + 1), 2);
        if (k == 0 || n == 0) {
            return maxSubArrays;
        }

        return maxSubArrays - CountSubarraysWithAtMostKBadDays.count(sales, k - 1);
    }
}
