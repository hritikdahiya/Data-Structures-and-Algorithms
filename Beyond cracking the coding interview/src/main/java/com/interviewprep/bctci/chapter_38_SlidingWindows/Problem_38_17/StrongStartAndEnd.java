package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_17;

import java.util.Arrays;

class StrongStartAndEnd {
    // Reframe the problem
    public static int calculateMaxGoodDays(int[] projectedSales, int k) {
        int badDays = Math.toIntExact(Arrays.stream(projectedSales).filter(val -> val < 10).count());

        if (badDays <= k) {
            return projectedSales.length;
        }

        int remainingBadDays = badDays - k;
        // find the smallest subarray with (remainingBadDays) number of bad days
        int l = 0, r = 0;
        int minLen = Integer.MAX_VALUE, currBadDays = 0;
        while (true) {
            if (currBadDays < remainingBadDays) {
                if (r == projectedSales.length) {
                    break;
                }
                if (projectedSales[r] < 10) {
                    currBadDays++;
                }
                r++;
            } else {
                minLen = Math.min(minLen, r - l);
                if (projectedSales[l] < 10) {
                    currBadDays--;
                }
                l++;
            }
        }

        return projectedSales.length - minLen;
    }
}
