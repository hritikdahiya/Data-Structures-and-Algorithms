package com.interviewprep.bctci.chapter_34_LinkedList.Problem_34_1;

public class SinglyLinkedList {
    private Node head;
    private int length;

    SinglyLinkedList() {
        length = 0;
        head = null;
    }

    // T - O(1)
    public void pushFront(Integer val) {
        Node newNode = new Node(val);
        length++;

        newNode.next = head;
        head = newNode;
    }

    // T - O(1)
    public Integer popFront() {
        if (head == null) {
            // no element in the list
            return null;
        }

        length--;

        if(head.next == null) {
            // one element in the list
            Node curr = head;
            head = null;
            return curr.val;
        }

        Node oldHead = head;
        head = head.next;       // actual pop operation - move head ahead
        oldHead.next = null;    // not really required but helps gc
        return oldHead.val;
    }

    // T - O(n)
    public void pushBack(Integer val) {
        Node newNode = new Node(val);
        length++;

        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    // T - O(n)
    public Integer popBack() {
        if (head == null) {
            // no element in the list
            return null;
        }

        length--;

        if (head.next == null) {
            // one element in the list
            Node currHead = head;
            head = null;
            return currHead.val;
        }

        // > 1 element in the list
        Node curr = head;
        while (curr.next != null && curr.next.next != null) {
            curr = curr.next;
        }

        // previous now points are the second last element in the list
        Node nodeToRemove = curr.next;
        curr.next = null;

        return nodeToRemove.val;
    }

    // T - O(1)
    public int size() {
        return length;
    }

    // T - O(n) linear traversal
    public boolean contains(int v) {
        Node curr = head;
        while (curr != null) {
            if (curr.val == v) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
}

class Node {
    Integer val;
    Node next;

    Node(Integer val) {
        this.val = val;
        this.next = null;
    }
}
