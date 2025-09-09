package com.interviewprep.bctci.chapter_35_Trees.Problem_35_1;

import com.interviewprep.bctci.chapter_35_Trees.Node;

public class AlignedChain {
    public static Integer longestAlignedChainLength(Node<Integer> root) {
        Integer[] longestLength = new Integer[]{0};

        longestAlignedChainLength(root, 0, longestLength);

        return longestLength[0];
    }

    private static Integer longestAlignedChainLength(Node<Integer> root, int currDepth, Integer[] longestLength) {
        if (root == null) {
            return 0;
        }

        int leftNodeChainLength = longestAlignedChainLength(root.left, currDepth + 1, longestLength);
        int rightNodeChainLength = longestAlignedChainLength(root.right, currDepth + 1, longestLength);

        if (root.val == currDepth) {
            int chainLength = Math.max(leftNodeChainLength, rightNodeChainLength) + 1;
            longestLength[0] = Math.max(longestLength[0], chainLength);
            return chainLength;
        } else {
            return 0;
        }
    }
}
