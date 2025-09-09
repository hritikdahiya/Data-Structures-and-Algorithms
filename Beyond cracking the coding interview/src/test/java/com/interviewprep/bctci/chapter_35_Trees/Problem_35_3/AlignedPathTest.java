package com.interviewprep.bctci.chapter_35_Trees.Problem_35_3;

import com.interviewprep.bctci.chapter_35_Trees.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AlignedPathTest {


    @Test
    public void longestAlignedPathLength() {
        // empty tree
        Node<Integer> root = null;
        int expectedLength = 0;
        Assertions.assertEquals(expectedLength, AlignedPath.longestAlignedPathLength(root));

        // single node tree
        root = new Node<>(0);
        expectedLength = 1;
        Assertions.assertEquals(expectedLength, AlignedPath.longestAlignedPathLength(root));
        root = new Node<>(10);
        expectedLength = 0;
        Assertions.assertEquals(expectedLength, AlignedPath.longestAlignedPathLength(root));

        // multiple valid chains
        root = new Node<>(7,
                new Node<>(1,
                        new Node<>(2,
                                new Node<>(4),
                                new Node<>(3)),
                        new Node<>(8)),
                new Node<>(3,
                        new Node<>(2,
                                new Node<>(3),
                                new Node<>(3)),
                        null));

        expectedLength = 3;
        Assertions.assertEquals(expectedLength, AlignedPath.longestAlignedPathLength(root));


        root = new Node<>(0,
                new Node<>(1,
                        new Node<>(2,
                                new Node<>(4),
                                new Node<>(5)),
                        new Node<>(8)),
                new Node<>(1,
                        new Node<>(2,
                                new Node<>(3),
                                new Node<>(3)),
                        null));

        expectedLength = 6;
        Assertions.assertEquals(expectedLength, AlignedPath.longestAlignedPathLength(root));
    }
}