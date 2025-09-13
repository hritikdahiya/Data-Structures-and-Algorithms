package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_7;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HilliestConnectedComponent {
    public static float findHilliestComponent(List<List<Integer>> graph, float[] heights) {
        int V = graph.size();
        if (V < 2) {
            return 0;
        }

        float maxHilliness = 0;
        Set<Integer> visited = new HashSet<>();
        for (int source = 0; source < V; source++) {
            if (!visited.contains(source)) {
                // totalElevationGain[0] = elevationGain, totalElevationGain[1] = #edges
                float[] totalElevationGain = new float[]{0, 0};

                // traverse over connected component and sum to elevation gain of every edge along the way
                dfs(graph, heights, source, visited, totalElevationGain);

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

    private static void dfs(List<List<Integer>> graph, float[] heights, Integer currNode, Set<Integer> visited, float[] hilliness) {
        if (visited.contains(currNode)) {
            return;
        }

        visited.add(currNode);
        for (int i = 0; i < graph.get(currNode).size(); i++) {
            Integer neighbor = graph.get(currNode).get(i);

            // calculate sum of edges as we dfs along the way (it wll be counted twice)
            hilliness[0] += Math.abs(heights[neighbor] - heights[currNode]);
            hilliness[1]++;

            dfs(graph, heights, neighbor, visited, hilliness);
        }
    }
}
