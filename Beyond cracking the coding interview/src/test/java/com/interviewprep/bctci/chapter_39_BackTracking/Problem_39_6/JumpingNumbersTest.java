package com.interviewprep.bctci.chapter_39_BackTracking.Problem_39_6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JumpingNumbersTest {

    @Test
    public void findJumpingNumbersTest() {
        int n = 34;
        Integer[] expectedJumpingNumbers = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 21, 23, 32};
        Assertions.assertArrayEquals(expectedJumpingNumbers, JumpingNumbers.findJumpingNumbers(n).toArray());

        n = 5;
        expectedJumpingNumbers = new Integer[]{1, 2, 3, 4};
        Assertions.assertArrayEquals(expectedJumpingNumbers, JumpingNumbers.findJumpingNumbers(n).toArray());

        n = 1;
        expectedJumpingNumbers = new Integer[]{};
        Assertions.assertArrayEquals(expectedJumpingNumbers, JumpingNumbers.findJumpingNumbers(n).toArray());
    }
}