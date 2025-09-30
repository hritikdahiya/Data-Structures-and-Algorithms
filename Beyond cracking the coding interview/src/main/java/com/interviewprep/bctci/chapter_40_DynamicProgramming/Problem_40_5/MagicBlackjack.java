package com.interviewprep.bctci.chapter_40_DynamicProgramming.Problem_40_5;

import java.util.Arrays;

public class MagicBlackjack {
    private int[] dp;

    public int numOfWaysToBustMemoization() {
        dp = new int[16];
        Arrays.fill(dp, -1);

        return numOfWaysToBustMemoizationHelper(0);
    }

    private int numOfWaysToBustMemoizationHelper(int currSum) {
        // bust
        if (currSum > 21) {
            return 1;
        }
        // dealer is safe
        if (currSum > 15) {
            return 0;
        }

        // recurring subproblem - return from cache
        if (dp[currSum] != -1) {
            return dp[currSum];
        }

        int waysToBust = 0;
        for (int cardNum = 1; cardNum <= 10; cardNum++) {
            waysToBust += numOfWaysToBustMemoizationHelper(currSum + cardNum);
        }

        dp[currSum] = waysToBust;
        return waysToBust;
    }

    public int numOfWaysToBustTabulation() {
        // since the max sum of card can be 15 (the last card at which the dealer will pick another card) + 10 (maximum card value) => 25
        dp = new int[26];
        for (int i = 22; i < dp.length; i++) {
            dp[i] = 1;
        }

        for (int i = 15; i >= 0; i--) {
            for (int card = i + 1; card <= i + 10; card++) {
                dp[i] += dp[card];
            }
        }

        return dp[0];
    }
}
