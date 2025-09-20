package com.interviewprep.bctci.chapter_37_Heaps.Problem_37_3;

import com.interviewprep.bctci.chapter_37_Heaps.Problem_37_2.Song;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class TopSongs {
    private final int maxSize;
    private final PriorityQueue<Song> minHeap;

    TopSongs(int k) {
        this.maxSize = k;
        this.minHeap = new PriorityQueue<>(Comparator.comparingInt(Song::plays));
    }

    public void registerPlays(String songTitle, int playCount) {
        minHeap.add(new Song(songTitle, playCount));
        if (minHeap.size() > maxSize) {
            minHeap.poll();
        }
    }

    public List<String> topK() {
        return minHeap.stream().map(Song::name).toList();
    }
}
