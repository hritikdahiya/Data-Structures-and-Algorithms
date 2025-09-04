package com.interviewprep.bctci.chapter_34_LinkedList.Problem_34_9;

import com.interviewprep.bctci.chapter_34_LinkedList.Node;

import java.util.ArrayList;
import java.util.List;

public class DoublyLinkedListToArray {
    public static <T> List<T> linkedListToArray(Node<T> node) {
        List<T> finalList = new ArrayList<>();
        if (node == null) {
            return new ArrayList<>();
        }

        Node<T> curr = node;
        while (curr.prev != null) {
            curr = curr.prev;
        }

        // current at start of the list
        while (curr != null) {
            finalList.add(curr.val);
            curr = curr.next;
        }

        return finalList;
    }
}
