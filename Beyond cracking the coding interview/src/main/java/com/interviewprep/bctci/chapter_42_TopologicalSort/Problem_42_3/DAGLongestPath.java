package com.interviewprep.bctci.chapter_42_TopologicalSort.Problem_42_3;

import com.interviewprep.bctci.chapter_36_Graphs.Edge;
import com.interviewprep.bctci.chapter_42_TopologicalSort.Topological_Sort.TopologicalSort;

import java.util.Arrays;
import java.util.List;

public class DAGLongestPath {
    public static final float MIN_VALUE = -1000000000;

    public static float[] getLongestPathFromSourceToDestination(List<List<Edge>> dag, int source) {
        List<Integer> topologicalOrder = TopologicalSort.kahnImpl(dag);

        float[] distance = new float[dag.size()];
        Arrays.fill(distance, MIN_VALUE);
        distance[source] = 0;

        int indexOfSource = topologicalOrder.indexOf(source);
        for (int i = indexOfSource; i < topologicalOrder.size(); i++) {
            int node = topologicalOrder.get(i);
            for (Edge edge : dag.get(node)) {
                int nbr = edge.destinationNode();
                float weight = edge.weight();

                if (distance[node] + weight > distance[nbr]) {
                    distance[nbr] = distance[node] + weight;
                }
            }
        }

        return distance;
    }
}
