package com.interviewprep.bctci.chapter_29_BinarySearch.Problem_29_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TargetCountDivisibleByKTest {
    @Test
    public void EmptyArrayTest() {
        TargetCountDivisibleByK obj = new TargetCountDivisibleByK();

        int[] sorted_arr = new int[0];

        Assertions.assertTrue(obj.findTargetCountDivisibleByK(sorted_arr, 1, 2));
    }

    @Test
    public void TargetDoesNotExistTest() {
        TargetCountDivisibleByK obj = new TargetCountDivisibleByK();

        int[] sorted_arr = new int[]{1, 2, 2, 2, 2, 2, 2, 3};

        Assertions.assertTrue(obj.findTargetCountDivisibleByK(sorted_arr, 4, 2));
        Assertions.assertTrue(obj.findTargetCountDivisibleByK(sorted_arr, -1, 2));
        Assertions.assertTrue(obj.findTargetCountDivisibleByK(sorted_arr, 5, 2));
    }

    @Test
    public void TargetExistTest() {
        TargetCountDivisibleByK obj = new TargetCountDivisibleByK();

        int[] sorted_arr = new int[]{1, 1, 2, 2, 2, 2, 2, 2, 3, 3};

        // Target in the middle and divisible by K
        Assertions.assertTrue(obj.findTargetCountDivisibleByK(sorted_arr, 2, 3));
        // Target at the start and divisible by K
        Assertions.assertTrue(obj.findTargetCountDivisibleByK(sorted_arr, 1, 2));
        // Target at the end and divisible by K
        Assertions.assertTrue(obj.findTargetCountDivisibleByK(sorted_arr, 3, 2));


        // Target in the middle and NOT divisible by K
        Assertions.assertFalse(obj.findTargetCountDivisibleByK(sorted_arr, 2, 4));
        // Target at the start and NOT divisible by K
        Assertions.assertFalse(obj.findTargetCountDivisibleByK(sorted_arr, 1, 3));
        // Target at the end and NOT divisible by K
        Assertions.assertFalse(obj.findTargetCountDivisibleByK(sorted_arr, 3, 3));
    }

    @Test
    public void EveryElementIsTargetTest() {
        TargetCountDivisibleByK obj = new TargetCountDivisibleByK();

        int[] sorted_arr = new int[]{2, 2, 2, 2, 2};

        Assertions.assertTrue(obj.findTargetCountDivisibleByK(sorted_arr, 2, 5));
        Assertions.assertFalse(obj.findTargetCountDivisibleByK(sorted_arr, 2, 3));

    }
}