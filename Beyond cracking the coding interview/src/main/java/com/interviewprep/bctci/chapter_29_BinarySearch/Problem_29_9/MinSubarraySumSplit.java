package com.interviewprep.bctci.chapter_29_BinarySearch.Problem_29_9;

public class MinSubarraySumSplit {
    // arr only has positive integers
    // k is the number of subarrays the array should be split.
    // 1 <= k <= n
    public static int findMinSubarraySplit(int[] arr, int k) {
        int n = arr.length;
        if (k > n) {
            return Integer.MIN_VALUE;
        }

        // Smallest possible value of the subarray sum (when every element acts as a subArray i.e. when k = n)
        int largestelement = Integer.MIN_VALUE;
        int arraySum = 0;
        for (int arrItem : arr) {
            largestelement = Math.max(arrItem, largestelement);
            arraySum += arrItem;
        }

        int s = largestelement, e = arraySum;

        if (!isBeforeTransitionPoint(arr, s, k)) {
            return s;
        }

        while (e - s > 1) {
            int mid = s + (e - s) / 2;
            if (isBeforeTransitionPoint(arr, mid, k)) {
                s = mid;
            } else {
                e = mid;
            }
        }

        return e;
    }

    private static boolean isBeforeTransitionPoint(int[] arr, int maxSum, int k) {
        int partitions = 1;
        int currSubsetSum = 0;
        for (int i = 0; i < arr.length; i++) {
            // when the maxSum is too small for even a single element subarray to exist
            if (arr[i] > maxSum) {
                return false;
            }
            if (currSubsetSum + arr[i] > maxSum) {
                partitions++;
                currSubsetSum = arr[i];
            } else {
                currSubsetSum += arr[i];
            }
        }

        return partitions > k;
    }
}

