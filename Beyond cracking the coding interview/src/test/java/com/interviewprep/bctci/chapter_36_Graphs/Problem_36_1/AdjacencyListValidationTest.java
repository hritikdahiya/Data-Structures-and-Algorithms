package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.List.of;

class AdjacencyListValidationTest {

    @Test
    public void isGraphValidTest() {
        // single edge graph
        List<List<Integer>> graph = of(of(1), of(0));
        Assertions.assertTrue(AdjacencyListValidation.isGraphValid(graph));

        // node number greater than V-1
        graph = of(of(2), of(0));
        Assertions.assertFalse(AdjacencyListValidation.isGraphValid(graph));

        // self-loop
        graph = of(of(0));
        Assertions.assertFalse(AdjacencyListValidation.isGraphValid(graph));

        // parallel edges
        graph = of(of(1, 1), of(0));
        Assertions.assertFalse(AdjacencyListValidation.isGraphValid(graph));

        // unidirectional edge
        graph = of(of(1, 2), of(0));
        Assertions.assertFalse(AdjacencyListValidation.isGraphValid(graph));

        // normal graph
        graph = of(of(1, 2), of(0), of(0));
        Assertions.assertTrue(AdjacencyListValidation.isGraphValid(graph));
    }
}