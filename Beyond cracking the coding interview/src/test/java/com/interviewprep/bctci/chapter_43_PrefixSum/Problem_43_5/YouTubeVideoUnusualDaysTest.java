package com.interviewprep.bctci.chapter_43_PrefixSum.Problem_43_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class YouTubeVideoUnusualDaysTest {
    @Test
    public void youTubeVideoUnusualDaysTest() {
        int[] likes = new int[]{1, 2, 3};
        int[] dislikes = new int[]{0, 0, 0};
        int expected = 3;
        Assertions.assertEquals(expected, YouTubeVideoUnusualDays.findHighestTotalDeviation(likes, dislikes));


        likes = new int[]{3, 6, 1};
        dislikes = new int[]{0, 1, 9};
        expected = 24;
        Assertions.assertEquals(expected, YouTubeVideoUnusualDays.findHighestTotalDeviation(likes, dislikes));
    }

}