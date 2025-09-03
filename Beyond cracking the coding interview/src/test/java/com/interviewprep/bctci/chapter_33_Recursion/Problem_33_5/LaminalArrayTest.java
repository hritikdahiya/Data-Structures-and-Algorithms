package com.interviewprep.bctci.chapter_33_Recursion.Problem_33_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LaminalArrayTest {

    @Test
    public void maxSumTest() {
        int[] arr = new int[]{3, -9, 2, 4, -1, 5, 5, -4};
        Assertions.assertEquals(6, LaminalArray.maxSum(arr));

        arr = new int[]{1};
        Assertions.assertEquals(1, LaminalArray.maxSum(arr));

        arr = new int[]{-1, -2};
        Assertions.assertEquals(-1, LaminalArray.maxSum(arr));

        arr = new int[]{1, 2, 3, 4};
        Assertions.assertEquals(10, LaminalArray.maxSum(arr));

        arr = new int[]{-2, -1, -4, -3};
        Assertions.assertEquals(-1, LaminalArray.maxSum(arr));
    }
}