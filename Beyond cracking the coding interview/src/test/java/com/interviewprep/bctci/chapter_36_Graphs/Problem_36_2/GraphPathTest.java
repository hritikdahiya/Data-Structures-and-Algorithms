package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;

class GraphPathTest {

    @Test
    public void findSimplePathDFSTest() {
        List<List<Integer>> graph = asList(
                List.of(1),
                asList(0, 2, 5, 4),
                asList(1, 4, 5),
                List.of(),
                asList(5, 2, 1),
                asList(1, 2, 4)
        );
        int source = 0, sink = 4;
        List<Integer> expectedPath = asList(0, 1, 2, 4);
        Assertions.assertArrayEquals(expectedPath.toArray(), GraphPath.findSimplePathDFS(graph, source, sink).toArray());


        source = 1;
        sink = 3;
        expectedPath = List.of();
        Assertions.assertArrayEquals(expectedPath.toArray(), GraphPath.findSimplePathDFS(graph, source, sink).toArray());
    }

    @Test
    public void findSimplePathDFSWithPredecessorMapTest() {
        List<List<Integer>> graph = asList(
                List.of(1),
                asList(0, 2, 5, 4),
                asList(1, 4, 5),
                List.of(),
                asList(5, 2, 1),
                asList(1, 2, 4)
        );
        int source = 0, sink = 4;
        List<Integer> expectedPath = asList(0, 1, 5, 4);
        Assertions.assertArrayEquals(expectedPath.toArray(), GraphPath.findSimplePathDFSWithPredecessorMap(graph, source, sink).toArray());


        source = 1;
        sink = 3;
        expectedPath = List.of();
        Assertions.assertArrayEquals(expectedPath.toArray(), GraphPath.findSimplePathDFSWithPredecessorMap(graph, source, sink).toArray());
    }
}