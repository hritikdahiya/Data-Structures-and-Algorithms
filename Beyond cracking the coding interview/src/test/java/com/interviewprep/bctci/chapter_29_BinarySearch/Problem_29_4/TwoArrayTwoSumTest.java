package com.interviewprep.bctci.chapter_29_BinarySearch.Problem_29_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoArrayTwoSumTest {
    @Test
    public void TwoSumExistsTest() {
        int[] sorted_arr = new int[]{-5, -4, -1, 4, 6, 6, 7};
        int[] unsorted_arr = new int[]{-3, 7, 18, 4, 6};

        Assertions.assertArrayEquals(new int[]{1, 3}, TwoArrayTwoSum.find2SumIndices(sorted_arr, unsorted_arr));
    }

    @Test
    public void TwoSumExistsWithDuplicatedValueTest() {
        int[] sorted_arr = new int[]{-4, -4, -1, 4, 6, 6, 7};
        int[] unsorted_arr = new int[]{-3, 7, 18, 5, -6};

        Assertions.assertArrayEquals(new int[]{4, 4}, TwoArrayTwoSum.find2SumIndices(sorted_arr, unsorted_arr));
    }

    @Test
    public void TwoSumDoesNotExistsTest() {
        int[] sorted_arr = new int[]{-5, -4, -1, 4, 6, 6, 7};
        int[] unsorted_arr = new int[]{-3, 7, 18, 3, 6};
        Assertions.assertArrayEquals(new int[]{-1, -1}, TwoArrayTwoSum.find2SumIndices(sorted_arr, unsorted_arr));
    }

}