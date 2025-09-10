package com.interviewprep.bctci.chapter_35_Trees.Problem_35_8;

import com.interviewprep.bctci.chapter_35_Trees.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class LeftViewTest {

    @Test
    public void leftViewTest() {
        Node<Integer> root = null;
        List<Integer> expectedLeftView = new ArrayList<>();
        Assertions.assertArrayEquals(expectedLeftView.toArray(), LeftView.leftView(root).toArray());

//                1
//            2       3
        root = new Node<>(1,
                new Node<>(2),
                new Node<>(3));
        expectedLeftView = Arrays.asList(1, 2);
        Assertions.assertArrayEquals(expectedLeftView.toArray(), LeftView.leftView(root).toArray());

//                1
//                    3
        root = new Node<>(1,
                null,
                new Node<>(3));
        expectedLeftView = Arrays.asList(1, 3);
        Assertions.assertArrayEquals(expectedLeftView.toArray(), LeftView.leftView(root).toArray());

//                    1
//            2             3
//                5              6
//                                    7
        root = new Node<>(1,
                new Node<>(2,
                        null,
                        new Node<>(5)),
                new Node<>(3,
                        null,
                        new Node<>(6,
                                null,
                                new Node<>(7))));
        expectedLeftView = Arrays.asList(1, 2, 5, 7);
        Assertions.assertArrayEquals(expectedLeftView.toArray(), LeftView.leftView(root).toArray());
    }
}