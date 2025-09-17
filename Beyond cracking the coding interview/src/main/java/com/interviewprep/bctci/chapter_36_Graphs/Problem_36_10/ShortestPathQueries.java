package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_10;

import java.util.*;

public class ShortestPathQueries {
    public static List<Integer>[] findShortestPathFromANode(List<List<Integer>> graph, Integer[] queries, int sourceNode) {
        int numOfQueries = queries.length;
        List<Integer>[] responses = new ArrayList[numOfQueries];
        if (numOfQueries < 1) {
            return responses;
        }

        // stores the path for every node from sourceNode
        Map<Integer, List<Integer>> pathMap = new HashMap<>();
        pathMap.put(sourceNode, new ArrayList<>());
        pathMap.get(sourceNode).add(sourceNode);

        Queue<Integer> bfsQueue = new LinkedList<>();
        bfsQueue.add(sourceNode);

        while (!bfsQueue.isEmpty()) {
            int node = bfsQueue.poll();

            for (int i = 0; i < graph.get(node).size(); i++) {
                int neighbor = graph.get(node).get(i);
                if (!pathMap.containsKey(neighbor)) {
                    List<Integer> pathTillNode = new ArrayList<>(pathMap.get(node));
                    pathTillNode.add(neighbor);

                    pathMap.put(neighbor, pathTillNode);
                    bfsQueue.add(neighbor);
                }
            }
        }

        for (int i = 0; i < numOfQueries; i++) {
            responses[i] = pathMap.getOrDefault(queries[i], new ArrayList<>());
        }

        return responses;
    }
}
