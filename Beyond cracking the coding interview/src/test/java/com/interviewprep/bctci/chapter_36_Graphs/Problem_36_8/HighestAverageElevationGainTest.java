package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_8;

import com.interviewprep.bctci.chapter_36_Graphs.Edge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class HighestAverageElevationGainTest {

    @Test
    public void findHighestAverageElevationGainTest() {
        int V = 4;
        List<Edge> edges = Arrays.asList(
                new Edge(0, 1, 3),
                new Edge(1, 2, 2),
                new Edge(2, 3, 1),
                new Edge(3, 0, 2)
        );
        float expectedHilliness = 2;
        Assertions.assertEquals(expectedHilliness, HighestAverageElevationGain.findHighestAverageElevationGain(V, edges));

        V = 2;
        edges = List.of(
                new Edge(0, 1, 5)
        );
        expectedHilliness = 5;
        Assertions.assertEquals(expectedHilliness, HighestAverageElevationGain.findHighestAverageElevationGain(V, edges));

        V = 6;
        edges = Arrays.asList(
                new Edge(0, 1, 1),
                new Edge(1, 2, 2),
                new Edge(3, 4, 3),
                new Edge(4, 5, 5)
        );
        expectedHilliness = 4;
        Assertions.assertEquals(expectedHilliness, HighestAverageElevationGain.findHighestAverageElevationGain(V, edges));
    }
}