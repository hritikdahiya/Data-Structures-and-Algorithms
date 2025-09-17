package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_11;

import java.util.*;

import static java.lang.Integer.MAX_VALUE;

public class GraphHangout {
    // node 1, 2, and 3 are definitely present in the graph
    public static int findMinimumDistanceTravelled(List<List<Integer>> graph, int node1, int node2, int node3) {
        // minimum distance of every node from node 1
        Map<Integer, Integer> distanceMap1 = new HashMap<>();
        // minimum distance of every node from node 2
        Map<Integer, Integer> distanceMap2 = new HashMap<>();
        // minimum distance of every node from node 3
        Map<Integer, Integer> distanceMap3 = new HashMap<>();

        // populate distance map for every node using BFS
        bfs(graph, node1, distanceMap1);
        bfs(graph, node2, distanceMap2);
        bfs(graph, node3, distanceMap3);

        int result = MAX_VALUE;
        // for every node, calculate its distance to node1, node2 and node3 and find the minimum
        for (int i = 0; i < graph.size(); i++) {
            result = Math.min(result, distanceMap1.get(i) + distanceMap2.get(i) + distanceMap3.get(i));
        }

        return result;
    }

    private static void bfs(List<List<Integer>> graph, int currNode, Map<Integer, Integer> distanceMap) {
        Queue<Map.Entry<Integer, Integer>> bfsQueue = new LinkedList<>();
        bfsQueue.add(new AbstractMap.SimpleEntry<>(currNode, 0));
        while (!bfsQueue.isEmpty()) {
            Map.Entry<Integer, Integer> entry = bfsQueue.poll();
            int node = entry.getKey(), dist = entry.getValue();

            distanceMap.put(node, dist);

            for (int i = 0; i < graph.get(node).size(); i++) {
                int neighbor = graph.get(node).get(i);
                if (!distanceMap.containsKey(neighbor)) {
                    bfsQueue.add(new AbstractMap.SimpleEntry<>(neighbor, dist + 1));
                }
            }
        }
    }
}
