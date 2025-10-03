package com.interviewprep.bctci.chapter_36_Graphs.Dijkstra_Algorithm;

import com.interviewprep.bctci.chapter_36_Graphs.Edge;

import java.util.AbstractMap.SimpleEntry;
import java.util.*;
import java.util.Map.Entry;

public class AllShortestPathFromSource {
    public static Map<Integer, Float> dijkstra(int V, List<Edge> edges, int source) {
        List<List<Edge>> adjacencyList = buildGraphFromEdges(V, edges);

        Map<Integer, Float> distanceMap = new HashMap<>();
        distanceMap.put(source, 0f);

        // holder an array of size 2 -> [node, distanceToNodeFromSource]
        PriorityQueue<Entry<Integer, Float>> minHeap = new PriorityQueue<>(Comparator.comparingDouble(Entry::getValue));
        minHeap.add(new SimpleEntry<>(source, 0f));

        while (!minHeap.isEmpty()) {
            // get the node with the minimum distance to it
            Entry<Integer, Float> minDistEntry = minHeap.poll();
            Integer node = minDistEntry.getKey();
            Float dist = minDistEntry.getValue();

            // for every neighbor, update its distance and add to the heap
            for (Edge nbrEdge : adjacencyList.get(node)) {
                int nbrNode = nbrEdge.destinationNode();
                float weight = nbrEdge.weight();
                // update the distance from source if it is smaller than existing distance
                if (dist + weight < distanceMap.getOrDefault(nbrNode, Float.MAX_VALUE)) {
                    distanceMap.put(nbrNode, dist + weight);
                }

                Entry<Integer, Float> nbrEntry = new SimpleEntry<>(nbrEdge.destinationNode(), dist + weight);
                minHeap.add(nbrEntry);
            }
        }

        // set the distance of unreachable nodes as -1
        for (int i = 0; i < V; i++) {
            if (!distanceMap.containsKey(i)) {
                distanceMap.put(i, -1f);
            }
        }

        return distanceMap;
    }

    private static List<List<Edge>> buildGraphFromEdges(int V, List<Edge> edges) {
        List<List<Edge>> adjacencyList = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adjacencyList.add(new ArrayList<>());
        }
        for (Edge edge : edges) {
            adjacencyList.get(edge.sourceNode()).add(edge);
        }

        return adjacencyList;
    }
}
