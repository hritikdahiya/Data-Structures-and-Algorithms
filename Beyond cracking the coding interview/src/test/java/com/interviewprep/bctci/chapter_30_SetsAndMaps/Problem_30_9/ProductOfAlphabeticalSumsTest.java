package com.interviewprep.bctci.chapter_30_SetsAndMaps.Problem_30_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductOfAlphabeticalSumsTest {

    @Test
    public void doesExistTest() {
        String[] words = new String[]{"abc", "fg", "hij", "klm", "nop", "qrs", "vwx"};
        int target = 1620;
        Assertions.assertTrue(ProductOfAlphabeticalSums.doesExist(words, target));


        words = new String[]{"a", "b"};
        target = 2;
        Assertions.assertTrue(ProductOfAlphabeticalSums.doesExist(words, target));

        words = new String[]{"a", "b", "C"};
        target = 7;
        Assertions.assertFalse(ProductOfAlphabeticalSums.doesExist(words, target));
    }
}