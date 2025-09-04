package com.interviewprep.bctci.chapter_34_LinkedList;

// keeping member variables public for ease of use. NOT IDEAL
public class Node<T> {
    public T val;
    public Node<T> next;
    public Node<T> prev;

    public Node(T val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
