package com.interviewprep.bctci.chapter_33_Recursion.Problem_33_5;

public class LaminalArray {
    public static int maxSum(int[] arr) {
        if (arr.length < 1) {
            return 0;
        }
        int[] maxSumResult = new int[1];
        maxSumResult[0] = Integer.MIN_VALUE;

        maxSumHelper(arr, 0, arr.length - 1, maxSumResult);

        return maxSumResult[0];
    }

    private static int maxSumHelper(int[] arr, int s, int e, int[] maxSumResult) {
        // edge case
        if (s > e) {
            return 0;
        }
        // leaf node i.e. single element array
        if (s == e) {
            maxSumResult[0] = Math.max(maxSumResult[0], arr[s]);
            return arr[s];
        }

        int mid = (s + e) / 2;

        int leftSum = maxSumHelper(arr, s, mid, maxSumResult);
        int rightSum = maxSumHelper(arr, mid + 1, e, maxSumResult);

        maxSumResult[0] = Math.max(maxSumResult[0], leftSum + rightSum);

        return leftSum + rightSum;
    }
}
