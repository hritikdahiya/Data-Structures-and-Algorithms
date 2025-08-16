package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class InPlaceDuplicateRemovalTest {

    @Test
    public void inplaceDuplicateRemovalTes() {
        // elements less than 2
        int[] arr = new int[]{1};
        int newLen = InPlaceDuplicateRemoval.inPlaceDuplicateRemoval(arr);
        Assertions.assertArrayEquals(new int[]{1}, Arrays.copyOf(arr, newLen));

        // all duplicates
        arr = new int[]{2, 2, 2, 2};
        newLen = InPlaceDuplicateRemoval.inPlaceDuplicateRemoval(arr);
        Assertions.assertArrayEquals(new int[]{2}, Arrays.copyOf(arr, newLen));

        // all unique elements
        arr = new int[]{1, 2, 3, 4, 5};
        newLen = InPlaceDuplicateRemoval.inPlaceDuplicateRemoval(arr);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, Arrays.copyOf(arr, newLen));


        // normal case
        arr = new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 5, 5};
        newLen = InPlaceDuplicateRemoval.inPlaceDuplicateRemoval(arr);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, Arrays.copyOf(arr, newLen));
    }
}