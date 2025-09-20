package com.interviewprep.bctci.chapter_37_Heaps.Problem_37_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.util.List.of;

class TopSongsExtendedTest {

    @Test
    public void topSongsTest() {
        int k = 3;
        TopSongsExtended topSongsExtended = new TopSongsExtended(k);

        topSongsExtended.registerPlays("Boolean Rhapsody", 100);
        topSongsExtended.registerPlays("Boolean Rhapsody", 193);
        topSongsExtended.registerPlays("Coding In The Deep", 75);
        topSongsExtended.registerPlays("Coding In The Deep", 75);
        topSongsExtended.registerPlays("All About That Base Case", 200);
        topSongsExtended.registerPlays("All About That Base Case", 290);
        topSongsExtended.registerPlays("All About That Base Case", 1);
        topSongsExtended.registerPlays("Here Comes The Bug", 223);
        topSongsExtended.registerPlays("Oops! I Broke Prod Again", 274);
        topSongsExtended.registerPlays("All the Single Brackets", 132);

        Assertions.assertArrayEquals(of("All About That Base Case", "Boolean Rhapsody", "Oops! I Broke Prod Again").toArray(), topSongsExtended.topK().toArray());
    }
}