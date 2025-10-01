package com.interviewprep.bctci.chapter_40_DynamicProgramming.Problem_40_8;

import java.util.Arrays;

public class ReconstructLongestCommonSubsequence {
    private String[][] resultCache;

    public String lcsMemoization(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        if (n1 == 0 || n2 == 0) {
            return "";
        }

        resultCache = new String[n1][n2];
        for (String[] row : resultCache) {
            Arrays.fill(row, "");
        }

        lcsMemoizationHelper(s1, 0, s2, 0);

        return resultCache[0][0];
    }

    private String lcsMemoizationHelper(String s1, int i1, String s2, int i2) {
        if (i1 == s1.length() || i2 == s2.length()) {
            return "";
        }

        if (!resultCache[i1][i2].isEmpty()) {
            return resultCache[i1][i2];
        }

        String lcs;
        if (s1.charAt(i1) == s2.charAt(i2)) {
            lcs = s1.charAt(i1) + lcsMemoizationHelper(s1, i1 + 1, s2, i2 + 1);
        } else {
            String lcs1 = lcsMemoizationHelper(s1, i1 + 1, s2, i2);
            String lcs2 = lcsMemoizationHelper(s1, i1, s2, i2 + 1);

            lcs = lcs1.length() >= lcs2.length() ? lcs1 : lcs2;
        }

        resultCache[i1][i2] = lcs;

        return lcs;
    }
}
