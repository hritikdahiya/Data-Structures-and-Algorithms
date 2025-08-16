package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeCheckTest {
    @Test
    public void palindromeCheckTest() {
        // empty string
        Assertions.assertTrue(PalindromeCheck.isPalindrome(""));

        // single character string
        Assertions.assertTrue(PalindromeCheck.isPalindrome("1"));

        // odd length string
        Assertions.assertTrue(PalindromeCheck.isPalindrome("level"));
        Assertions.assertFalse(PalindromeCheck.isPalindrome("hello"));

        // even length string
        Assertions.assertTrue(PalindromeCheck.isPalindrome("naan"));
        Assertions.assertFalse(PalindromeCheck.isPalindrome("tester"));
    }
}