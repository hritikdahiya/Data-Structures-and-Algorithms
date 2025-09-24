package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_11;

public class BoostingDaysMultipleTimes {
    public static int consecutiveGoodDays(int[] projectedSales, int k) {
        int l = 0, r = 0;
        int maxDays = 0, currBoosts = 0;
        while (r < projectedSales.length) {
            boolean canGrowWindow = currBoosts + Math.max(10 - projectedSales[r], 0) <= k;
            if (canGrowWindow) {
                currBoosts += Math.max(10 - projectedSales[r], 0);
                r++;
                maxDays = Math.max(maxDays, r - l);
            } else {
                currBoosts -= Math.max(10 - projectedSales[l], 0);
                l++;
            }
        }

        return maxDays;
    }
}
