package com.interviewprep.bctci.chapter_35_Trees.Problem_35_14;

import com.interviewprep.bctci.chapter_35_Trees.Node;

import java.util.LinkedList;
import java.util.Queue;

public class BSTValidation {
    public static boolean isBSTValidIterative(Node<Integer> root) {
        if (root == null) {
            return true;
        }

        Queue<Node<Integer>> bfsQueue = new LinkedList<>();
        bfsQueue.add(root);

        while (!bfsQueue.isEmpty()) {
            Node<Integer> curr = bfsQueue.poll();
            if (curr.left != null) {
                if (curr.val < curr.left.val) {
                    return false;
                }
                bfsQueue.add(curr.left);
            }
            if (curr.right != null) {
                if (curr.val > curr.right.val) {
                    return false;
                }
                bfsQueue.add(curr.right);
            }
        }

        return true;
    }

    public static boolean isBSTValidRecursive(Node<Integer> root) {
        if (root == null) {
            return true;
        }

        boolean isLeftValid = true, isRightValid = true;
        if (root.left != null) {
            if (root.val < root.left.val) {
                return false;
            }
            isLeftValid = isBSTValidRecursive((root.left));
        }
        if (root.right != null) {
            if (root.val > root.right.val) {
                return false;
            }
            isRightValid = isBSTValidRecursive(root.right);
        }

        return isLeftValid && isRightValid;
    }
}
