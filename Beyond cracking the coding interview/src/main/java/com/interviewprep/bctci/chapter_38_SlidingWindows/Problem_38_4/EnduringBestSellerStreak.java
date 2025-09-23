package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class EnduringBestSellerStreak {
    public static boolean hasEnduringStreak(String[] bestSellers, int k) {
        if (bestSellers.length < k) {
            return false;
        }
        if (k == 1) {
            return true;
        }

        int l = 0, r = 1;
        while (r < bestSellers.length) {
            if (r - l == k) {
                return true;
            }

            if (!Objects.equals(bestSellers[r], bestSellers[l])) {
                l = r;
            }
            r++;
        }

        return r - l == k;
    }

    public static boolean calculateUsingFixedLenWindowRecipe(String[] bestSellers, int k) {
        int l = 0, r = 0;
        Map<String, Integer> bookFreqMap = new HashMap<>();
        while (r < bestSellers.length) {
            bookFreqMap.compute(bestSellers[r], (String key, Integer val) -> val == null ? 1 : val + 1);
            r++;
            if (r - l == k) {
                if (bookFreqMap.size() == 1) {
                    return true;
                }
                bookFreqMap.compute(bestSellers[l], (String key, Integer val) -> val == 1 ? null : val - 1);
                l++;
            }
        }

        return false;
    }
}
