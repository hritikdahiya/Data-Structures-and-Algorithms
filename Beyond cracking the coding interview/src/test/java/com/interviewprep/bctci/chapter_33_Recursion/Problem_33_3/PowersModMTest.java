package com.interviewprep.bctci.chapter_33_Recursion.Problem_33_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PowersModMTest {

    @Test
    public void calculateTest() {
        Assertions.assertEquals(32, PowersModM.calculate(2, 5, 100));

        Assertions.assertEquals(2, PowersModM.calculate(2, 5, 30));

        Assertions.assertEquals(652541198, PowersModM.calculate(123456789, 987654321, 1000000007));

        Assertions.assertEquals(3, PowersModM.calculate(3, 1, 5));

        Assertions.assertEquals(6, PowersModM.calculate(5, 3, 7));
    }
}