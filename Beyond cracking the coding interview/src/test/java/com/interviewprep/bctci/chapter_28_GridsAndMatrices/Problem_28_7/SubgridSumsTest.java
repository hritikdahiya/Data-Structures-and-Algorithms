package com.interviewprep.bctci.chapter_28_GridsAndMatrices.Problem_28_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SubgridSumsTest {

    @Test
    public void findSubgridSumsTest() {
        // 1 X C grid
        int[][] grid = new int[][]{
                {1, 5, 3, -2}
        };
        int[][] subgridSums = new int[][]{
                {7, 6, 1, -2}
        };
        verifyResult(subgridSums, SubgridSums.findSubgridSums(grid));

        // R X 1 grid
        grid = new int[][]{
                {1},
                {5},
                {3},
        };
        subgridSums = new int[][]{
                {9},
                {8},
                {3},
        };
        verifyResult(subgridSums, SubgridSums.findSubgridSums(grid));

        grid = new int[][]{
                {1, 2, 3, 4},
                {-4, 3, -2, 1},
        };
        subgridSums = new int[][]{
                {8, 11, 6, 5},
                {-2, 2, -1, 1},
        };
        verifyResult(subgridSums, SubgridSums.findSubgridSums(grid));
    }

    private void verifyResult(int[][] expected, int[][] actual) {
        Assertions.assertEquals(expected.length, actual.length);
        for (int i = 0; i < actual.length; i++) {
            Assertions.assertArrayEquals(expected[i], actual[i]);
        }
    }
}