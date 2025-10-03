package com.interviewprep.bctci.chapter_42_TopologicalSort.Problem_42_2;

import com.interviewprep.bctci.chapter_36_Graphs.Edge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.List.of;

class DAGPathReconstructionTest {

    @Test
    void getShortestPathFromSourceToDestination() {
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
        int goal = 1;
        Integer[] expected = new Integer[]{4, 5, 2, 1};
        Assertions.assertArrayEquals(expected, DAGPathReconstruction.getShortestPathFromSourceToDestination(graph, start, goal).toArray());


        start = 3;
        goal = 2;
        expected = new Integer[]{3, 4, 5, 2};
        Assertions.assertArrayEquals(expected, DAGPathReconstruction.getShortestPathFromSourceToDestination(graph, start, goal).toArray());

        start = 0;
        goal = 3;
        expected = new Integer[]{};
        Assertions.assertArrayEquals(expected, DAGPathReconstruction.getShortestPathFromSourceToDestination(graph, start, goal).toArray());
    }
}