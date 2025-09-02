package com.interviewprep.bctci.chapter_33_Recursion.Problem_33_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RobotInstructionsTest {

    @Test
    public void performInstructionsTest() {
        Assertions.assertEquals("", RobotInstructions.performInstructions(""));
        Assertions.assertEquals("L", RobotInstructions.performInstructions("L"));
        Assertions.assertEquals("LR", RobotInstructions.performInstructions("LR"));
        Assertions.assertEquals("LRR", RobotInstructions.performInstructions("2LR"));
        Assertions.assertEquals("L", RobotInstructions.performInstructions("2L"));
        Assertions.assertEquals("LRRLR", RobotInstructions.performInstructions("22LR"));
        Assertions.assertEquals("LLRLL", RobotInstructions.performInstructions("LL2R2L"));
    }
}