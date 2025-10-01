package com.interviewprep.bctci.chapter_41_GreedyAlgorithms.Problem_41_1;

import java.util.Arrays;
import java.util.Comparator;

public class MostNonOverlappingIntervals {
    public static int getMostNonOverlappingIntervals(int[][] intervals) {
        if (intervals.length < 1) {
            return intervals.length;
        }

        // sort in ascending order of the end of interval, break ties with ascending order of starting interval
        Arrays.sort(intervals, Comparator.comparingInt((int[] a) -> a[1]).thenComparingInt(a -> a[0]));

        int nonOverLappingIntervals = 0;
        int prevEnd = -1;
        // pick an interval which does not overlap with the previous one
        for (int[] interval : intervals) {
            if (interval[0] > prevEnd) {
                nonOverLappingIntervals++;
                prevEnd = interval[1];
            }
        }

        return nonOverLappingIntervals;
    }
}
