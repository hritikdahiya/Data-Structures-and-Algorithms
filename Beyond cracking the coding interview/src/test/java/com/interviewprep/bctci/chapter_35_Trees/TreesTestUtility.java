package com.interviewprep.bctci.chapter_35_Trees;

import org.junit.jupiter.api.Assertions;

public class TreesTestUtility {
    public static <T> void areTreesEqual(Node<T> expected, Node<T> actual) {
        if (expected == null) {
            Assertions.assertNull(actual);
            return;
        } else {
            Assertions.assertNotNull(actual);
        }

        Assertions.assertEquals(expected.val, actual.val);

        areTreesEqual(expected.left, actual.left);
        areTreesEqual(expected.right, actual.right);
    }
}
