package com.interviewprep.bctci.chapter_41_GreedyAlgorithms.Problem_41_6;

import java.util.PriorityQueue;

public class TimeTravelerMaxYear {
    public static int lastReachableYear(int[] jumpingPoints, int k, int maxAging) {
        int n = jumpingPoints.length;

        if (k >= n) {
            return jumpingPoints[n - 1] + maxAging;
        }


        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 1; i <= k; i++) {
            // use jumps
            minHeap.add(jumpingPoints[i] - jumpingPoints[i - 1]);
        }

        int lastYear = jumpingPoints[k];
        for (int i = k + 1; i < n; i++) {
            int yearDiff = jumpingPoints[i] - jumpingPoints[i - 1];
            int yearsToLiveNaturally = yearDiff;
            if (!minHeap.isEmpty() && minHeap.peek() < yearDiff) {
                yearsToLiveNaturally = minHeap.poll();
                minHeap.add(yearDiff);
            }

            if (maxAging - yearsToLiveNaturally < 0) {
                lastYear += maxAging;
                return lastYear;
            } else {
                lastYear = jumpingPoints[i];
                maxAging -= yearsToLiveNaturally;
            }
        }

        // add the number of years left to live naturally
        return lastYear + maxAging;
    }
}
