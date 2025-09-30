package com.interviewprep.bctci.chapter_40_DynamicProgramming.Problem_40_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Count0SumPathsTest {

    @Test
    public void count0SumPathsTest() {
        Count0SumPaths count0SumPaths = new Count0SumPaths();

        int[][] grid = new int[][]{
                new int[]{0, 1, 1},
                new int[]{0, 0, 0},
                new int[]{1, 0, 0}
        };
        int expected = 7;
        Assertions.assertEquals(expected, count0SumPaths.countMemoization(grid));
        Assertions.assertEquals(expected, count0SumPaths.countTabulation(grid));

        grid = new int[][]{
                new int[]{0, 0},
                new int[]{0, 0}
        };
        expected = 3;
        Assertions.assertEquals(expected, count0SumPaths.countMemoization(grid));
        Assertions.assertEquals(expected, count0SumPaths.countTabulation(grid));

        grid = new int[][]{
                new int[]{1},
        };
        expected = 0;
        Assertions.assertEquals(expected, count0SumPaths.countMemoization(grid));
        Assertions.assertEquals(expected, count0SumPaths.countTabulation(grid));

        grid = new int[][]{
                new int[]{0},
        };
        expected = 1;
        Assertions.assertEquals(expected, count0SumPaths.countMemoization(grid));
        Assertions.assertEquals(expected, count0SumPaths.countTabulation(grid));
    }
}