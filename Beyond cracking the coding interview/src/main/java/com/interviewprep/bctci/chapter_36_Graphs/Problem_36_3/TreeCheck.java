package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class TreeCheck {
    public static boolean isGraphATree(List<List<Integer>> graph) {
        Map<Integer, Integer> predecessorMap = new HashMap<>();

        // start dfs with any node
        Integer source = 0;
        boolean hasCycle = checkCyclesDfs(graph, source, predecessorMap);

        return !hasCycle && predecessorMap.size() == graph.size();
    }

    private static boolean checkCyclesDfs(List<List<Integer>> graph, Integer currNode, Map<Integer, Integer> predecessorMap) {
        for (Integer neighbor : graph.get(currNode)) {
            // the neighbor had been visited,
            if (predecessorMap.containsKey(neighbor)) {
                // AND it is not currNode's predecessor ==> there is a cycle
                if (!Objects.equals(predecessorMap.get(currNode), neighbor)) {
                    return true;
                }
                // AND it is currNode's predecessor, ignore it (currNode just came from it)
            } else {
                predecessorMap.put(neighbor, currNode);
                boolean isCyclic = checkCyclesDfs(graph, neighbor, predecessorMap);
                if (isCyclic) {
                    return true;
                }
            }
        }

        return false;
    }
}
