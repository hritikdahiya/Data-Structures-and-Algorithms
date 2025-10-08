package com.interviewprep.bctci.chapter_42_TopologicalSort.Problem_42_3;

import com.interviewprep.bctci.chapter_36_Graphs.Edge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.interviewprep.bctci.chapter_42_TopologicalSort.Problem_42_3.DAGLongestPath.MIN_VALUE;
import static java.util.List.of;

class DAGLongestPathTest {

    @Test
    public void getLongestPathFromSourceToDestinationTest() {
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
        float[] expected = new float[]{MIN_VALUE, 31, 21, MIN_VALUE, 0, 14};
        Assertions.assertArrayEquals(expected, DAGLongestPath.getLongestPathFromSourceToDestination(graph, start));


        start = 3;
        expected = new float[]{MIN_VALUE, 43, 33, 0, 12, 26};
        Assertions.assertArrayEquals(expected, DAGLongestPath.getLongestPathFromSourceToDestination(graph, start));

        start = 0;
        expected = new float[]{0, 10, MIN_VALUE, MIN_VALUE, MIN_VALUE, MIN_VALUE};
        Assertions.assertArrayEquals(expected, DAGLongestPath.getLongestPathFromSourceToDestination(graph, start));
    }
}