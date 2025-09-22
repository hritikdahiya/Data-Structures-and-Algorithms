package com.interviewprep.bctci.chapter_37_Heaps.Problem_37_6;

import com.interviewprep.bctci.chapter_37_Heaps.Problem_37_2.Song;

import java.util.*;

// songsByGenres is songs grouped by genre and the songs per genre are sorted in descending order of plays
public class MostListenedAcrossGenre {

    // T - O(nlogk)
    // S - O(k)
    public static List<String> mostListened(List<List<Song>> songsByGenres, int k) {
        // size restricted heap - keeps track of songs
        PriorityQueue<Song> minHeap = new PriorityQueue<>(Comparator.comparingInt(Song::plays));

        for (List<Song> genreSongs : songsByGenres) {
            for (Song song : genreSongs) {
                minHeap.add(song);
                if (minHeap.size() > k) {
                    minHeap.poll();
                }
            }
        }

        List<String> list = new ArrayList<>();
        for (Song song : minHeap) {
            list.add(song.name());
        }
        return list;
    }


    // something like merge k sorted arrays
    public static List<String> mostListenedEfficient(List<List<Song>> songsByGenres, int k) {
        // max heap keeps track of the top song per genre (max size - m - #genres)
        PriorityQueue<SongInGenre> maxHeap = new PriorityQueue<>(Collections.reverseOrder(Comparator.comparingInt(songInGenre -> songInGenre.song().plays())));

        for (int i = 0; i < songsByGenres.size(); i++) {
            // songs by genre is already sorted in desc order, the first song is most played in the genre
            if (!songsByGenres.get(i).isEmpty()) {
                maxHeap.add(new SongInGenre(songsByGenres.get(i).get(0), i, 0));
            }
        }

        List<String> mostListenedSongs = new ArrayList<>();
        while (mostListenedSongs.size() < k && !maxHeap.isEmpty()) {
            SongInGenre mostListenedSongAcrossGenre = maxHeap.poll();
            int genreIndex = mostListenedSongAcrossGenre.genreIndex();
            int songIndex = mostListenedSongAcrossGenre.songInGenreIndex();

            mostListenedSongs.add(mostListenedSongAcrossGenre.song().name());

            if (songIndex + 1 < songsByGenres.get(genreIndex).size()) {
                maxHeap.add(new SongInGenre(songsByGenres.get(genreIndex).get(songIndex + 1), genreIndex, songIndex + 1));
            }
        }

        return mostListenedSongs;
    }
}
