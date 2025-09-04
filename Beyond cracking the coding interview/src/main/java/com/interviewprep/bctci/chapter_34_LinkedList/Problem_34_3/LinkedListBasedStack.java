package com.interviewprep.bctci.chapter_34_LinkedList.Problem_34_3;

import com.interviewprep.bctci.chapter_34_LinkedList.Node;

public class LinkedListBasedStack<T> {
    private Node<T> head;
    private int length;

    LinkedListBasedStack() {
        head = null;
        length = 0;
    }

    // push front of singly linked list
    public void push(T val) {
        Node<T> newNode = new Node<>(val);

        newNode.next = head;
        head = newNode;
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