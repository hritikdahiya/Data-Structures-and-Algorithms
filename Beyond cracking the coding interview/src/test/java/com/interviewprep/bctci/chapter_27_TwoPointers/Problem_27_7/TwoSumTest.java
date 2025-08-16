package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumTest {
    @Test
    public void twoSumExistTest() {
        // arr with less than 2 elements should return false
        Assertions.assertFalse(TwoSum.twoSumExist(new int[]{0}));
        Assertions.assertFalse(TwoSum.twoSumExist(new int[0]));

        // arr with all positive elements
        Assertions.assertFalse(TwoSum.twoSumExist(new int[]{1, 2, 3}));

        // arr with all negative elements
        Assertions.assertFalse(TwoSum.twoSumExist(new int[]{-10, -5, -3}));

        // arr with no 2 sum indices
        Assertions.assertFalse(TwoSum.twoSumExist(new int[]{-10, -5, -3, 0, 8, 9}));
        Assertions.assertFalse(TwoSum.twoSumExist(new int[]{-10, -5, -3, 0, 8, 9, 15}));

        // arr with multiple 2 sum indices
        Assertions.assertTrue(TwoSum.twoSumExist(new int[]{-10, -5, -3, 0, 0, 3, 6}));

        // arr with 2 0s as 2 sum indices
        Assertions.assertTrue(TwoSum.twoSumExist(new int[]{0, 0, 3, 6}));
        Assertions.assertTrue(TwoSum.twoSumExist(new int[]{-5, -4, -3, 0, 0}));
    }
}