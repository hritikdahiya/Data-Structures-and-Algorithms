package com.interviewprep.bctci.chapter_UnionFind.Problem_6;

import com.interviewprep.bctci.chapter_36_Graphs.Edge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class LargestConnectedComponentsOverTimeTest {

    @Test
    public void largestConnectedComponentsOverTimeTest() {
        int V = 4;
        List<Edge> edgeList = Arrays.asList(
                new Edge(0, 1, 60),
                new Edge(0, 3, 180),
                new Edge(2, 3, 120)
        );
        int[] times = {30, 60, 130, 210, 250};
        int[] expected = {1, 2, 2, 4, 4};
        Assertions.assertArrayEquals(expected, LargestConnectedComponentsOverTime.find(V, edgeList, times));
    }
}