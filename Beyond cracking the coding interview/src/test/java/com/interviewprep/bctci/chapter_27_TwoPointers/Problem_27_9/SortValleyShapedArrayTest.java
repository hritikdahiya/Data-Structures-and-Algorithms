package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SortValleyShapedArrayTest {

    @Test
    public void sortValleyShapedArrayTest() {
        // asc order
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, SortValleyShapedArray.sortValleyShapedArray(new int[]{1, 2, 3, 4, 5}));
        Assertions.assertArrayEquals(new int[]{1, 1, 1, 4, 5}, SortValleyShapedArray.sortValleyShapedArray(new int[]{1, 1, 1, 4, 5}));
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 3, 3}, SortValleyShapedArray.sortValleyShapedArray(new int[]{1, 2, 3, 3, 3}));

        // desc order
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, SortValleyShapedArray.sortValleyShapedArray(new int[]{5, 4, 3, 2, 1}));
        Assertions.assertArrayEquals(new int[]{1, 2, 5, 5, 5,}, SortValleyShapedArray.sortValleyShapedArray(new int[]{5, 5, 5, 2, 1}));
        Assertions.assertArrayEquals(new int[]{3, 3, 3, 4, 5}, SortValleyShapedArray.sortValleyShapedArray(new int[]{5, 4, 3, 3, 3}));

        // valley bottom
        Assertions.assertArrayEquals(new int[]{3, 4, 5, 6, 8}, SortValleyShapedArray.sortValleyShapedArray(new int[]{5, 4, 3, 6, 8}));
        // valley bottom with a lot of duplicates
        Assertions.assertArrayEquals(new int[]{3, 3, 4, 4, 5, 6, 8, 8}, SortValleyShapedArray.sortValleyShapedArray(new int[]{5, 4, 4, 3, 3, 6, 8, 8}));
        Assertions.assertArrayEquals(new int[]{2, 3, 3, 3, 4, 5, 8, 8}, SortValleyShapedArray.sortValleyShapedArray(new int[]{5, 4, 2, 3, 3, 3, 8, 8}));
    }
}