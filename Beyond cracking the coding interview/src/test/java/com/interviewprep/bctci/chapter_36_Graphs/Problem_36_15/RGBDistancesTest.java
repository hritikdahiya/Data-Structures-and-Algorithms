package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.List.of;

class RGBDistancesTest {

    @Test
    public void calculateTest() {
        List<String> screen = of(
                "RRRGRB",
                "BGRGRR",
                "RRRGRR",
                "RGRRRR",
                "GBGRGG"
        );
        int[][] expectedResult = new int[][]{
                {2, 1, 1, 2, 1, 1},
                {1, 1, 1, 3, 1, 2},
                {2, 1, 1, 4, 1, 2},
                {1, 1, 1, 1, 1, 1},
                {1, 2, 1, 1, 3, 4}
        };
        verifyResult(expectedResult, RGBDistances.calculate(screen));


        screen = of(
                "RGB"
        );
        expectedResult = new int[][]{
                {1, 1, 2}
        };
        verifyResult(expectedResult, RGBDistances.calculate((screen)));
    }

    private void verifyResult(int[][] expected, int[][] actual) {
        Assertions.assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], actual[i]);
        }
    }
}