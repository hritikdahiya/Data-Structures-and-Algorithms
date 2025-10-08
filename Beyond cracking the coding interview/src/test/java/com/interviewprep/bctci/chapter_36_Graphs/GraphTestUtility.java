package com.interviewprep.bctci.chapter_36_Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphTestUtility {
    public static List<List<Integer>> edgeListToAdjacencyList(int V, List<Integer[]> edgeList, boolean isDirected) {
        List<List<Integer>> adjacencyList = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        for (Integer[] edge : edgeList) {
            Integer source = edge[0], sink = edge[1];
            adjacencyList.get(source).add(sink);
            if (!isDirected) {
                adjacencyList.get(sink).add(source);
            }
        }

        return adjacencyList;
    }

    public static <T> Map<T, List<T>> edgeListToAdjacencyMap(List<T[]> edgeList, boolean isDirected) {
        Map<T, List<T>> adjacencyMap = new HashMap<>();
        for (T[] edge : edgeList) {
            T source = edge[0], sink = edge[1];
            List<T> sourceNeighbors = adjacencyMap.getOrDefault(source, new ArrayList<>());
            if (!adjacencyMap.containsKey(source)) {
                adjacencyMap.put(source, sourceNeighbors);
            }
            sourceNeighbors.add(edge[1]);

            if (!isDirected) {
                List<T> sinkNeighbors = adjacencyMap.getOrDefault(sink, new ArrayList<>());
                if (!adjacencyMap.containsKey(sink)) {
                    adjacencyMap.put(edge[1], sinkNeighbors);
                }
                sinkNeighbors.add(source);
            }
        }

        return adjacencyMap;
    }

}
