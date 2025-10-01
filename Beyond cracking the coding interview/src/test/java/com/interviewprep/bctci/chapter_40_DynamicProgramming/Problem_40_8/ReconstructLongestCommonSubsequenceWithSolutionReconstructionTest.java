package com.interviewprep.bctci.chapter_40_DynamicProgramming.Problem_40_8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReconstructLongestCommonSubsequenceWithSolutionReconstructionTest {

    @Test
    public void reconstructLongestCommonSubsequenceWithSolutionReconstructionTest() {
        ReconstructLongestCommonSubsequenceWithSolutionReconstruction lcs = new ReconstructLongestCommonSubsequenceWithSolutionReconstruction();

        String s1 = "HAHAH";
        String s2 = "AAAAHH";
        String expectedLcs = "AAH";
        Assertions.assertEquals(expectedLcs, lcs.getLCS(s1, s2));

        s1 = "";
        s2 = "AA";
        expectedLcs = "";
        Assertions.assertEquals(expectedLcs, lcs.getLCS(s1, s2));

        s1 = "ABCD";
        s2 = "ACBAD";
        expectedLcs = "ACD";
        Assertions.assertEquals(expectedLcs, lcs.getLCS(s1, s2));
    }
}