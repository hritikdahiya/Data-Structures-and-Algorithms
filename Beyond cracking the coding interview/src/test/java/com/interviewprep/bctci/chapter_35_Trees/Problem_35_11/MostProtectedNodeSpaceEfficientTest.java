package com.interviewprep.bctci.chapter_35_Trees.Problem_35_11;

import com.interviewprep.bctci.chapter_35_Trees.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MostProtectedNodeSpaceEfficientTest {

    @Test
    public void findHighestProtectionLevelTest() {
        Node<Integer> root = new Node<>(1,
                new Node<>(2,
                        new Node<>(3,
                                new Node<>(4,
                                        new Node<>(5,
                                                new Node<>(6),
                                                null),
                                        new Node<>(7,
                                                new Node<>(8),
                                                new Node<>(9))),
                                new Node<>(10,
                                        new Node<>(11),
                                        null)),
                        new Node<>(12,
                                new Node<>(13,
                                        new Node<>(14,
                                                new Node<>(15),
                                                new Node<>(16)),
                                        null),
                                null)),
                new Node<>(17,
                        new Node<>(18,
                                new Node<>(19,
                                        new Node<>(20,
                                                new Node<>(21),
                                                null),
                                        null),
                                null),
                        new Node<>(22,
                                new Node<>(23,
                                        new Node<>(24,
                                                new Node<>(25),
                                                null),
                                        null),
                                null)));


        int expectedProtectionLevel = 2;
        Assertions.assertEquals(expectedProtectionLevel, MostProtectedNodeSpaceEfficient.findHighestProtectionLevel(root));
    }
}