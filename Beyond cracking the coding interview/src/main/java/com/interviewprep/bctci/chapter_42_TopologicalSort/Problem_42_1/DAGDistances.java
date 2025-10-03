package com.interviewprep.bctci.chapter_42_TopologicalSort.Problem_42_1;

import com.interviewprep.bctci.chapter_36_Graphs.Edge;
import com.interviewprep.bctci.chapter_42_TopologicalSort.Topological_Sort.TopologicalSort;

import java.util.Arrays;
import java.util.List;

public class DAGDistances {
    public static final float MAX_VALUE = 1000000000;

    // Cannot use dijkstra since it has negative weights
    public static float[] findShortestPathToAllNodesFromSource(List<List<Edge>> dag, int start) {
        List<Integer> topologicalOrder = TopologicalSort.kahnImpl(dag);

        int indexOfStart = topologicalOrder.indexOf(start);
        float[] distances = new float[dag.size()];
        Arrays.fill(distances, MAX_VALUE);
        distances[start] = 0;

        // for every node in the topological ordering
        for (int i = indexOfStart; i < topologicalOrder.size(); i++) {
            int node = topologicalOrder.get(i);
            // update the distance of
            for (Edge edge : dag.get(node)) {
                int nbr = edge.destinationNode();
                float weight = edge.weight();
                // if there is a smaller weight (but longer) path available, it will appear later in the topological ordering
                if (distances[node] + weight < distances[nbr]) {
                    distances[nbr] = distances[node] + weight;
                }
            }
        }

        return distances;
    }

}
