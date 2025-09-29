package com.interviewprep.bctci.chapter_40_DynamicProgramming.Problem_40_1;

public class RoadTrip {
    public int findLeastTimeSpentOnBreaksMemoization(int[] times) {
        int n = times.length;
        if (n < 3) {
            return 0;
        }

        int[] resultCache = new int[n];
        System.arraycopy(times, n - 3, resultCache, n - 3, 3);

        findLeastTimeSpentOnBreaksMemoization(times, 0, resultCache);

        return Math.min(resultCache[0], Math.min(resultCache[1], resultCache[2]));
    }

    private int findLeastTimeSpentOnBreaksMemoization(int[] times, int currIndex, int[] memo) {
        if (currIndex >= times.length - 3) {
            return times[currIndex];
        }

        // return cached result if available
        if (memo[currIndex] > 0) {
            return memo[currIndex];
        }

        memo[currIndex] = times[currIndex] + Math.min(
                findLeastTimeSpentOnBreaksMemoization(times, currIndex + 1, memo),
                Math.min(findLeastTimeSpentOnBreaksMemoization(times, currIndex + 2, memo),
                        findLeastTimeSpentOnBreaksMemoization(times, currIndex + 3, memo)));

        return memo[currIndex];
    }

}
