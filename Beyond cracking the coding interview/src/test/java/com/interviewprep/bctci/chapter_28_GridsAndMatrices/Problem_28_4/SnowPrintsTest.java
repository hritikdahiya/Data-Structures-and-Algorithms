package com.interviewprep.bctci.chapter_28_GridsAndMatrices.Problem_28_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SnowPrintsTest {
    @Test
    public void findClosestRowTest() {
        // single row
        int[][] prints = {
                {1, 1, 1}
        };
        int expectedRow = 0;
        Assertions.assertEquals(expectedRow, SnowPrints.findClosestRow(prints));

        // diagonal path
        prints = new int[][]{
                {0, 0, 0, 1},
                {0, 0, 1, 0},
                {0, 1, 0, 1},
                {1, 0, 0, 0}
        };
        expectedRow = 0;
        Assertions.assertEquals(expectedRow, SnowPrints.findClosestRow(prints));

        // normal case 1
        prints = new int[][]{
                {0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0},
                {1, 1, 0, 1, 0, 0},
                {0, 0, 0, 0, 1, 1}
        };
        expectedRow = 1;
        Assertions.assertEquals(expectedRow, SnowPrints.findClosestRow(prints));

        // normal case 2
        prints = new int[][]{
                {0, 0, 0, 1, 0, 0},
                {0, 0, 1, 0, 1, 0},
                {1, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 0, 0}
        };
        expectedRow = 0;
        Assertions.assertEquals(expectedRow, SnowPrints.findClosestRow(prints));


    }
}