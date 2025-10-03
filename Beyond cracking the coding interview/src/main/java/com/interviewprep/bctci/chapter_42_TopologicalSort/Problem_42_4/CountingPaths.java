package com.interviewprep.bctci.chapter_42_TopologicalSort.Problem_42_4;

import com.interviewprep.bctci.chapter_36_Graphs.Edge;
import com.interviewprep.bctci.chapter_42_TopologicalSort.Topological_Sort.TopologicalSort;

import java.util.List;

public class CountingPaths {
    // number of ways to any node, i = sum of ways to reach its neighbors from source who have an outgoing edge to i
    public static int[] countPathsToAllNodesFromSource(List<List<Edge>> dag, int source) {
        int V = dag.size();

        // topological sort makes sure that we have found the number of ways to reach any node
        List<Integer> topologicalOrder = TopologicalSort.kahnImpl(dag);

        int[] countPaths = new int[V];
        countPaths[source] = 1;
        int indexOfSource = topologicalOrder.indexOf(source);

        for (int i = indexOfSource; i < V; i++) {
            int node = topologicalOrder.get(i);
            for (Edge edge : dag.get(node)) {
                int nbr = edge.destinationNode();
                countPaths[nbr] += countPaths[node];
            }
        }

        return countPaths;
    }
}
