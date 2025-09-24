package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AdCampaignBoostTest {

    @Test
    public void consecutiveGoodDaysForAdCampaignTest() {
        int[] sales = new int[]{5, 0, 20, 0, 5};
        int k = 2;
        int expected = 3;
        Assertions.assertEquals(expected, AdCampaignBoost.consecutiveGoodDaysForAdCampaign(sales, k));

        sales = new int[]{0, 10, 0, 10};
        k = 1;
        Assertions.assertEquals(expected, AdCampaignBoost.consecutiveGoodDaysForAdCampaign(sales, k));

        sales = new int[]{5, 5, 5};
        k = 3;
        Assertions.assertEquals(expected, AdCampaignBoost.consecutiveGoodDaysForAdCampaign(sales, k));
    }
}