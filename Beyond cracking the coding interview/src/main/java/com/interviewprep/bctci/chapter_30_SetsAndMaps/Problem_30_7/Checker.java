package com.interviewprep.bctci.chapter_30_SetsAndMaps.Problem_30_7;

public class Checker {
    private final int[] charCount;

    Checker(String s) {
        charCount = new int[26];
        for (char ch : s.toCharArray()) {
            charCount[ch - 'a']++;
        }
    }

    public boolean expandsInto(String s) {
        int[] newStringCharCount = new int[26];
        for (char ch : s.toCharArray()) {
            newStringCharCount[ch - 'a']++;
        }

        int differentCharCount = 0;
        // compare the frequency maps of both strings
        for (int i = 0; i < 26; i++) {
            newStringCharCount[i] -= charCount[i];
            // if newString has 1 more character than original string, increment differentCharCount
            if (newStringCharCount[i] == 1) {
                differentCharCount++;
            } else if (newStringCharCount[i] != 0) {
                // if character count difference is greater than 1 (or negative), return false immediately
                return false;
            }
        }

        return differentCharCount == 1;
    }


}
