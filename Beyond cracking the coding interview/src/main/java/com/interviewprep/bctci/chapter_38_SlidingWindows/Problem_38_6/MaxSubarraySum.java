package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_6;

import java.util.Arrays;

public class MaxSubarraySum {
    public static int find(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }

        int maxVal = Arrays.stream(arr).max().orElse(0);
        if (maxVal <= 0) {
            return maxVal;
        }

        int index = 0;
        int maxSum = 0, currSum = 0;
        while (index < arr.length) {
            if (currSum + arr[index] > 0) {
                currSum += arr[index];
                maxSum = Math.max(maxSum, currSum);
            } else {
                currSum = 0;
            }
            index++;
        }

        return maxSum;
    }
}
