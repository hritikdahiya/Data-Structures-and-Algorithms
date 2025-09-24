package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_14;

public class ShortestPeriodWithOver20Sales {
    public static int findShortestPeriod(int[] sales) {
        int l = 0, r = 0;
        int minLength = Integer.MAX_VALUE;
        int currSum = 0;

        while (true) {
            if (currSum <= 20) {
                if (r == sales.length) {
                    break;
                }
                currSum += sales[r++];
            } else {
                minLength = Math.min(minLength, r - l);
                currSum -= sales[l++];
            }
        }

        return minLength != Integer.MAX_VALUE ? minLength : -1;
    }
}
