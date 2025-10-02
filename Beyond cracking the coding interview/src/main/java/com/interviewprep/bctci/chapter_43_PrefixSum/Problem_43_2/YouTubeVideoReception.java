package com.interviewprep.bctci.chapter_43_PrefixSum.Problem_43_2;

public class YouTubeVideoReception {
    public static int[] numberOfPositiveDays(int[] likes, int[] dislikes, int[][] periods) {
        int n = likes.length;
        int[] prefixSumOfPositiveDays = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefixSumOfPositiveDays[i + 1] = prefixSumOfPositiveDays[i] + (likes[i] > dislikes[i] ? 1 : 0);
        }

        int q = periods.length;
        int[] responses = new int[q];
        for (int i = 0; i < q; i++) {
            int l = periods[i][0], r = periods[i][1];

            responses[i] = prefixSumOfPositiveDays[r + 1] - prefixSumOfPositiveDays[l];
        }

        return responses;
    }
}
