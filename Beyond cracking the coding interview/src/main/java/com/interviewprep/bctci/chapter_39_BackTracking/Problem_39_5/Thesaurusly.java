package com.interviewprep.bctci.chapter_39_BackTracking.Problem_39_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Thesaurusly {
    public static List<String> thesaurusly(String s, Map<String, List<String>> synonyms) {
        List<String> words = List.of(s.split(" "));
        List<String> allWordCombinations = new ArrayList<>();

        thesauruslyHelper(words, synonyms, 0, new ArrayList<>(), allWordCombinations);

        return allWordCombinations;
    }

    private static void thesauruslyHelper(List<String> words, Map<String, List<String>> synonyms, int currIndex, ArrayList<String> sentence, List<String> allWordCombinations) {
        if (currIndex == words.size()) {
            // join the words into sentence
            allWordCombinations.add(String.join(" ", sentence));
            return;
        }

        String currWord = words.get(currIndex);
        // move along it the current word is empty, or no synonym exists for it
        if (currWord.isEmpty()) {
            thesauruslyHelper(words, synonyms, currIndex + 1, sentence, allWordCombinations);
            return;
        }

        // replace this word with every synonym possible
        for (String synonym : synonyms.getOrDefault(currWord, List.of(currWord))) {
            sentence.add(synonym);
            thesauruslyHelper(words, synonyms, currIndex + 1, sentence, allWordCombinations);
            sentence.remove(sentence.size() - 1);
        }
    }
}
