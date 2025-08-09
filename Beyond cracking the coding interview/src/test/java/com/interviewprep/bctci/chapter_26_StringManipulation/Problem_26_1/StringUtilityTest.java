package com.interviewprep.bctci.chapter_26_StringManipulation.Problem_26_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringUtilityTest {
    @Test
    public void testStringSplit() {
        StringUtility obj = new StringUtility();

        // Empty string
        Assertions.assertArrayEquals(new String[]{}, obj.split("", ' '));

        // Single character string
        Assertions.assertArrayEquals(new String[]{"", ""}, obj.split("a", 'a'));
        Assertions.assertArrayEquals(new String[]{"a"}, obj.split("a", 'z'));

        // Char doesn't exist - no split
        Assertions.assertArrayEquals(new String[]{"Complete String"}, obj.split("Complete String", 'a'));

        // Character at beginning, consecutive characters and character at end
        Assertions.assertArrayEquals(new String[]{"", "hello", "", "", "world", ""}, obj.split(" hello   world ", ' '));

        // All character same
        Assertions.assertArrayEquals(new String[]{"", "", "", "", ""}, obj.split("aaaa", 'a'));
    }
}