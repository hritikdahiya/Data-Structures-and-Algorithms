package com.interviewprep.bctci.chapter_37_Heaps.Problem_37_6;

import com.interviewprep.bctci.chapter_37_Heaps.Problem_37_2.Song;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.List.of;

class MostListenedAcrossGenreTest {
    @Test
    public void mostListenedAcrossGenreTest() {
        List<List<Song>> songsByGenre = asList(
                asList(
                        new Song("Coding In The Deep", 123),
                        new Song("Someone Like GNU", 99),
                        new Song("Hello World", 98)),
                of(
                        new Song("Ring Of Firewalls", 217)),
                asList(
                        new Song("Boolean Rhapsody", 184),
                        new Song("Merge Together", 119),
                        new Song("Hey Queue", 102))
        );
        String[] expectedSongs = new String[]{
                "Hey Queue",
                "Coding In The Deep",
                "Merge Together",
                "Ring Of Firewalls",
                "Boolean Rhapsody"
        };
        int k = 5;

        verifyResults(expectedSongs, MostListenedAcrossGenre.mostListened(songsByGenre, k));
        verifyResults(expectedSongs, MostListenedAcrossGenre.mostListenedEfficient(songsByGenre, k));

        // Test with fewer songs than k
        songsByGenre = asList(
                of(
                        new Song("Song A", 100)),
                of(
                        new Song("Song B", 200))
        );
        expectedSongs = new String[]{
                "Song A",
                "Song B"
        };

        verifyResults(expectedSongs, MostListenedAcrossGenre.mostListened(songsByGenre, k));
        verifyResults(expectedSongs, MostListenedAcrossGenre.mostListenedEfficient(songsByGenre, k));

        // Test with ties in play counts
        songsByGenre = asList(
                of(
                        new Song("Song A", 100)),
                of(
                        new Song("Song B", 100)),
                of(
                        new Song("Song C", 100)),
                of(
                        new Song("Song D", 100))
        );
        expectedSongs = new String[]{
                "Song D",
                "Song B"
        };
        k = 2;
        verifyResults(expectedSongs, MostListenedAcrossGenre.mostListened(songsByGenre, k));

        expectedSongs = new String[]{
                "Song A",
                "Song D"
        };
        verifyResults(expectedSongs, MostListenedAcrossGenre.mostListenedEfficient(songsByGenre, k));

        // Test with empty genres
        songsByGenre = of(
                of()
        );
        expectedSongs = new String[]{};
        k = 3;

        verifyResults(expectedSongs, MostListenedAcrossGenre.mostListened(songsByGenre, k));
        verifyResults(expectedSongs, MostListenedAcrossGenre.mostListenedEfficient(songsByGenre, k));


    }

    void verifyResults(String[] expected, List<String> actual) {
        Arrays.sort(expected);
        Collections.sort(actual);
        Assertions.assertArrayEquals(expected, actual.toArray());
    }
}