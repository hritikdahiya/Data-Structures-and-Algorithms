package com.interviewprep.bctci.chapter_35_Trees.Problem_35_10;

import com.interviewprep.bctci.chapter_35_Trees.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ZigZagOrderTest {

    @Test
    public void traverseUsingQueueTest() {
        // empty tree
        Node<Integer> root = null;
        List<Integer> expectedZigZagOrder = new ArrayList<>();
        Assertions.assertArrayEquals(expectedZigZagOrder.toArray(), ZigZagOrder.traverse(root).toArray());

        // single node tree
        root = new Node<>(1);
        expectedZigZagOrder = List.of(1);
        Assertions.assertArrayEquals(expectedZigZagOrder.toArray(), ZigZagOrder.traverse(root).toArray());

        // single node tree
        root = new Node<>(1,
                new Node<>(3,
                        new Node<>(4),
                        new Node<>(5,
                                null,
                                new Node<>(8))),
                new Node<>(2,
                        new Node<>(6,
                                null,
                                new Node<>(7)),
                        null));
        expectedZigZagOrder = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Assertions.assertArrayEquals(expectedZigZagOrder.toArray(), ZigZagOrder.traverse(root).toArray());
    }

    @Test
    public void traverseUsingStackTest() {
        // empty tree
        Node<Integer> root = null;
        List<Integer> expectedZigZagOrder = new ArrayList<>();
        Assertions.assertArrayEquals(expectedZigZagOrder.toArray(), ZigZagOrder.traverseUsingStack(root).toArray());

        // single node tree
        root = new Node<>(1);
        expectedZigZagOrder = List.of(1);
        Assertions.assertArrayEquals(expectedZigZagOrder.toArray(), ZigZagOrder.traverseUsingStack(root).toArray());

        // single node tree
        root = new Node<>(1,
                new Node<>(3,
                        new Node<>(4),
                        new Node<>(5,
                                null,
                                new Node<>(8))),
                new Node<>(2,
                        new Node<>(6,
                                null,
                                new Node<>(7)),
                        null));
        expectedZigZagOrder = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Assertions.assertArrayEquals(expectedZigZagOrder.toArray(), ZigZagOrder.traverseUsingStack(root).toArray());
    }
}