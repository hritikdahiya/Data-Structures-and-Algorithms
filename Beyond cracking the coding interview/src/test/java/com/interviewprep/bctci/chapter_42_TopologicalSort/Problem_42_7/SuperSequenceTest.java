package com.interviewprep.bctci.chapter_42_TopologicalSort.Problem_42_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SuperSequenceTest {

    @Test
    public void isSuperSequencePossibleTest() {
        String[] arr = new String[]{"abc", "bde", "df", "cfe"};
        Assertions.assertTrue(SuperSequence.isSuperSequencePossible(arr));

        arr = new String[]{"abc", "bda"};
        Assertions.assertFalse(SuperSequence.isSuperSequencePossible(arr));

        arr = new String[]{"ab", "bb"};
        Assertions.assertFalse(SuperSequence.isSuperSequencePossible(arr));
    }
}