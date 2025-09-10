package com.interviewprep.bctci.chapter_35_Trees.Problem_35_14;

import com.interviewprep.bctci.chapter_35_Trees.Node;

import java.util.AbstractMap;
import java.util.Map;

public class BSTValidation {

    public static boolean isBSTValidRecursive(Node<Integer> root) {
        Boolean[] result = new Boolean[]{true};
        if (root != null) {
            isBSTValidRecursiveHelper(root, result);
        }
        return result[0];
    }

    // returns a pair of minValue and maxValue under the tree rooted at root
    public static Map.Entry<Integer, Integer> isBSTValidRecursiveHelper(Node<Integer> root, Boolean[] result) {
        if (root == null) {
            return new AbstractMap.SimpleEntry<>(Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Map.Entry<Integer, Integer> leftTreeStats = isBSTValidRecursiveHelper(root.left, result);
        Map.Entry<Integer, Integer> rightTreeStats = isBSTValidRecursiveHelper(root.right, result);

        // BST condition check
        if (root.val < leftTreeStats.getValue() || root.val > rightTreeStats.getKey()) {
            result[0] = false;
        }

        return new AbstractMap.SimpleEntry<>(Math.min(root.val, leftTreeStats.getKey()), Math.max(root.val, rightTreeStats.getValue()));
    }
}
