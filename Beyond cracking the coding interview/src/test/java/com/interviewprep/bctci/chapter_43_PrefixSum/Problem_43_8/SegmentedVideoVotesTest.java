package com.interviewprep.bctci.chapter_43_PrefixSum.Problem_43_8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SegmentedVideoVotesTest {

    @Test
    public void segmentedVideoVotesTest() {
        int n = 6;
        int[][] votes = new int[][]{
                new int[]{3, 4, 1},
                new int[]{0, 0, 1},
                new int[]{1, 3, 1},
                new int[]{0, 5, -1}
        };
        int[] expected = new int[]{0, 0, 0, 1, 0, -1};
        Assertions.assertArrayEquals(expected, SegmentedVideoVotes.getVoteCount(n, votes));
    }
}