package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestGoodDayStreakTest {

    @Test
    public void longestGoodDayStreakTest() {
        int[] sales = new int[]{0, 14, 7, 12, 10, 20};
        int expected = 3;
        Assertions.assertEquals(expected, LongestGoodDayStreak.find(sales));

        sales = new int[]{10, 10, 10};
        expected = 3;
        Assertions.assertEquals(expected, LongestGoodDayStreak.find(sales));

        sales = new int[]{5, 5, 5};
        expected = 0;
        Assertions.assertEquals(expected, LongestGoodDayStreak.find(sales));
    }
}