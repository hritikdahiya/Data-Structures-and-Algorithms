package com.interviewprep.bctci.chapter_28_GridsAndMatrices.Problem_28_6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SubgridMaximumsTest {

    @Test
    public void getSubgridMaximumsTest() {
        // 1 X C grid
        int[][] grid = new int[][]{
                {1, 5, 3, -2}
        };
        int[][] subgridMaximums = new int[][]{
                {5, 5, 3, -2}
        };
        verifyResult(subgridMaximums, SubgridMaximums.getSubgridMaximums(grid));

        // R X 1 grid
        grid = new int[][]{
                {1},
                {5},
                {3},
        };
        subgridMaximums = new int[][]{
                {5},
                {5},
                {3},
        };
        verifyResult(subgridMaximums, SubgridMaximums.getSubgridMaximums(grid));

        // Maximum at the top of the grid
        grid = new int[][]{
                {12, 11, 10, 9},
                {8, 7, 6, 5},
                {4, 3, 2, 1},
        };
        subgridMaximums = new int[][]{
                {12, 11, 10, 9},
                {8, 7, 6, 5},
                {4, 3, 2, 1},
        };
        verifyResult(subgridMaximums, SubgridMaximums.getSubgridMaximums(grid));

        // Maximum at the bottom of the grid
        grid = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        subgridMaximums = new int[][]{
                {12, 12, 12, 12},
                {12, 12, 12, 12},
                {12, 12, 12, 12}
        };
        verifyResult(subgridMaximums, SubgridMaximums.getSubgridMaximums(grid));


    }

    private void verifyResult(int[][] expected, int[][] actual) {
        Assertions.assertEquals(expected.length, actual.length);
        for (int i = 0; i < actual.length; i++) {
            Assertions.assertArrayEquals(expected[i], actual[i]);
        }
    }
}