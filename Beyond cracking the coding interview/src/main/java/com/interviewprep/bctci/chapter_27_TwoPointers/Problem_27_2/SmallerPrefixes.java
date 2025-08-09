package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_2;

public class SmallerPrefixes {
    public static boolean smallerPrefixSpaceOptimized(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return false;
        }

        if (n % 2 == 1) {
            throw new IllegalArgumentException("arr should have an even length");
        }

        long leftHalfSum = 0, rightHalfSum = 0;
        int l = 0, r = 0;
        while (r < n) {
            leftHalfSum += arr[l];                      // Slow pointer
            rightHalfSum += arr[r] + arr[r + 1];        // Fast pointer

            if (leftHalfSum >= rightHalfSum) {
                return false;
            }
            l += 1;
            r += 2;
        }

        return true;
    }

    public static boolean smallerPrefix(int[] arr) {
        // Basic solution which precomputes prefix sum array with O(n) extra space
        int n = arr.length;
        if (n == 0) {
            return false;
        }

        if (n % 2 == 1) {
            throw new IllegalArgumentException("arr should have an even length");
        }

        long[] prefixSum = new long[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        for (int i = 0; 2 * i < n; i++) {
            if (prefixSum[i] >= prefixSum[2 * i + 1]) {
                return false;
            }
        }

        return true;
    }

}
