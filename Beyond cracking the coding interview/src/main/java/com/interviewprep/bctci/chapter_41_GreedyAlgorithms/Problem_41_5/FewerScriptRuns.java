package com.interviewprep.bctci.chapter_41_GreedyAlgorithms.Problem_41_5;

import java.util.Arrays;
import java.util.Comparator;

public class FewerScriptRuns {
    public static int findMinScriptRuns(int[][] meetings) {
        int n = meetings.length;
        if (n < 2) {
            return n;
        }
        // sort meetings based on their start times
        Arrays.sort(meetings, Comparator.comparingInt((int[] meet) -> meet[0]).thenComparingInt(meet -> meet[1]));

        int scriptRuns = 1;
        int lastEndTime = meetings[0][1];
        for (int i = 1; i < n; i++) {
            if (meetings[i][0] > lastEndTime) {
                scriptRuns += 1;
                lastEndTime = meetings[i][1];
            }
        }

        return scriptRuns;
    }
}
