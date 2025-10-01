package com.interviewprep.bctci.chapter_41_GreedyAlgorithms.Problem_41_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TimeTravelerTest {

    @Test
    public void timeTravelerCanReachDestinationTest() {
        int[] jumpingPoints = new int[]{2020, 2024};
        int k = 0;
        int maxAging = 3;
        Assertions.assertFalse(TimeTraveler.canReachDestination(jumpingPoints, k, maxAging));

        jumpingPoints = new int[]{2020, 2024};
        k = 1;
        maxAging = 1;
        Assertions.assertTrue(TimeTraveler.canReachDestination(jumpingPoints, k, maxAging));

        jumpingPoints = new int[]{1803, 1861, 1863, 1865, 1920, 1929, 1941, 1964, 2001, 2021};
        k = 4;
        maxAging = 45;
        Assertions.assertTrue(TimeTraveler.canReachDestination(jumpingPoints, k, maxAging));
    }
}