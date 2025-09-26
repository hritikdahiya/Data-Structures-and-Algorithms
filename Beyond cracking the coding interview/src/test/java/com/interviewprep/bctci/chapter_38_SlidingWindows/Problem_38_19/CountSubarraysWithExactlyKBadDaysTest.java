package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountSubarraysWithExactlyKBadDaysTest {
    @Test
    void countSubarraysWithExactlyKBadDaysTest() {
        int[] sales = new int[]{0, 20, 5};
        int k = 1;
        int expected = 4;
        Assertions.assertEquals(expected, CountSubarraysWithExactlyKBadDays.countReusingAtMostKSolution(sales, k));
        Assertions.assertEquals(expected, CountSubarraysWithExactlyKBadDays.count(sales, k));

        // 0 bad days
        sales = new int[]{10, 20, 30};
        expected = 0;
        Assertions.assertEquals(expected, CountSubarraysWithExactlyKBadDays.countReusingAtMostKSolution(sales, k));
        Assertions.assertEquals(expected, CountSubarraysWithExactlyKBadDays.count(sales, k));

        sales = new int[]{0, 5, 8};
        k = 2;
        expected = 2;
        Assertions.assertEquals(expected, CountSubarraysWithExactlyKBadDays.countReusingAtMostKSolution(sales, k));
        Assertions.assertEquals(expected, CountSubarraysWithExactlyKBadDays.count(sales, k));
    }

}