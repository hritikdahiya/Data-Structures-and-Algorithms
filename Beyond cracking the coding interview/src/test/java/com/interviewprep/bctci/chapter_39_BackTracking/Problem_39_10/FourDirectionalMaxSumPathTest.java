package com.interviewprep.bctci.chapter_39_BackTracking.Problem_39_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class FourDirectionalMaxSumPathTest {

    @Test
    public void fourDirectionalMaxSumPathTest() {
        int[][] grid = new int[][]{
                new int[]{1, -4, 3},
                new int[]{-2, 7, -6},
                new int[]{5, -4, 9}
        };
        List<Integer[]> expectedPath = Arrays.asList(
                new Integer[]{0, 0},
                new Integer[]{0, 1},
                new Integer[]{1, 1},
                new Integer[]{1, 0},
                new Integer[]{2, 0},
                new Integer[]{2, 1},
                new Integer[]{2, 2}
        );
        verifyResult(expectedPath, new FourDirectionalMaxSumPath().maxSum(grid));
    }

    private void verifyResult(List<Integer[]> expectedPath, List<Integer[]> actualPath) {
        Assertions.assertEquals(expectedPath.size(), actualPath.size());
        for (int i = 0; i < expectedPath.size(); i++) {
            Assertions.assertArrayEquals(expectedPath.get(i), actualPath.get(i));
        }
    }
}