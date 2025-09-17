package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_10;

import java.util.*;

public class ShortestPathQueries {
    public static List<Integer>[] findShortestPathFromANode(List<List<Integer>> graph, Integer[] queries, int sourceNode) {
        int numOfQueries = queries.length;
        List<Integer>[] responses = new ArrayList[numOfQueries];
        if (numOfQueries < 1) {
            return responses;
        }

        Map<Integer, Integer> predecessorMap = new HashMap<>();
        predecessorMap.put(sourceNode, null);
        Queue<Integer> bfsQueue = new LinkedList<>();
        bfsQueue.add(sourceNode);

        // BFS traversal to populate the predecessor map
        while (!bfsQueue.isEmpty()) {
            int node = bfsQueue.poll();

            for (int i = 0; i < graph.get(node).size(); i++) {
                int neighbor = graph.get(node).get(i);
                if (!predecessorMap.containsKey(neighbor)) {
                    predecessorMap.put(neighbor, node);
                    bfsQueue.add(neighbor);
                }
            }
        }

        for (int i = 0; i < numOfQueries; i++) {
            int destinationNode = queries[i];
            List<Integer> path = new ArrayList<>();
            if (predecessorMap.containsKey(destinationNode)) {
                path.add(destinationNode);
            }

            int curr = destinationNode;
            while (predecessorMap.get(curr) != null) {
                path.add(predecessorMap.get(curr));
                curr = predecessorMap.get(curr);
            }

            Collections.reverse(path);

            responses[i] = path;
        }

        return responses;
    }
}

