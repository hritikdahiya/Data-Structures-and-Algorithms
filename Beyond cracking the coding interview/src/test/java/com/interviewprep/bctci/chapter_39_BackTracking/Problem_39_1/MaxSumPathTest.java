package com.interviewprep.bctci.chapter_39_BackTracking.Problem_39_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxSumPathTest {
    @Test
    public void maxSumPathRecursiveTest() {
        int[][] grid = new int[][]{
                new int[]{1, 4, 3},
                new int[]{2, 7, 6},
                new int[]{5, 8, 9}
        };
        int expected = 29;
        Assertions.assertEquals(expected, MaxSumPath.find(grid));

        grid = new int[][]{
                new int[]{5},
        };
        expected = 5;
        Assertions.assertEquals(expected, MaxSumPath.find(grid));

        grid = new int[][]{
                new int[]{1, 2, 3},
        };
        expected = 6;
        Assertions.assertEquals(expected, MaxSumPath.find(grid));
    }
}