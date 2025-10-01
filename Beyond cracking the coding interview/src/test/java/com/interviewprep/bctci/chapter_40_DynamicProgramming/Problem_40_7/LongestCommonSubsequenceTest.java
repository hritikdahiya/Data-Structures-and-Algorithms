package com.interviewprep.bctci.chapter_40_DynamicProgramming.Problem_40_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestCommonSubsequenceTest {

    @Test
    public void longestCommonSubsequenceTest() {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();

        String s1 = "HAHAHA";
        String s2 = "AAAAHH";
        int expectedLcsLength = 3;
        Assertions.assertEquals(expectedLcsLength, lcs.findLengthOfLCSMemoization(s1, s2));
        Assertions.assertEquals(expectedLcsLength, lcs.findLengthOfLCSTabulation(s1, s2));

        s1 = "";
        s2 = "AA";
        expectedLcsLength = 0;
        Assertions.assertEquals(expectedLcsLength, lcs.findLengthOfLCSMemoization(s1, s2));
        Assertions.assertEquals(expectedLcsLength, lcs.findLengthOfLCSTabulation(s1, s2));

        s1 = "ABC";
        s2 = "BCA";
        expectedLcsLength = 2;
        Assertions.assertEquals(expectedLcsLength, lcs.findLengthOfLCSMemoization(s1, s2));
        Assertions.assertEquals(expectedLcsLength, lcs.findLengthOfLCSTabulation(s1, s2));
    }
}