package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AdCampaignWithSmallBoostsTest {

    @Test
    public void consecutiveGoodDaysForAdCampaignWithSmallBoostsTest() {
        int[] sales = new int[]{8, 4, 8};
        int k = 3;
        int expected = 1;
        Assertions.assertEquals(expected, AdCampaignWithSmallBoosts.consecutiveGoodDaysForAdCampaignWithSmallBoosts(sales, k));

        sales = new int[]{10, 5, 8};
        k = 1;
        expected = 2;
        Assertions.assertEquals(expected, AdCampaignWithSmallBoosts.consecutiveGoodDaysForAdCampaignWithSmallBoosts(sales, k));

        sales = new int[]{8, 8, 8};
        k = 3;
        expected = 3;
        Assertions.assertEquals(expected, AdCampaignWithSmallBoosts.consecutiveGoodDaysForAdCampaignWithSmallBoosts(sales, k));
    }
}