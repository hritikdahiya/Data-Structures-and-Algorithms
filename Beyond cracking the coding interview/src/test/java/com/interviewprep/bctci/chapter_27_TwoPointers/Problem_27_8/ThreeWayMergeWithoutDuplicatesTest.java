package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ThreeWayMergeWithoutDuplicatesTest {

    @Test
    public void mergeTest() {
        int[] a = new int[0];
        int[] b = new int[0];
        int[] c = new int[0];
        // all arrays empty
        Assertions.assertArrayEquals(a, ThreeWayMergeWithoutDuplicates.merge(a, b, c));

        // any two arrays empty
        a = new int[]{1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(a, ThreeWayMergeWithoutDuplicates.merge(a, b, c));

        // any 1 array empty
        b = new int[]{4, 6, 8};
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 8}, ThreeWayMergeWithoutDuplicates.merge(a, b, c));

        // duplicate elements
        a = new int[]{1, 1, 1};
        b = new int[]{1, 1};
        c = new int[]{1};
        Assertions.assertArrayEquals(new int[]{1}, ThreeWayMergeWithoutDuplicates.merge(a, b, c));

        // arrays in order
        a = new int[]{1, 2, 3};
        b = new int[]{8, 9, 10};
        c = new int[]{4, 5, 6, 7};
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, ThreeWayMergeWithoutDuplicates.merge(a, b, c));


        // average case - overlap with merged elements
        a = new int[]{1, 4, 7, 8};
        b = new int[]{3, 4, 7};
        c = new int[]{1, 2, 3, 8};
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 7, 8}, ThreeWayMergeWithoutDuplicates.merge(a, b, c));


    }
}