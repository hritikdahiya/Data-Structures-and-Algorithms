package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_18;

public class CountSubarraysWithAtMostKBadDays {
    public static int count(int[] sales, int k) {
        int subArrayCount = 0;
        int l = 0, r = 0, badDays = 0;
        while (r < sales.length) {
            // can increase window
            if (sales[r] >= 10 || badDays < k) {
                if (sales[r] < 10) {
                    badDays++;
                }
                r++;
                // array from l (inc) to r (exc) has r-l possible subarrays
                subArrayCount += (r - l);
            } else {
                // shrink window
                if (sales[l] < 10) {
                    badDays--;
                }
                l++;
            }
        }

        return subArrayCount;
    }
}
