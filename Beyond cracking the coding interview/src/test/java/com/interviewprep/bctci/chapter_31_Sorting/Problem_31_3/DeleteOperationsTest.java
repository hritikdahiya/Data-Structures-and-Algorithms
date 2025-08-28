package com.interviewprep.bctci.chapter_31_Sorting.Problem_31_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class DeleteOperationsTest {

    @Test
    public void deleteOperationsTest() {
        List<Integer> expectedList = List.of(50);
        int[] nums = new int[]{50, 30, 70, 20, 80};
        int[] operations = new int[]{2, -1, 4, -1};
        Assertions.assertArrayEquals(expectedList.toArray(), DeleteOperations.deleteOperations(nums, operations).toArray());

        // delete all by smallest operation with duplicates
        expectedList = new ArrayList<>();
        nums = new int[]{3, 2, 1, 3, 2};
        operations = new int[]{-1, -1, -1, -1, -1};
        Assertions.assertArrayEquals(expectedList.toArray(), DeleteOperations.deleteOperations(nums, operations).toArray());

        // delete all by index
        expectedList = new ArrayList<>();
        nums = new int[]{3, 2, 1};
        operations = new int[]{2, 0, 1};
        Assertions.assertArrayEquals(expectedList.toArray(), DeleteOperations.deleteOperations(nums, operations).toArray());

        // no operations
        expectedList = Arrays.asList(1, 2, 3);
        nums = new int[]{1, 2, 3};
        operations = new int[]{};
        Assertions.assertArrayEquals(expectedList.toArray(), DeleteOperations.deleteOperations(nums, operations).toArray());
    }

}