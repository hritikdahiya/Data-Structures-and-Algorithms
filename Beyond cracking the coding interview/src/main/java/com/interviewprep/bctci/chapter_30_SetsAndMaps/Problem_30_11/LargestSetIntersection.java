package com.interviewprep.bctci.chapter_30_SetsAndMaps.Problem_30_11;

import java.util.HashMap;
import java.util.Map;

public class LargestSetIntersection {
    public static int findSetToRemove(int[][] sets) {
        int n = sets.length;
        if (n < 2) {
            return 0;
        }
        if (n == 2) {
            // remove the smallest set
            return sets[0].length <= sets[1].length ? 0 : 1;
        }

        // calculate the number of sets that each element belong to
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int[] set : sets) {
            for (int ele : set) {
                frequencyMap.put(ele, frequencyMap.getOrDefault(ele, 0) + 1);
            }
        }

        int indexToRemove = -1;
        int minNumOfNMinus1FreqElements = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int nMinus1FreqElementCount = 0;
            // in every set, find the number of elements that have frequency n-1
            for (int ele : sets[i]) {
                if (frequencyMap.getOrDefault(ele, 0) == n - 1) {
                    nMinus1FreqElementCount++;
                }
            }

            // the index of the set to remove is the one which has the least number of n-1 freq elements
            if (nMinus1FreqElementCount < minNumOfNMinus1FreqElements) {
                indexToRemove = i;
                minNumOfNMinus1FreqElements = nMinus1FreqElementCount;
            }
        }


        return indexToRemove;
    }
}
