package com.interviewprep.bctci.chapter_32_StacksAndQueues.Problem_32_8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestBalancedSubsequenceTest {

    @Test
    public void getLongestBalancedSubsequenceTest() {
        String s = "))(())(()";
        String expectedString = "(())()";
        Assertions.assertEquals(expectedString, LongestBalancedSubsequence.getLongestBalancedSubsequence(s));

        // closing parentheses without opening
        s = "))))()))";
        expectedString = "()";
        Assertions.assertEquals(expectedString, LongestBalancedSubsequence.getLongestBalancedSubsequence(s));

        // dangling open parentheses
        s = "((((()()((((";
        expectedString = "()()";
        Assertions.assertEquals(expectedString, LongestBalancedSubsequence.getLongestBalancedSubsequence(s));

        s = "";
        expectedString = "";
        Assertions.assertEquals(expectedString, LongestBalancedSubsequence.getLongestBalancedSubsequence(s));
    }
}