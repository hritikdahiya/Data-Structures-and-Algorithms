package com.interviewprep.bctci.chapter_UnionFind.Problem_4;

import com.interviewprep.bctci.chapter_36_Graphs.Edge;
import com.interviewprep.bctci.chapter_UnionFind.Problem_1.MinimumSpanningTree;

import java.util.ArrayList;
import java.util.List;

public class EdgeInMST {
    public static boolean isEdgeInMST(int V, List<Edge> edges, int edgeIndex) {
        float mstSum = MinimumSpanningTree.getSumOfMST_Kruskal(V, edges);

        List<Edge> listWithoutEdge = new ArrayList<>();
        listWithoutEdge.addAll(edges.subList(0, edgeIndex));
        listWithoutEdge.addAll(edges.subList(edgeIndex + 1, edges.size()));

        float mstSumWithoutEdge = MinimumSpanningTree.getSumOfMST_Kruskal(V, listWithoutEdge);

        // this edge is crucial in the MST, without it MST is not possible
        if (mstSumWithoutEdge == -1) {
            return true;
        }

        // if there are is another MST with same value without the specified edge, then this edge is not crucial
        return mstSumWithoutEdge > mstSum;
    }
}
