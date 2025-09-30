package com.interviewprep.bctci.chapter_40_DynamicProgramming.Problem_40_2;

import java.util.Arrays;

import static java.lang.Math.min;

// Extension of Problem 40.1 - instead of 2 stops, k stops can be skipped
public class MinivanRoadTrip {
    public int findLeastTimeSpentOnBreaksTabulation(int[] times, int k) {
        int n = times.length;
        if (n <= k) {
            return 0;
        }

        int[] resultCache = new int[n];
        System.arraycopy(times, n - k - 1, resultCache, n - k - 1, k + 1);

        for (int i = n - k - 2; i >= 0; i--) {
            resultCache[i] = Integer.MAX_VALUE;
            // find the least out of the next k elements
            for (int j = i + 1; j <= i + k + 1; j++) {
                resultCache[i] = min(resultCache[i], times[i] + resultCache[j]);
            }
        }

        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i <= k; i++) {
            minVal = Math.min(minVal, resultCache[i]);
        }

        return minVal;
    }

    public int findLeastTimeSpentOnBreaksMemoization(int[] times, int k) {
        int n = times.length;
        if (n <= k) {
            return 0;
        }

        int[] resultCache = new int[n];
        Arrays.fill(resultCache, Integer.MAX_VALUE);
        System.arraycopy(times, n - k - 1, resultCache, n - k - 1, k + 1);

        findLeastTimeSpentOnBreaksMemoization(times, k, 0, resultCache);

        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i <= k; i++) {
            minVal = Math.min(minVal, resultCache[i]);
        }
        return minVal;
    }

    private int findLeastTimeSpentOnBreaksMemoization(int[] times, int k, int currIndex, int[] memo) {
        // return cached result if available
        if (memo[currIndex] != Integer.MAX_VALUE) {
            return memo[currIndex];
        }

        for (int i = currIndex + 1; i <= currIndex + k + 1; i++) {
            memo[currIndex] = min(
                    memo[currIndex],
                    times[currIndex] + findLeastTimeSpentOnBreaksMemoization(times, k, i, memo)
            );
        }

        return memo[currIndex];
    }
}
