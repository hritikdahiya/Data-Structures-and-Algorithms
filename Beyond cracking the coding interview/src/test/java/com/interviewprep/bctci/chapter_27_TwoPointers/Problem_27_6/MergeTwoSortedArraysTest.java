package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeTwoSortedArraysTest {
    @Test
    public void mergeTwoSortedArraysTest() {
        // Empty array items
        Assertions.assertArrayEquals(new int[0], MergeTwoSortedArrays.merge(new int[0], new int[0]));

        // One array is empty
        int[] arr = new int[]{1, 2, 3, 4};
        Assertions.assertArrayEquals(arr, MergeTwoSortedArrays.merge(new int[0], arr));
        Assertions.assertArrayEquals(arr, MergeTwoSortedArrays.merge(arr, new int[0]));

        // Multiple duplicate items
        int[] a1 = new int[]{1, 1, 1, 3, 5, 6, 7, 8};
        int[] a2 = new int[]{1, 1, 2, 3, 3, 5, 5, 5, 6, 8, 8};
        int[] merged = new int[]{1, 1, 1, 1, 1, 2, 3, 3, 3, 5, 5, 5, 5, 6, 6, 7, 8, 8, 8};
        Assertions.assertArrayEquals(merged, MergeTwoSortedArrays.merge(a1, a2));
    }
}