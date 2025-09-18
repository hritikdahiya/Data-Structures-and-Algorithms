package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;

class MultiExitMazeTest {

    @Test
    public void findNearestExitPerCellTest() {
        List<String> maze = asList(
                "...X.O",
                "OX.X..",
                "...X..",
                ".X....",
                "XOX.XX"
        );
        int[][] expectedResult = new int[][]{
                {1, 2, 3, -1, 1, 0},
                {0, -1, 4, -1, 2, 1},
                {1, 2, 3, -1, 3, 2},
                {2, -1, 4, 5, 4, 3},
                {-1, 0, -1, 6, -1, -1}
        };
        verifyResult(expectedResult, MultiExitMaze.findNearestExitPerCell(maze));


        maze = asList(
                "...",
                ".O.",
                "..."
        );
        expectedResult = new int[][]{
                {2, 1, 2},
                {1, 0, 1},
                {2, 1, 2}
        };
        verifyResult(expectedResult, MultiExitMaze.findNearestExitPerCell(maze));
    }

    private void verifyResult(int[][] expected, int[][] actual) {
        Assertions.assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], actual[i]);
        }
    }
}