package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestPeriodAtMostKDistinctTest {

    @Test
    public void calculateLongestPeriodTest() {
        String[] bestSellers = new String[]{"book1", "book1", "book2", "book1", "book3", "book1"};
        int k = 2;
        int expected = 4;
        Assertions.assertEquals(expected, LongestPeriodAtMostKDistinct.calculateLongestPeriod(bestSellers, k));


        bestSellers = new String[]{"book1", "book2", "book3"};
        k = 1;
        expected = 1;
        Assertions.assertEquals(expected, LongestPeriodAtMostKDistinct.calculateLongestPeriod(bestSellers, k));


        bestSellers = new String[]{"book1", "book1", "book1"};
        k = 2;
        expected = 3;
        Assertions.assertEquals(expected, LongestPeriodAtMostKDistinct.calculateLongestPeriod(bestSellers, k));
    }

}