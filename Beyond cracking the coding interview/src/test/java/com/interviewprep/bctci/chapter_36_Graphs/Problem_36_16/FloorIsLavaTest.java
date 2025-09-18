package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.List.of;

class FloorIsLavaTest {

    @Test
    public void canCrossFloorTest() {
        List<List<Double>> furniture = of(
                of(1.0, 1.0, 9.0, 5.0),
                of(12.0, 9.0, 20.0, 13.0),
                of(16.0, 2.0, 22.0, 7.0),
                of(24.0, 9.0, 26.0, 11.0),
                of(29.0, 1.0, 31.0, 5.0)
        );
        double maxJump = 5.0;
        Assertions.assertTrue(FloorIsLava.canCrossFloor(furniture, maxJump));

        maxJump = 4;
        Assertions.assertFalse(FloorIsLava.canCrossFloor(furniture, maxJump));
    }
}