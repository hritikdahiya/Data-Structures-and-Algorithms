package com.interviewprep.bctci.chapter_29_BinarySearch.Problem_29_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MinSubarraySumSplitTest {
    @Test
    public void minimumSubArraySumSplitTest() {
        MinSubarraySumSplit obj = new MinSubarraySumSplit();
        int[] arr = new int[]{10, 5, 8, 9, 11};
        int k = 3;

        Assertions.assertEquals(17, obj.findMinSubarraySplit(arr, k));
    }


    @Test
    public void minimumSubArraySumSplitEdgeCaseTest() {
        MinSubarraySumSplit obj = new MinSubarraySumSplit();

        int[] arr = new int[]{10, 5, 8, 9, 11};

        // k = 1;
        Assertions.assertEquals(Arrays.stream(arr).sum(), obj.findMinSubarraySplit(arr, 1));

        // k = n;
        Assertions.assertEquals(Arrays.stream(arr).max().getAsInt(), obj.findMinSubarraySplit(arr, arr.length));

        // n = 1;
        Assertions.assertEquals(10, obj.findMinSubarraySplit(new int[]{10}, 1));

    }
}