package com.interviewprep.bctci.chapter_42_TopologicalSort.Problem_42_1;

import com.interviewprep.bctci.chapter_36_Graphs.Edge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.interviewprep.bctci.chapter_42_TopologicalSort.Problem_42_1.DAGDistances.MAX_VALUE;
import static java.util.List.of;

class DAGDistancesTest {

    @Test
    public void findShortestPathToAllNodesFromSourceTest() {
        List<List<Edge>> graph = of(
                of(new Edge(0, 1, 10)),
                of(),
                of(new Edge(2, 1, 10)),
                of(new Edge(3, 4, 12)),
                of(new Edge(4, 1, 11),
                        new Edge(4, 2, 21),
                        new Edge(4, 5, 14)),
                of(new Edge(5, 2, -30))
        );
        int start = 4;
        float[] expected = new float[]{MAX_VALUE, -6, -16, MAX_VALUE, 0, 14};
        Assertions.assertArrayEquals(expected, DAGDistances.findShortestPathToAllNodesFromSource(graph, start));

    }
}