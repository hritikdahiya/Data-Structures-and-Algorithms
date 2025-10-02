package com.interviewprep.bctci.chapter_43_PrefixSum.Problem_43_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class YouTubeVideoReceptionTest {

    @Test
    public void youTubeVideoReceptionTest() {
        int[] likes = new int[]{6, 3, 4, 8, 7, 2, 6, 5, 0, 1};
        int[] dislikes = new int[]{6, 0, 8, 0, 0, 0, 1, 8, 0, 2};
        int[][] periods = new int[][]{
                new int[]{0, 1},
                new int[]{0, 5},
                new int[]{5, 8},
                new int[]{3, 3}
        };
        int[] expected = new int[]{1, 4, 2, 1};

        Assertions.assertArrayEquals(expected, YouTubeVideoReception.numberOfPositiveDays(likes, dislikes, periods));
    }
}