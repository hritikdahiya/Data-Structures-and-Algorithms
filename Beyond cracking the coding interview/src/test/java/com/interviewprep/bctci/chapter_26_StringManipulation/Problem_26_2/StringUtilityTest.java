package com.interviewprep.bctci.chapter_26_StringManipulation.Problem_26_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringUtilityTest {
    @Test
    public void joinStringTest() {
        // Empty array
        Assertions.assertEquals("", StringUtility.join(new String[]{}, ""));

        // Empty joiner string
        Assertions.assertEquals("FirstSecond", StringUtility.join(new String[]{"First", "Second"}, ""));

        // Single element in array
        Assertions.assertEquals("First", StringUtility.join(new String[]{"First"}, "longString"));

        //  Normal test case
        Assertions.assertEquals("beeeekeeeepeer neeeedeed!!", StringUtility.join(new String[]{"b", "", "k", "", "p", "r n", "", "d", "d!!"}, "ee"));
    }
}