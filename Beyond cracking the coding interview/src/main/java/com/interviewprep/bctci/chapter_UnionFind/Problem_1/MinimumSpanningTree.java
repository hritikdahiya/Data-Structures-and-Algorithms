package com.interviewprep.bctci.chapter_UnionFind.Problem_1;

import com.interviewprep.bctci.chapter_36_Graphs.Edge;
import com.interviewprep.bctci.chapter_UnionFind.UnionFind;

import java.util.*;

public class MinimumSpanningTree {
    /**
     * This only works for UNDIRECTED, CONNECTED Graphs
     */
    public static float getSumOfMST_Kruskal(int V, List<Edge> edges) {
        // sort edges based on their weights in ascending order
        edges.sort(Comparator.comparingDouble(Edge::weight));

        UnionFind<Integer> disjointSet = new UnionFind<>();
        for (int i = 0; i < V; i++) {
            disjointSet.add(i);
        }

        float sumOfEdges = 0;
        int edgesIncluded = 0;
        for (Edge edge : edges) {
            int parentSource = disjointSet.find(edge.sourceNode()), parentDestination = disjointSet.find(edge.destinationNode());

            // including this edge would make a cycle, it should not be part of the MST
            if (parentSource == parentDestination) {
                continue;
            }

            // include this edge to be a part of the MST
            sumOfEdges += edge.weight();
            edgesIncluded += 1;
            disjointSet.union(edge.sourceNode(), edge.destinationNode());
        }

        return edgesIncluded == V - 1 ? sumOfEdges : -1;
    }

    public static float getSumOfMST_Prim(int V, List<Edge> edges) {
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        for (Edge edge : edges) {
            graph.get(edge.sourceNode()).add(edge);
            graph.get(edge.destinationNode()).add(new Edge(edge.destinationNode(), edge.sourceNode(), edge.weight()));
        }

        Set<Integer> visited = new HashSet<>();
        PriorityQueue<Edge> minHeap = new PriorityQueue<>(Comparator.comparingDouble(Edge::weight));

        // arbitrary start node
        int startNode = edges.get(0).sourceNode();

        visited.add(startNode);
        minHeap.addAll(graph.get(startNode));

        float sumOfEdges = 0;
        while (!minHeap.isEmpty()) {
            Edge smallestWeightEdge = minHeap.poll();

            int reachedNode = smallestWeightEdge.destinationNode();
            if (visited.contains(reachedNode)) {
                //discard this edge
                continue;
            }

            visited.add(reachedNode);
            sumOfEdges += smallestWeightEdge.weight();

            // add all the neighboring edges of the reached node in the heap
            minHeap.addAll(graph.get(reachedNode));
        }

        return sumOfEdges;
    }
}
