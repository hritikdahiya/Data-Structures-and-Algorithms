package com.interviewprep.bctci.chapter_43_PrefixSum.Problem_43_6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountSubarraysWithSumKTest {

    @Test
    public void countSubarraysWithSumKTest() {
        int[] arr = new int[]{1, 2, 3, 2, 1};
        int k = 3;
        int expected = 3;
        Assertions.assertEquals(expected, CountSubarraysWithSumK.count(arr, k));

        arr = new int[]{-1, -2, -3, 2, 1};
        k = -3;
        expected = 4;
        Assertions.assertEquals(expected, CountSubarraysWithSumK.count(arr, k));
    }
}