package com.interviewprep.bctci.chapter_34_LinkedList.Problem_34_10;

import com.interviewprep.bctci.chapter_34_LinkedList.Node;

public class LinkedListMidpoint {
    public static <T> T findMidpoint(Node<T> head) {
        if (head == null) {
            return null;
        }

        Node<T> slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.val;
    }
}
