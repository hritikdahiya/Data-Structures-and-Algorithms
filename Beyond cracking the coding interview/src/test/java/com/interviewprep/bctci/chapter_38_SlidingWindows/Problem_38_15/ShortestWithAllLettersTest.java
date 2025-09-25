package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ShortestWithAllLettersTest {

    @Test
    public void findShortestWithAllLettersTest() {
        String s1 = "helloworld";
        String s2 = "well";
        int expected = 5;
        Assertions.assertEquals(expected, ShortestWithAllLetters.findShortestWithAllLetters(s1, s2));

        s2 = "weelll";
        expected = -1;
        Assertions.assertEquals(expected, ShortestWithAllLetters.findShortestWithAllLetters(s1, s2));
    }
}