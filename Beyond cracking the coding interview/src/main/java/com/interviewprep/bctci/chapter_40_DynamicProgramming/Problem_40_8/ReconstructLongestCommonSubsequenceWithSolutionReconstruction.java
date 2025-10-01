package com.interviewprep.bctci.chapter_40_DynamicProgramming.Problem_40_8;

import java.util.Arrays;

import static java.lang.Math.max;

public class ReconstructLongestCommonSubsequenceWithSolutionReconstruction {
    private int[][] cache;

    public String getLCS(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        if (n1 == 0 || n2 == 0) {
            return "";
        }

        cache = new int[n1][n2];
        for (int[] row : cache) {
            Arrays.fill(row, -1);
        }

        int i = 0, j = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                stringBuilder.append(s1.charAt(i));
                i++;
                j++;
            } else if (findLengthOfLCSMemoizationHelper(s1, i + 1, s2, j) >= findLengthOfLCSMemoizationHelper(s1, i, s2, j + 1)) {
                i++;
            } else {
                j++;
            }
        }

        return stringBuilder.toString();
    }

    private int findLengthOfLCSMemoizationHelper(String s1, int i1, String s2, int i2) {
        if (i1 == s1.length() || i2 == s2.length()) {
            return 0;
        }

        if (cache[i1][i2] > -1) {
            return cache[i1][i2];
        }

        int maxLen = 0;
        if (s1.charAt(i1) == s2.charAt(i2)) {
            maxLen = max(maxLen, 1 + findLengthOfLCSMemoizationHelper(s1, i1 + 1, s2, i2 + 1));
        } else {
            maxLen = max(findLengthOfLCSMemoizationHelper(s1, i1 + 1, s2, i2), findLengthOfLCSMemoizationHelper(s1, i1, s2, i2 + 1));
        }

        cache[i1][i2] = maxLen;

        return maxLen;
    }
}
