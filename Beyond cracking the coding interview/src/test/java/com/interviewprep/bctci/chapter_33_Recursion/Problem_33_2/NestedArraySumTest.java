package com.interviewprep.bctci.chapter_33_Recursion.Problem_33_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NestedArraySumTest {

    @Test
    public void nestedArraySumTest() {

        IntegerOrArray[] nestedArray = new IntegerOrArray[]{};
        Assertions.assertEquals(0, NestedArraySum.sum(nestedArray));

        nestedArray = new IntegerOrArray[]{
                new IntegerOrArray(5)
        };
        Assertions.assertEquals(5, NestedArraySum.sum(nestedArray));

        nestedArray = new IntegerOrArray[]{
                new IntegerOrArray(new IntegerOrArray[]{
                        new IntegerOrArray(new IntegerOrArray[]{
                                new IntegerOrArray(new IntegerOrArray[]{
                                        new IntegerOrArray(1)
                                }),
                                new IntegerOrArray(2),
                        }),
                        new IntegerOrArray(3),
                }),
                new IntegerOrArray(4),
        };
        Assertions.assertEquals(10, NestedArraySum.sum(nestedArray));


        nestedArray = new IntegerOrArray[]{
                new IntegerOrArray(1),
                new IntegerOrArray(new IntegerOrArray[]{
                        new IntegerOrArray(2),
                        new IntegerOrArray(3),
                }),
                new IntegerOrArray(new IntegerOrArray[]{
                        new IntegerOrArray(4),
                        new IntegerOrArray(new IntegerOrArray[]{
                                new IntegerOrArray(5)
                        }),
                }),
                new IntegerOrArray(6)
        };
        Assertions.assertEquals(21, NestedArraySum.sum(nestedArray));
    }
}