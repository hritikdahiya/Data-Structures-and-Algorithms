package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MostWeeklySalesTest {

    @Test
    public void mostWeeklySalesTest() {
        // weekly data not available
        int[] sales = new int[]{1, 2, 3};
        Assertions.assertEquals(0, MostWeeklySales.calculate(sales));

        sales = new int[]{1, 2, 3, 4, 5, 6, 7};
        Assertions.assertEquals(28, MostWeeklySales.calculate(sales));

        sales = new int[]{0, 3, 7, 12, 10, 5, 0, 1, 0, 15, 12, 11, 1};
        Assertions.assertEquals(44, MostWeeklySales.calculate(sales));
    }
}