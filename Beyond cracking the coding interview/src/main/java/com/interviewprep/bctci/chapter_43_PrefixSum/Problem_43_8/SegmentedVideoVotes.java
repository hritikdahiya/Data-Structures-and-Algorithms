package com.interviewprep.bctci.chapter_43_PrefixSum.Problem_43_8;

public class SegmentedVideoVotes {
    public static int[] getVoteCount(int n, int[][] votes) {
        int[] votePerMin = new int[n];

        // for every vote, mark the start of the window to add the vote, and mark the end of window to stop propagating
        // that vote. At the end, propagate every vote value to the end to get the votes at every minute
        for (int[] vote : votes) {
            // vote tuple - startMin, endMin, voteValue
            int start = vote[0], end = vote[1], val = vote[2];
            votePerMin[start] += val;
            if (end + 1 < n) {
                votePerMin[end + 1] -= val;
            }
            // ex - vote = [3,4,1] ==> votePerMin[3] = 1, votePerMin[4 + 1] = -1
        }

        for (int i = 1; i < n; i++) {
            votePerMin[i] += votePerMin[i - 1];
        }

        return votePerMin;
    }
}
