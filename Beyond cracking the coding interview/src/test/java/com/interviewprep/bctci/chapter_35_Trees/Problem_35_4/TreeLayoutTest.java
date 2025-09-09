package com.interviewprep.bctci.chapter_35_Trees.Problem_35_4;

import com.interviewprep.bctci.chapter_35_Trees.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TreeLayoutTest {

    @Test
    public void maxNumOfStackedNodesTest() {
        // empty tree
        Node<Integer> root = null;
        Integer expectedCount = 0;
        Assertions.assertEquals(expectedCount, TreeLayout.maxNumOfStackedNodes(root));

        // single node tree
        root = new Node<>(1);
        expectedCount = 1;
        Assertions.assertEquals(expectedCount, TreeLayout.maxNumOfStackedNodes(root));

        // no overlap
        root = new Node<>(1,
                new Node<>(2,
                        new Node<>(3),
                        null),
                new Node<>(4,
                        null,
                        new Node<>(5)));
        expectedCount = 1;
        Assertions.assertEquals(expectedCount, TreeLayout.maxNumOfStackedNodes(root));


        // significant overlap

//                                                1
//                            2                                           3
//                4                   5                       6                       7
//        9              10   11              12      13              14      15              16


//        ----------------------------------
//        | 1 | 3         |  7        | 16 |
//        ----------------------------------
//        | 2 | 5,6       | 12, 14, 15|
//        ----------------------------------
//        | 4 | 10,11,13  |
//        ----------------------------------
//        | 9 |
//        ----------------------------------
        root = new Node<>(1,
                new Node<>(2,
                        new Node<>(4,
                                new Node<>(9),
                                new Node<>(10)),
                        new Node<>(5,
                                new Node<>(11),
                                new Node<>(12))),
                new Node<>(3,
                        new Node<>(6,
                                new Node<>(13),
                                new Node<>(14)),
                        new Node<>(7,
                                new Node<>(15),
                                new Node<>(16)))
        );
        expectedCount = 3;
        Assertions.assertEquals(expectedCount, TreeLayout.maxNumOfStackedNodes(root));
    }
}