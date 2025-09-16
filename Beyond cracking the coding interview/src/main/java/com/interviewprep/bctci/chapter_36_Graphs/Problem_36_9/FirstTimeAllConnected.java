package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstTimeAllConnected {
    public static int findTransitionPointBinarySearch(int V, List<List<Integer>> cables) {
        int s = 0, e = cables.size() - 1;
        if (isConnected(V, cables, s + 1)) {
            return s;
        }
        if (!isConnected(V, cables, e)) {
            return -1;
        }
        while (e - s > 1) {
            int mid = (s + e) / 2;
            boolean isGraphConnected = isConnected(V, cables, mid + 1);

            if (isGraphConnected) {
                e = mid;
            } else {
                s = mid;
            }
        }

        return e;
    }

    private static boolean isConnected(int V, List<List<Integer>> cables, int numOfCables) {
        List<List<Integer>> graph = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < numOfCables; i++) {
            List<Integer> edge = cables.get(i);

            Integer source = edge.get(0), sink = edge.get(1);
            graph.get(source).add(sink);
            graph.get(sink).add(source);
        }

        Set<Integer> visited = new HashSet<>();
        dfs(graph, 0, visited);
        return visited.size() == V;
    }

    private static void dfs(List<List<Integer>> graph, Integer currNode, Set<Integer> visited) {
        if (visited.contains(currNode)) {
            return;
        }
        visited.add(currNode);
        for (int i = 0; i < graph.get(currNode).size(); i++) {
            dfs(graph, graph.get(currNode).get(i), visited);
        }
    }
}
