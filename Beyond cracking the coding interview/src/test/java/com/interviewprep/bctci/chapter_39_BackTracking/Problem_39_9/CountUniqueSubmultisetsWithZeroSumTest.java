package com.interviewprep.bctci.chapter_39_BackTracking.Problem_39_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountUniqueSubmultisetsWithZeroSumTest {

    @Test
    public void countUniqueSubsetsWithZeroSumTest() {
        int[] multiset = new int[]{};
        int expected = 1;
        Assertions.assertEquals(expected, CountUniqueSubmultisetsWithZeroSum.count(multiset));

        multiset = new int[]{-1, 2, 1, 0, 3};
        expected = 4;
        Assertions.assertEquals(expected, CountUniqueSubmultisetsWithZeroSum.count(multiset));

        multiset = new int[]{1, 1, -1, -1};
        expected = 3;
        Assertions.assertEquals(expected, CountUniqueSubmultisetsWithZeroSum.count(multiset));
    }
}