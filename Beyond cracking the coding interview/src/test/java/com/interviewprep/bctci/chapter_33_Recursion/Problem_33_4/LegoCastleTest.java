package com.interviewprep.bctci.chapter_33_Recursion.Problem_33_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LegoCastleTest {

    @Test
    public void calcBlocksRequiredTest() {
        Assertions.assertEquals(1, LegoCastle.calcBlocksRequired(1));

        Assertions.assertEquals(5, LegoCastle.calcBlocksRequired(2));

        Assertions.assertEquals(17, LegoCastle.calcBlocksRequired(3));

        Assertions.assertEquals(49, LegoCastle.calcBlocksRequired(4));
    }
}