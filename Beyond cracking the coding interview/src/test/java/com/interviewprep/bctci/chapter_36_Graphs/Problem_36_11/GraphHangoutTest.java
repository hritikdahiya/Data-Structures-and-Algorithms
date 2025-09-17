package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.List.of;

class GraphHangoutTest {
    @Test
    public void minimumDistanceTravelledTest() {
        List<List<Integer>> graph = of(
                of(1, 4),
                of(0, 2),
                of(1, 3),
                of(2, 4),
                of(0, 3)
        );
        int node1 = 0;
        int node2 = 2;
        int node3 = 4;
        int expectedDistance = 3;
        Assertions.assertEquals(expectedDistance, GraphHangout.findMinimumDistanceTravelled(graph, node1, node2, node3));


        graph = of(
                of(1, 2, 3),
                of(0, 2, 3),
                of(0, 1, 3),
                of(0, 1, 2)
        );
        node1 = 0;
        node2 = 1;
        node3 = 2;
        expectedDistance = 2;
        Assertions.assertEquals(expectedDistance, GraphHangout.findMinimumDistanceTravelled(graph, node1, node2, node3));


        // spoke and wheel as the graph in problem
        graph = of(
                // 0
                of(1, 14, 15),
                of(0, 2),
                of(1, 3),
                of(2, 4),
                of(3, 5),
                // 5
                of(4, 6, 19),
                of(5, 7),
                of(6, 8),
                of(7, 9),
                of(8, 10),
                // 10
                of(9, 11, 21),
                of(10, 12),
                of(11, 13),
                of(12, 14),
                of(0, 13),
                // 15
                of(1, 16),
                of(15, 17),
                // 17
                of(15, 18, 20),
                of(17, 19),
                of(18, 5),
                of(17, 21),
                of(10, 20)
        );
        node1 = 0;
        node2 = 5;
        node3 = 10;
        expectedDistance = 9;
        Assertions.assertEquals(expectedDistance, GraphHangout.findMinimumDistanceTravelled(graph, node1, node2, node3));
    }
}