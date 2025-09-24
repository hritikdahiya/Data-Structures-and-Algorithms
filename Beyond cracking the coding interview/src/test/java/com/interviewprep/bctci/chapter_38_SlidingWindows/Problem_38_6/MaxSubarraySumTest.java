package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxSubarraySumTest {
    @Test
    public void maxSubarraySumTest() {
        int[] arr = new int[]{1, 2, 3, -2, 1};
        int expected = 6;
        Assertions.assertEquals(expected, MaxSubarraySum.find(arr));

        arr = new int[]{1, 2, 3, -2, 7};
        expected = 11;
        Assertions.assertEquals(expected, MaxSubarraySum.find(arr));

        arr = new int[]{1, 2, 3, -8, 7};
        expected = 7;
        Assertions.assertEquals(expected, MaxSubarraySum.find(arr));

        arr = new int[]{-2, -3, -4};
        expected = -2;
        Assertions.assertEquals(expected, MaxSubarraySum.find(arr));

    }
}