package com.interviewprep.bctci.chapter_35_Trees.Problem_35_16;

import com.interviewprep.bctci.chapter_35_Trees.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.interviewprep.bctci.chapter_35_Trees.TreesTestUtility.createBSTFromArray;

class BSTKthElementTest {
    @Test
    public void getKthElementTest() {
        Node<Integer> bst = createBSTFromArray(Arrays.asList(5, 2, 4, 9, 11, 9), Integer::compareTo);
        int k = 0;
        Integer expectedKthElement = 2;
        Assertions.assertEquals(expectedKthElement, BSTKthElement.getKthElementRecursive(bst, k));
        Assertions.assertEquals(expectedKthElement, BSTKthElement.getKthElementIterative(bst, k));

        k = 5;
        expectedKthElement = 11;
        Assertions.assertEquals(expectedKthElement, BSTKthElement.getKthElementRecursive(bst, k));
        Assertions.assertEquals(expectedKthElement, BSTKthElement.getKthElementIterative(bst, k));

        k = 3;
        expectedKthElement = 9;
        Assertions.assertEquals(expectedKthElement, BSTKthElement.getKthElementRecursive(bst, k));
        Assertions.assertEquals(expectedKthElement, BSTKthElement.getKthElementIterative(bst, k));
    }
}