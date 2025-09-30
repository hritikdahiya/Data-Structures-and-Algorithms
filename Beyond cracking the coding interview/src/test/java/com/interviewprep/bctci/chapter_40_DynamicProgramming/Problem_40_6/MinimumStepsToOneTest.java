package com.interviewprep.bctci.chapter_40_DynamicProgramming.Problem_40_6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumStepsToOneTest {

    @Test
    public void minimumStepsToOneTest() {
        MinimumStepsToOne minimumStepsToOne = new MinimumStepsToOne();

        int n = 10;
        int expectedSteps = 3;
        Assertions.assertEquals(expectedSteps, minimumStepsToOne.findWithMemoization(n));
        Assertions.assertEquals(expectedSteps, minimumStepsToOne.findWithTabulation(n));

        n = 1;
        expectedSteps = 0;
        Assertions.assertEquals(expectedSteps, minimumStepsToOne.findWithMemoization(n));
        Assertions.assertEquals(expectedSteps, minimumStepsToOne.findWithTabulation(n));

        n = 15;
        expectedSteps = 4;
        Assertions.assertEquals(expectedSteps, minimumStepsToOne.findWithTabulation(n));
        Assertions.assertEquals(expectedSteps, minimumStepsToOne.findWithMemoization(n));
    }
}