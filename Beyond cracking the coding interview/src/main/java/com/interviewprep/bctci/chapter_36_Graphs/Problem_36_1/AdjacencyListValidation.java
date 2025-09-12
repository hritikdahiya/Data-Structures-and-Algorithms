package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AdjacencyListValidation {
    public static boolean isGraphValid(List<List<Integer>> graph) {
        int v = graph.size();

        List<Set<Integer>> neighborSetGraph = new ArrayList<>();
        // O(v + E) operation
        for (List<Integer> neighbors : graph) {
            neighborSetGraph.add(new HashSet<>(neighbors));
        }

        for (int sourceNode = 0; sourceNode < v; sourceNode++) {
            List<Integer> neighbors = graph.get(sourceNode);
            Set<Integer> seenNeighbors = new HashSet<>();
            for (Integer sinkNode : neighbors) {
                // self loop
                if (sinkNode == sourceNode) {
                    return false;
                }
                // vertices are not between 0 and V-1
                if (sinkNode < 0 || sinkNode > v - 1) {
                    return false;
                }
                // parallel edges
                if (seenNeighbors.contains(sinkNode)) {
                    return false;
                }
                // unidirectional relationship
                if (!neighborSetGraph.get(sinkNode).contains(sourceNode)) {
                    return false;
                }

                seenNeighbors.add(sinkNode);
            }
        }

        return true;
    }

}
