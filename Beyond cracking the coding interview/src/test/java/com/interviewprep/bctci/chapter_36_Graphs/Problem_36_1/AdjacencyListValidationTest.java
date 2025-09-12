package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.interviewprep.bctci.chapter_36_Graphs.GraphTestUtility.undirectedEdgeListToAdjacencyList;

class AdjacencyListValidationTest {

    @Test
    public void isGraphValidTest() {
        // single edge graph
        int V = 2;
        List<Integer[]> edges = Arrays.asList(new Integer[]{0, 1}, new Integer[]{1, 0});
        List<List<Integer>> graph = undirectedEdgeListToAdjacencyList(V, edges, true);
        Assertions.assertTrue(AdjacencyListValidation.isGraphValid(graph));

        // node number greater than V-1
        edges = Arrays.asList(new Integer[]{0, 2}, new Integer[]{1, 0});
        graph = undirectedEdgeListToAdjacencyList(V, edges, true);
        Assertions.assertFalse(AdjacencyListValidation.isGraphValid(graph));

        // self-loop
        edges = new ArrayList<>();
        edges.add(new Integer[]{0, 0});
        graph = undirectedEdgeListToAdjacencyList(V, edges, true);
        Assertions.assertFalse(AdjacencyListValidation.isGraphValid(graph));

        // parallel edges
        edges = Arrays.asList(new Integer[]{0, 1}, new Integer[]{0, 1}, new Integer[]{1, 0});
        graph = undirectedEdgeListToAdjacencyList(V, edges, true);
        Assertions.assertFalse(AdjacencyListValidation.isGraphValid(graph));

        // unidirectional edge
        V = 3;
        edges = Arrays.asList(new Integer[]{0, 1}, new Integer[]{0, 2}, new Integer[]{1, 0});
        graph = undirectedEdgeListToAdjacencyList(V, edges, true);
        Assertions.assertFalse(AdjacencyListValidation.isGraphValid(graph));

        // normal graph
        edges = Arrays.asList(new Integer[]{0, 1}, new Integer[]{0, 2}, new Integer[]{1, 0}, new Integer[]{2, 0});
        graph = undirectedEdgeListToAdjacencyList(V, edges, true);
        Assertions.assertTrue(AdjacencyListValidation.isGraphValid(graph));
    }
}