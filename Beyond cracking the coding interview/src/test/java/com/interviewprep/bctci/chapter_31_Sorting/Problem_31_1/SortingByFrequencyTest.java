package com.interviewprep.bctci.chapter_31_Sorting.Problem_31_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SortingByFrequencyTest {

    @Test
    public void sortTest() {
        String wordToSort = "supercalifragilisticexpialidocious";
        Character[] expected = new Character[]
                {'i', 'a', 'c', 'l', 's', 'e', 'o', 'p', 'r', 'u', 'd', 'f', 'g', 't', 'x'};
        Assertions.assertArrayEquals(expected, SortingByFrequency.sort(wordToSort));


        wordToSort = "aabbbcccc";
        expected = new Character[]
                {'c', 'b', 'a'};
        Assertions.assertArrayEquals(expected, SortingByFrequency.sort(wordToSort));


        wordToSort = "cba";
        expected = new Character[]
                {'a', 'b', 'c'};
        Assertions.assertArrayEquals(expected, SortingByFrequency.sort(wordToSort));
    }
}