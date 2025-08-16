package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayReversalTest {

    @Test
    public void reverseTest() {
        // empty array
        int[] arr = new int[0];
        ArrayReversal.reverse(arr);
        Assertions.assertArrayEquals(new int[0], arr);

        // single element array
        arr = new int[]{5};
        ArrayReversal.reverse(arr);
        Assertions.assertArrayEquals(new int[]{5}, arr);

        // even length array
        arr = new int[]{1, 5, 2, 3, 4, 6};
        ArrayReversal.reverse(arr);
        Assertions.assertArrayEquals(new int[]{6, 4, 3, 2, 5, 1}, arr);

        // odd length array
        arr = new int[]{1, 5, 2, 3, 4};
        ArrayReversal.reverse(arr);
        Assertions.assertArrayEquals(new int[]{4, 3, 2, 5, 1}, arr);
    }
}