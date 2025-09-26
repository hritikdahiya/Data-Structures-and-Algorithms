package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountSubarraysWithAllRemaindersTest {

    @Test
    public void countSubarraysWithAllRemaindersTest() {
        int[] arr = new int[]{9, 8, 7};
        int expected = 1;
        Assertions.assertEquals(expected, CountSubarraysWithAllRemainders.count(arr));

        arr = new int[]{1, 2, 3, 4, 5};
        expected = 6;
        Assertions.assertEquals(expected, CountSubarraysWithAllRemainders.count(arr));


        arr = new int[]{1, 3, 4, 6, 7, 9};
        expected = 0;
        Assertions.assertEquals(expected, CountSubarraysWithAllRemainders.count(arr));
    }
}