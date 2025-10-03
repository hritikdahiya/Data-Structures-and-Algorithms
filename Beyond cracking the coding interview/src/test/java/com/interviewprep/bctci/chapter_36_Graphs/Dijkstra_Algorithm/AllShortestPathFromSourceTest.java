package com.interviewprep.bctci.chapter_36_Graphs.Dijkstra_Algorithm;

import com.interviewprep.bctci.chapter_36_Graphs.Edge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.AbstractMap.SimpleEntry;
import java.util.*;

class AllShortestPathFromSourceTest {

    @Test
    public void allShortestPathFromSourceTest() {
        int V = 5;
        List<Edge> edges = Arrays.asList(
                new Edge(0, 1, 10),
                new Edge(0, 2, 3),
                new Edge(1, 3, 2),
                new Edge(2, 1, 4),
                new Edge(2, 3, 8),
                new Edge(2, 4, 2),
                new Edge(3, 4, 5)
        );
        int source = 0;
        Map<Integer, Float> expectedMinDist = Map.ofEntries(
                new SimpleEntry<>(0, 0f),
                new SimpleEntry<>(1, 7f),
                new SimpleEntry<>(2, 3f),
                new SimpleEntry<>(3, 9f),
                new SimpleEntry<>(4, 5f)
        );

        verifyMap(expectedMinDist, AllShortestPathFromSource.dijkstra(V, edges, source));


        // Forest
        V = 7;
        edges = Arrays.asList(
                new Edge(0, 1, 10),
                new Edge(0, 2, 3),
                new Edge(1, 3, 2),
                new Edge(2, 1, 4),
                new Edge(2, 3, 8),
                new Edge(2, 4, 2),
                new Edge(3, 4, 5),
                new Edge(5, 6, 5)
        );
        source = 0;
        expectedMinDist = Map.ofEntries(
                new SimpleEntry<>(0, 0f),
                new SimpleEntry<>(1, 7f),
                new SimpleEntry<>(2, 3f),
                new SimpleEntry<>(3, 9f),
                new SimpleEntry<>(4, 5f),
                new SimpleEntry<>(5, -1f),
                new SimpleEntry<>(6, -1f)
        );

        verifyMap(expectedMinDist, AllShortestPathFromSource.dijkstra(V, edges, source));
    }

    private void verifyMap(Map<Integer, Float> expected, Map<Integer, Float> actual) {
        List<Integer> expectedKeySet = new ArrayList<>(expected.keySet());
        Collections.sort(expectedKeySet);
        List<Integer> actualKeySet = new ArrayList<>(actual.keySet());
        Collections.sort(actualKeySet);

        Assertions.assertArrayEquals(expectedKeySet.toArray(), actualKeySet.toArray());

        for (Integer key : expectedKeySet) {
            Assertions.assertEquals(expected.get(key), actual.get(key));
        }
    }
}