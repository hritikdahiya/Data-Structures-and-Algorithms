package com.interviewprep.bctci.chapter_42_TopologicalSort.Problem_42_2;

import com.interviewprep.bctci.chapter_36_Graphs.Edge;
import com.interviewprep.bctci.chapter_42_TopologicalSort.Topological_Sort.TopologicalSort;

import java.util.*;

import static com.interviewprep.bctci.chapter_42_TopologicalSort.Problem_42_1.DAGDistances.MAX_VALUE;

public class DAGPathReconstruction {
    public static List<Integer> getShortestPathFromSourceToDestination(List<List<Edge>> dag, int source, int destination) {
        List<Integer> topologicalOrder = TopologicalSort.kahnImpl(dag);

        float[] distance = new float[dag.size()];
        Arrays.fill(distance, MAX_VALUE);
        distance[source] = 0;

        Map<Integer, Integer> predecessorMap = new HashMap<>();
        int indexOfSource = topologicalOrder.indexOf(source);
        for (int i = indexOfSource; i < topologicalOrder.size(); i++) {
            int node = topologicalOrder.get(i);
            for (Edge edge : dag.get(node)) {
                int nbr = edge.destinationNode();
                float weight = edge.weight();

                if (distance[node] + weight < distance[nbr]) {
                    distance[nbr] = distance[node] + weight;
                    predecessorMap.put(nbr, node);
                }
            }
        }

        // no path to destination
        if (distance[destination] == MAX_VALUE) {
            return new ArrayList<>();
        }

        List<Integer> path = new ArrayList<>();
        Integer predecessor = destination;
        while (predecessor != null) {
            path.add(predecessor);
            predecessor = predecessorMap.get(predecessor);
        }

        Collections.reverse(path);

        return path;
    }
}
