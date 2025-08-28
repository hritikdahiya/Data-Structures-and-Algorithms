package com.interviewprep.bctci.chapter_31_Sorting.Problem_31_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NestedCirclesTest {

    @Test
    public void areNestedTest() {
        // single circle
        Circle[] circles = new Circle[]{
                new Circle(0, 0, 2)
        };
        Assertions.assertTrue(NestedCircles.areNested(circles));

        // nested circles
        circles = new Circle[]{
                new Circle(0, 0, 2),
                new Circle(0, 0, 3),
                new Circle(1, 1, 5)
        };
        Assertions.assertTrue(NestedCircles.areNested(circles));


        // some nested, some not nested circles
        circles = new Circle[]{
                new Circle(0, 0, 2),
                new Circle(0, 0, 3),
                new Circle(1, 1, 5),
                new Circle(10,10,1),
        };
        Assertions.assertFalse(NestedCircles.areNested(circles));

    }
}