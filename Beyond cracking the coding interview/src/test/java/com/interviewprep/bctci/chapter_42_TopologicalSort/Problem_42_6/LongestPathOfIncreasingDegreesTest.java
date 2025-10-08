package com.interviewprep.bctci.chapter_42_TopologicalSort.Problem_42_6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestPathOfIncreasingDegreesTest {

    @Test
    public void findLongestPathOfIncreasingDegreesTest() {
        int V = 8;
        int[][] edges = new int[][]{
                new int[]{0, 1},
                new int[]{1, 2},
                new int[]{2, 3},
                new int[]{0, 2},
                new int[]{0, 4},
                new int[]{2, 6},
                new int[]{3, 7},
                new int[]{2, 7},
                new int[]{4, 5},
                new int[]{5, 6},
                new int[]{6, 7}
        };
        int expected = 3;

        Assertions.assertEquals(expected, LongestPathOfIncreasingDegrees.findLongestPathOfIncreasingDegrees(V, edges));
    }
}