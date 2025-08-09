package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeCheckTest {
    @Test
    public void palindromeCheckTest() {
        PalindromeCheck pc = new PalindromeCheck();

        // empty string
        Assertions.assertTrue(pc.isPalindrome(""));

        // single character string
        Assertions.assertTrue(pc.isPalindrome("1"));

        // odd length string
        Assertions.assertTrue(pc.isPalindrome("level"));
        Assertions.assertFalse(pc.isPalindrome("hello"));

        // even length string
        Assertions.assertTrue(pc.isPalindrome("naan"));
        Assertions.assertFalse(pc.isPalindrome("tester"));
    }
}