package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ReachabilityQueries {
    public static boolean[] isReachable(List<List<Integer>> graph, Integer[][] queries) {
        int k = queries.length;
        boolean[] responses = new boolean[k];
        if (k < 1) {
            return responses;
        }

        // stores which connected component does a node belong to
        Map<Integer, Integer> nodeToComponentMap = new HashMap<>();

        int componentNumber = 1;
        for (int node = 0; node < graph.size(); node++) {
            populateNodeToComponentMapWithDFS(graph, node, componentNumber, nodeToComponentMap);
            componentNumber++;
        }

        int i = 0;
        for (Integer[] query : queries) {
            Integer source = query[0], destination = query[1];
            // for every query check if both the nodes belong to the same connected component
            responses[i++] = Objects.equals(
                    nodeToComponentMap.getOrDefault(source, 0),
                    nodeToComponentMap.getOrDefault(destination, -1)
            );
        }
        return responses;
    }

    private static void populateNodeToComponentMapWithDFS(List<List<Integer>> graph, Integer currNode, int componentNumber, Map<Integer, Integer> nodeToComponentMap) {
        if (nodeToComponentMap.containsKey(currNode)) {
            return;
        }
        nodeToComponentMap.put(currNode, componentNumber);

        for (int i = 0; i < graph.get(currNode).size(); i++) {
            int neighbor = graph.get(currNode).get(i);
            populateNodeToComponentMapWithDFS(graph, neighbor, componentNumber, nodeToComponentMap);
        }
    }
}
