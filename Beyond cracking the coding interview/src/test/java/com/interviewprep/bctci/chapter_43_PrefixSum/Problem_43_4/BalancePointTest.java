package com.interviewprep.bctci.chapter_43_PrefixSum.Problem_43_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BalancePointTest {

    @Test
    public void findBalancePointsTest() {
        int[] arr = new int[]{3, 5, -2, 7, 2, 2, 2};
        int expected = 3;
        Assertions.assertEquals(expected, BalancePoint.findBalancePoints(arr));
        Assertions.assertEquals(expected, BalancePoint.findBalancePointsSpaceEfficient(arr));

        arr = new int[]{1, 2, 3};
        expected = -1;
        Assertions.assertEquals(expected, BalancePoint.findBalancePoints(arr));
        Assertions.assertEquals(expected, BalancePoint.findBalancePointsSpaceEfficient(arr));

        arr = new int[]{0, 1, -1};
        expected = 0;
        Assertions.assertEquals(expected, BalancePoint.findBalancePoints(arr));
        Assertions.assertEquals(expected, BalancePoint.findBalancePointsSpaceEfficient(arr));

        arr = new int[]{-1, 1, 0};
        expected = 2;
        Assertions.assertEquals(expected, BalancePoint.findBalancePoints(arr));
        Assertions.assertEquals(expected, BalancePoint.findBalancePointsSpaceEfficient(arr));

        arr = new int[]{5};
        expected = 0;
        Assertions.assertEquals(expected, BalancePoint.findBalancePoints(arr));
        Assertions.assertEquals(expected, BalancePoint.findBalancePointsSpaceEfficient(arr));
    }
}