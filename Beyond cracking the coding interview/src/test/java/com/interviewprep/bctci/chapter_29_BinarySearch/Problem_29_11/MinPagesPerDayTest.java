package com.interviewprep.bctci.chapter_29_BinarySearch.Problem_29_11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinPagesPerDayTest {

    @Test
    public void findMinPagesPerDayTest() {
        // number of days equal to number of chapters
        int[] pageCounts = {5, 2, 7, 10, 2};
        int daysToPrepare = 5;
        int expectedPages = 10;
        Assertions.assertEquals(expectedPages, MinPagesPerDay.findMinPagesPerDay(pageCounts, daysToPrepare));

        // a lot of days left to prepare
        pageCounts = new int[]{5, 2};
        daysToPrepare = 20;
        expectedPages = 1;
        Assertions.assertEquals(expectedPages, MinPagesPerDay.findMinPagesPerDay(pageCounts, daysToPrepare));

        // single chapter
        pageCounts = new int[]{100};
        daysToPrepare = 5;
        expectedPages = 20;
        Assertions.assertEquals(expectedPages, MinPagesPerDay.findMinPagesPerDay(pageCounts, daysToPrepare));


        // normal case
        pageCounts = new int[]{20, 15, 17, 10};
        daysToPrepare = 14;
        expectedPages = 5;
        Assertions.assertEquals(expectedPages, MinPagesPerDay.findMinPagesPerDay(pageCounts, daysToPrepare));

    }
}