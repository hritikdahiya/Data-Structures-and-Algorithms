package com.interviewprep.bctci.chapter_35_Trees.Problem_35_2;

import com.interviewprep.bctci.chapter_35_Trees.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HiddenMessageTest {

    @Test
    public void decryptTest() {
        Node<String> root = null;
        String expected = "";
        Assertions.assertEquals(expected, HiddenMessage.decrypt(root));

        root = new Node<>("bn",
                new Node<>("i_",
                        new Node<>("ae",
                                new Node<>("bi"),
                                new Node<>("bc")),
                        new Node<>("it")),
                new Node<>("a!",
                        new Node<>("br",
                                null,
                                new Node<>("ay")),
                        null));
        expected = "nice_try!";
        Assertions.assertEquals(expected, HiddenMessage.decrypt(root));
    }
}