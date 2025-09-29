package com.interviewprep.bctci.chapter_39_BackTracking.Problem_39_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IkeaShoppingTest {

    @Test
    public void ikeaShoppingTest() {
        int budget = 20;
        int[] prices = new int[]{10, 5, 15, 8, 3};
        float[] ratings = new float[]{7.0f, 3.5f, 9.0f, 6.0f, 2.0f};
        Integer[] expectedItems = new Integer[]{0, 3};
        Assertions.assertArrayEquals(expectedItems, new IkeaShopping(budget, prices, ratings).solve());

        budget = 10;
        prices = new int[]{2, 3, 4, 5};
        ratings = new float[]{1.0f, 2.0f, 3.5f, 4.0f};
        expectedItems = new Integer[]{2, 3};
        Assertions.assertArrayEquals(expectedItems, new IkeaShopping(budget, prices, ratings).solve());

        // out of  budget
        budget = 1;
        prices = new int[]{2, 3, 4, 5};
        ratings = new float[]{1.0f, 2.0f, 3.5f, 4.0f};
        expectedItems = new Integer[]{};
        Assertions.assertArrayEquals(expectedItems, new IkeaShopping(budget, prices, ratings).solve());


    }
}