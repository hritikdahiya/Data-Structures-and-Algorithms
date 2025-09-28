package com.interviewprep.bctci.chapter_39_BackTracking.Problem_39_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.List.of;

class ToBeOrNotToBeTest {

    @Test
    public void shakespearifyTest() {
        String sentence = "";
        List<String> shakespearifiedSentences = of("");
        Assertions.assertArrayEquals(shakespearifiedSentences.toArray(), ToBeOrNotToBe.shakespearify(sentence).toArray());

        // one word with extra spaces
        sentence = "hello";
        shakespearifiedSentences = of("", "hello");
        Assertions.assertArrayEquals(shakespearifiedSentences.toArray(), ToBeOrNotToBe.shakespearify(sentence).toArray());

        // many word with extra spaces
        sentence = "I love   dogs ";
        shakespearifiedSentences = of(
                "",
                "dogs",
                "love",
                "love dogs",
                "I",
                "I dogs",
                "I love",
                "I love dogs"
        );
        Assertions.assertArrayEquals(shakespearifiedSentences.toArray(), ToBeOrNotToBe.shakespearify(sentence).toArray());
    }
}