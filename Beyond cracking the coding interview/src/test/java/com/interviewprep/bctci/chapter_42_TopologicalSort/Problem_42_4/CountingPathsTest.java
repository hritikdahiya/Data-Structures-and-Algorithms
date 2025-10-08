package com.interviewprep.bctci.chapter_42_TopologicalSort.Problem_42_4;

import com.interviewprep.bctci.chapter_36_Graphs.Edge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.List.of;

class CountingPathsTest {

    @Test
    public void countPathsToAllNodesFromSourceTest() {
        List<List<Edge>> graph = of(
                of(new Edge(0, 1, 1)),
                of(),
                of(new Edge(2, 1, 1)),
                of(new Edge(3, 4, 1)),
                of(new Edge(4, 1, 1),
                        new Edge(4, 2, 1),
                        new Edge(4, 5, 1)),
                of(new Edge(5, 2, 1))
        );
        int start = 4;
        int[] expected = new int[]{0, 3, 2, 0, 1, 1};
        Assertions.assertArrayEquals(expected, CountingPaths.countPathsToAllNodesFromSource(graph, start));
    }
}