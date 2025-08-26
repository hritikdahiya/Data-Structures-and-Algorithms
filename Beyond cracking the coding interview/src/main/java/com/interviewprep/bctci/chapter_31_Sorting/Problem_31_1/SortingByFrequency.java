package com.interviewprep.bctci.chapter_31_Sorting.Problem_31_1;

import java.util.*;


public class SortingByFrequency {
    public static Character[] sort(String word) {
        Map<Character, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            freqMap.put(word.charAt(i), freqMap.getOrDefault(word.charAt(i), 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(freqMap.entrySet());

        list.sort((e1, e2) -> {
            if (Objects.equals(e1.getValue(), e2.getValue())) {
                // alphabetical ordering when frequency is equal
                return e1.getKey().compareTo(e2.getKey());
            } else {
                // descending order based on frequency
                return e2.getValue().compareTo(e1.getValue());
            }
        });

        List<Character> result = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : list) {
            result.add(entry.getKey());
        }

        return result.toArray(result.toArray(new Character[0]));
    }
}
