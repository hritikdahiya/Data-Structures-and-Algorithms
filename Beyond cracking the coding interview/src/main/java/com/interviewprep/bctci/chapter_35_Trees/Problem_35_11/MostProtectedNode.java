package com.interviewprep.bctci.chapter_35_Trees.Problem_35_11;

import com.interviewprep.bctci.chapter_35_Trees.Node;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class MostProtectedNode {
    public static <T> Integer findHighestProtectionLevel(Node<T> root) {
        // maintains the count of nodes at any level,
        // 1. while DFS traversing with L to R, it keeps the left padding count of any node
        Map<Integer, Integer> nodeCountPerDepthCountMap = new HashMap<>();

        // instantiate the copy Node which holds extra information about every node
        NodeStats nodeStats = instantiateNodeStats(root, 0, nodeCountPerDepthCountMap);

        nodeCountPerDepthCountMap.clear();
        // 2. while DFS traversing with R to L, it keeps the right padding count of any node
        calculateRightPadding(root, nodeStats, 0, nodeCountPerDepthCountMap);

        // BFS on the tree to find the most protected node
        Queue<NodeStats> bfsQueue = new LinkedList<>();
        bfsQueue.add(nodeStats);
        int highestProtectionLevel = 0;

        while (!bfsQueue.isEmpty()) {
            NodeStats stats = bfsQueue.poll();

            if (stats == null) {
                continue;
            }

            int currProtectionLevel = Math.min(
                    Math.min(stats.descendantCount, stats.ancestorCount),
                    Math.min(stats.leftPadding, stats.rightPadding)
            );

            highestProtectionLevel = Math.max(highestProtectionLevel, currProtectionLevel);

            bfsQueue.add(stats.left);
            bfsQueue.add(stats.right);
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
    private static <T> NodeStats instantiateNodeStats(Node<T> root, int depth, Map<Integer, Integer> nodeCountPerDepthCountMap) {
        if (root == null) {
            return null;
        }

        NodeStats node = new NodeStats();
        // ancestor count is a synonym for the depth of any node
        node.ancestorCount = depth;

        // find node stats for left node
        NodeStats leftNode = instantiateNodeStats(root.left, depth + 1, nodeCountPerDepthCountMap);

        // left padding will be the number of nodes that have been counted at the current depth/level (till now)
        node.leftPadding = nodeCountPerDepthCountMap.getOrDefault(depth, 0);
        nodeCountPerDepthCountMap.put(depth, node.leftPadding + 1);

        // find node stats for right node
        NodeStats rightNode = instantiateNodeStats(root.right, depth + 1, nodeCountPerDepthCountMap);

        // calculate descendant count from left and right results
        node.descendantCount = leftNode == null ?
                (rightNode == null ? 0 : rightNode.descendantCount + 1) :
                (rightNode == null ? leftNode.descendantCount + 1 : Math.max(leftNode.descendantCount, rightNode.descendantCount) + 1);

        node.left = leftNode;
        node.right = rightNode;

        return node;
    }

    /**
     * This method calculates the rightPadding for any node
     */
    private static <T> void calculateRightPadding(Node<T> root, NodeStats statNode, int depth, Map<Integer, Integer> nodeCountPerDepthCountMap) {
        if (root == null) {
            return;
        }

        calculateRightPadding(root.right, statNode.right, depth + 1, nodeCountPerDepthCountMap);

        // since it has processed all the right nodes, nodeCountPerDepthCountMap keeps the count of nodes to the right
        // of current node at the same depth / level yet
        statNode.rightPadding = nodeCountPerDepthCountMap.getOrDefault(depth, 0);
        nodeCountPerDepthCountMap.put(depth, statNode.rightPadding + 1);

        calculateRightPadding(root.left, statNode.left, depth + 1, nodeCountPerDepthCountMap);
    }

}
