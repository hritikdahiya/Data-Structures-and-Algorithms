package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UniqueBestSellerStreakTest {

    @Test
    public void uniqueBestSellerStreakTest() {
        String[] bestSellers = new String[]{"book3", "book1", "book3", "book3", "book2", "book3", "book4", "book3"};
        int k = 3;
        Assertions.assertTrue(UniqueBestSellerStreak.wasStreakCreated(bestSellers, k));
//        Assertions.assertTrue(UniqueBestSellerStreak.calculateUsingFixedLenWindowRecipe(bestSellers, k));

        bestSellers = new String[]{"book3", "book1", "book3", "book3", "book2", "book3", "book4", "book3"};
        k = 4;
        Assertions.assertFalse(UniqueBestSellerStreak.wasStreakCreated(bestSellers, k));
        Assertions.assertFalse(UniqueBestSellerStreak.calculateUsingFixedLenWindowRecipe(bestSellers, k));

        bestSellers = new String[]{"book3", "book1", "book2"};
        k = 3;
        Assertions.assertTrue(UniqueBestSellerStreak.wasStreakCreated(bestSellers, k));
        Assertions.assertTrue(UniqueBestSellerStreak.calculateUsingFixedLenWindowRecipe(bestSellers, k));
    }
}