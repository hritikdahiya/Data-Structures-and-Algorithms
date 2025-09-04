package com.interviewprep.bctci.chapter_34_LinkedList.Problem_34_4;

import com.interviewprep.bctci.chapter_34_LinkedList.Node;

public class LinkedListBasedQueue<T> {
    private Node<T> head;
    private Node<T> tail;
    private int length;

    LinkedListBasedQueue() {
        head = null;
        tail = null;
        length = 0;
    }

    // push back of singly linked list
    public void push(T val) {
        Node<T> newNode = new Node<>(val);

        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        length++;
    }

    public T peek() {
        return empty() ? null : head.val;
    }

    public T pop() {
        if (empty()) {
            return null;
        }

        Node<T> oldHead = head;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        length--;
        return oldHead.val;
    }

    public int size() {
        return length;
    }

    public boolean empty() {
        return length == 0;
    }
}