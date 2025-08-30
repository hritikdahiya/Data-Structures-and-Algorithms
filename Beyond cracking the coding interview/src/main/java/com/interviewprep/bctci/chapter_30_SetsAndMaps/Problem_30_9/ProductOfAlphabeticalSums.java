package com.interviewprep.bctci.chapter_30_SetsAndMaps.Problem_30_9;

import java.util.HashSet;
import java.util.Set;

public class ProductOfAlphabeticalSums {
    public static boolean doesExist(String[] words, int target) {
        Set<Integer> wordSet = new HashSet<>();
        for (String word : words) {
            wordSet.add(sumOfChars(word));
        }

        // BRUTE FORCE - Iterating over the words array in O(n^2) time to find two pair of string, and find the third
        // element from set.

        // OPTIMIZATION - iterate over the set (which can only have 3 * 26 = 78 unique values, since set contains the
        // sum of any string in words which can only be at max 3 characters long)

        for (Integer i : wordSet) {
            if (target % i != 0) {
                continue;
            }
            for (Integer j : wordSet) {
                if (target % (i * j) != 0) {
                    continue;
                }

                int thirdMultiplier = target / (i * j);

                if (wordSet.contains(thirdMultiplier)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static Integer sumOfChars(String s) {
        int sum = 0;
        for (char ch : s.toCharArray()) {
            sum += (ch - 'a' + 1);
        }

        return sum;
    }
}
