package com.interviewprep.bctci.chapter_34_LinkedList.Problem_34_1;

import com.interviewprep.bctci.chapter_34_LinkedList.Node;

public class SinglyLinkedList<T> {
    private Node<T> head;
    private int length;

    SinglyLinkedList() {
        length = 0;
        head = null;
    }

    // T - O(1)
    public void pushFront(T val) {
        Node<T> newNode = new Node<>(val);
        length++;

        newNode.next = head;
        head = newNode;
    }

    // T - O(1)
    public T popFront() {
        if (head == null) {
            // no element in the list
            return null;
        }

        length--;

        Node<T> oldHead = head;
        head = head.next;       // actual pop operation - move head ahead
        return oldHead.val;
    }

    // T - O(n)
    public void pushBack(T val) {
        Node<T> newNode = new Node<>(val);
        length++;

        if (head == null) {
            head = newNode;
        } else {
            Node<T> curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    // T - O(n)
    public T popBack() {
        if (head == null) {
            // no element in the list
            return null;
        }

        length--;

        if (head.next == null) {
            // one element in the list
            Node<T> currHead = head;
            head = null;
            return currHead.val;
        }

        // > 1 element in the list
        Node<T> curr = head;
        while (curr.next != null && curr.next.next != null) {
            curr = curr.next;
        }

        // previous now points are the second last element in the list
        Node<T> nodeToRemove = curr.next;
        curr.next = null;

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