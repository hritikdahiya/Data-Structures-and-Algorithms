package com.interviewprep.bctci.chapter_35_Trees.Problem_35_9;

import com.interviewprep.bctci.chapter_35_Trees.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MostProlificLevelTest {

    @Test
    public void getMostProlificLevelTest() {
        // empty tree
        Node<Integer> root = null;
        int expectedMostProlificLevel = -1;
        Assertions.assertEquals(expectedMostProlificLevel, MostProlificLevel.getMostProlificLevel(root));

        // single node tree
        root = new Node<>(0);
        expectedMostProlificLevel = 0;
        Assertions.assertEquals(expectedMostProlificLevel, MostProlificLevel.getMostProlificLevel(root));

        // list ike tree
        root = new Node<>(0,
                new Node<>(0,
                        new Node<>(0),
                        null),
                null);
        Assertions.assertEquals(expectedMostProlificLevel, MostProlificLevel.getMostProlificLevel(root));

        // regular test case
        root = new Node<>(0,
                new Node<>(0,
                        new Node<>(0,
                                new Node<>(0),
                                new Node<>(0)),
                        new Node<>(0,
                                null,
                                new Node<>(0))),
                null);
        expectedMostProlificLevel = 1;
        Assertions.assertEquals(expectedMostProlificLevel, MostProlificLevel.getMostProlificLevel(root));
    }
}