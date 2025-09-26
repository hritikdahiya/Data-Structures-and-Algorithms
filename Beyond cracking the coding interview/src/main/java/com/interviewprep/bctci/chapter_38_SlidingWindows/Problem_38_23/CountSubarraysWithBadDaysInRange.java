package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_23;

public class CountSubarraysWithBadDaysInRange {
    public static int count(int[] sales, int k1, int k2) {
        // guarantee k1 is smaller than k2
        if (k1 > k2) {
            return count(sales, k2, k1);
        }
        if (k1 == 0) {
            return findAtMostKBadDays(sales, k2);
        }

        return Math.abs(findAtMostKBadDays(sales, k2) - findAtMostKBadDays(sales, k1 - 1));
    }

    private static int findAtMostKBadDays(int[] sales, int k) {
        int l = 0, r = 0, badDays = 0, total = 0;
        while (r < sales.length) {
            if (sales[r] >= 10 || badDays < k) {
                if (sales[r] < 10) {
                    badDays++;
                }
                r++;
                total += r - l;
            } else {
                if (sales[l] < 10) {
                    badDays--;
                }
                l++;
            }
        }

        return total;
    }
}
