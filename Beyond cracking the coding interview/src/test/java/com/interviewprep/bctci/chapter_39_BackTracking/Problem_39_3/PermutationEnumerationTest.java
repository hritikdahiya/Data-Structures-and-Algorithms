package com.interviewprep.bctci.chapter_39_BackTracking.Problem_39_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.List.of;

class PermutationEnumerationTest {

    @Test
    public void permutationEnumerationTest() {
        List<Integer> arr = of(1);
        List<List<Integer>> expectedPermutation = of(of(1));
        verifyResult(expectedPermutation, PermutationEnumeration.enumerate(arr));

        arr = of(1, 2);
        expectedPermutation = of(
                of(1, 2),
                of(2, 1)
        );
        verifyResult(expectedPermutation, PermutationEnumeration.enumerate(arr));


        arr = of(1, 2, 3);
        expectedPermutation = of(
                of(1, 2, 3),
                of(1, 3, 2),
                of(2, 1, 3),
                of(2, 3, 1),
                of(3, 1, 2),
                of(3, 2, 1)

        );
        verifyResult(expectedPermutation, PermutationEnumeration.enumerate(arr));
    }

    private void verifyResult(List<List<Integer>> expectedSubSets, List<List<Integer>> actualSubSets) {
        Assertions.assertEquals(expectedSubSets.size(), actualSubSets.size());
        for (int i = 0; i < expectedSubSets.size(); i++) {
            Assertions.assertArrayEquals(expectedSubSets.get(i).toArray(), actualSubSets.get(i).toArray());
        }
    }
}