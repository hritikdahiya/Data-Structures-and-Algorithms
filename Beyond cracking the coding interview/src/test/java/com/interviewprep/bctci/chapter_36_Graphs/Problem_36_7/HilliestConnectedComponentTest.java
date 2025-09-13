package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.List.of;

class HilliestConnectedComponentTest {

    @Test
    public void findHilliestComponentTest() {
        List<List<Integer>> graph = of(
                of(1, 3),
                of(0, 2),
                of(1, 3),
                of(0, 2)
        );
        float[] heights = new float[]{4, 1, 3, 2};
        float expectedHilliness = 2;
        Assertions.assertEquals(expectedHilliness, HilliestConnectedComponent.findHilliestComponent(graph, heights));

        graph = of(
                of()
        );
        heights = new float[]{5};
        expectedHilliness = 0;
        Assertions.assertEquals(expectedHilliness, HilliestConnectedComponent.findHilliestComponent(graph, heights));

        graph = of(
                of(1),
                of(0),
                of(3),
                of(2)
        );
        heights = new float[]{1.5f, 5.5f, 0, 5};
        expectedHilliness = 5f;
        Assertions.assertEquals(expectedHilliness, HilliestConnectedComponent.findHilliestComponent(graph, heights));

        // same elevation
        graph = of(
                of(1, 2),
                of(0, 2),
                of(0, 1)
        );
        heights = new float[]{3, 3, 3};
        expectedHilliness = 0;
        Assertions.assertEquals(expectedHilliness, HilliestConnectedComponent.findHilliestComponent(graph, heights));
    }
}