package com.interviewprep.bctci.chapter_39_BackTracking.Problem_39_4;

import java.util.ArrayList;
import java.util.List;

public class ToBeOrNotToBe {
    public static List<String> shakespearify(String s) {
        List<String> words = List.of(s.split(" "));
        List<String> allWordCombinations = new ArrayList<>();

        shakespearifyHelper(words, 0, new ArrayList<>(), allWordCombinations);

        return allWordCombinations;
    }

    private static void shakespearifyHelper(List<String> words, int currIndex, ArrayList<String> sentence, List<String> allWordCombinations) {
        if (currIndex == words.size()) {
            // join the words into sentence
            allWordCombinations.add(String.join(" ", sentence));
            return;
        }

        if (words.get(currIndex).isEmpty()) {
            // ignore empty word
            shakespearifyHelper(words, currIndex + 1, sentence, allWordCombinations);
            return;
        }

        // exclude curr word
        shakespearifyHelper(words, currIndex + 1, sentence, allWordCombinations);

        // include curr word
        sentence.add(words.get(currIndex).trim());
        shakespearifyHelper(words, currIndex + 1, sentence, allWordCombinations);
        sentence.remove(sentence.size() - 1);
    }
}
