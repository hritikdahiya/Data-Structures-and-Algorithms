package com.interviewprep.bctci.chapter_40_DynamicProgramming.Problem_40_7;

import java.util.Arrays;

import static java.lang.Math.max;

public class LongestCommonSubsequence {
    private int[][] cache;

    public int findLengthOfLCSTabulation(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        if (n1 == 0 || n2 == 0) {
            return 0;
        }

        cache = new int[n1][n2];
        for (int[] row : cache) {
            Arrays.fill(row, -1);
        }


        // base case - last column
        for (int r = n1 - 2; r >= 0; r--) {
            cache[r][n2 - 1] = s1.charAt(r) == s2.charAt(n2 - 1) ? 1 : 0;
        }

        // base case - last row
        for (int c = n2 - 2; c >= 0; c--) {
            cache[n1 - 1][c] = s1.charAt(n1 - 1) == s2.charAt(c) ? 1 : 0;
        }

        for (int r = n1 - 2; r >= 0; r--) {
            for (int c = n2 - 2; c >= 0; c--) {
                cache[r][c] = s1.charAt(r) == s2.charAt(c) ? 1 + cache[r + 1][c + 1] : max(cache[r + 1][c], cache[r][c + 1]);
            }
        }

        return cache[0][0];
    }

    // Recurrence relation
    // 1. lcs(i, j) = 1 + lcs(1 + 1, j + 1) when s1[i] == s2[j]
    // 2. lcs(i, j) = max(lcs(i, j + 1), lcs(i + 1, j))
    public int findLengthOfLCSMemoization(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        if (n1 == 0 || n2 == 0) {
            return 0;
        }

        cache = new int[n1][n2];
        for (int[] row : cache) {
            Arrays.fill(row, -1);
        }

        return findLengthOfLCSMemoizationHelper(s1, 0, s2, 0);
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
