package com.interviewprep.bctci.chapter_43_PrefixSum.Problem_43_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestSubarrayWithSumKTest {

    @Test
    public void findLengthOfLongestSubarrayWithSumTest() {

        int[] arr = new int[]{1, 2, 3, 2, 1};
        int k = 3;
        int expected = 2;
        Assertions.assertEquals(expected, LongestSubarrayWithSumK.findLengthOfLongestSubarrayWithSum(arr, k));

        arr = new int[]{-1, -2, -3, 2, 1};
        k = -3;
        expected = 5;
        Assertions.assertEquals(expected, LongestSubarrayWithSumK.findLengthOfLongestSubarrayWithSum(arr, k));
    }
}