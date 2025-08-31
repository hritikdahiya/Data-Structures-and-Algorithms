package com.interviewprep.bctci.chapter_32_StacksAndQueues.Problem_32_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CompressArrayTest {

    @Test
    public void compressTest() {
        // single element array
        Integer[] arr = new Integer[]{1};
        Integer[] expectedCompressed = new Integer[]{1};
        Assertions.assertArrayEquals(expectedCompressed, CompressArray.compress(arr));

        // no merges element array
        arr = new Integer[]{4, 3, 2, 1};
        expectedCompressed = new Integer[]{4, 3, 2, 1};
        Assertions.assertArrayEquals(expectedCompressed, CompressArray.compress(arr));

        // all elements merged into 1
        arr = new Integer[]{16, 8, 4, 2, 2};
        expectedCompressed = new Integer[]{32};
        Assertions.assertArrayEquals(expectedCompressed, CompressArray.compress(arr));

        arr = new Integer[]{8, 8, 8, 8};
        expectedCompressed = new Integer[]{32};
        Assertions.assertArrayEquals(expectedCompressed, CompressArray.compress(arr));

        // normal case
        arr = new Integer[]{16, 8, 8, 3, 3, 2, 2, 1, 5, 2, 5, 5};
        expectedCompressed = new Integer[]{32, 6, 4, 1, 5, 2, 10};
        Assertions.assertArrayEquals(expectedCompressed, CompressArray.compress(arr));

    }
}