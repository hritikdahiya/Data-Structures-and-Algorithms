package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountSubarraysWithGoodStartAndEndingTest {
    @Test
    public void countSubarraysWithGoodStartAndEndingTest() {
        int[] sales = new int[]{0, 20, 5, 15, 10};
        int expected = 6;
        Assertions.assertEquals(expected, CountSubarraysWithGoodStartAndEnding.count(sales));

        sales = new int[]{0, 5, 8};
        expected = 0;
        Assertions.assertEquals(expected, CountSubarraysWithGoodStartAndEnding.count(sales));


        sales = new int[]{10, 20, 30};
        expected = 6;
        Assertions.assertEquals(expected, CountSubarraysWithGoodStartAndEnding.count(sales));
    }
}