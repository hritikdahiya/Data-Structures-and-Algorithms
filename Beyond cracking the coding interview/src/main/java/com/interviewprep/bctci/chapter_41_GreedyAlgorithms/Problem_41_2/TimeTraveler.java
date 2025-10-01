package com.interviewprep.bctci.chapter_41_GreedyAlgorithms.Problem_41_2;

import java.util.PriorityQueue;

public class TimeTraveler {
    public static boolean canReachDestination(int[] jumpingPoints, int k, int maxAging) {
        int n = jumpingPoints.length;

        // number of jumps are more than the jumping points (-1 because we're already at the 1st jumping point)
        if (k >= n - 1) {
            return true;
        }
        // if no jumps, then the maxAging should be less than the range of years to pass
        if (k == 0) {
            return jumpingPoints[n - 1] - jumpingPoints[0] <= maxAging;
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 1; i <= k; i++) {
            // use jumps
            minHeap.add(jumpingPoints[i] - jumpingPoints[i - 1]);
        }

        for (int i = k + 1; i < n; i++) {
            int yearDiff = jumpingPoints[i] - jumpingPoints[i - 1];
            // found a larger year that could use a jump (which was used on a smaller year span)
            if (!minHeap.isEmpty() && minHeap.peek() < yearDiff) {
                // use natural aging to cover the smaller year span
                maxAging -= minHeap.poll();
                // use jump to cover the larger current year diff
                minHeap.add(yearDiff);
            } else {
                maxAging -= yearDiff;
            }

            if (maxAging < 0) {
                return false;
            }
        }

        return true;
    }
}