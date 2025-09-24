package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_9;

public class AdCampaignBoost {
    // reframe it to find the longest subarray which has a maximum of k bad days
    public static int consecutiveGoodDaysForAdCampaign(int[] sales, int k) {
        int l = 0, r = 0;
        int maxDays = 0, badDays = 0;
        while (r < sales.length) {
            if (isGoodDay(sales[r]) || badDays < k) {
                if (!isGoodDay(sales[r])) {
                    badDays++;
                }
                r++;
                maxDays = Math.max(maxDays, r - l);
            } else {
                if (!isGoodDay(sales[l])) {
                    badDays--;
                }
                l++;
            }
        }

        return maxDays;
    }

    private static boolean isGoodDay(int sale) {
        return sale >= 10;
    }
}
