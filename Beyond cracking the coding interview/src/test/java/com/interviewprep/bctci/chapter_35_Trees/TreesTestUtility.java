package com.interviewprep.bctci.chapter_35_Trees;

import org.junit.jupiter.api.Assertions;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

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

    public static <T> Node<T> createBSTFromArray(List<T> values, Comparator<T> comparator) {
        Node<T> root = null;
        for (T val : values) {
            Node<T> newNode = new Node<>(val);
            if (root == null) {
                root = newNode;
            } else {
                Node<T> prev = null, curr = root;
                int direction = 0;    // 0 means left, 1 means right
                while (curr != null) {
                    int comparison = Objects.compare(val, curr.val, comparator);
                    prev = curr;
                    curr = (comparison <= 0) ? curr.left : curr.right;
                    direction = (comparison <= 0) ? 0 : 1;
                }

                if (direction == 0) {
                    prev.left = newNode;
                } else {
                    prev.right = newNode;
                }
            }
        }

        return root;
    }
}
