package com.interviewprep.bctci.chapter_39_BackTracking.Problem_39_9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountUniqueSubmultisetsWithZeroSum {
    public static int count(int[] multiset) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int ele : multiset) {
            freqMap.compute(ele, (k, v) -> v == null ? 1 : v + 1);
        }
        List<Integer> set = new ArrayList<>(freqMap.keySet());

        return countHelper(set, 0, 0, freqMap);
    }

    private static int countHelper(List<Integer> set, int currIndex, int sum, Map<Integer, Integer> freqMap) {
        if (currIndex == set.size()) {
            // or update a shared variable
            return sum == 0 ? 1 : 0;
        }

        // exclude an element or include it once/multiple times in the sum of the current running subset
        int zeroSumCombinations = 0;
        for (int count = 0; count <= freqMap.get(set.get(currIndex)); count++) {
            zeroSumCombinations += countHelper(set, currIndex + 1, sum + count * set.get(currIndex), freqMap);
        }

        return zeroSumCombinations;
    }
}
