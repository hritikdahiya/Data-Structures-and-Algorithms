package com.interviewprep.bctci.chapter_34_LinkedList.Problem_34_12;

import com.interviewprep.bctci.chapter_34_LinkedList.Node;

public class LinkedListZip {
    public static <T> Node<T> zip(Node<T> list1, Node<T> list2) {
        Node<T> zipDummyNode = new Node<>(null);
        Node<T> curr = zipDummyNode;

        int turn = 0;
        while (list1 != null && list2 != null) {
            Node<T> newNode;
            if (turn == 0) {
                newNode = new Node<>(list1.val);
                list1 = list1.next;
                turn = 1;
            } else {
                newNode = new Node<>(list2.val);
                list2 = list2.next;
                turn = 0;
            }
            curr.next = newNode;
            curr = newNode;
        }

        while (list1 != null) {
            Node<T> newNode = new Node<>(list1.val);
            list1 = list1.next;
            curr.next = newNode;
            curr = newNode;
        }

        while (list2 != null) {
            Node<T> newNode = new Node<>(list2.val);
            list2 = list2.next;
            curr.next = newNode;
            curr = newNode;
        }

        return zipDummyNode.next;
    }
}
