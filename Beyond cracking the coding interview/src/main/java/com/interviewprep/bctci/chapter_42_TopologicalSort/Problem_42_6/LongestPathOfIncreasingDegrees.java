package com.interviewprep.bctci.chapter_42_TopologicalSort.Problem_42_6;

import com.interviewprep.bctci.chapter_42_TopologicalSort.Topological_Sort.TopologicalSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestPathOfIncreasingDegrees {
    public static int findLongestPathOfIncreasingDegrees(int V, int[][] edges) {
        // make adj list out of edges - unweighted undirected graph
        List<List<Integer>> adjList = new ArrayList<>();
        List<List<Integer>> dag = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
            dag.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }

        // create a DAG out of the undirected graph based on the following property
        // An edge u -> w exists if degree(u) < degree(w)
        for (int node = 0; node < V; node++) {
            int degreeOfNode = adjList.get(node).size();
            for (Integer neighbor : adjList.get(node)) {
                int degreeOfNbr = adjList.get(neighbor).size();

                if (degreeOfNbr < degreeOfNode) {
                    dag.get(neighbor).add(node);
                } else if (degreeOfNbr > degreeOfNode) {
                    dag.get(node).add(neighbor);
                }
            }
        }

        // Topologically sort the DAG
        List<Integer> topologicallyOrderedList = TopologicalSort.kahnImpl2(dag);

        int[] dist = new int[V];
        Arrays.fill(dist, 1);
        // traverse the DAG in topological order and maintain the length of the longest path
        for (int i = 0; i < V; i++) {
            int node = topologicallyOrderedList.get(i);
            for (Integer neighbor : dag.get(node)) {
                if (dist[neighbor] < dist[node] + 1) {
                    dist[neighbor] = dist[node] + 1;
                }
            }
        }

        return Arrays.stream(dist).max().orElse(0);
    }
}
