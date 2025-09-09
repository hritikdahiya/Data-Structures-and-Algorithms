package com.interviewprep.bctci.chapter_35_Trees.Problem_35_3;

import com.interviewprep.bctci.chapter_35_Trees.Node;

public class AlignedPath {
    public static Integer longestAlignedPathLength(Node<Integer> root) {
        Integer[] longestLength = new Integer[]{0};

        longestAlignedPathLength(root, 0, longestLength);

        return longestLength[0];
    }

    private static Integer longestAlignedPathLength(Node<Integer> root, int currDepth, Integer[] longestLength) {
        if (root == null) {
            return 0;
        }

        int leftNodePathLength = longestAlignedPathLength(root.left, currDepth + 1, longestLength);
        int rightNodePathLength = longestAlignedPathLength(root.right, currDepth + 1, longestLength);

        if (root.val == currDepth) {
            longestLength[0] = Math.max(longestLength[0], leftNodePathLength + rightNodePathLength + 1);
            return 1 + Math.max(leftNodePathLength, rightNodePathLength);
        } else {
            return 0;
        }
    }
}
