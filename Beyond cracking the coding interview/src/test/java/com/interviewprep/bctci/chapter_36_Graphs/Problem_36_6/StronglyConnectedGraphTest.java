package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.List.of;

class StronglyConnectedGraphTest {

    @Test
    public void isStronglyConnectedTest() {
        List<List<Integer>> graph = of(
                of(1, 3),
                of(2),
                of(0),
                of(2)
        );
        Assertions.assertTrue(StronglyConnectedGraph.isStronglyConnected(graph));

        // not strongly connected, 0 is not reachable
        graph = of(
                of(1, 2, 3),
                of(2),
                of(),
                of(2)
        );
        Assertions.assertFalse(StronglyConnectedGraph.isStronglyConnected(graph));

        // two strongly connected components connected by one directed edge
        graph = of(
                of(1, 3),
                of(2),
                of(0),
                of(4),
                of(5),
                of(3)
        );
        Assertions.assertTrue(StronglyConnectedGraph.isStronglyConnected(graph));
    }
}