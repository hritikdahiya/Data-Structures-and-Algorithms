package com.interviewprep.bctci.chapter_35_Trees.Problem_35_12;

import com.interviewprep.bctci.chapter_35_Trees.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static com.interviewprep.bctci.chapter_35_Trees.TreesTestUtility.createBSTFromArray;

class BSTSearchTest {
    @Test
    public void containsTest() {
        Node<Integer> bst = createBSTFromArray(Arrays.asList(5, 2, 4, 9, 9, 11), Integer::compareTo);
        Assertions.assertTrue(BSTSearch.containsRecursive(bst, 4, Integer::compareTo));
        Assertions.assertTrue(BSTSearch.containsIterative(bst, 4, Integer::compareTo));

        Assertions.assertFalse(BSTSearch.containsRecursive(bst, 10, Integer::compareTo));
        Assertions.assertFalse(BSTSearch.containsIterative(bst, 10, Integer::compareTo));

        bst = createBSTFromArray(new ArrayList<>(), Integer::compareTo);
        Assertions.assertFalse(BSTSearch.containsRecursive(bst, 1, Integer::compareTo));
        Assertions.assertFalse(BSTSearch.containsIterative(bst, 1, Integer::compareTo));
    }
}