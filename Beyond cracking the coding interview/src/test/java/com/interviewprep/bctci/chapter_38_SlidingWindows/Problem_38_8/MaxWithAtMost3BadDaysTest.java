package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxWithAtMost3BadDaysTest {

    @Test
    public void maxWithAtMost3BadDaysTest() {
        int[] sales = new int[]{0, 14, 7, 9, 0, 20, 10, 0, 10};
        int expected = 6;
        Assertions.assertEquals(expected, MaxWithAtMost3BadDays.find(sales));

        sales = new int[]{10, 10, 10};
        expected = 3;
        Assertions.assertEquals(expected, MaxWithAtMost3BadDays.find(sales));

        sales = new int[]{5, 5, 5, 5};
        Assertions.assertEquals(expected, MaxWithAtMost3BadDays.find(sales));
    }
}