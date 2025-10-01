package com.interviewprep.bctci.chapter_41_GreedyAlgorithms.Problem_41_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MostNonOverlappingIntervalsTest {

    @Test
    public void getMostNonOverlappingIntervalsTest() {
        int[][] intervals = new int[][]{
                new int[]{2, 3},
                new int[]{1, 4},
                new int[]{2, 3},
                new int[]{3, 6},
                new int[]{8, 9},
        };
        int expected = 2;
        Assertions.assertEquals(expected, MostNonOverlappingIntervals.getMostNonOverlappingIntervals(intervals));

        intervals = new int[][]{
                new int[]{1, 2},
                new int[]{2, 3},
                new int[]{5, 8},
                new int[]{3, 4}
        };
        expected = 3;
        Assertions.assertEquals(expected, MostNonOverlappingIntervals.getMostNonOverlappingIntervals(intervals));

        intervals = new int[][]{
                new int[]{1, 10},
                new int[]{8, 9},
                new int[]{2, 3},
        };
        expected = 2;
        Assertions.assertEquals(expected, MostNonOverlappingIntervals.getMostNonOverlappingIntervals(intervals));
    }
}