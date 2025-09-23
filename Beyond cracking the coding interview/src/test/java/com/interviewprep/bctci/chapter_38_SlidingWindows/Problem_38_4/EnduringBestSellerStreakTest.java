package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EnduringBestSellerStreakTest {

    @Test
    public void enduringBestSellerStreakTest() {
        String[] bestSellers = new String[]{"book3", "book1", "book3", "book3", "book2"};
        int k = 3;
        Assertions.assertFalse(EnduringBestSellerStreak.hasEnduringStreak(bestSellers, k));
        Assertions.assertFalse(EnduringBestSellerStreak.calculateUsingFixedLenWindowRecipe(bestSellers, k));

        bestSellers = new String[]{"book3", "book1", "book3", "book3", "book2"};
        k = 2;
        Assertions.assertTrue(EnduringBestSellerStreak.hasEnduringStreak(bestSellers, k));
        Assertions.assertTrue(EnduringBestSellerStreak.calculateUsingFixedLenWindowRecipe(bestSellers, k));

        bestSellers = new String[]{"book2", "book1", "book2"};
        k = 2;
        Assertions.assertFalse(EnduringBestSellerStreak.hasEnduringStreak(bestSellers, k));
        Assertions.assertFalse(EnduringBestSellerStreak.calculateUsingFixedLenWindowRecipe(bestSellers, k));

        bestSellers = new String[]{"book2", "book2", "book2"};
        k = 3;
        Assertions.assertTrue(EnduringBestSellerStreak.hasEnduringStreak(bestSellers, k));
        Assertions.assertTrue(EnduringBestSellerStreak.calculateUsingFixedLenWindowRecipe(bestSellers, k));
    }
}