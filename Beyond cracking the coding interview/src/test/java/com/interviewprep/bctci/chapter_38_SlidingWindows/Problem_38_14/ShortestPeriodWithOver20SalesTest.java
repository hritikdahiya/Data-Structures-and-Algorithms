package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ShortestPeriodWithOver20SalesTest {

    @Test
    public void findShortestPeriodTest() {
        int[] sales = new int[]{5, 10, 15, 5, 10};
        int expected = 2;
        Assertions.assertEquals(expected, ShortestPeriodWithOver20Sales.findShortestPeriod(sales));

        sales = new int[]{5, 10, 4, 5, 10};
        expected = 4;
        Assertions.assertEquals(expected, ShortestPeriodWithOver20Sales.findShortestPeriod(sales));

        sales = new int[]{5, 5, 5, 5};
        expected = -1;
        Assertions.assertEquals(expected, ShortestPeriodWithOver20Sales.findShortestPeriod(sales));
    }
}