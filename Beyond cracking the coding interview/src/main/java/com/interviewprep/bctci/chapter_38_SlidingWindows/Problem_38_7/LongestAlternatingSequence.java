package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_7;

public class LongestAlternatingSequence {
    public static int find(int[] sales) {
        int l = 0, r = 0;
        int maxLen = 0;
        while (r < sales.length) {
            // alternating sequence continues - expand the window
            if (l == r ||
                    (isGoodDay(sales[r]) && !isGoodDay(sales[r - 1])) ||
                    (!isGoodDay(sales[r]) && isGoodDay(sales[r - 1]))) {
                r += 1;
                maxLen = Math.max(maxLen, r - l);
            }
            // alternating sequence breaks
            else {
                l = r;
            }
        }

        return maxLen;
    }

    private static boolean isGoodDay(int sale) {
        return sale >= 10;
    }
}
