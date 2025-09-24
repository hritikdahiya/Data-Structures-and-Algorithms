package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_10;

public class AdCampaignWithSmallBoosts {
    private static final int MINI_BOOST = 5;

    public static int consecutiveGoodDaysForAdCampaignWithSmallBoosts(int[] projectedSales, int k) {
        int l = 0, r = 0;
        int maxDays = 0, boostableDays = 0;
        while (r < projectedSales.length) {
            // r is a good day, include it in the window
            // OR boostable days are available AND r can be boosted to be a good day, include it in the window
            if (isGoodDay(projectedSales[r]) || (boostableDays < k && isGoodDay((projectedSales[r] + MINI_BOOST)))) {
                if (!isGoodDay(projectedSales[r]) && isGoodDay((projectedSales[r] + MINI_BOOST))) {
                    boostableDays++;
                }
                r++;
                maxDays = Math.max(maxDays, r - l);
            }
            // if r is NOT a good day AND it cannot be boosted to be a good day, reset the window
            else if (!isGoodDay((projectedSales[r] + MINI_BOOST))) {
                l = r + 1;
                r = r + 1;
                boostableDays = 0;
            }
            // if r is NOT a good day AND k days have been boosted, shrink the window to be able to boost r
            else {
                if (!isGoodDay(projectedSales[l]) && isGoodDay(projectedSales[l] + MINI_BOOST)) {
                    boostableDays--;
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
