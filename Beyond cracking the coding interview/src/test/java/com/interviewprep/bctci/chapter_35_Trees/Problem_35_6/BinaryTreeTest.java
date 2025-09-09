package com.interviewprep.bctci.chapter_35_Trees.Problem_35_6;

import com.interviewprep.bctci.chapter_35_Trees.Node;
import org.junit.jupiter.api.Test;

import static com.interviewprep.bctci.chapter_35_Trees.TreesTestUtility.areTreesEqual;

class BinaryTreeTest {

    @Test
    public void invertBinaryTreeTest() {
        Node<Integer> root = null;
        Node<Integer> expectedInverted = null;

        BinaryTree.invert(root);
        areTreesEqual(expectedInverted, root);


        root = new Node<>(1);
        expectedInverted = new Node<>(1);

        BinaryTree.invert(root);
        areTreesEqual(expectedInverted, root);


        root = new Node<>(1,
                new Node<>(6,
                        new Node<>(4,
                                null,
                                new Node<>(5)),
                        new Node<>(11)),
                new Node<>(7,
                        new Node<>(2,
                                null,
                                new Node<>(9)),
                        null)
        );
        expectedInverted = new Node<>(1,
                new Node<>(7,
                        null,
                        new Node<>(2,
                                new Node<>(9),
                                null)),
                new Node<>(6,
                        new Node<>(11),
                        new Node<>(4,
                                new Node<>(5),
                                null))

        );

        BinaryTree.invert(root);
        areTreesEqual(expectedInverted, root);
    }
}