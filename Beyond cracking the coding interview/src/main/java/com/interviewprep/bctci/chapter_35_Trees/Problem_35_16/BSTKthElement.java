package com.interviewprep.bctci.chapter_35_Trees.Problem_35_16;

import com.interviewprep.bctci.chapter_35_Trees.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BSTKthElement {
    public static <T> T getKthElementIterative(Node<T> root, int k) {
        Node<T> curr = root;

        int elementsCovered = -1;
        Stack<Node<T>> stack = new Stack<>();
        goLeftAndAddToStack(curr, stack);

        while (!stack.isEmpty()) {
            curr = stack.pop();
            elementsCovered++;
            if (elementsCovered == k) {
                return curr.val;
            }

            goLeftAndAddToStack(curr.right, stack);
        }

        return null;
    }

    private static <T> void goLeftAndAddToStack(Node<T> curr, Stack<Node<T>> stack) {
        while (curr != null) {
            stack.push(curr);
            curr = curr.left;
        }
    }

    public static <T> T getKthElementRecursive(Node<T> root, int k) {
        if (root == null) {
            return null;
        }

        Integer[] elementsCovered = {-1};
        List<T> kthElement = new ArrayList<>();
        kthElement.add(null);

        traverseInOrder(root, k, elementsCovered, kthElement);

        return kthElement.get(0);
    }

    private static <T> void traverseInOrder(Node<T> root, int k, Integer[] elementsCovered, List<T> kthElement) {
        if (root == null) {
            return;
        }

        traverseInOrder(root.left, k, elementsCovered, kthElement);

        elementsCovered[0]++;
        if (elementsCovered[0] == k) {
            kthElement.set(0, root.val);
            return;
        }

        traverseInOrder(root.right, k, elementsCovered, kthElement);
    }
}
