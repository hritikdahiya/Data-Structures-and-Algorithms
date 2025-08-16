package com.interviewprep.bctci.chapter_29_BinarySearch.Problem_29_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MinSubarraySumSplitTest {
    @Test
    public void minimumSubArraySumSplitTest() {
        int[] arr = new int[]{10, 5, 8, 9, 11};
        int k = 3;

        Assertions.assertEquals(17, MinSubarraySumSplit.findMinSubarraySplit(arr, k));
    }


    @Test
    public void minimumSubArraySumSplitEdgeCaseTest() {
        int[] arr = new int[]{10, 5, 8, 9, 11};

        // k = 1;
        Assertions.assertEquals(Arrays.stream(arr).sum(), MinSubarraySumSplit.findMinSubarraySplit(arr, 1));

        // k = n;
        Assertions.assertEquals(Arrays.stream(arr).max().getAsInt(), MinSubarraySumSplit.findMinSubarraySplit(arr, arr.length));

        // n = 1;
        Assertions.assertEquals(10, MinSubarraySumSplit.findMinSubarraySplit(new int[]{10}, 1));

    }
}