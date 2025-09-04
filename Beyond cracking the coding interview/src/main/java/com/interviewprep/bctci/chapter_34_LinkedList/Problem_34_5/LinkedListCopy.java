package com.interviewprep.bctci.chapter_34_LinkedList.Problem_34_5;

import com.interviewprep.bctci.chapter_34_LinkedList.Node;

public class LinkedListCopy {
    public static <T> Node<T> copy(Node<T> head) {
        Node<T> dummyNode = new Node<>(null);

        Node<T> newCurr = dummyNode;
        Node<T> oldHeadCurr = head;
        while (oldHeadCurr != null) {
            newCurr.next = new Node<>(oldHeadCurr.val);
            oldHeadCurr = oldHeadCurr.next;
            newCurr = newCurr.next;
        }

        return dummyNode.next;
    }
}