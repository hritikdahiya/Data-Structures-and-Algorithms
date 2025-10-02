package com.interviewprep.bctci.chapter_43_PrefixSum.Problem_43_4;

import java.util.Arrays;

public class BalancePoint {
    public static int findBalancePointsSpaceEfficient(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return -1;
        }
        if (n == 1) {
            return 0;
        }

        int prefixSum = 0;
        int postfixSum = Arrays.stream(arr).sum() - arr[0];

        for (int i = 0; i < n; i++) {
            if (prefixSum == postfixSum) {
                return i;
            }
            if (i < n - 1) {
                postfixSum -= arr[i + 1];
            }
            prefixSum += arr[i];
        }

        return -1;
    }

    public static int findBalancePoints(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return -1;
        }
        if (n == 1) {
            return 0;
        }

        int[] prefixSum = new int[n];
        int[] suffixSum = new int[n];

        prefixSum[0] = arr[0];
        suffixSum[n - 1] = arr[n - 1];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + arr[i];
        }

        if (suffixSum[1] == 0) {
            return 0;
        }
        if (prefixSum[n - 2] == 0) {
            return n - 1;
        }
        for (int i = 1; i < n - 1; i++) {
            if (prefixSum[i - 1] == suffixSum[i + 1]) {
                return i;
            }
        }

        return -1;
    }
}
