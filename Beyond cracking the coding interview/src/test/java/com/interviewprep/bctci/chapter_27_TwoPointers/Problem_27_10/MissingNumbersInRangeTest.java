package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MissingNumbersInRangeTest {

    @Test
    public void findMissingNumbersTest() {
        // no element in the arr - return every element from l to h
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, MissingNumbersInRange.findMissingNumbers(new int[0], 1, 5));

        // l-h range is lower than arr[0]
        Assertions.assertArrayEquals(new int[]{1, 2, 3}, MissingNumbersInRange.findMissingNumbers(new int[]{5, 6, 7, 8}, 1, 3));
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4}, MissingNumbersInRange.findMissingNumbers(new int[]{5, 6, 7, 8}, 1, 5));

        // l-h range is greater than arr[n-1]
        Assertions.assertArrayEquals(new int[]{10, 11, 12}, MissingNumbersInRange.findMissingNumbers(new int[]{5, 6, 7, 8}, 10, 12));
        Assertions.assertArrayEquals(new int[]{9, 10}, MissingNumbersInRange.findMissingNumbers(new int[]{5, 6, 7, 8}, 8, 10));

        // range overlap
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 6, 7, 9}, MissingNumbersInRange.findMissingNumbers(new int[]{5, 8, 10, 12}, 1, 10));
        Assertions.assertArrayEquals(new int[]{9, 11, 13, 14, 15}, MissingNumbersInRange.findMissingNumbers(new int[]{5, 8, 10, 12}, 8, 15));
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 6, 7, 9, 11, 13, 14, 15}, MissingNumbersInRange.findMissingNumbers(new int[]{5, 8, 10, 12}, 1, 15));
        Assertions.assertArrayEquals(new int[]{6, 7, 9, 11}, MissingNumbersInRange.findMissingNumbers(new int[]{5, 8, 10, 12}, 6, 11));


    }
}