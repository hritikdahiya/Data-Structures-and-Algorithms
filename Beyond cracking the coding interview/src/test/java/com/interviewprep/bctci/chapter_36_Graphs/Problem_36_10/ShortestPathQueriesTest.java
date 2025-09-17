package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.List.of;

class ShortestPathQueriesTest {

    @Test
    public void findShortestPathFromANodeTest() {
        List<List<Integer>> graph = of(
                of(1),
                of(0, 2, 5, 4),
                of(1, 4, 5),
                of(),
                of(5, 2, 1),
                of(1, 2, 4)
        );
        int start = 0;
        Integer[] queries = new Integer[]{1, 0, 3, 4};
        List<Integer>[] expectedResponses = new List[]{
                of(0, 1),
                of(0),
                of(),
                of(0, 1, 4)
        };

        verifyResult(expectedResponses, ShortestPathQueries.findShortestPathFromANode(graph, queries, start));

        graph = of(
                of(1),
                of(0, 2),
                of(1)
        );
        queries = new Integer[]{1, 2};
        expectedResponses = new List[]{
                of(0, 1),
                of(0, 1, 2)
        };

        verifyResult(expectedResponses, ShortestPathQueries.findShortestPathFromANode(graph, queries, start));


        graph = of(
                of(1),
                of(0),
                of(3),
                of(2)
        );
        queries = new Integer[]{1, 2, 3};
        expectedResponses = new List[]{
                of(0, 1),
                of(),
                of()
        };

        verifyResult(expectedResponses, ShortestPathQueries.findShortestPathFromANode(graph, queries, start));

    }

    private static void verifyResult(List<Integer>[] expected, List<Integer>[] actual) {
        Assertions.assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i].toArray(), actual[i].toArray());
        }
    }
}