package com.interviewprep.bctci.chapter_32_StacksAndQueues.Problem_32_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CompressArrayByKTest {

    @Test
    public void compressTest() {
        // single element array
        Integer[] arr = new Integer[]{1};
        int k = 1;
        Integer[] expectedCompressed = new Integer[]{1};
        Assertions.assertArrayEquals(expectedCompressed, CompressArrayByK.compress(arr, k).toArray());

        // no merges element array
        arr = new Integer[]{4, 3, 2, 1};
        k = 3;
        expectedCompressed = new Integer[]{4, 3, 2, 1};
        Assertions.assertArrayEquals(expectedCompressed, CompressArrayByK.compress(arr, k).toArray());

        // all elements merged into 1
        arr = new Integer[]{16, 8, 4, 2, 2};
        k = 2;
        expectedCompressed = new Integer[]{32};
        Assertions.assertArrayEquals(expectedCompressed, CompressArrayByK.compress(arr, k).toArray());

        arr = new Integer[]{8, 8, 8, 8};
        k = 4;
        expectedCompressed = new Integer[]{32};
        Assertions.assertArrayEquals(expectedCompressed, CompressArrayByK.compress(arr, k).toArray());

        // normal case
        arr = new Integer[]{24, 24, 8, 8, 8, 1, 5, 2, 5, 5, 5};
        k = 3;
        expectedCompressed = new Integer[]{72, 1, 5, 2, 15};
        Assertions.assertArrayEquals(expectedCompressed, CompressArrayByK.compress(arr, k).toArray());

    }
}