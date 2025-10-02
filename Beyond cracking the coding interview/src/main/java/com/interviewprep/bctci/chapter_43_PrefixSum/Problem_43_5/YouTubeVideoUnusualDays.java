package com.interviewprep.bctci.chapter_43_PrefixSum.Problem_43_5;

import java.util.Arrays;

public class YouTubeVideoUnusualDays {
    public static int findHighestTotalDeviation(int[] likes, int[] dislikes) {
        int n = likes.length;
        int[] scores = new int[n];
        int[] prefixSumScores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = likes[i] - dislikes[i];
        }

        Arrays.sort(scores);

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                prefixSumScores[i] = scores[i];
            } else {
                prefixSumScores[i] = prefixSumScores[i - 1] + scores[i];
            }
        }

        int maxDeviation = 0;
        for (int i = 0; i < n; i++) {
            int currScore = scores[i];

            int suffixSum = prefixSumScores[n - 1] - prefixSumScores[i];
            // suffix sum MINUS sum of rectangle
            int largerElementContribution = suffixSum - (n - i - 1) * currScore;

            // sum of rectangle - prefix sum
            int smallerElementContributions = i * currScore - (i == 0 ? 0 : prefixSumScores[i - 1]);

            maxDeviation = Math.max(maxDeviation, largerElementContribution + smallerElementContributions);
        }

        return maxDeviation;
    }
}
