package com.interviewprep.bctci.chapter_37_Heaps.Problem_37_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PopularSongsTest {
    @Test
    public void popularSongTest() {
        PopularSongs p = new PopularSongs();

        p.registerPlays("Boolean Rhapsody", 193);

        Assertions.assertFalse(p.isPopular("Boolean Rhapsody"));                   // Returns False

        p.registerPlays("Coding In The Deep", 140);
        p.registerPlays("All the Single Brackets", 132);

        Assertions.assertTrue(p.isPopular("Boolean Rhapsody"));                   // Returns True
        Assertions.assertFalse(p.isPopular("Coding In The Deep"));                 // Returns False
        Assertions.assertFalse(p.isPopular("All the Single Brackets"));            // Returns False

        p.registerPlays("All About That Base Case", 291);
        p.registerPlays("Oops! I Broke Prod Again", 274);
        p.registerPlays("Here Comes The Bug", 223);

        Assertions.assertFalse(p.isPopular("Boolean Rhapsody"));                  // Returns False
        Assertions.assertTrue(p.isPopular("Here Comes The Bug"));                 // Returns True
    }
}
