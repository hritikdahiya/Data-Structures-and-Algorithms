package com.interviewprep.bctci.chapter_35_Trees.Problem_35_13;

import com.interviewprep.bctci.chapter_35_Trees.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static com.interviewprep.bctci.chapter_35_Trees.TreesTestUtility.createBSTFromArray;

class BSTNearestValueTest {
    @Test
    public void nearestValueTest() {
        Node<Integer> bst = createBSTFromArray(Arrays.asList(5, 2, 4, 9, 9, 11), Integer::compareTo);
        int valToFind = 4;
        Integer expectedValue = 4;
        Assertions.assertEquals(expectedValue, BSTNearestValue.findNearest(bst, valToFind, Integer::compareTo));


        valToFind = 6;
        expectedValue = 5;
        Assertions.assertEquals(expectedValue, BSTNearestValue.findNearest(bst, valToFind, Integer::compareTo));

        valToFind = 3;
        expectedValue = 2;
        Assertions.assertEquals(expectedValue, BSTNearestValue.findNearest(bst, valToFind, Integer::compareTo));

        bst = createBSTFromArray(new ArrayList<>(), Integer::compareTo);
        valToFind = 10;
        Node<Integer> finalBst = bst;
        Integer finalValToFind = valToFind;
        Assertions.assertThrows(IllegalArgumentException.class, () -> BSTNearestValue.findNearest(finalBst, finalValToFind, Integer::compareTo));
    }
}