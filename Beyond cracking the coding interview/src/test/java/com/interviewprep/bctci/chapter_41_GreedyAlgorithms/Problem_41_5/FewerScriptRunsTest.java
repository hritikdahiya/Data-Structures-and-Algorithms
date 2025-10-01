package com.interviewprep.bctci.chapter_41_GreedyAlgorithms.Problem_41_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FewerScriptRunsTest {

    @Test
    public void fewerScriptRunsTest() {
        int[][] meetings = new int[][]{};
        int expected = 0;
        Assertions.assertEquals(expected, FewerScriptRuns.findMinScriptRuns(meetings));

        meetings = new int[][]{
                new int[]{2, 3}
        };
        expected = 1;
        Assertions.assertEquals(expected, FewerScriptRuns.findMinScriptRuns(meetings));

        // independent meetings
        meetings = new int[][]{
                new int[]{15, 16},
                new int[]{2, 3},
                new int[]{5, 10},
        };
        expected = 3;
        Assertions.assertEquals(expected, FewerScriptRuns.findMinScriptRuns(meetings));


        meetings = new int[][]{
                new int[]{2, 3},
                new int[]{1, 3},
                new int[]{2, 3},
                new int[]{3, 6},
                new int[]{8, 10}
        };
        expected = 2;
        Assertions.assertEquals(expected, FewerScriptRuns.findMinScriptRuns(meetings));


        meetings = new int[][]{
                new int[]{2, 4},
                new int[]{6, 8},
                new int[]{1, 3},
                new int[]{5, 7},
                new int[]{7, 9},
                new int[]{4, 6},
                new int[]{8, 10},
                new int[]{3, 5},
        };
        expected = 3;
        Assertions.assertEquals(expected, FewerScriptRuns.findMinScriptRuns(meetings));
    }
}