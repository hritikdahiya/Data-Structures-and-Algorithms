package com.interviewprep.bctci.chapter_35_Trees.Problem_35_15;

import com.interviewprep.bctci.chapter_35_Trees.Node;

import java.util.*;

public class BSTDuplicateDetection {
    public static <T> boolean containDuplicates(Node<T> root, Comparator<T> comparator) {
        Boolean[] result = new Boolean[]{false};

        if (root != null) {
            containDuplicatesHelper(root, comparator, result);
        }

        return result[0];
    }

    private static <T> Map.Entry<T, T> containDuplicatesHelper(Node<T> root, Comparator<T> comparator, Boolean[] result) {
        if (root == null) {
            return new AbstractMap.SimpleEntry<>(null, null);
        }

        T minVal, maxVal;
        Map.Entry<T, T> leftResult = containDuplicatesHelper(root.left, comparator, result);
        Map.Entry<T, T> rightResult = containDuplicatesHelper(root.right, comparator, result);

        // root is smaller than the greatest in the left subtree
        if (leftResult.getValue() != null && Objects.compare(root.val, leftResult.getValue(), comparator) == 0) {
            result[0] = true;
        }
        // root is greater than the smallest in the right subtree
        if (rightResult.getKey() != null && Objects.compare(root.val, rightResult.getKey(), comparator) == 0) {
            result[0] = true;
        }

        if (leftResult.getKey() == null) {
            minVal = root.val;
        } else {
            minVal = Objects.compare(root.val, leftResult.getKey(), comparator) < 0 ? root.val : leftResult.getKey();
        }

        if (rightResult.getValue() == null) {
            maxVal = root.val;
        } else {
            maxVal = Objects.compare(root.val, rightResult.getValue(), comparator) < 0 ? rightResult.getValue() : root.val;
        }

        return new AbstractMap.SimpleEntry<>(minVal, maxVal);
    }

    public static <T> boolean containDuplicatesWithInorderTraversal(Node<T> root, Comparator<T> comparator) {
        if (root == null) {
            return false;
        }

        List<T> inorderTraversal = new ArrayList<>();

        traverseInOrder(root, inorderTraversal);

        for (int i = 1; i < inorderTraversal.size(); i++) {
            if (Objects.compare(inorderTraversal.get(i), inorderTraversal.get(i - 1), comparator) == 0) {
                return true;
            }
        }

        return false;
    }

    private static <T> void traverseInOrder(Node<T> root, List<T> traversalList) {
        if (root == null) {
            return;
        }

        traverseInOrder(root.left, traversalList);
        traversalList.add(root.val);
        traverseInOrder(root.right, traversalList);
    }

}
