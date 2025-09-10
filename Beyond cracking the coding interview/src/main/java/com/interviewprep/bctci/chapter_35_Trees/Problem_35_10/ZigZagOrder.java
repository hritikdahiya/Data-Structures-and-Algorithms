package com.interviewprep.bctci.chapter_35_Trees.Problem_35_10;

import com.interviewprep.bctci.chapter_35_Trees.Node;

import java.util.*;

public class ZigZagOrder {
    public static <T> List<T> traverse(Node<T> root) {
        List<T> zigZagOrder = new ArrayList<>();
        if (root == null) {
            return zigZagOrder;
        }

        Queue<Map.Entry<Node<T>, Integer>> bfsQueue = new LinkedList<>();
        bfsQueue.add(new AbstractMap.SimpleEntry<>(root, 0));
        int currDepth = 0;
        // keep track of nodes at currDepth level
        List<T> currentNodes = new ArrayList<>();
        while (!bfsQueue.isEmpty()) {
            Map.Entry<Node<T>, Integer> entry = bfsQueue.poll();
            Node<T> node = entry.getKey();
            int depth = entry.getValue();
            if (node == null) {
                continue;
            }

            // when all the current depth nodes have been traversed
            if (depth > currDepth) {
                // if at odd level, reverse the order of nodes for zigzag traversal
                if (currDepth % 2 == 1) {
                    Collections.reverse(currentNodes);
                }
                zigZagOrder.addAll(currentNodes);
                currentNodes.clear();
                currDepth++;
            }

            currentNodes.add(node.val);
            bfsQueue.add(new AbstractMap.SimpleEntry<>(node.left, depth + 1));
            bfsQueue.add(new AbstractMap.SimpleEntry<>(node.right, depth + 1));
        }

        // add the last level to the zigzag order as well
        if (currDepth % 2 == 1) {
            Collections.reverse(currentNodes);
        }
        zigZagOrder.addAll(currentNodes);

        return zigZagOrder;
    }

    // Use a stack to keep track of node
    // Add odd depth nodes in stack from L to R (so they can be read from R to L)
    // Add even depth nodes in stack from R to L (so they can be read from L to R)
    public static <T> List<T> traverseUsingStack(Node<T> root) {
        List<T> zigZagOrder = new ArrayList<>();
        if (root == null) {
            return zigZagOrder;
        }

        Stack<Map.Entry<Node<T>, Integer>> mainStack = new Stack<>();
        mainStack.push(new AbstractMap.SimpleEntry<>(root, 0));

        while (!mainStack.isEmpty()) {
            Stack<Map.Entry<Node<T>, Integer>> childrenStack = new Stack<>();
            while (!mainStack.isEmpty()) {
                Map.Entry<Node<T>, Integer> entry = mainStack.pop();
                Node<T> node = entry.getKey();
                int depth = entry.getValue();

                if (node == null) {
                    continue;
                }

                zigZagOrder.add(node.val);

                // if node at even depth, the nodes at this level are being read L to R
                // add its children in L to R fashion in stack (so they will be read from R to L)
                if (depth % 2 == 0) {
                    childrenStack.push(new AbstractMap.SimpleEntry<>(node.left, depth + 1));
                    childrenStack.push(new AbstractMap.SimpleEntry<>(node.right, depth + 1));
                }
                // if node at odd depth, the nodes at this level are being read R to L
                // add its children in R to L fashion in stack (so they will be read from L to R)
                else {
                    childrenStack.push(new AbstractMap.SimpleEntry<>(node.right, depth + 1));
                    childrenStack.push(new AbstractMap.SimpleEntry<>(node.left, depth + 1));
                }
            }

            mainStack = childrenStack;
        }

        return zigZagOrder;
    }
}
