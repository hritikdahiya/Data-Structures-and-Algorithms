package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_4;

public class PalindromicSentence {
    public static boolean isPalindrome(String s) {
        int n = s.length();
        if (n < 2) {
            return true;
        }

        int l = 0, r = n - 1;
        while (l < r) {
            if (!Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            } else if (!Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            } else {
                if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                    return false;
                }
                l++;
                r--;
            }
        }

        return true;
    }
}
