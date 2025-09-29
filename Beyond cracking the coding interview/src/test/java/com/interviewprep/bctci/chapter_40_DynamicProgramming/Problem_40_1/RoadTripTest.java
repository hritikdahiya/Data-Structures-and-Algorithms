package com.interviewprep.bctci.chapter_40_DynamicProgramming.Problem_40_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RoadTripTest {

    @Test
    public void findLeastTimeSpentOnBreaksMemoizationTest() {
        RoadTrip roadTrip = new RoadTrip();

        int[] times = new int[]{8, 1, 2, 3, 9, 6, 2, 4};
        int expectedOutput = 6;
        Assertions.assertEquals(expectedOutput, roadTrip.findLeastTimeSpentOnBreaksMemoization(times));
        Assertions.assertEquals(expectedOutput, roadTrip.findLeastTimeSpentOnBreaksTabulation(times));

        times = new int[]{8, 1, 2, 3, 9, 3, 2, 4};
        expectedOutput = 5;
        Assertions.assertEquals(expectedOutput, roadTrip.findLeastTimeSpentOnBreaksMemoization(times));
        Assertions.assertEquals(expectedOutput, roadTrip.findLeastTimeSpentOnBreaksTabulation(times));

        times = new int[]{10, 20, 6};
        expectedOutput = 6;
        Assertions.assertEquals(expectedOutput, roadTrip.findLeastTimeSpentOnBreaksMemoization(times));
        Assertions.assertEquals(expectedOutput, roadTrip.findLeastTimeSpentOnBreaksTabulation(times));

        times = new int[]{10, 20};
        expectedOutput = 0;
        Assertions.assertEquals(expectedOutput, roadTrip.findLeastTimeSpentOnBreaksMemoization(times));
        Assertions.assertEquals(expectedOutput, roadTrip.findLeastTimeSpentOnBreaksTabulation(times));

        times = new int[]{};
        Assertions.assertEquals(expectedOutput, roadTrip.findLeastTimeSpentOnBreaksMemoization(times));
        Assertions.assertEquals(expectedOutput, roadTrip.findLeastTimeSpentOnBreaksTabulation(times));

    }
}