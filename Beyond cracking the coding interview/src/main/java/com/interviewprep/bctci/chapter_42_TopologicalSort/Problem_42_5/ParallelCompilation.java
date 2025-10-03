package com.interviewprep.bctci.chapter_42_TopologicalSort.Problem_42_5;

import com.interviewprep.bctci.chapter_36_Graphs.Edge;
import com.interviewprep.bctci.chapter_42_TopologicalSort.Topological_Sort.TopologicalSort;

import java.util.ArrayList;
import java.util.List;

public class ParallelCompilation {
    public static int findTimeToCompile(int[] seconds, List<List<Integer>> imports) {
        int V = imports.size();

        // convert imports to adjacency list]
        List<List<Edge>> dagAdjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            dagAdjList.add(new ArrayList<>());
        }
        for (int i = 0; i < V; i++) {
            List<Integer> importsPerNode = imports.get(i);
            for (Integer imp : importsPerNode) {
                dagAdjList.get(imp).add(new Edge(imp, i, 1));
            }
        }

        List<Integer> topologicalOrder = TopologicalSort.kahnImpl(dagAdjList);

        int[] timeToCompile = new int[V];
        int totalTimeToCompile = 0;
        for (Integer node : topologicalOrder) {
            if (timeToCompile[node] == 0) {
                timeToCompile[node] = seconds[node];
            }

            for (Edge edge : dagAdjList.get(node)) {
                int nbrNode = edge.destinationNode();
                if (timeToCompile[nbrNode] < timeToCompile[node] + seconds[nbrNode]) {
                    timeToCompile[nbrNode] = timeToCompile[node] + seconds[nbrNode];
                }
            }
            totalTimeToCompile = Math.max(totalTimeToCompile, timeToCompile[node]);
        }

        return totalTimeToCompile;
    }
}
