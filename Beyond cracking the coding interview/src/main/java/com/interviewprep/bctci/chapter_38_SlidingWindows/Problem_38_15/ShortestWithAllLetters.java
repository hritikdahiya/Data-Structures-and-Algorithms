package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_15;

import java.util.HashMap;
import java.util.Map;

public class ShortestWithAllLetters {
    public static int findShortestWithAllLetters(String s1, String s2) {
        if (s2.length() < 2) {
            return s2.length();
        }

        Map<Character, Integer> s2FreqMap = new HashMap<>();
        Map<Character, Integer> missingFreqMap = new HashMap<>();
        for (int i = 0; i < s2.length(); i++) {
            s2FreqMap.compute(s2.charAt(i), (Character key, Integer val) -> val == null ? 1 : val + 1);
            missingFreqMap.compute(s2.charAt(i), (Character key, Integer val) -> val == null ? 1 : val + 1);
        }

        int l = 0, r = 0;
        int minLen = Integer.MAX_VALUE;
        while (true) {
            // when no items are missing in the l to r window, shrink to find minimum
            // else grow
            boolean growWindow = !missingFreqMap.isEmpty();
            if (growWindow) {
                // check out of bounds
                if (r == s1.length()) {
                    break;
                }

                if (missingFreqMap.containsKey(s1.charAt(r))) {
                    // reduce frequency of character (remove item if reduced to 0)
                    missingFreqMap.compute(s1.charAt(r), (Character key, Integer val) -> val == 1 ? null : val - 1);
                }
                r++;
            } else {
                minLen = Math.min(minLen, r - l);
                if (s2FreqMap.containsKey(s1.charAt(l))) {
                    missingFreqMap.compute(s2.charAt(l), (Character key, Integer val) -> val == null ? 1 : val + 1);
                }
                l++;
            }
        }

        return minLen == Integer.MAX_VALUE ? -1 : minLen;
    }
}
