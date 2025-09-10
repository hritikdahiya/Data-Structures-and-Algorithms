package com.interviewprep.bctci.chapter_35_Trees.Problem_35_13;

import com.interviewprep.bctci.chapter_35_Trees.Node;

import java.util.Comparator;
import java.util.Objects;

public class BSTNearestValue {

    public static <T> T findNearestSimpler(Node<T> root, T valToFind, Comparator<T> comparator) {
        if (root == null) {
            throw new IllegalArgumentException("Tree is empty");
        }

        T lowerBound = null, upperBound = null;
        Node<T> curr = root;
        while (curr != null) {
            int diff = Objects.compare(valToFind, curr.val, comparator);
            if (diff == 0) {
                // found the value
                return curr.val;
            } else if (diff < 0) {
                // tighten upper bound
                upperBound = curr.val;
                curr = curr.left;
            } else {
                // tighten lower bound
                lowerBound = curr.val;
                curr = curr.right;
            }
        }

        if (lowerBound == null) return upperBound;
        if (upperBound == null) return lowerBound;

        int lowerBoundDiff = Objects.compare(valToFind, lowerBound, comparator);
        int upperBoundDiff = Objects.compare(upperBound, valToFind, comparator);

        return lowerBoundDiff <= upperBoundDiff ? lowerBound : upperBound;
    }

    public static <T> T findNearest(Node<T> root, T valToFind, Comparator<T> comparator) {
        if (root == null) {
            throw new IllegalArgumentException("Tree is empty");
        }

        int minDiff = Integer.MAX_VALUE;
        T closestValue = null;
        Node<T> curr = root;
        while (curr != null) {
            int diff = Objects.compare(valToFind, curr.val, comparator);
            if (diff == 0) {
                // found the value
                closestValue = curr.val;
                break;
            } else if (diff < 0) {
                // update minDiff is an element closer to valToFind is found
                // update the closest value to that element's value
                if (minDiff > -diff) {
                    minDiff = -diff;
                    closestValue = curr.val;
                } else if (minDiff == -diff) {
                    // if the difference is the same, let the closest value be the smaller one
                    closestValue = Objects.compare(closestValue, curr.val, comparator) < 0 ? closestValue : curr.val;
                }
                curr = curr.left;
            } else {
                if (minDiff > diff) {
                    minDiff = diff;
                    closestValue = curr.val;
                } else if (minDiff == diff) {
                    closestValue = Objects.compare(closestValue, curr.val, comparator) < 0 ? closestValue : curr.val;
                }
                curr = curr.right;
            }
        }

        return closestValue;
    }

}
