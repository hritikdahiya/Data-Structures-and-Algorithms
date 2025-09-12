package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;

class TreeCheckTest {

    @Test
    public void isGraphATreeTest() {
        // tree
        List<List<Integer>> graph = asList(
                List.of(2),
                asList(2, 5),
                asList(0, 1, 3, 4),
                List.of(2),
                List.of(2),
                List.of(1)
        );
        Assertions.assertTrue(TreeCheck.isGraphATree(graph));

        // forest of trees
        graph = asList(
                List.of(2),
                List.of(5),
                asList(0, 3),
                List.of(2),
                List.of(),
                List.of(1)
        );
        Assertions.assertFalse(TreeCheck.isGraphATree(graph));

        // cyclic graph
        graph = asList(
                List.of(1),
                asList(0, 2, 5),
                asList(1, 3, 4),
                List.of(2),
                asList(2, 5),
                asList(1, 4)
        );
        Assertions.assertFalse(TreeCheck.isGraphATree(graph));
    }
}