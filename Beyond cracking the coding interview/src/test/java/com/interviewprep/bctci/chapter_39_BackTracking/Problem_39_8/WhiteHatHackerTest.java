package com.interviewprep.bctci.chapter_39_BackTracking.Problem_39_8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WhiteHatHackerTest {

    @Test
    public void whiteHatHackerTest() {
        final String passwordString1 = "abc";
        CryptoAPI cryptoAPI = s -> s.equals(passwordString1);

        Assertions.assertEquals(passwordString1, WhiteHatHacker.getPassword(cryptoAPI));

        final String passwordString2 = "abcdefghij";
        cryptoAPI = s -> s.equals(passwordString2);

        Assertions.assertEquals(passwordString2, WhiteHatHacker.getPassword(cryptoAPI));
    }
}