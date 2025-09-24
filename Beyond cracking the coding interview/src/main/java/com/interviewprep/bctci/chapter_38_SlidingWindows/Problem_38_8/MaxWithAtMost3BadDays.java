package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_8;

public class MaxWithAtMost3BadDays {
    public static int find(int[] sales) {
        int l = 0, r = 0;
        int badDays = 0, maxPeriodLen = 0;
        while (r < sales.length) {
            if (sales[r] < 10 && badDays >= 3) {
                if (sales[l] < 10) {
                    badDays--;
                }
                l++;
            } else {
                if (sales[r] < 10) {
                    badDays++;
                }
                r++;
                maxPeriodLen = Math.max(maxPeriodLen, r - l);
            }
        }

        return maxPeriodLen;
    }
}
