package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MostSalesInKDaysTest {

    @Test
    public void mostSalesInKDaysTest() {
        int[] sales = new int[]{8, 1, 3, 7};
        int k = 2;
        int expected = 2;
        Assertions.assertEquals(expected, MostSalesInKDays.calculate(sales, k));

        sales = new int[]{5, 10, 15, 5};
        k = 1;
        Assertions.assertEquals(expected, MostSalesInKDays.calculate(sales, k));

        sales = new int[]{1, 2, 3};
        k = 3;
        expected = 0;
        Assertions.assertEquals(expected, MostSalesInKDays.calculate(sales, k));
    }
}