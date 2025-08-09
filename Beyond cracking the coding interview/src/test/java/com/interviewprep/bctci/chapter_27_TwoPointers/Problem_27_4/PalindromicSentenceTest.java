package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromicSentenceTest {
    @Test
    public void palindromicSentenceTest() {
        PalindromicSentence ps = new PalindromicSentence();

        // Empty string
        Assertions.assertTrue(ps.isPalindrome(""));

        // String with no alphanumeric ~ empty string
        Assertions.assertTrue(ps.isPalindrome("! @ # $ % ^ % $ # @ !"));

        // Palindrome
        Assertions.assertTrue(ps.isPalindrome("Bob wondered, 'Now, Bob?'"));
        // Palindrome with numbers
        Assertions.assertTrue(ps.isPalindrome("r1a2c - 3e3 ` c2a1 $ r"));

        // Not a palindrome
        Assertions.assertFalse(ps.isPalindrome("race a car"));
    }
}