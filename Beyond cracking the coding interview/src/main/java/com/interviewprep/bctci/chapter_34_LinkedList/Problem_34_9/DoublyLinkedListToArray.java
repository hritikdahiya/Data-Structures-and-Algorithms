package com.interviewprep.bctci.chapter_34_LinkedList.Problem_34_9;

import com.interviewprep.bctci.chapter_34_LinkedList.Node;

import java.util.ArrayList;
import java.util.List;

public class DoublyLinkedListToArray {
    public static <T> List<T> linkedListToArray(Node<T> node) {
        List<T> prefixList = new ArrayList<>();
        List<T> suffixList = new ArrayList<>();

        if (node == null) {
            return new ArrayList<>();
        }

        Node<T> curr = node.prev;

        while (curr != null) {
            prefixList.add(curr.val);
            curr = curr.prev;
        }

        curr = node;
        while (curr != null) {
            suffixList.add(curr.val);
            curr = curr.next;
        }

        List<T> finalList = new ArrayList<>();
        for (int i = prefixList.size() - 1; i > -1; i--) {
            finalList.add(prefixList.get(i));
        }
        finalList.addAll(suffixList);

        return finalList;
    }
}
