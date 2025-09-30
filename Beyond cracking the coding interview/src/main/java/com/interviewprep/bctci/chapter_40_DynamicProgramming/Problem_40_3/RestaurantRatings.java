package com.interviewprep.bctci.chapter_40_DynamicProgramming.Problem_40_3;

import java.util.Arrays;

public class RestaurantRatings {
    private int[] dp;

    public int findMaxRatingTabulation(int[] ratings) {
        int n = ratings.length;
        if (n < 1) {
            return 0;
        }

        dp = new int[n];
        dp[n - 1] = ratings[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            if (i == n - 2) {
                dp[i] = ratings[i];
            } else {
                dp[i] = Math.max(ratings[i] + dp[i + 2], dp[i + 1]);
            }

        }
        return dp[0];
    }

    public int findMaxRatingMemoization(int[] ratings) {
        int length = ratings.length;
        if (length < 1) {
            return 0;
        }

        dp = new int[length];
        Arrays.fill(dp, Integer.MIN_VALUE);

        findMaxRatingMemoizationHelper(ratings, 0);

        return dp[0];
    }

    private int findMaxRatingMemoizationHelper(int[] rating, int currIndex) {
        if (currIndex >= rating.length) {
            return 0;
        }

        if (dp[currIndex] != Integer.MIN_VALUE) {
            return dp[currIndex];
        }

        int inclusiveResult = rating[currIndex] + findMaxRatingMemoizationHelper(rating, currIndex + 2);
        int exclusiveResult = findMaxRatingMemoizationHelper(rating, currIndex + 1);

        dp[currIndex] = Math.max(inclusiveResult, exclusiveResult);

        return dp[currIndex];
    }
}
