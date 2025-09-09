package com.interviewprep.bctci.chapter_35_Trees.Problem_35_4;

import com.interviewprep.bctci.chapter_35_Trees.Node;

import java.util.HashMap;
import java.util.Map;

public class TreeLayout {
    public static <T> Integer maxNumOfStackedNodes(Node<T> root) {
        Map<Coordinate, Integer> frequencyMap = new HashMap<>();
        Integer[] maxCount = new Integer[]{0};

        maxNumOfStackedNodesHelper(root, 0, 0, frequencyMap, maxCount);

        return maxCount[0];
    }

    private static <T> void maxNumOfStackedNodesHelper(Node<T> root, int r, int c, Map<Coordinate, Integer> freqMap, Integer[] maxCount) {
        if (root == null) {
            return;
        }

        Coordinate coordinate = new Coordinate(r, c);
        // increment the count of nodes on given coordinate
        freqMap.put(coordinate, freqMap.getOrDefault(coordinate, 0) + 1);
        // update the answer
        maxCount[0] = Math.max(maxCount[0], freqMap.get(coordinate));

        maxNumOfStackedNodesHelper(root.left, r + 1, c, freqMap, maxCount);
        maxNumOfStackedNodesHelper(root.right, r, c + 1, freqMap, maxCount);
    }
}
