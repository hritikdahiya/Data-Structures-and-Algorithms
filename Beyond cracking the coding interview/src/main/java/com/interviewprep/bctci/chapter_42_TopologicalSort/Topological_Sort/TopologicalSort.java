package com.interviewprep.bctci.chapter_42_TopologicalSort.Topological_Sort;

import com.interviewprep.bctci.chapter_36_Graphs.Edge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TopologicalSort {
    // BFS based Kahn or Peel-off algorithm to find topological ordering of a DAG
    public static List<Integer> kahnImpl(List<List<Edge>> dag) {
        int[] inDegrees = new int[dag.size()];

        // calculate the indegrees of every node
        for (List<Edge> edgesPerNode : dag) {
            for (Edge edge : edgesPerNode) {
                inDegrees[edge.destinationNode()]++;
            }
        }

        // start with nodes with indegree 0
        Queue<Integer> bfsQueue = new LinkedList<>();
        for (int i = 0; i < inDegrees.length; i++) {
            if (inDegrees[i] == 0) {
                bfsQueue.add(i);
            }
        }

        List<Integer> topologicalOrder = new ArrayList<>();
        // peel off every node in the queue (i.e. remove its edges and update the indegree of neighbors)
        // and keep adding nodes with indegree zero
        while (!bfsQueue.isEmpty()) {
            int node = bfsQueue.poll();
            topologicalOrder.add(node);

            for (Edge edge : dag.get(node)) {
                int neighbor = edge.destinationNode();
                inDegrees[neighbor]--;
                if (inDegrees[neighbor] == 0) {
                    bfsQueue.add(neighbor);
                }
            }
        }

        return topologicalOrder;
    }

    public static List<Integer> kahnImpl2(List<List<Integer>> dag) {
        List<List<Edge>> edgeDag = new ArrayList<>();
        for (int node = 0; node < dag.size(); node++) {
            edgeDag.add(new ArrayList<>());
            for (Integer neighbor: dag.get(node)) {
                edgeDag.get(node).add(new Edge(node, neighbor, 1f));
            }
        }

        return kahnImpl(edgeDag);
    }
}
