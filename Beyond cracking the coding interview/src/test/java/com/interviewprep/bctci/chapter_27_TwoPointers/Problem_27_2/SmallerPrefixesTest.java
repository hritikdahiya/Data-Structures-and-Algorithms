package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SmallerPrefixesTest {
    @Test
    public void smallerPrefixTest() {
        // Empty array
        Assertions.assertFalse(SmallerPrefixes.smallerPrefix(new int[]{}));

        // Odd length throws exception for invalid input
        Assertions.assertThrows(IllegalArgumentException.class, () -> SmallerPrefixes.smallerPrefix(new int[]{1, 2, 3}));

        // Normal test case
        Assertions.assertTrue(SmallerPrefixes.smallerPrefix(new int[]{1, 2, 2, -1}));
        Assertions.assertFalse(SmallerPrefixes.smallerPrefix(new int[]{1, 2, -2, 1, 3, 5}));

        // Increasing sequence with positive ints
        Assertions.assertTrue(SmallerPrefixes.smallerPrefix(new int[]{0, 1, 2, 3, 4, 5, 6, 7}));
        // negative ints
        Assertions.assertFalse(SmallerPrefixes.smallerPrefix(new int[]{-6, -5, -4, -3, -2, -1}));

        // large numbers - to test overflow
        int[] largeNumArray = new int[10000];
        Arrays.fill(largeNumArray, Integer.MAX_VALUE);
        Assertions.assertTrue(SmallerPrefixes.smallerPrefix(largeNumArray));
    }


    @Test
    public void smallerPrefixSpaceOptimizedTest() {
        // Empty array
        Assertions.assertFalse(SmallerPrefixes.smallerPrefixSpaceOptimized(new int[]{}));

        // Odd length throws exception for invalid input
        Assertions.assertThrows(IllegalArgumentException.class, () -> SmallerPrefixes.smallerPrefixSpaceOptimized(new int[]{1, 2, 3}));

        // Normal test case
        Assertions.assertTrue(SmallerPrefixes.smallerPrefixSpaceOptimized(new int[]{1, 2, 2, -1}));
        Assertions.assertFalse(SmallerPrefixes.smallerPrefixSpaceOptimized(new int[]{1, 2, -2, 1, 3, 5}));

        // Increasing sequence with positive ints
        Assertions.assertTrue(SmallerPrefixes.smallerPrefixSpaceOptimized(new int[]{0, 1, 2, 3, 4, 5, 6, 7}));
        // negative ints
        Assertions.assertFalse(SmallerPrefixes.smallerPrefixSpaceOptimized(new int[]{-6, -5, -4, -3, -2, -1}));

        // large numbers - to test overflow
        int[] largeNumArray = new int[10000];
        Arrays.fill(largeNumArray, Integer.MAX_VALUE);
        Assertions.assertTrue(SmallerPrefixes.smallerPrefix(largeNumArray));
    }
}