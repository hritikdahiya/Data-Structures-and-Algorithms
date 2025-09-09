package com.interviewprep.bctci.chapter_35_Trees.Problem_35_5;

import com.interviewprep.bctci.chapter_35_Trees.Node;

public class TriangleCount {
    public static <T> Integer count(Node<T> root) {
        Integer[] totalCount = new Integer[]{0};

        countHelper(root, totalCount);

        return totalCount[0];
    }

    private static <T> Pair countHelper(Node<T> root, Integer[] totalCount) {
        if (root == null) {
            return new Pair(0, 0);
        }

        Pair left = countHelper(root.left, totalCount);
        Pair right = countHelper(root.right, totalCount);

        totalCount[0] += Math.min(left.leftCount(), right.rightCount());

        return new Pair(1 + left.leftCount(), 1 + right.rightCount());
    }
}
