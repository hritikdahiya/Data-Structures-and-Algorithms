package com.interviewprep.bctci.chapter_34_LinkedList.Problem_34_2;

import com.interviewprep.bctci.chapter_34_LinkedList.Node;

public class DoublyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int length;

    DoublyLinkedList() {
        length = 0;
        head = null;
        tail = null;
    }

    // T - O(1)
    public void pushFront(T val) {
        Node<T> newNode = new Node<>(val);
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
    public T popFront() {
        if (head == null) {
            // no element in the list
            return null;
        }

        length--;

        Node<T> nodeToRemove = head;
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
    public void pushBack(T val) {
        Node<T> newNode = new Node<>(val);
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
    public T popBack() {
        if (tail == null) {
            // no element in the list
            return null;
        }

        length--;

        Node<T> nodeToRemove = tail;
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
    public boolean contains(T v) {
        Node<T> curr = head;
        while (curr != null) {
            if (curr.val == v) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
}