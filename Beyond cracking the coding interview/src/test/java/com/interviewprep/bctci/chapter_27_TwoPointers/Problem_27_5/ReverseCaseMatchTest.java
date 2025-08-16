package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseCaseMatchTest {
    @Test
    public void reverseCaseMatchTest() {
        // Empty string
        Assertions.assertTrue(ReverseCaseMatch.doesReverseCaseMatch(""));

        // all lowercase
        Assertions.assertFalse(ReverseCaseMatch.doesReverseCaseMatch("edgecase"));
        // all uppercase
        Assertions.assertFalse(ReverseCaseMatch.doesReverseCaseMatch("EDGECASE"));

        // reverse case match
        // overlap
        Assertions.assertTrue(ReverseCaseMatch.doesReverseCaseMatch("haDrRAHd"));
        // lowercase prefix
        Assertions.assertTrue(ReverseCaseMatch.doesReverseCaseMatch("hardDRAH"));
        // uppercase prefix
        Assertions.assertTrue(ReverseCaseMatch.doesReverseCaseMatch("HARDdrah"));

        // reverse case does not match
        Assertions.assertFalse(ReverseCaseMatch.doesReverseCaseMatch("haHARrDd"));

        // reverse case does not match - when the string length is odd
        Assertions.assertFalse(ReverseCaseMatch.doesReverseCaseMatch("ARharHd"));
    }
}