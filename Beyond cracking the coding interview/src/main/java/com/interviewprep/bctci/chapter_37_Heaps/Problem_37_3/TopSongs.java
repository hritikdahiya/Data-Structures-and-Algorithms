package com.interviewprep.bctci.chapter_37_Heaps.Problem_37_3;

import com.interviewprep.bctci.chapter_37_Heaps.Problem_37_2.Song;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

// S - O(k)
public class TopSongs {
    protected final int maxSize;
    protected final PriorityQueue<Song> minHeap;

    public TopSongs(int k) {
        this.maxSize = k;
        this.minHeap = new PriorityQueue<>(Comparator.comparingInt(Song::plays));
    }

    // T - O(logk)
    public void registerPlays(String songTitle, int playCount) {
        minHeap.add(new Song(songTitle, playCount));
        if (minHeap.size() > maxSize) {
            minHeap.poll();
        }
    }

    // T - O(k)
    public List<String> topK() {
        return minHeap.stream().map(Song::name).toList();
    }
}
