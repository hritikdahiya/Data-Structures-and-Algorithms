package com.interviewprep.bctci.chapter_30_SetsAndMaps.Problem_30_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllSquares {
    public static List<Integer[]> findAllPairs(Integer[] arr) {
        Map<Integer, Integer> itemToIndexMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            itemToIndexMap.put(arr[i], i);
        }

        List<Integer[]> pairs = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int square = arr[i] * arr[i];
            if (itemToIndexMap.containsKey(square)) {
                pairs.add(new Integer[]{itemToIndexMap.get(square), i});
            }
        }

        return pairs;
    }
}
