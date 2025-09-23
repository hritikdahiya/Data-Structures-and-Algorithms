package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueBestSellerStreak {
    public static boolean wasStreakCreated(String[] bestSellers, int k) {
        int l = 0, r = 0;
        int streakLen = 0;
        Set<String> seenBooksSet = new HashSet<>();
        while (r < bestSellers.length) {
            // shrink the window till we have all unique bestsellers in the widow
            if (seenBooksSet.contains(bestSellers[r])) {
                seenBooksSet.remove(bestSellers[l++]);
                streakLen--;
            } else {
                seenBooksSet.add(bestSellers[r++]);
                streakLen++;
                if (streakLen == k) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean calculateUsingFixedLenWindowRecipe(String[] bestSellers, int k) {
        int l = 0, r = 0;
        Map<String, Integer> bookFreqMap = new HashMap<>();
        while (r < bestSellers.length) {
            bookFreqMap.compute(bestSellers[r], (String key, Integer val) -> val == null ? 1 : val + 1);
            r++;
            if (r - l == k) {
                if (bookFreqMap.size() == k) {
                    return true;
                }
                bookFreqMap.compute(bestSellers[l], (String key, Integer val) -> val == 1 ? null : val - 1);
                l++;
            }
        }

        return false;
    }
}
