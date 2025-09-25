package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StrongStartAndEndTest {

    @Test
    public void calculateMaxGoodDaysWithStrongStartAndEndTest() {
        int[] projectedSales = new int[]{0, 0, 0, 0, 10, 0, 0, 10};
        int k = 2;
        int expected = 4;
        Assertions.assertEquals(expected, StrongStartAndEnd.calculateMaxGoodDays(projectedSales, k));

        projectedSales = new int[]{0, 10, 0, 0, 10, 0, 0, 10};
        Assertions.assertEquals(expected, StrongStartAndEnd.calculateMaxGoodDays(projectedSales, k));

        projectedSales = new int[]{10, 0, 0, 0, 10, 0, 0, 10};
        expected = 5;
        Assertions.assertEquals(expected, StrongStartAndEnd.calculateMaxGoodDays(projectedSales, k));

        projectedSales = new int[]{10, 0, 10, 0};
        k = 1;
        expected = 3;
        Assertions.assertEquals(expected, StrongStartAndEnd.calculateMaxGoodDays(projectedSales, k));

        projectedSales = new int[]{5, 5, 5};
        k = 2;
        expected = 2;
        Assertions.assertEquals(expected, StrongStartAndEnd.calculateMaxGoodDays(projectedSales, k));

        projectedSales = new int[]{};
        expected = 0;
        Assertions.assertEquals(expected, StrongStartAndEnd.calculateMaxGoodDays(projectedSales, k));


        projectedSales = new int[]{5, 5, 5};
        k = 3;
        expected = 3;
        Assertions.assertEquals(expected, StrongStartAndEnd.calculateMaxGoodDays(projectedSales, k));
    }
}