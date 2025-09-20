package com.interviewprep.bctci.chapter_37_Heaps.Problem_37_2;

import java.util.*;

public class KMostPlayed {
    // T - O(n + k logn) - for build heap + k removal from heap
    // S - O(n) - heap space
    public static List<String> findKMostPlayedSongs(List<Song> songs, int k) {
        PriorityQueue<Song> maxHeap = new PriorityQueue<>(Collections.reverseOrder(Comparator.comparingInt(Song::plays)));

        maxHeap.addAll(songs);

        List<String> kMostPlayedSongs = new ArrayList<>();
        int elements = Math.min(k, songs.size());
        for (int i = 0; i < elements; i++) {
            kMostPlayedSongs.add(maxHeap.poll().name());
        }

        return kMostPlayedSongs;
    }

    // T - O(nlogk + klogk)
    // S - O(k) - heap space
    public static List<String> findKMostPlayedSongsWithKSpace(List<Song> songs, int k) {
        PriorityQueue<Song> minHeap = new PriorityQueue<>(Comparator.comparingInt(Song::plays));

        for (Song song : songs) {
            minHeap.add(song);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        List<String> kMostPlayedSongs = new ArrayList<>();
        int elements = Math.min(minHeap.size(), k);
        for (int i = 0; i < elements; i++) {
            kMostPlayedSongs.add(minHeap.poll().name());
        }

        return kMostPlayedSongs;
    }
}
