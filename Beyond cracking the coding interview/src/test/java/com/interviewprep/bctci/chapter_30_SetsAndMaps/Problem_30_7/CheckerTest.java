package com.interviewprep.bctci.chapter_30_SetsAndMaps.Problem_30_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CheckerTest {

    @Test
    public void expandsIntoTest() {
        Checker checker = new Checker("zoo");

        Assertions.assertTrue(checker.expandsInto("zoom"));
        Assertions.assertTrue(checker.expandsInto("ooze"));
        Assertions.assertFalse(checker.expandsInto("ozone"));
        Assertions.assertFalse(checker.expandsInto("oz"));
        Assertions.assertFalse(checker.expandsInto("zoo"));


        checker = new Checker("");

        Assertions.assertTrue(checker.expandsInto("a"));
        Assertions.assertFalse(checker.expandsInto(""));
    }
}