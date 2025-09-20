package com.interviewprep.bctci.chapter_37_Heaps.Problem_37_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class KMostPlayedTest {

    @Test
    public void kMostPlayedTest() {
        List<Song> songs = Arrays.asList(
                new Song("All the Single Brackets", 132),
                new Song("Oops! I Broke Prod Again", 274),
                new Song("Coding In The Deep", 146),
                new Song("Boolean Rhapsody", 193),
                new Song("Here Comes The Bug", 291),
                new Song("All About That Base Case", 291)
        );
        int k = 3;
        List<String> expectedSongs = Arrays.asList(
                "All About That Base Case",
                "Here Comes The Bug",
                "Oops! I Broke Prod Again"
        );

        verifyResult(expectedSongs, KMostPlayed.findKMostPlayedSongs(songs, k));
        verifyResult(expectedSongs, KMostPlayed.findKMostPlayedSongsWithKSpace(songs, k));

        k = 10;
        expectedSongs = Arrays.asList("All the Single Brackets",
                "Oops! I Broke Prod Again",
                "Coding In The Deep",
                "Boolean Rhapsody",
                "Here Comes The Bug",
                "All About That Base Case"
        );
        verifyResult(expectedSongs, KMostPlayed.findKMostPlayedSongs(songs, k));
        verifyResult(expectedSongs, KMostPlayed.findKMostPlayedSongsWithKSpace(songs, k));
    }

    private static void verifyResult(List<String> expectedSongs, List<String> actuaSongs) {
        Collections.sort(expectedSongs);
        Collections.sort(actuaSongs);
        Assertions.assertArrayEquals(expectedSongs.toArray(), actuaSongs.toArray());
    }
}