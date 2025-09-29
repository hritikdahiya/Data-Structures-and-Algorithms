package com.interviewprep.bctci.chapter_39_BackTracking.Problem_39_11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class EscapeWithAllCluesTest {

    @Test
    public void escapeWithAllCluesTest() {
        int[][] room = new int[][]{
                {0, 1, 0},
                {0, 2, 0},
                {0, 0, 2}
        };
        List<Integer[]> expectedPath = List.of(
                new Integer[]{0, 0},
                new Integer[]{1, 0},
                new Integer[]{1, 1},
                new Integer[]{2, 1},
                new Integer[]{2, 2}
        );
        verifyResult(expectedPath, new EscapeWithAllClues().findPath(room));

        // multiple clues in 1 line
        room = new int[][]{
                {0, 2, 2},
        };
        expectedPath = List.of(
                new Integer[]{0, 0},
                new Integer[]{0, 1},
                new Integer[]{0, 2}
        );
        verifyResult(expectedPath, new EscapeWithAllClues().findPath(room));

        // no path to all clues
        room = new int[][]{
                {0, 0, 0},
                {2, 1, 2}
        };
        expectedPath = List.of();
        verifyResult(expectedPath, new EscapeWithAllClues().findPath(room));

        // path is completely blocked
        room = new int[][]{
                {0, 0, 1, 2},
                {2, 1, 2, 0}
        };
        expectedPath = List.of();
        verifyResult(expectedPath, new EscapeWithAllClues().findPath(room));

        // shortest path is not the closest clue
        room = new int[][]{
                {0, 0, 0, 0, 0},
                {1, 1, 0, 1, 1},
                {2, 0, 0, 0, 0},
                {0, 0, 2, 0, 2},
                {0, 0, 0, 0, 0}
        };
        expectedPath = List.of(
                new Integer[]{0, 0}, new Integer[]{0, 1}, new Integer[]{0, 2}, new Integer[]{1, 2}, new Integer[]{2, 2},
                new Integer[]{2, 1}, new Integer[]{2, 0}, new Integer[]{3, 0}, new Integer[]{3, 1}, new Integer[]{3, 2},
                new Integer[]{3, 3}, new Integer[]{3, 4}
        );
        verifyResult(expectedPath, new EscapeWithAllClues().findPath(room));
    }

    private void verifyResult(List<Integer[]> expectedPath, List<Integer[]> actualPath) {
        Assertions.assertEquals(expectedPath.size(), actualPath.size());
        for (int i = 0; i < expectedPath.size(); i++) {
            Assertions.assertArrayEquals(expectedPath.get(i), actualPath.get(i));
        }
    }
}