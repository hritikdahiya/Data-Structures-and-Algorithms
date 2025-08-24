package com.interviewprep.bctci.chapter_30_SetsAndMaps.Problem_30_8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CheaterDetectionTest {
    @Test
    public void cheaterDetectionTest() {
        char[] answers = new char[]{'a', 'b', 'c', 'c'};
        int m = 5;
        List<StudentResult> studentResults = Arrays.asList(
                new StudentResult(4, 10, new char[]{'a', 'a', 'c', 'c'}),
                new StudentResult(3, 8, new char[]{'a', 'b', 'c', 'd'}),
                new StudentResult(9, 7, new char[]{'a', 'b', 'c', 'd'}),
                new StudentResult(1, 6, new char[]{'a', 'b', 'c', 'd'}),
                new StudentResult(10, 5, new char[]{'a', 'b', 'c', 'd'}),
                new StudentResult(5, 11, new char[]{'a', 'a', 'c', 'c'}),
                new StudentResult(6, 16, new char[]{'a', 'b', 'c', 'd'})
        );
        List<int[]> expectedSuspects = Arrays.asList(
                new int[]{1, 9},
                new int[]{9, 3}
                // 10 and 1 are not in this list because they're in different rows
        );
        verifyResult(expectedSuspects, CheaterDetection.cheaterDetectionBruteForce(answers, m, studentResults));
        verifyResult(expectedSuspects, CheaterDetection.cheaterDetection(answers, m, studentResults));

        // all in one row
        m = 20;
        expectedSuspects = Arrays.asList(
                new int[]{10, 1},
                new int[]{1, 9},
                new int[]{9, 3},
                new int[]{4, 5}
        );
        verifyResult(expectedSuspects, CheaterDetection.cheaterDetectionBruteForce(answers, m, studentResults));
        verifyResult(expectedSuspects, CheaterDetection.cheaterDetection(answers, m, studentResults));

        // 1 desk per row
        m = 1;
        expectedSuspects = new ArrayList<>();
        verifyResult(expectedSuspects, CheaterDetection.cheaterDetectionBruteForce(answers, m, studentResults));
        verifyResult(expectedSuspects, CheaterDetection.cheaterDetection(answers, m, studentResults));
    }

    private void verifyResult(List<int[]> expectedSuspects, List<int[]> actualSuspects) {
        Assertions.assertEquals(expectedSuspects.size(), actualSuspects.size());
        for (int i = 0; i < expectedSuspects.size(); i++) {
            Assertions.assertArrayEquals(expectedSuspects.get(i), actualSuspects.get(i));
        }
    }
}