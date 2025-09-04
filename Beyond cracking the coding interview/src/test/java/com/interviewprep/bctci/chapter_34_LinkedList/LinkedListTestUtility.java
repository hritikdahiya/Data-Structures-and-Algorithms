package com.interviewprep.bctci.chapter_34_LinkedList;

import org.junit.jupiter.api.Assertions;

public class LinkedListTestUtility {
    public static <T> void areListsEqual(Node<T> expected, Node<T> original) {
        Node<T> expectedCurr = expected, originalCurr = original;
        while (expectedCurr != null && originalCurr != null) {
            Assertions.assertEquals(expectedCurr.val, originalCurr.val);
            expectedCurr = expectedCurr.next;
            originalCurr = originalCurr.next;
        }

        // both should be null
        Assertions.assertNull(expectedCurr);
        Assertions.assertNull(originalCurr);
    }

    public static <T> Node<T> createListFromValues(T[] values) {
        Node<T> head = null, curr = null;
        for (T val : values) {
            Node<T> node = new Node<>(val);
            if (head == null) {
                head = node;
                curr = node;
            } else {
                curr.next = node;
                node.prev = curr;
                curr = curr.next;
            }
        }

        return head;
    }

    public static <T> Node<T> getLastNode(Node<T> head) {
        if (head == null) {
            return null;
        }
        Node<T> curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        return curr;
    }
}
