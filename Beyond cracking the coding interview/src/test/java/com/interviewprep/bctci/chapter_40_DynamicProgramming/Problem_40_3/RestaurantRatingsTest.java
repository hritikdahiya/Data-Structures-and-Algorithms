package com.interviewprep.bctci.chapter_40_DynamicProgramming.Problem_40_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RestaurantRatingsTest {

    @Test
    public void restaurantRatingsTest() {
        RestaurantRatings restaurantRatings = new RestaurantRatings();
        int[] ratings = new int[]{8, 1, 3, 9, 5, 2, 1};
        int expected = 19;
        Assertions.assertEquals(expected, restaurantRatings.findMaxRatingMemoization(ratings));
        Assertions.assertEquals(expected, restaurantRatings.findMaxRatingTabulation(ratings));

        ratings = new int[]{8, 1, 3, 7, 5, 2, 4};
        expected = 20;
        Assertions.assertEquals(expected, restaurantRatings.findMaxRatingMemoization(ratings));
        Assertions.assertEquals(expected, restaurantRatings.findMaxRatingTabulation(ratings));

        ratings = new int[]{};
        expected = 0;
        Assertions.assertEquals(expected, restaurantRatings.findMaxRatingMemoization(ratings));
        Assertions.assertEquals(expected, restaurantRatings.findMaxRatingTabulation(ratings));
    }
}