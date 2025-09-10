package com.interviewprep.bctci.chapter_35_Trees.Problem_35_11;

import com.interviewprep.bctci.chapter_35_Trees.Node;

import java.util.HashMap;
import java.util.Map;

public class MostProtectedNodeSpaceEfficient {
    public static <T> Integer findHighestProtectionLevel(Node<T> root) {
        Map<Node<T>, Integer> protectionLevelMap = new HashMap<>();

        // maintains the count of nodes at any level,
        // 1. while DFS traversing with L to R, it keeps the left padding count of any node
        Map<Integer, Integer> nodeCountPerDepthCountMap = new HashMap<>();

        // calculate protection level based on ancestorCount, descendantCount and leftPadding
        calcIntermediateProtectionLevel(root, 0, nodeCountPerDepthCountMap, protectionLevelMap);

        nodeCountPerDepthCountMap.clear();
        // 2. while DFS traversing with R to L, it keeps the right padding count of any node
        calculateRightPadding(root, 0, nodeCountPerDepthCountMap, protectionLevelMap);

        int highestProtectionLevel = 0;
        if (!protectionLevelMap.isEmpty()) {
            highestProtectionLevel = protectionLevelMap.values().stream().max(Integer::compareTo).get();
        }

        return highestProtectionLevel;
    }

    /**
     * This method calculates
     * 1. ancestorCount,
     * 2. leftPadding, and
     * 3. descendantCount only.
     * <p>
     * It does not calculate rightPadding yet.
     */
    private static <T> int calcIntermediateProtectionLevel(Node<T> root, int depth, Map<Integer, Integer> nodeCountPerDepthCountMap, Map<Node<T>, Integer> protectionLevelMap) {
        if (root == null) {
            return 0;
        }

        // ancestor count is a synonym for the depth of any node
        // update protection level with ancestorCount
        protectionLevelMap.put(root,
                Math.min(protectionLevelMap.getOrDefault(root, Integer.MAX_VALUE), depth));

        // find node stats for left node
        int leftDepth = calcIntermediateProtectionLevel(root.left, depth + 1, nodeCountPerDepthCountMap, protectionLevelMap);

        // left padding will be the number of nodes that have been counted at the current depth/level (till now)
        int leftPadding = nodeCountPerDepthCountMap.getOrDefault(depth, 0);
        nodeCountPerDepthCountMap.put(depth, leftPadding + 1);
        // update protection level with left padding
        protectionLevelMap.put(root,
                Math.min(protectionLevelMap.getOrDefault(root, Integer.MAX_VALUE), leftPadding));

        // find node stats for right node
        int rightDepth = calcIntermediateProtectionLevel(root.right, depth + 1, nodeCountPerDepthCountMap, protectionLevelMap);

        // calculate descendant count from left and right results
        int maxDescendantCount = Math.max(leftDepth, rightDepth) + 1;
        // update protection level with descendant count
        protectionLevelMap.put(root,
                Math.min(protectionLevelMap.getOrDefault(root, Integer.MAX_VALUE), maxDescendantCount));

        return maxDescendantCount;
    }

    /**
     * This method calculates the rightPadding for any node
     */
    private static <T> void calculateRightPadding(Node<T> root,
                                                  int depth,
                                                  Map<Integer, Integer> nodeCountPerDepthCountMap,
                                                  Map<Node<T>, Integer> protectionLevelMap) {
        if (root == null) {
            return;
        }

        calculateRightPadding(root.right, depth + 1, nodeCountPerDepthCountMap, protectionLevelMap);

        // since it has processed all the right nodes, nodeCountPerDepthCountMap keeps the count of nodes to the right
        // of current node at the same depth / level yet
        int rightPadding = nodeCountPerDepthCountMap.getOrDefault(depth, 0);

        protectionLevelMap.put(root,
                Math.min(protectionLevelMap.getOrDefault(root, Integer.MAX_VALUE), rightPadding));
        nodeCountPerDepthCountMap.put(depth, rightPadding + 1);

        calculateRightPadding(root.left, depth + 1, nodeCountPerDepthCountMap, protectionLevelMap);
    }

}
