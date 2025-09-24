package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_5;

public class LongestGoodDayStreak {
    public static int find(int[] sales) {
        int l = 0, r = 0;
        int longestStreak = 0;
        while (r < sales.length) {
            // bad day - reset window
            if (sales[r] < 10) {
                l = r + 1;
                r++;
            } else {
                r++;
                longestStreak = Math.max(longestStreak, r - l);
            }
        }

        return longestStreak;
    }
}
