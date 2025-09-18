package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountGridIslandsTest {

    @Test
    public void numOfIslandsTest() {
        int[][] grid = new int[][]{
                new int[]{0, 0, 1, 0},
                new int[]{1, 1, 0, 1},
                new int[]{0, 0, 1, 1}
        };
        int expectedIslands = 3;
        Assertions.assertEquals(expectedIslands, CountGridIslands.numOfIslands(grid));


        grid = new int[][]{
                new int[]{},
        };
        expectedIslands = 0;
        Assertions.assertEquals(expectedIslands, CountGridIslands.numOfIslands(grid));


        grid = new int[][]{
                new int[]{1},
        };
        expectedIslands = 1;
        Assertions.assertEquals(expectedIslands, CountGridIslands.numOfIslands(grid));


        grid = new int[][]{
                new int[]{1, 0, 1},
                new int[]{0, 0, 0},
                new int[]{1, 0, 1},
        };
        expectedIslands = 4;
        Assertions.assertEquals(expectedIslands, CountGridIslands.numOfIslands(grid));
    }
}