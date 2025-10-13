package com.interviewprep.bctci.chapter_UnionFind.Problem_3;

import com.interviewprep.bctci.chapter_36_Graphs.Edge;
import com.interviewprep.bctci.chapter_UnionFind.UnionFind;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MSTReconstruction {
    public static List<Edge> buildMST(int V, List<Edge> edges) {
        edges.sort(Comparator.comparingDouble(Edge::weight));

        UnionFind<Integer> uf = new UnionFind<>();
        for (int i = 0; i < V; i++) {
            uf.add(i);
        }
        List<Edge> mst = new ArrayList<>();

        for (Edge edge : edges) {
            int sourceRoot = uf.find(edge.sourceNode()), destinationRoot = uf.find(edge.destinationNode());

            if (sourceRoot != destinationRoot) {
                uf.union(edge.sourceNode(), edge.destinationNode());
                mst.add(edge);
            }
        }

        return mst.size() == V - 1 ? mst : new ArrayList<>();
    }
}
