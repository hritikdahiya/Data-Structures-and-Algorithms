package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromicSentenceTest {
    @Test
    public void palindromicSentenceTest() {
        // Empty string
        Assertions.assertTrue(PalindromicSentence.isPalindrome(""));

        // String with no alphanumeric ~ empty string
        Assertions.assertTrue(PalindromicSentence.isPalindrome("! @ # $ % ^ % $ # @ !"));

        // Palindrome
        Assertions.assertTrue(PalindromicSentence.isPalindrome("Bob wondered, 'Now, Bob?'"));
        // Palindrome with numbers
        Assertions.assertTrue(PalindromicSentence.isPalindrome("r1a2c - 3e3 ` c2a1 $ r"));

        // Not a palindrome
        Assertions.assertFalse(PalindromicSentence.isPalindrome("race a car"));
    }
}