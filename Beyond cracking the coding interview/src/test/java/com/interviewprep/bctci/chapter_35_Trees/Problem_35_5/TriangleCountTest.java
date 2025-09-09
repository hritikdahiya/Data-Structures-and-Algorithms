package com.interviewprep.bctci.chapter_35_Trees.Problem_35_5;

import com.interviewprep.bctci.chapter_35_Trees.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleCountTest {

    @Test
    public void triangleCountTest() {
        Node<Integer> root = new Node<>(0,
                new Node<>(1,
                        null,
                        new Node<>(3,
                                new Node<>(6),
                                new Node<>(7))),
                new Node<>(2,
                        new Node<>(4,
                                new Node<>(8),
                                null),
                        new Node<>(5,
                                null,
                                new Node<>(9))));

        Integer expectedTriangleCount = 4;
        Assertions.assertEquals(expectedTriangleCount, TriangleCount.count(root));
    }
}