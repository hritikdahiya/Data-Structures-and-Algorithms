package com.interviewprep.bctci.chapter_43_PrefixSum.Problem_43_1;

public class ChannelViews {
    public static int[] getViews(int[] views, int[][] queries) {
        int n = views.length;
        int[] prefixViews = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixViews[i + 1] = prefixViews[i] + views[i];
        }

        int q = queries.length;
        int[] responses = new int[q];
        int i = 0;
        for (int[] query : queries) {
            int l = query[0], r = query[1];
            assert l >= 0 && l < n && r >= 0 && r < n;

            responses[i++] = prefixViews[r + 1] - prefixViews[l];
        }

        return responses;
    }
}
