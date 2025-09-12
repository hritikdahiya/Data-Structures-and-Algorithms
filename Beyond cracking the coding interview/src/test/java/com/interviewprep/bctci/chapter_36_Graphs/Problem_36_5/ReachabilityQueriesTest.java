package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;

class ReachabilityQueriesTest {

    @Test
    public void isReachableTest() {
        List<List<Integer>> graph = asList(
                List.of(1),
                asList(0, 2, 5, 4),
                asList(1, 4, 5),
                List.of(6, 7),
                asList(5, 2, 1),
                asList(1, 2, 4),
                List.of(3),
                List.of(3)
        );

        Integer[][] queries = new Integer[][]{
                new Integer[]{0, 2},
                new Integer[]{5, 2},
                new Integer[]{2, 3},
                new Integer[]{4, 7},
                new Integer[]{6, 7},
                new Integer[]{3, 6},
                new Integer[]{1, 4}
        };
        boolean[] expectedResponses = new boolean[]{true, true, false, false, true, true, true};

        Assertions.assertArrayEquals(expectedResponses, ReachabilityQueries.isReachable(graph, queries));
    }
}