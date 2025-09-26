package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountSubarraysWithAtMostKBadDaysTest {

    @Test
    public void countSubarraysWithAtMostKBadDaysTest() {
        int[] sales = new int[]{0, 20, 5};
        int k = 1;
        int expected = 5;
        Assertions.assertEquals(expected, CountSubarraysWithAtMostKBadDays.count(sales, k));

        // k = 0 --> only good days combinations
        sales = new int[]{0, 20, 30, 5};
        k = 0;
        expected = 3;
        Assertions.assertEquals(expected, CountSubarraysWithAtMostKBadDays.count(sales, k));

        // 0 bad days
        sales = new int[]{10, 20, 30};
        k = 1;
        expected = 6;
        Assertions.assertEquals(expected, CountSubarraysWithAtMostKBadDays.count(sales, k));

        sales = new int[]{0, 5, 8};
        expected = 3;
        Assertions.assertEquals(expected, CountSubarraysWithAtMostKBadDays.count(sales, k));
    }
}