package com.interviewprep.bctci.chapter_40_DynamicProgramming.Problem_40_1;

import static java.lang.Math.min;

public class RoadTrip {
    public int findLeastTimeSpentOnBreaksTabulation(int[] times) {
        int n = times.length;
        if (n < 3) {
            return 0;
        }

        int[] resultCache = new int[n];
        System.arraycopy(times, n - 3, resultCache, n - 3, 3);

        for (int i = n - 4; i >= 0; i--) {
            resultCache[i] = times[i] + min(resultCache[i + 1], min(resultCache[i + 2], resultCache[i + 3]));
        }

        return min(resultCache[0], min(resultCache[1], resultCache[2]));
    }

    public int findLeastTimeSpentOnBreaksMemoization(int[] times) {
        int n = times.length;
        if (n < 3) {
            return 0;
        }

        int[] resultCache = new int[n];
        System.arraycopy(times, n - 3, resultCache, n - 3, 3);

        findLeastTimeSpentOnBreaksMemoization(times, 0, resultCache);

        return min(resultCache[0], min(resultCache[1], resultCache[2]));
    }

    private int findLeastTimeSpentOnBreaksMemoization(int[] times, int currIndex, int[] memo) {
        if (currIndex >= times.length - 3) {
            return times[currIndex];
        }

        // return cached result if available
        if (memo[currIndex] > 0) {
            return memo[currIndex];
        }

        memo[currIndex] = times[currIndex] + min(
                findLeastTimeSpentOnBreaksMemoization(times, currIndex + 1, memo),
                min(findLeastTimeSpentOnBreaksMemoization(times, currIndex + 2, memo),
                        findLeastTimeSpentOnBreaksMemoization(times, currIndex + 3, memo)));

        return memo[currIndex];
    }

}
