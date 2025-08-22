package com.interviewprep.bctci.chapter_29_BinarySearch.Problem_29_11;

import java.util.Arrays;

public class MinPagesPerDay {
    // 1 <= len(page_count) <= days
    public static int findMinPagesPerDay(int[] pageCounts, int days) {
        if (days < pageCounts.length) {
            throw new IllegalArgumentException();
        }

        // minimum possible number of pages read in a day (when the number of days are > sum(pageCounts))
        int s = 1;
        // maximum possible number of pages required to be read in a day (case when number of days == len(pageCounts))
        int e = Arrays.stream(pageCounts).max().getAsInt();

        if (isPossibleToPrepare(pageCounts, s, days)) {
            return s;
        }

        while (e - s > 1) {
            int mid = s + (e - s) / 2;

            if (isPossibleToPrepare(pageCounts, mid, days)) {
                // try to find a lower number of pages required to be read per day
                e = mid;
            } else {
                s = mid;
            }
        }

        return e;
    }

    // returns true if the number of days required to finish chapters with "pagesPerDay" pages per day is less than "days"
    private static boolean isPossibleToPrepare(int[] pageCounts, int pagesPerDay, int days) {
        int daysRequired = 0;
        for (int pageCount : pageCounts) {
            daysRequired += Math.ceilDiv(pageCount, pagesPerDay);
        }

        return daysRequired <= days;
    }
}
