package com.interviewprep.bctci.chapter_35_Trees.Problem_35_15;

import com.interviewprep.bctci.chapter_35_Trees.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.interviewprep.bctci.chapter_35_Trees.TreesTestUtility.createBSTFromArray;

class BSTDuplicateDetectionTest {
    @Test
    public void containDuplicatesWithInorderTraversalTest() {
        Node<Integer> bst = createBSTFromArray(Arrays.asList(5, 2, 4, 9, 9, 11), Integer::compareTo);
        Assertions.assertTrue(BSTDuplicateDetection.containDuplicatesWithInorderTraversal(bst, Integer::compareTo));
        Assertions.assertTrue(BSTDuplicateDetection.containDuplicates(bst, Integer::compareTo));

        bst = createBSTFromArray(Arrays.asList(5, 2, 4, 9, 10, 11, 9, 10), Integer::compareTo);
        Assertions.assertTrue(BSTDuplicateDetection.containDuplicatesWithInorderTraversal(bst, Integer::compareTo));
        Assertions.assertTrue(BSTDuplicateDetection.containDuplicates(bst, Integer::compareTo));

        bst = createBSTFromArray(Arrays.asList(5, 2, 4, 9, 11), Integer::compareTo);
        Assertions.assertFalse(BSTDuplicateDetection.containDuplicatesWithInorderTraversal(bst, Integer::compareTo));
        Assertions.assertFalse(BSTDuplicateDetection.containDuplicates(bst, Integer::compareTo));

        bst = createBSTFromArray(List.of(), Integer::compareTo);
        Assertions.assertFalse(BSTDuplicateDetection.containDuplicatesWithInorderTraversal(bst, Integer::compareTo));
        Assertions.assertFalse(BSTDuplicateDetection.containDuplicates(bst, Integer::compareTo));
    }
}