package com.interviewprep.bctci.chapter_35_Trees.Problem_35_6;

import com.interviewprep.bctci.chapter_35_Trees.Node;

public class BinaryTree {
    public static <T> void invert(Node<T> root) {
        if(root == null) {
            return;
        }

        invert(root.left);
        invert(root.right);

        // swap left and right
        Node<T> left = root.left;
        root.left = root.right;
        root.right = left;
    }
}
