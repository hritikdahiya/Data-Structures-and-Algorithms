package com.interviewprep.bctci.chapter_34_LinkedList.Problem_34_13;

import com.interviewprep.bctci.chapter_34_LinkedList.Node;

public class DuplicateRemovalInSortedLinkedList {
    public static <T> void removeDuplicates(Node<T> head) {
        if (head == null) {
            return;
        }

        Node<T> curr = head.next, prev = head;
        while (curr != null) {
            if (curr.val == prev.val) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
    }
}
