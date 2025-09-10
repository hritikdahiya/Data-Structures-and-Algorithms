package com.interviewprep.bctci.chapter_35_Trees.Problem_35_12;

import com.interviewprep.bctci.chapter_35_Trees.Node;

import java.util.Comparator;
import java.util.Objects;

public class BSTSearch {
    public static <T> boolean containsRecursive(Node<T> root, T valToFind, Comparator<T> comparator) {
        if (root == null) {
            return false;
        }

        int comparison = Objects.compare(valToFind, root.val, comparator);
        if (comparison == 0) {
            return true;
        }

        return comparison < 0 ? containsRecursive(root.left, valToFind, comparator) : containsRecursive(root.right, valToFind, comparator);
    }

    public static <T> boolean containsIterative(Node<T> root, T valToFind, Comparator<T> comparator) {
        Node<T> curr = root;
        while (curr != null) {
            int comparison = Objects.compare(valToFind, curr.val, comparator);
            if (comparison == 0) {
                return true;
            } else if (comparison < 0) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }

        return false;
    }

}
