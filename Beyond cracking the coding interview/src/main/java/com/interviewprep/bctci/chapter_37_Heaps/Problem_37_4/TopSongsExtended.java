package com.interviewprep.bctci.chapter_37_Heaps.Problem_37_4;

import com.interviewprep.bctci.chapter_37_Heaps.Problem_37_2.Song;

import java.util.*;

// S - O(n)
public class TopSongsExtended {
    private final int maxSize;
    private final PriorityQueue<Song> maxHeap;
    private final Map<String, Integer> songCountMap;

    public TopSongsExtended(int k) {
        maxSize = k;
        maxHeap = new PriorityQueue<>(Collections.reverseOrder(Comparator.comparingInt(Song::plays)));
        songCountMap = new HashMap<>();
    }

    // T - O(logn)
    public void registerPlays(String songTitle, int playCount) {
        Song song = new Song(songTitle, songCountMap.getOrDefault(songTitle, 0) + playCount);
        songCountMap.put(songTitle, song.plays());
        maxHeap.add(song);
    }

    // T - O(klogn)
    public List<String> topK() {
        List<Song> topKSongs = new ArrayList<>();
        int count = maxSize;
        while (count > 0 && !maxHeap.isEmpty()) {
            Song song = maxHeap.poll();
            if (song.plays() == songCountMap.get(song.name())) {
                // latest count of song
                topKSongs.add(song);
                count--;
            }
            // stale count - do nothing
        }

        maxHeap.clear();
        maxHeap.addAll(topKSongs);

        return topKSongs.stream().map(Song::name).toList();
    }
}

