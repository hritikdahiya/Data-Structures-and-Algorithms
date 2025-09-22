package com.interviewprep.bctci.chapter_37_Heaps.Problem_37_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

class MakePlaylistTest {

    @Test
    public void shuffleTest() {
        // no songs
        List<String[]> songs = asList();
        verifyResults(MakePlaylist.shuffle(songs));

        // 1 song 1 artist
        songs = new ArrayList<>();
        songs.add(new String[]{"Coding In The Deep", "A Dell"});
        verifyResults(MakePlaylist.shuffle(songs));

        // not possible to shuffle
        songs = asList(new String[]{"Coding In The Deep", "A Dell"},
                new String[]{"Hello World", "A Dell"},
                new String[]{"Someone Like GNU", "A Dell"},
                new String[]{"Make You Read My Logs", "A Dell"},
                new String[]{"Hey Queue", "The Bugs"}
        );
        verifyResults(MakePlaylist.shuffle(songs));

        // shuffle properly
        songs = asList(new String[]{"Coding In The Deep", "A Dell"},
                new String[]{"Hello World", "A Dell"},
                new String[]{"Someone Like GNU", "A Dell"},
                new String[]{"Make You Read My Logs", "A Dell"},
                new String[]{"Hey Queue", "The Bugs"},
                new String[]{"Here Comes the Bug", "The Bugs"},
                new String[]{"Merge Together", "The Bugs"},
                new String[]{"Dirty Data", "Michael JSON"},
                new String[]{"Man in the Middle Attack", "Michael JSON"},
                new String[]{"Ring Of Firewalls", "Johnny Cache"}
        );
        verifyResults(MakePlaylist.shuffle(songs));
    }

    private void verifyResults(List<String> shuffled) {
        if (shuffled.size() < 2) {
            Assertions.assertTrue(true);
        } else {
            for (int i = 1; i < shuffled.size(); i++) {
                Assertions.assertNotEquals(shuffled.get(i), shuffled.get(i - 1));
            }
        }

    }

}