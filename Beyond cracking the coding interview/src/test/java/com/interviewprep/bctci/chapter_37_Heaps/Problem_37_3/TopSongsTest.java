package com.interviewprep.bctci.chapter_37_Heaps.Problem_37_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.util.List.of;

class TopSongsTest {

    @Test
    public void topSongsTest() {
        int k = 3;
        TopSongs topSongs = new TopSongs(k);

        topSongs.registerPlays("Boolean Rhapsody", 193);
        topSongs.registerPlays("Coding In The Deep", 146);

        Assertions.assertArrayEquals(of("Coding In The Deep", "Boolean Rhapsody").toArray(), topSongs.topK().toArray());
        // Returns ["Coding In The Deep", "Boolean Rhapsody"]

        topSongs.registerPlays("All About That Base Case", 291);
        topSongs.registerPlays("Here Comes The Bug", 223);
        topSongs.registerPlays("Oops! I Broke Prod Again", 274);
        topSongs.registerPlays("All the Single Brackets", 132);

        Assertions.assertArrayEquals(of("Here Comes The Bug", "Oops! I Broke Prod Again", "All About That Base Case").toArray(), topSongs.topK().toArray());
        // Returns ["All About That Base Case", "Here Comes The Bug", "Oops! I Broke Prod Again"]
    }
}