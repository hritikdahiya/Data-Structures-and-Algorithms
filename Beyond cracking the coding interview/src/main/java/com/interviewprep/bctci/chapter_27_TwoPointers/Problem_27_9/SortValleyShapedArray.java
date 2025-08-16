package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_9;

import java.util.Arrays;

public class SortValleyShapedArray {
    public static int[] sortValleyShapedArray(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return Arrays.copyOf(arr, n);
        }

        int[] sortedArr = new int[n];
        // Merge two sorted array (in descending order) in reverse order
        // Arr1 starting from 0 going right
        // Arr2 starting from end going left
        // Move pointers inward and populate the sorted array in reverse order
        int l = 0, r = n - 1;
        int k = n - 1;

        while (l <= r) {
            sortedArr[k--] = arr[l] < arr[r] ? arr[r--] : arr[l++];
        }

        return sortedArr;
    }
}
