package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.asList;

class SpanningTreeTest {

    @Test
    public void spanningTreeTest() {
        List<List<Integer>> graph = asList(
                List.of(1),
                asList(0, 2, 5),
                asList(1, 3, 4),
                List.of(2),
                asList(2, 5),
                asList(1, 4)
        );
        List<Integer[]> expectedSpanningTree = Arrays.asList(
                new Integer[]{0, 1},
                new Integer[]{1, 2},
                new Integer[]{2, 3},
                new Integer[]{2, 4},
                new Integer[]{4, 5}
        );
        verifySpanningTree(expectedSpanningTree, SpanningTree.getSpanningTree(graph));


        graph = asList(
                List.of(1),
                List.of(0)
        );
        expectedSpanningTree = new ArrayList<>();
        expectedSpanningTree.add(new Integer[]{0, 1});
        verifySpanningTree(expectedSpanningTree, SpanningTree.getSpanningTree(graph));


        graph = new ArrayList<>();
        expectedSpanningTree = new ArrayList<>();
        verifySpanningTree(expectedSpanningTree, SpanningTree.getSpanningTree(graph));
    }

    private void verifySpanningTree(List<Integer[]> expectedSpanningTree, List<Integer[]> spanningTree) {
        Assertions.assertEquals(expectedSpanningTree.size(), spanningTree.size());

        mapAndSortSpanningTrees(expectedSpanningTree);
        mapAndSortSpanningTrees(spanningTree);

        for (int i = 0; i < expectedSpanningTree.size(); i++) {
            Assertions.assertArrayEquals(expectedSpanningTree.get(i), spanningTree.get(i));
        }
    }

    private static void mapAndSortSpanningTrees(List<Integer[]> edges) {
        for (int i = 0; i < edges.size(); i++) {
            Integer start = edges.get(i)[0], destination = edges.get(i)[0];
            edges.set(i, new Integer[]{Math.min(start, destination), Math.max(start, destination)});
        }

        edges.sort(Comparator.comparingInt((Integer[] a) -> a[0]).thenComparingInt(a -> a[1]));
    }
}