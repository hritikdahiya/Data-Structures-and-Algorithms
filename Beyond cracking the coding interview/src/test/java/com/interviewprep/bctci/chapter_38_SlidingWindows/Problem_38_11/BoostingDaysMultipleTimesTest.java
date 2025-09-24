package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BoostingDaysMultipleTimesTest {

    @Test
    public void consecutiveGoodDaysTest() {

        int[] projectedSales = new int[]{5, 5, 15, 0, 10};
        int k = 12;
        int expected = 3;
        Assertions.assertEquals(expected, BoostingDaysMultipleTimes.consecutiveGoodDays(projectedSales, k));

        projectedSales = new int[]{5, 5, 15, 0, 10};
        k = 15;
        expected = 4;
        Assertions.assertEquals(expected, BoostingDaysMultipleTimes.consecutiveGoodDays(projectedSales, k));

        projectedSales = new int[]{0, 0, 0};
        k = 29;
        expected = 2;
        Assertions.assertEquals(expected, BoostingDaysMultipleTimes.consecutiveGoodDays(projectedSales, k));
    }
}