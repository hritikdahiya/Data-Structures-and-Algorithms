package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_21;

import java.util.Arrays;

public class CountSubarraysWithGoodStartAndEnding {
    public static int count(int[] sales) {
        int goodDays = Math.toIntExact(Arrays.stream(sales).filter(sale -> sale >= 10).count());

        return Math.floorDiv(goodDays * (goodDays + 1), 2);
    }
}
