package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestAlternatingSequenceTest {

    @Test
    public void longestAlternatingSequenceTest() {
        int[] sales = new int[]{8, 9, 20, 0, 9};
        int expected = 3;
        Assertions.assertEquals(expected, LongestAlternatingSequence.find(sales));

        sales = new int[]{1, 2, 3, 4};
        expected = 1;
        Assertions.assertEquals(expected, LongestAlternatingSequence.find(sales));

        sales = new int[]{5, 10, 5, 15};
        expected = 4;
        Assertions.assertEquals(expected, LongestAlternatingSequence.find(sales));
    }
}