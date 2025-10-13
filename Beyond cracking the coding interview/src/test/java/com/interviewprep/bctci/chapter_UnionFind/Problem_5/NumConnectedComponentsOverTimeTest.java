package com.interviewprep.bctci.chapter_UnionFind.Problem_5;

import com.interviewprep.bctci.chapter_36_Graphs.Edge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class NumConnectedComponentsOverTimeTest {

    @Test
    public void numConnectedComponentsOverTimeTest() {
        int V = 4;
        List<Edge> edgeList = Arrays.asList(
                new Edge(0, 1, 60),
                new Edge(0, 3, 180),
                new Edge(2, 3, 120)
        );
        int[] times = {30, 60, 130, 210, 250};
        int[] expected = {4, 3, 2, 1, 1};
        Assertions.assertArrayEquals(expected, NumConnectedComponentsOverTime.find(V, edgeList, times));
    }
}