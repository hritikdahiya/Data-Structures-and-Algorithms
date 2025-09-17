package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.List.of;

class DaysUntilAllInfectedTest {

    @Test
    void findDDay() {
        List<List<Integer>> graph = of(
                of(1, 2),
                of(0, 2),
                of(0, 1, 3),
                of(2)
        );
        List<Integer> infected = of(0);
        int expectedDDay = 2;
        Assertions.assertEquals(expectedDDay, DaysUntilAllInfected.findDDay(graph, infected));


        graph = of(
                of(1),
                of(0, 2),
                of(1, 3),
                of(2, 4),
                of(3)
        );
        infected = of(0, 4);
        expectedDDay = 2;
        Assertions.assertEquals(expectedDDay, DaysUntilAllInfected.findDDay(graph, infected));

        graph = of(
                of(1, 2),
                of(0, 3),
                of(0, 3),
                of(1, 2)
        );
        infected = of(0, 3);
        expectedDDay = 1;
        Assertions.assertEquals(expectedDDay, DaysUntilAllInfected.findDDay(graph, infected));


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
        infected = of(4, 11, 17);
        expectedDDay = 3;
        Assertions.assertEquals(expectedDDay, DaysUntilAllInfected.findDDay(graph, infected));
    }
}