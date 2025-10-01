package com.interviewprep.bctci.chapter_41_GreedyAlgorithms.Problem_41_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumTripletMediansTest {

    @Test
    public void minimumTripletMediansTest() {
        int[] arr = new int[]{6, 5, 8, 2, 1, 9};
        int expected = 8;
        Assertions.assertEquals(expected, MinimumTripletMedians.calculate(arr));

        arr = new int[]{6, 5, 8, 2, 1, 9, 12, 15, 14};
        expected = 17;
        Assertions.assertEquals(expected, MinimumTripletMedians.calculate(arr));
    }
}