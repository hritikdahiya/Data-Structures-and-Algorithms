package com.interviewprep.bctci.chapter_29_BinarySearch.Problem_29_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WaterRefillingTest {

    @Test
    void findNumberOfPoursTest() {
        // single pour
        Assertions.assertEquals(1, WaterRefilling.findNumberOfPours(10, 8));

        // Exactly equal capacity
        Assertions.assertEquals(2, WaterRefilling.findNumberOfPours(10, 5));

        // large case
        Assertions.assertEquals(2755352, WaterRefilling.findNumberOfPours(19287465, 7));
    }
}