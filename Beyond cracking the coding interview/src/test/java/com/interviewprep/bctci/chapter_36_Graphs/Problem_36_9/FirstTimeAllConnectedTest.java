package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.List.of;

class FirstTimeAllConnectedTest {

    @Test
    public void findTransitionPointBinarySearchTest() {
        int V = 4;
        List<List<Integer>> cables = asList(
                asList(0, 2),
                asList(1, 3),
                asList(0, 1),
                asList(1, 2)
        );
        Integer expectedIndexOfCables = 2;
        Assertions.assertEquals(expectedIndexOfCables, FirstTimeAllConnected.findTransitionPointBinarySearch(V, cables));

        V = 3;
        cables = of(
                asList(0, 1)
        );
        expectedIndexOfCables = -1;
        Assertions.assertEquals(expectedIndexOfCables, FirstTimeAllConnected.findTransitionPointBinarySearch(V, cables));

        V = 4;
        cables = asList(
                asList(0, 1),
                asList(1, 2),
                asList(2, 0),
                asList(2, 3),
                asList(3, 0)
        );
        expectedIndexOfCables = 3;
        Assertions.assertEquals(expectedIndexOfCables, FirstTimeAllConnected.findTransitionPointBinarySearch(V, cables));
    }
}