package com.interviewprep.bctci.chapter_39_BackTracking.Problem_39_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.List.of;

class SubsetEnumerationTest {
    @Test
    public void subsetEnumerationTest() {
        List<Integer> set = of(1, 2, 3);
        List<List<Integer>> expectedSubSets = of(
                of(),
                of(3),
                of(2),
                of(2, 3),
                of(1),
                of(1, 3),
                of(1, 2),
                of(1, 2, 3)
        );
        verifyResult(expectedSubSets, SubsetEnumeration.enumerate(set));

        set = of(1);
        expectedSubSets = of(
                of(),
                of(1)
        );
        verifyResult(expectedSubSets, SubsetEnumeration.enumerate(set));

        set = of();
        expectedSubSets = of(
                of()
        );
        verifyResult(expectedSubSets, SubsetEnumeration.enumerate(set));
    }

    private void verifyResult(List<List<Integer>> expectedSubSets, List<List<Integer>> actualSubSets) {
        Assertions.assertEquals(expectedSubSets.size(), actualSubSets.size());
        for (int i = 0; i < expectedSubSets.size(); i++) {
            Assertions.assertArrayEquals(expectedSubSets.get(i).toArray(), actualSubSets.get(i).toArray());
        }
    }
}