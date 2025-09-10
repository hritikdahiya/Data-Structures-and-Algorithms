package com.interviewprep.bctci.chapter_35_Trees.Problem_35_14;

import com.interviewprep.bctci.chapter_35_Trees.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.interviewprep.bctci.chapter_35_Trees.TreesTestUtility.createBSTFromArray;

class BSTValidationTest {

    @Test
    public void isBSTValidTest() {
        Node<Integer> bst = createBSTFromArray(Arrays.asList(8, 6, 5, 8, 2, 6, 8, 8, 12, 10, 9), Integer::compareTo);
        Assertions.assertTrue(BSTValidation.isBSTValidRecursive(bst));


//                5
//    2                       9
//          4           9          11
//                          9
        Node<Integer> looseBST = new Node<>(5,
                new Node<>(2,
                        null,
                        new Node<>(4)),
                new Node<>(9,
                        new Node<>(9,
                                null,
                                new Node<>(9)),
                        new Node<>(11)));
        Assertions.assertTrue(BSTValidation.isBSTValidRecursive(looseBST));

//                            5
//                  2                     9
//          4                       9          11
//                                      9
        Node<Integer> notBST = new Node<>(5,
                new Node<>(2,
                        new Node<>(4),
                        null),
                new Node<>(9,
                        new Node<>(9,
                                null,
                                new Node<>(9)),
                        new Node<>(11)));
        Assertions.assertFalse(BSTValidation.isBSTValidRecursive(notBST));
    }
}