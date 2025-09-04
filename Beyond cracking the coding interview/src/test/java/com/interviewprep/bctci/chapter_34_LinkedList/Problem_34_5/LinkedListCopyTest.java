package com.interviewprep.bctci.chapter_34_LinkedList.Problem_34_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LinkedListCopyTest {

    @Test
    public void copyTest() {
        // empty list
        Node listToCopy = createList(new int[0]);
        areListsEqual(listToCopy, LinkedListCopy.copy(listToCopy));

        // single element
        listToCopy = createList(new int[]{1});
        areListsEqual(listToCopy, LinkedListCopy.copy(listToCopy));

        // normal case
        listToCopy = createList(new int[]{1, 2, 3, 6, 5, 4});
        areListsEqual(listToCopy, LinkedListCopy.copy(listToCopy));
    }

    private void areListsEqual(Node expected, Node original) {
        Node expectedCurr = expected, originalCurr = original;
        while (expectedCurr != null && originalCurr != null) {
            Assertions.assertEquals(expectedCurr.val, originalCurr.val);
            expectedCurr = expectedCurr.next;
            originalCurr = originalCurr.next;
        }

        // both should be null
        Assertions.assertNull(expectedCurr);
        Assertions.assertNull(originalCurr);
    }

    private Node createList(int[] values) {
        Node head = null, curr = null;
        for (int val : values) {
            Node node = new Node(val);
            if (head == null) {
                head = node;
                curr = node;
            } else {
                curr.next = node;
                curr = curr.next;
            }
        }

        return head;
    }
}