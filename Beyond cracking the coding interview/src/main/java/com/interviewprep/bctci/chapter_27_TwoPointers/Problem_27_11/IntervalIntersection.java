package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_11;

import java.util.ArrayList;
import java.util.List;

public class IntervalIntersection {
    public static Integer[][] findIntervalIntersection(int[][] arr1, int[][] arr2) {
        int n1 = arr1.length, n2 = arr2.length;

        if (n1 < 1 || n2 < 1) {
            return new Integer[0][];
        }

        int p1 = 0, p2 = 0;
        List<Integer[]> intersection = new ArrayList<>();

        // 2 pointer - one over each interval
        //check overlap and move the pointer forward whose interval starts earlier
        while (p1 < n1 && p2 < n2) {
            int int1Start = arr1[p1][0], int1End = arr1[p1][1];
            int int2Start = arr2[p2][0], int2End = arr2[p2][1];

            if (int1End < int2Start) {
                // Interval1 ends before interval 2 starts
                p1++;
            } else if (int2End < int1Start) {
                // Interval2 ends before interval 1 starts
                p2++;
            } else {
                Integer[] commonInterval = new Integer[]{
                        Math.max(int1Start, int2Start),
                        Math.min(int1End, int2End)
                };

                mergeOrAppend(intersection, commonInterval);

                if (int1End < int2End) {
                    p1++;
                } else {
                    p2++;
                }
            }
        }

        return intersection.toArray(new Integer[0][]);
    }

    private static void mergeOrAppend(List<Integer[]> intervals, Integer[] newInterval) {
        if (intervals.isEmpty()) {
            intervals.add(newInterval);
        } else {
            // last interval and current interval share an endpoint - merge them into one
            if (intervals.get(intervals.size() - 1)[1].equals(newInterval[0])) {
                intervals.get(intervals.size() - 1)[1] = newInterval[1];
            } else {
                intervals.add(newInterval);
            }
        }
    }

}