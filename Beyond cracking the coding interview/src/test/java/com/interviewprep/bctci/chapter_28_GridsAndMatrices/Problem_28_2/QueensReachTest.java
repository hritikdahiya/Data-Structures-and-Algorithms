package com.interviewprep.bctci.chapter_28_GridsAndMatrices.Problem_28_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QueensReachTest {

    @Test
    void findReachTest() {
        int[][] board = new int[][]{
                {0, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 0}
        };
        int[][] expectedSafePlaces = new int[][]{
                {1, 1, 1, 1},
                {1, 0, 1, 1},
                {1, 1, 0, 1},
                {1, 1, 1, 1}
        };
        int[][] actualSafeSpace = QueensReach.findReach(board);
        verifyResult(expectedSafePlaces, actualSafeSpace);

        board = new int[][]{
                {0, 1},
                {0, 0},
        };
        expectedSafePlaces = new int[][]{
                {1, 1},
                {1, 1}
        };
        actualSafeSpace = QueensReach.findReach(board);
        verifyResult(expectedSafePlaces, actualSafeSpace);

        board = new int[][]{{1}};
        expectedSafePlaces = new int[][]{{1}};
        actualSafeSpace = QueensReach.findReach(board);
        verifyResult(expectedSafePlaces, actualSafeSpace);

        board = new int[][]{
                {0, 0},
                {0, 0},
        };
        expectedSafePlaces = new int[][]{
                {0, 0},
                {0, 0}
        };
        actualSafeSpace = QueensReach.findReach(board);
        verifyResult(expectedSafePlaces, actualSafeSpace);
    }

    private void verifyResult(int[][] expectedSafePlaces, int[][] actualSafeSpace) {
        for (int i = 0; i < expectedSafePlaces.length; i++) {
            Assertions.assertArrayEquals(expectedSafePlaces[i], actualSafeSpace[i]);
        }
    }
}