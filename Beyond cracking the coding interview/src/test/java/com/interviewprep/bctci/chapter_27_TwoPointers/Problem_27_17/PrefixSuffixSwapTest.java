package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PrefixSuffixSwapTest {

    @Test
    public void prefixSuffixSwapTest() {
        char[] arr = new char[0];
        char[] swappedArray = new char[0];
        PrefixSuffixSwap.prefixSuffixSwap(arr);
        Assertions.assertArrayEquals(swappedArray, arr);

        arr = new char[]{'a', 'b', 'c'};
        swappedArray = new char[]{'b', 'c', 'a'};
        PrefixSuffixSwap.prefixSuffixSwap(arr);
        Assertions.assertArrayEquals(swappedArray, arr);

        arr = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
        swappedArray = new char[]{'d', 'e', 'f', 'g', 'h', 'i', 'a', 'b', 'c'};
        PrefixSuffixSwap.prefixSuffixSwap(arr);
        Assertions.assertArrayEquals(swappedArray, arr);
    }
}