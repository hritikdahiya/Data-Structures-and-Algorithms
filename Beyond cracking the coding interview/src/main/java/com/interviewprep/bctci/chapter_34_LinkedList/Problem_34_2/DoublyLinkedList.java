package com.interviewprep.bctci.chapter_34_LinkedList.Problem_34_2;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    DoublyLinkedList() {
        length = 0;
        head = null;
        tail = null;
    }

    // T - O(1)
    public void pushFront(Integer val) {
        Node newNode = new Node(val);
        length++;

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // T - O(1)
    public Integer popFront() {
        if (head == null) {
            // no element in the list
            return null;
        }

        length--;

        Node nodeToRemove = head;
        head = head.next;
        if (head == null) {
            // if the list had only a single element, update tail as well since they were pointing to the same element
            tail = null;
        } else {
            head.prev = null;
        }

        return nodeToRemove.val;
    }

    // T - O(1)
    public void pushBack(Integer val) {
        Node newNode = new Node(val);
        length++;

        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // T - O(1)
    public Integer popBack() {
        if (tail == null) {
            // no element in the list
            return null;
        }

        length--;

        Node nodeToRemove = tail;
        tail = tail.prev;
        if (tail == null) {
            // if the list had only a single element, update head as well since they were pointing to the same element
            head = null;
        } else {
            tail.next = null;
        }

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
    Node prev;

    Node(Integer val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
