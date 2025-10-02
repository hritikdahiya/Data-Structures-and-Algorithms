package com.interviewprep.bctci.chapter_41_GreedyAlgorithms.Problem_41_6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TimeTravelerMaxYearTest {

    @Test
    public void lastReachableYearTest() {
        int[] jumpingPoints = new int[]{2020, 2024};
        int k = 0;
        int maxAging = 3;
        int expected = 2023;
        Assertions.assertEquals(expected, TimeTravelerMaxYear.lastReachableYear(jumpingPoints, k, maxAging));


        jumpingPoints = new int[]{2021, 2030, 2050};
        k = 1;
        maxAging = 5;
        expected = 2035;
        Assertions.assertEquals(expected, TimeTravelerMaxYear.lastReachableYear(jumpingPoints, k, maxAging));

        jumpingPoints = new int[]{2020, 2024};
        maxAging = 1;
        expected = 2025;
        Assertions.assertEquals(expected, TimeTravelerMaxYear.lastReachableYear(jumpingPoints, k, maxAging));

        jumpingPoints = new int[]{1803, 1861, 1863, 1865, 1920, 1929, 1941, 1964, 2001, 2021};
        k = 4;
        maxAging = 45;
        expected = 2021;
        Assertions.assertEquals(expected, TimeTravelerMaxYear.lastReachableYear(jumpingPoints, k, maxAging));


        jumpingPoints = new int[]{1803, 1861, 1863, 1865, 1920, 1929, 1941, 1964, 2001, 2021};
        maxAging = 40;
        expected = 2016;
        Assertions.assertEquals(expected, TimeTravelerMaxYear.lastReachableYear(jumpingPoints, k, maxAging));


        jumpingPoints = new int[]{1803, 1861, 1863, 1865, 1920, 1929, 1941, 1964, 2001, 2021};
        maxAging = 50;
        expected = 2026;
        Assertions.assertEquals(expected, TimeTravelerMaxYear.lastReachableYear(jumpingPoints, k, maxAging));
    }
}