package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_23;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountSubarraysWithBadDaysInRangeTest {

    @Test
    public void countSubarraysWithBadDaysInRangeTest() {
        int[] sales = new int[]{};
        int k1 = 1;
        int k2 = 2;
        int expected = 0;
        Assertions.assertEquals(expected, CountSubarraysWithBadDaysInRange.count(sales, k1, k2));

        sales = new int[]{0, 20, 5};
        k1 = 2;
        k2 = 2;
        expected = 1;
        Assertions.assertEquals(expected, CountSubarraysWithBadDaysInRange.count(sales, k1, k2));

        sales = new int[]{0, 20, 5};
        k1 = 1;
        k2 = 2;
        expected = 5;
        Assertions.assertEquals(expected, CountSubarraysWithBadDaysInRange.count(sales, k1, k2));

        sales = new int[]{10, 20, 30};
        k1 = 1;
        k2 = 2;
        expected = 0;
        Assertions.assertEquals(expected, CountSubarraysWithBadDaysInRange.count(sales, k1, k2));
    }
}