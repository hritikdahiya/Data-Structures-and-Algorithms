package com.interviewprep.bctci.chapter_35_Trees.Problem_35_17;

import com.interviewprep.bctci.chapter_35_Trees.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.interviewprep.bctci.chapter_35_Trees.TreesTestUtility.createBSTFromArray;

class BSTMergeIntoArrayTest {
    @Test
    public void mergeTest() {
        Node<Integer> bst1 = createBSTFromArray(Arrays.asList(5, 2, 4, 9, 9, 11), Integer::compareTo);
        Node<Integer> bst2 = createBSTFromArray(List.of(), Integer::compareTo);
        List<Integer> expectedMergedList = Arrays.asList(2, 4, 5, 9, 9, 11);
        Assertions.assertArrayEquals(expectedMergedList.toArray(), BSTMergeIntoArray.merge(bst1, bst2, Integer::compareTo).toArray());


        bst1 = createBSTFromArray(List.of(), Integer::compareTo);
        bst2 = createBSTFromArray(Arrays.asList(5, 2, 4, 9, 9, 11), Integer::compareTo);
        Assertions.assertArrayEquals(expectedMergedList.toArray(), BSTMergeIntoArray.merge(bst1, bst2, Integer::compareTo).toArray());

        bst1 = createBSTFromArray(Arrays.asList(3, 2, 1, 7, 6, 6, 8), Integer::compareTo);
        bst2 = createBSTFromArray(Arrays.asList(5, 2, 4, 9, 9, 11), Integer::compareTo);
        expectedMergedList = Arrays.asList(1, 2, 2, 3, 4, 5, 6, 6, 7, 8, 9, 9, 11);
        Assertions.assertArrayEquals(expectedMergedList.toArray(), BSTMergeIntoArray.merge(bst1, bst2, Integer::compareTo).toArray());
    }
}