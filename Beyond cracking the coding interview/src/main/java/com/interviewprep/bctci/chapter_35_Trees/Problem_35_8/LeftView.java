package com.interviewprep.bctci.chapter_35_Trees.Problem_35_8;

import com.interviewprep.bctci.chapter_35_Trees.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeftView {
    public static <T> List<T> leftView(Node<T> root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<T> leftViewList = new ArrayList<>();

        Queue<NodeAndDepth<T>> bfsQueue = new LinkedList<>();
        bfsQueue.add(new NodeAndDepth<>(root, 0));
        while (!bfsQueue.isEmpty()) {
            NodeAndDepth<T> nodeAndDepth = bfsQueue.poll();
            Node<T> node = nodeAndDepth.node();
            int depth = nodeAndDepth.depth();

            if (node == null) {
                continue;
            }

            // only add one (the left most) element to leftView list per depth
            if (leftViewList.size() == depth) {
                leftViewList.add(node.val);
            }

            bfsQueue.add(new NodeAndDepth<>(node.left, depth + 1));
            bfsQueue.add(new NodeAndDepth<>(node.right, depth + 1));
        }

        return leftViewList;
    }
}
