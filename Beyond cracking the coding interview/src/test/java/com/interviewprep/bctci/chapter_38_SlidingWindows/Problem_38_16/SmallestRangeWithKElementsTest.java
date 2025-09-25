package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SmallestRangeWithKElementsTest {

    @Test
    public void smallestRangeWithKElementsTest() {
        int[] arr = new int[]{1, 2, 5, 7, 8};
        int k = 3;
        int[] expectedRange = new int[]{5, 8};
        Assertions.assertArrayEquals(expectedRange, SmallestRangeWithKElements.findRange(arr, k));

        arr = new int[]{5, 5, 2, 2, 8, 8};
        expectedRange = new int[]{2, 5};
        Assertions.assertArrayEquals(expectedRange, SmallestRangeWithKElements.findRange(arr, k));

        arr = new int[]{0};
        k = 1;
        expectedRange = new int[]{0, 0};
        Assertions.assertArrayEquals(expectedRange, SmallestRangeWithKElements.findRange(arr, k));
    }
}