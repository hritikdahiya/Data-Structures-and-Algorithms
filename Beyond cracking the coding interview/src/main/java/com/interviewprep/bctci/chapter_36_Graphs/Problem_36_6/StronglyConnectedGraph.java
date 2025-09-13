package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StronglyConnectedGraph {
    public static boolean isStronglyConnected(List<List<Integer>> graph) {
        int V = graph.size();
        if (V < 1) {
            return true;
        }

        Set<Integer> visited = new HashSet<>();
        dfs(graph, 0, visited);
        if (visited.size() != V) {
            return false;
        }

        // reverse graph
        List<List<Integer>> reverseGraph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            reverseGraph.add(new ArrayList<>());
        }
        for (int source = 0; source < V; source++) {
            for (int nbr = 0; nbr < graph.get(source).size(); nbr++) {
                reverseGraph.get(nbr).add(source);
            }
        }

        visited.clear();
        dfs(reverseGraph, 0, visited);

        return visited.size() == V;
    }

    private static void dfs(List<List<Integer>> graph, int currNode, Set<Integer> visited) {
        if (visited.contains(currNode)) {
            return;
        }
        visited.add(currNode);
        for (int i = 0; i < graph.get(currNode).size(); i++) {
            dfs(graph, graph.get(currNode).get(i), visited);
        }
    }
}
