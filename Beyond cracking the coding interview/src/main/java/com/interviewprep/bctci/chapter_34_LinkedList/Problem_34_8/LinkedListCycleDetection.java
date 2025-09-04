package com.interviewprep.bctci.chapter_34_LinkedList.Problem_34_8;

import com.interviewprep.bctci.chapter_34_LinkedList.Node;

public class LinkedListCycleDetection {
    public static <T> boolean hasCycle(Node<T> head) {
        Node<T> slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
