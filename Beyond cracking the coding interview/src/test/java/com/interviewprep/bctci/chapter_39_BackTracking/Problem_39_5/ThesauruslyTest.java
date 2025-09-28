package com.interviewprep.bctci.chapter_39_BackTracking.Problem_39_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

class ThesauruslyTest {
    @Test
    public void thesauruslyTest() {
        String sentence = "one does not simply walk into mordor";
        Map<String, List<String>> synonyms = Map.of(
                "walk", List.of("stroll", "hike", "wander"),
                "simply", List.of("just", "merely")
        );
        String[] expectedOutput = new String[]{
                "one does not just stroll into mordor",
                "one does not just hike into mordor",
                "one does not just wander into mordor",
                "one does not merely stroll into mordor",
                "one does not merely hike into mordor",
                "one does not merely wander into mordor"
        };
        Assertions.assertArrayEquals(expectedOutput, Thesaurusly.thesaurusly(sentence, synonyms).toArray());

        sentence = "simply";
        synonyms = Map.of(
                "simply", List.of("just", "merely")
        );
        expectedOutput = new String[]{
                "just",
                "merely"
        };
        Assertions.assertArrayEquals(expectedOutput, Thesaurusly.thesaurusly(sentence, synonyms).toArray());
    }
}