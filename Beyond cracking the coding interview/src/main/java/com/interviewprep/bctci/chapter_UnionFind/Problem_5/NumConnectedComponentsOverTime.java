package com.interviewprep.bctci.chapter_UnionFind.Problem_5;

import com.interviewprep.bctci.chapter_36_Graphs.Edge;
import com.interviewprep.bctci.chapter_UnionFind.UnionFind;

import java.util.Comparator;
import java.util.List;

public class NumConnectedComponentsOverTime {
    public static int[] find(int V, List<Edge> edges, int[] times) {
        edges.sort(Comparator.comparingDouble(Edge::weight));

        UnionFind<Integer> unionFind = new UnionFind<>();
        for (int i = 0; i < V; i++) {
            unionFind.add(i);
        }

        int[] numConnectedComps = new int[times.length];
        int k = 0;
        int components = V;
        for (int i = 0; i < times.length; i++) {
            int time = times[i];
            while (k < edges.size() && edges.get(k).weight() <= time) {
                int root1 = edges.get(k).sourceNode(), root2 = edges.get(k).destinationNode();
                if (root1 != root2) {
                    unionFind.union(edges.get(k).sourceNode(), edges.get(k).destinationNode());
                    components--;
                }
                k++;
            }

            numConnectedComps[i] = components;
        }

        return numConnectedComps;
    }
}
