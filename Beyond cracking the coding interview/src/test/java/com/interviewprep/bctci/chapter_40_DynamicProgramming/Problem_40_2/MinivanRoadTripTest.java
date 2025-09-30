package com.interviewprep.bctci.chapter_40_DynamicProgramming.Problem_40_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinivanRoadTripTest {

    @Test
    public void findLeastTimeSpentOnBreaksMemoizationTest() {
        MinivanRoadTrip roadTrip = new MinivanRoadTrip();

        int[] times = new int[]{8, 1, 2, 3, 9, 6, 2, 4};
        int k = 2;
        int expectedOutput = 6;
        Assertions.assertEquals(expectedOutput, roadTrip.findLeastTimeSpentOnBreaksMemoization(times, k));
        Assertions.assertEquals(expectedOutput, roadTrip.findLeastTimeSpentOnBreaksTabulation(times, k));

        times = new int[]{8, 1, 2, 3, 9, 3, 2, 4};
        k = 3;
        expectedOutput = 4;
        Assertions.assertEquals(expectedOutput, roadTrip.findLeastTimeSpentOnBreaksMemoization(times, k));
        Assertions.assertEquals(expectedOutput, roadTrip.findLeastTimeSpentOnBreaksTabulation(times, k));

        times = new int[]{10, 20, 6};
        k = 4;
        expectedOutput = 0;
        Assertions.assertEquals(expectedOutput, roadTrip.findLeastTimeSpentOnBreaksMemoization(times, k));
        Assertions.assertEquals(expectedOutput, roadTrip.findLeastTimeSpentOnBreaksTabulation(times, k));

        times = new int[]{10, 20};
        k = 2;
        Assertions.assertEquals(expectedOutput, roadTrip.findLeastTimeSpentOnBreaksMemoization(times, k));
        Assertions.assertEquals(expectedOutput, roadTrip.findLeastTimeSpentOnBreaksTabulation(times, k));

        times = new int[]{};
        k = 1;
        Assertions.assertEquals(expectedOutput, roadTrip.findLeastTimeSpentOnBreaksMemoization(times, k));
        Assertions.assertEquals(expectedOutput, roadTrip.findLeastTimeSpentOnBreaksTabulation(times, k));

    }
}