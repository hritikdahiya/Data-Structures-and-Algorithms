package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_25;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountGoodSubarraysWithAtLeastKSalesTest {
    @Test
    public void countGoodSubarraysWithAtLeastKSalesTest() {
        int[] sales = new int[]{15, 20, 5, 30, 25};
        int k = 50;
        int expected = 1;
        Assertions.assertEquals(expected, CountGoodSubarraysWithAtLeastKSales.count(sales, k));

        sales = new int[]{10, 20, 30};
        k = 40;
        expected = 2;
        Assertions.assertEquals(expected, CountGoodSubarraysWithAtLeastKSales.count(sales, k));

        sales = new int[]{0, 5, 8};
        k = 10;
        expected = 0;
        Assertions.assertEquals(expected, CountGoodSubarraysWithAtLeastKSales.count(sales, k));
    }

}