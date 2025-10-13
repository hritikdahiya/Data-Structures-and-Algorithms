package com.interviewprep.bctci.chapter_UnionFind.Problem_3;

import com.interviewprep.bctci.chapter_36_Graphs.Edge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class MSTReconstructionTest {
    @Test
    public void minimumSpanningTreeReconstructionTest() {
        int V = 9;
        List<Edge> edgeList = Arrays.asList(
                new Edge(0, 1, 3),
                new Edge(1, 8, 9),
                new Edge(8, 7, 5),
                new Edge(7, 4, 13),
                new Edge(4, 3, 4),
                new Edge(3, 0, 5),
                new Edge(1, 5, 8),
                new Edge(5, 4, 2),
                new Edge(4, 2, 3),
                new Edge(2, 1, -1),
                new Edge(2, 5, 10),
                new Edge(5, 6, 11),
                new Edge(6, 8, 0),
                new Edge(6, 7, -2)
        );
        List<Edge> expectedMST = Arrays.asList(
                new Edge(0, 1, 3),
                new Edge(1, 8, 9),
                new Edge(4, 3, 4),
                new Edge(5, 4, 2),
                new Edge(4, 2, 3),
                new Edge(2, 1, -1),
                new Edge(6, 8, 0),
                new Edge(6, 7, -2)
        );
        verifyResult(expectedMST, MSTReconstruction.buildMST(V, edgeList));


        V = 3;
        edgeList = Arrays.asList(
                new Edge(0, 1, 1)
        );
        expectedMST = new ArrayList<>();
        verifyResult(expectedMST, MSTReconstruction.buildMST(V, edgeList));


        V = 3;
        edgeList = Arrays.asList(
                new Edge(0, 1, 1),
                new Edge(1, 2, 1),
                new Edge(2, 0, 1)
        );
        expectedMST = Arrays.asList(
                new Edge(0, 1, 1),
                new Edge(1, 2, 1)
        );
        verifyResult(expectedMST, MSTReconstruction.buildMST(V, edgeList));
    }

    private void verifyResult(List<Edge> expected, List<Edge> actual) {
        Assertions.assertEquals(expected.size(), actual.size());

        expected.sort(Comparator.comparingInt(Edge::sourceNode).thenComparingInt(Edge::destinationNode));
        actual.sort(Comparator.comparingInt(Edge::sourceNode).thenComparingInt(Edge::destinationNode));

        for (int i = 0; i < expected.size(); i++) {
            Assertions.assertEquals(expected.get(i), actual.get(i));
        }
    }
}