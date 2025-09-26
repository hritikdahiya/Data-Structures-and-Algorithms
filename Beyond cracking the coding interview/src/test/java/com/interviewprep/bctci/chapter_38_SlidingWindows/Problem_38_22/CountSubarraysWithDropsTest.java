package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_22;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountSubarraysWithDropsTest {

    @Test
    public void countSubarraysWithDropsTest() {
        int[] arr = new int[]{1, 2, 3};
        int k = 1;
        int[] expected = new int[]{6, 0, 0};
        Assertions.assertArrayEquals(expected, CountSubarraysWithDrops.count(arr, k));

        arr = new int[]{3, 2, 1};
        expected = new int[]{5, 2, 3};
        Assertions.assertArrayEquals(expected, CountSubarraysWithDrops.count(arr, k));

        arr = new int[]{5, 4, 3, 2, 1};
        k = 2;
        expected = new int[]{12, 3, 6};
        Assertions.assertArrayEquals(expected, CountSubarraysWithDrops.count(arr, k));


        arr = new int[]{6, 2, 7, 3, 8, 4, 9, 5, 10, 6};
        k = 3;
        expected = new int[]{50, 8, 13};
        Assertions.assertArrayEquals(expected, CountSubarraysWithDrops.count(arr, k));
    }
}