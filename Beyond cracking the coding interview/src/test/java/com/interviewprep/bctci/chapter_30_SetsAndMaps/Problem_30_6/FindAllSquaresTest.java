package com.interviewprep.bctci.chapter_30_SetsAndMaps.Problem_30_6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class FindAllSquaresTest {

    @Test
    public void findAllPairsTest() {
        // empty arr
        Integer[] arr = new Integer[]{};
        Assertions.assertEquals(0, FindAllSquares.findAllPairs(arr).size());

        // single element, no squares
        arr = new Integer[]{2};
        Assertions.assertEquals(0, FindAllSquares.findAllPairs(arr).size());

        // single element - 1
        arr = new Integer[]{1};
        List<Integer[]> expectedPairs = new ArrayList<>();
        expectedPairs.add(new Integer[]{0, 0});

        verifyResult(expectedPairs, FindAllSquares.findAllPairs(arr));

        arr = new Integer[]{4, 10, 3, 100, 2, 10000};
        expectedPairs = new ArrayList<>();
        expectedPairs.add(new Integer[]{3, 1});
        expectedPairs.add(new Integer[]{5, 3});
        expectedPairs.add(new Integer[]{0, 4});

        verifyResult(expectedPairs, FindAllSquares.findAllPairs(arr));
    }

    private void verifyResult(List<Integer[]> expected, List<Integer[]> actual) {
        Assertions.assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            Assertions.assertArrayEquals(expected.get(i), actual.get(i));
        }
    }
}