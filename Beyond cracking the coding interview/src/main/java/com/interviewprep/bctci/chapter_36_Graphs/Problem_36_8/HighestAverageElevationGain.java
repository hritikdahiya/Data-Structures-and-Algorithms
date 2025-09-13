package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_8;

import com.interviewprep.bctci.chapter_36_Graphs.Edge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HighestAverageElevationGain {
    public static float findHighestAverageElevationGain(int V, List<Edge> edges) {
        if (edges.isEmpty() || V < 2) {
            return 0;
        }

        // convert edges to adjacency list
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        for (Edge edge : edges) {
            graph.get(edge.sourceNode()).add(edge);
            graph.get(edge.destinationNode()).add(edge);
        }

        float maxHilliness = 0;
        Set<Integer> visited = new HashSet<>();
        for (int source = 0; source < V; source++) {
            if (!visited.contains(source)) {
                // totalElevationGain[0] = elevationGain, totalElevationGain[1] = #edges
                float[] totalElevationGain = new float[]{0, 0};

                // traverse over connected component and sum to elevation gain of every edge along the way
                dfs(graph, source, visited, totalElevationGain);

                // hilliness = (sum of elevation diff / num of edges in that component)
                // dfs algo above counts the elevation diff TWICE as well as the edges count TWICE, do a simple division should do the trick
                // no need to dive both of them by 2 unnecessarily
                float hilliness = totalElevationGain[0] / (totalElevationGain[1]);

                // calc hilliness and update max value
                maxHilliness = Math.max(maxHilliness, hilliness);
            }
        }

        return maxHilliness;
    }

    private static void dfs(List<List<Edge>> graph, Integer currNode, Set<Integer> visited, float[] totalElevationGain) {
        if (visited.contains(currNode)) {
            return;
        }

        visited.add(currNode);
        for (int i = 0; i < graph.get(currNode).size(); i++) {
            Edge edge = graph.get(currNode).get(i);

            // calculate sum of edges as we dfs along the way (it wll be counted twice)
            totalElevationGain[0] += edge.weight();
            totalElevationGain[1]++;

            dfs(graph, edge.destinationNode(), visited, totalElevationGain);
        }
    }
}
