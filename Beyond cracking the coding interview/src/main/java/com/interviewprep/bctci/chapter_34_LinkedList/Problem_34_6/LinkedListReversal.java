package com.interviewprep.bctci.chapter_34_LinkedList.Problem_34_6;

import com.interviewprep.bctci.chapter_34_LinkedList.Node;

public class LinkedListReversal {
    public static <T> Node<T> reverse(Node<T> list) {
        if (list == null) {
            return null;
        }

        Node<T> prev = null, curr = list;
        while (curr != null) {
            Node<T> next = curr.next;

            // move next of curr to its previous node
            curr.next = prev;
            // move previous the current node
            prev = curr;
            // move curr to its next node in the un-reversed original list
            curr = next;
        }

        return prev;
    }
}