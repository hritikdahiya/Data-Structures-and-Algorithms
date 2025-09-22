package com.interviewprep.bctci.chapter_37_Heaps.Problem_37_7;

import java.util.*;

public class MakePlaylist {
    public static List<String> shuffle(List<String[]> songsByArtist) {
        Map<String, List<String>> artistBySongsMapping = new HashMap<>();
        for (String[] strings : songsByArtist) {
            String song = strings[0], artist = strings[1];
            if (!artistBySongsMapping.containsKey(artist)) {
                artistBySongsMapping.put(artist, new ArrayList<>());
            }
            artistBySongsMapping.get(artist).add(song);
        }

        PriorityQueue<SongInfo> maxHeap = new PriorityQueue<>(Collections.reverseOrder(Comparator.comparingInt(SongInfo::count)));
        for (Map.Entry<String, List<String>> entry : artistBySongsMapping.entrySet()) {
            maxHeap.add(new SongInfo(entry.getKey(), entry.getValue().size(), 0));
        }

        List<String> shuffledSongs = new ArrayList<>();
        String prevArtistInPlaylist = "";
        while (!maxHeap.isEmpty()) {
            SongInfo maxSongArtist = maxHeap.poll();
            // if the last added artist is the same as the current one
            if (maxSongArtist.artist().equals(prevArtistInPlaylist)) {
                // pick another artist
                SongInfo nextSongArtist = maxHeap.poll();

                // not possible to shuffle the list because 1 artist has more than half the songs in the list
                if (nextSongArtist == null) {
                    return new ArrayList<>();
                }

                // put the prev artist back in the heap so it can be considered for the next song
                maxHeap.add(maxSongArtist);

                maxSongArtist = nextSongArtist;
            }

            if (maxSongArtist.songIndex() < artistBySongsMapping.get(maxSongArtist.artist()).size()) {
                // add song to list
                shuffledSongs.add(artistBySongsMapping.get(maxSongArtist.artist()).get(maxSongArtist.songIndex()));
                // move the song index of the currently selected artist along
                maxHeap.add(new SongInfo(maxSongArtist.artist(), maxSongArtist.count() - 1, maxSongArtist.songIndex() + 1));
                // update the prev artist
                prevArtistInPlaylist = maxSongArtist.artist();
            }
        }

        return shuffledSongs;
    }
}

record SongInfo(String artist, int count, int songIndex) {
}