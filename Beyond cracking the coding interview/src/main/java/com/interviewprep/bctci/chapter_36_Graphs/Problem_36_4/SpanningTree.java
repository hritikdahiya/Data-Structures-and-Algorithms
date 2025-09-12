package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpanningTree {
    public static List<Integer[]> getSpanningTree(List<List<Integer>> graph) {
        Map<Integer, Integer> predecessorMap = new HashMap<>();
        List<Integer[]> spanningTree = new ArrayList<>();

        // start dfs with any node
        Integer source = 0;
        predecessorMap.put(source, null);
        buildSpanningTreeDFS(graph, source, predecessorMap, spanningTree);

        // alternatively, just dfs and populate predecessor map, and then build the spanning tree from every entry of the map
        // since dfs visits evey node once
        return spanningTree;
    }

    private static void buildSpanningTreeDFS(List<List<Integer>> graph, Integer currNode, Map<Integer, Integer> predecessorMap, List<Integer[]> spanningTree) {
        if (graph.isEmpty()) {
            return;
        }

        for (Integer neighbor : graph.get(currNode)) {
            // if neighbor has not been visited yet, add this edge to the spanning tree
            if (!predecessorMap.containsKey(neighbor)) {
                spanningTree.add(new Integer[]{currNode, neighbor});
                predecessorMap.put(neighbor, currNode);
                buildSpanningTreeDFS(graph, neighbor, predecessorMap, spanningTree);
            }
            // do nothing if already visited
        }
    }
}
