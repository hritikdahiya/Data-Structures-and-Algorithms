package com.interviewprep.bctci.chapter_31_Sorting.Problem_31_3;

import java.util.*;

public class DeleteOperations {
    public static List<Integer> deleteOperations(int[] nums, int[] operations) {
        int n = nums.length;

        Integer[] numsIndices = new Integer[n];
        for (int i = 0; i < n; i++) {
            numsIndices[i] = i;
        }

        // nums indices is sorted based on nums values i.e. indices[0] holds the index of the smallest element in nums
        Arrays.sort(numsIndices, Comparator.comparingInt((Integer a) -> nums[a]));

        // When we don't want to edit the inputs, maintain a set of to be deleted indices
        // Set<Integer> deletedIndices = new HashSet<>();
        int smallestIndex = 0;
        for (int operation : operations) {
            int indexToRemove = operation;
            // if operation is to remove the smallest element, find the first smallest element still not deleted
            if (operation == -1) {
                int indexOfNumsArray = numsIndices[smallestIndex++];
                while (nums[indexOfNumsArray] == Integer.MIN_VALUE) {
                    indexOfNumsArray = numsIndices[smallestIndex++];
                }
                indexToRemove = indexOfNumsArray;
            }
            // deletedIndices.add(indexToRemove)
            nums[indexToRemove] = Integer.MIN_VALUE;
        }

        List<Integer> resultAfterDeleteOperations = new ArrayList<>();
        for (int num : nums) {
            // if(!deletedIndices.contains(i)) {
            if (num != Integer.MIN_VALUE) {
                resultAfterDeleteOperations.add(num);
            }
        }

        return resultAfterDeleteOperations;
    }
}
