package com.interviewprep.bctci.chapter_34_LinkedList.Problem_34_5;

public class LinkedListCopy {
    public static Node copy(Node head) {
        Node dummyNode = new Node(Integer.MIN_VALUE);

        Node newCurr = dummyNode;
        Node oldHeadCurr = head;
        while (oldHeadCurr != null) {
            newCurr.next = new Node(oldHeadCurr.val);
            oldHeadCurr = oldHeadCurr.next;
            newCurr = newCurr.next;
        }

        return dummyNode.next;
    }
}


class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}