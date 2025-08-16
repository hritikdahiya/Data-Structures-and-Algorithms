package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_1;

public class PalindromeCheck {
    public static boolean isPalindrome(String s) {
        if (s.length() < 2) {
            return true;
        }

        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
