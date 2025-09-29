package com.interviewprep.bctci.chapter_39_BackTracking.Problem_39_7;

import java.util.ArrayList;
import java.util.List;

public class IkeaShopping {
    private final int budget;
    private final int[] prices;
    private final float[] rating;
    private float maxRating = 0;
    private Integer[] maxRatingItems = new Integer[]{};

    public IkeaShopping(int budget, int[] prices, float[] rating) {
        this.budget = budget;
        this.prices = prices;
        this.rating = rating;
    }

    public Integer[] solve() {
        solveHelper(0, 0, 0, new ArrayList<>());
        return maxRatingItems;
    }

    private void solveHelper(int currIndex, int currCost, float currRating, List<Integer> currItems) {
        if (currIndex == prices.length) {
            if (currRating > maxRating) {
                maxRating = currRating;
                maxRatingItems = List.copyOf(currItems).toArray(new Integer[0]);
            }
            return;
        }

        // include current item in the cart only if it doesn't exceed budget
        if (currCost + prices[currIndex] <= budget) {
            currItems.add(currIndex);
            solveHelper(currIndex + 1, currCost + prices[currIndex], currRating + rating[currIndex], currItems);
            currItems.remove(currItems.size() - 1);
        }

        // exclue curr item from the card
        solveHelper(currIndex + 1, currCost, currRating, currItems);
    }
}
