package com.interviewprep.bctci.chapter_43_PrefixSum.Problem_43_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExclusiveProductTest {

    @Test
    public void exclusiveProductTest() {
        int[] arr = new int[]{1, 3, 2, 1};
        int[] expected = new int[]{6, 2, 3, 6};
        Assertions.assertArrayEquals(expected, ExclusiveProduct.findExclusiveProduct(arr));


        arr = new int[]{0, 1, 0};
        expected = new int[]{0, 0, 0};
        Assertions.assertArrayEquals(expected, ExclusiveProduct.findExclusiveProduct(arr));
    }
}