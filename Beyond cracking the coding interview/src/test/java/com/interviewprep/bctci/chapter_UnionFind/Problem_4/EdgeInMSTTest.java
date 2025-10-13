package com.interviewprep.bctci.chapter_UnionFind.Problem_4;

import com.interviewprep.bctci.chapter_36_Graphs.Edge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class EdgeInMSTTest {

    @Test
    public void isEdgeInMSTTest() {
        int V = 4;
        List<Edge> edgeList = Arrays.asList(
                new Edge(0, 1, 5),
                new Edge(1, 2, 5),
                new Edge(2, 3, 20),
                new Edge(3, 0, 20)
        );
        int edgeToConsider = 0;

        Assertions.assertTrue(EdgeInMST.isEdgeInMST(V, edgeList, edgeToConsider));

        edgeToConsider = 2;
        Assertions.assertFalse(EdgeInMST.isEdgeInMST(V, edgeList, edgeToConsider));
    }
}