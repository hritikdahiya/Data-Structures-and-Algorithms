package com.interviewprep.bctci.chapter_26_StringManipulation.Problem_26_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringUtilityTest {
    @Test
    public void joinStringTest() {
        StringUtility stringUtility = new StringUtility();

        // Empty array
        Assertions.assertEquals("", stringUtility.join(new String[]{}, ""));

        // Empty joiner string
        Assertions.assertEquals("FirstSecond", stringUtility.join(new String[]{"First", "Second"}, ""));

        // Single element in array
        Assertions.assertEquals("First", stringUtility.join(new String[]{"First"}, "longString"));

        //  Normal test case
        Assertions.assertEquals("beeeekeeeepeer neeeedeed!!", stringUtility.join(new String[] { "b", "", "k", "", "p", "r n", "", "d", "d!!" }, "ee"));
    }
}