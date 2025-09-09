package com.interviewprep.bctci.chapter_35_Trees;

// keeping member variables public for ease of use. NOT IDEAL
public class Node<T> {
    public T val;
    public Node<T> left;
    public Node<T> right;
    public Node<T> parent;

    public Node(T val) {
        this(val, null, null, null);
    }

    public Node(T val, Node<T> parent) {
        this(val, null, null, parent);
    }


    public Node(T val, Node<T> left, Node<T> right) {
        this(val, left, right, null);
    }

    public Node(T val, Node<T> left, Node<T> right, Node<T> parent) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.parent = parent;
    }
}
