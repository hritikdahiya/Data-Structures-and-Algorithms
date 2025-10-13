package com.interviewprep.bctci.chapter_UnionFind.Problem_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PresidentialElectionTest {

    @Test
    public void presidentialElectionTest() {
        String[] candidates = new String[]{"Ale", "Bloop", "Chip", "Dart", "Zing"};
        int[] votes = new int[]{10, 20, 30, 15, 25};
        String winner = "Dart";

        Assertions.assertEquals(winner, PresidentialElection.findWinner(candidates, votes));

        // Single party
        candidates = new String[]{"Alice"};
        votes = new int[]{40};
        winner = "Alice";
        Assertions.assertEquals(winner, PresidentialElection.findWinner(candidates, votes));

        // Two parties
        candidates = new String[]{"Alice", "Bob"};
        votes = new int[]{40, 50};
        winner = "Bob";
        Assertions.assertEquals(winner, PresidentialElection.findWinner(candidates, votes));

        votes = new int[]{50, 50};
        winner = "Alice";
        Assertions.assertEquals(winner, PresidentialElection.findWinner(candidates, votes));

        // Three Parties
        candidates = new String[]{"A", "E", "C", "D"};
        votes = new int[]{20, 5, 5, 5};
        winner = "A";
        Assertions.assertEquals(winner, PresidentialElection.findWinner(candidates, votes));

        votes = new int[]{10, 5, 5, 5};
        winner = "C";
        Assertions.assertEquals(winner, PresidentialElection.findWinner(candidates, votes));

    }
}