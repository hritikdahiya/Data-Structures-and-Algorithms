package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountSubarraysWithAtLeastKBadDaysTest {

    @Test
    void countSubarraysWithAtMostKBadDays() {
        int[] sales = new int[]{0, 20, 5};
        int k = 1;
        int expected = 5;
        Assertions.assertEquals(expected, CountSubarraysWithAtLeastKBadDays.countReusingAtMostKSolution(sales, k));

        // k = 0
        sales = new int[]{0, 20, 5, 20, 30};
        k = 0;
        expected = 15;
        Assertions.assertEquals(expected, CountSubarraysWithAtLeastKBadDays.countReusingAtMostKSolution(sales, k));

        // 0 bad days
        sales = new int[]{10, 20, 30};
        k = 1;
        expected = 0;
        Assertions.assertEquals(expected, CountSubarraysWithAtLeastKBadDays.countReusingAtMostKSolution(sales, k));

        sales = new int[]{0, 5, 8};
        k = 2;
        expected = 3;
        Assertions.assertEquals(expected, CountSubarraysWithAtLeastKBadDays.countReusingAtMostKSolution(sales, k));
    }
}