package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ShiftWordToBackTest {

    @Test
    void shiftTest() {
        // empty word
        char[] arr = "seekerandwriter".toCharArray();
        char[] shifted = "seekerandwriter".toCharArray();
        ShiftWordToBack.shift(arr, "");
        Assertions.assertArrayEquals(shifted, arr);

        // single char word
        arr = "bacb".toCharArray();
        shifted = "acbb".toCharArray();
        ShiftWordToBack.shift(arr, "b");
        Assertions.assertArrayEquals(shifted, arr);

        // normal test case
        arr = "seekerandwriter".toCharArray();
        shifted = "sekeranwreredit".toCharArray();
        ShiftWordToBack.shift(arr, "edit");
        Assertions.assertArrayEquals(shifted, arr);
    }
}