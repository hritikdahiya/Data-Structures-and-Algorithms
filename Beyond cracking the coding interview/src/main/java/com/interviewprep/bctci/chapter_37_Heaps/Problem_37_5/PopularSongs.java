package com.interviewprep.bctci.chapter_37_Heaps.Problem_37_5;

import com.interviewprep.bctci.chapter_37_Heaps.Problem_37_2.Song;

import java.util.*;

public class PopularSongs {
    private final Map<String, Integer> songCountMap;
    // stores the highest played n/2 songs
    private final PriorityQueue<Song> minHeap;
    // stores the least played n/2 songs
    // INVARIANT - maxHeap will have 1 more element than minHeap if n is odd
    private final PriorityQueue<Song> maxHeap;

    public PopularSongs() {
        songCountMap = new HashMap<>();
        minHeap = new PriorityQueue<>(Comparator.comparingInt(Song::plays));
        maxHeap = new PriorityQueue<>(Collections.reverseOrder(Comparator.comparingInt(Song::plays)));
    }

    public void registerPlays(String title, int playCount) {
        songCountMap.put(title, playCount);
        Song newSong = new Song(title, playCount);
        int totalCount = maxHeap.size() + minHeap.size();
        if (totalCount == 0) {
            // first element
            maxHeap.add(newSong);
            return;
        }

        // odd number of elements till now
        if (totalCount % 2 == 1) {
            int medianNumOfPlays = maxHeap.peek().plays();
            // new element is less popular than median, move median from left to right and add newSong to left
            // so both heaps have an even number of elements
            if (playCount < medianNumOfPlays) {
                minHeap.add(maxHeap.poll());
                maxHeap.add(newSong);
            }
            // mew element is more popular than median, keep median in the left and move newSong to right
            else {
                minHeap.add(newSong);
            }
        } else {
            double medianNumOfPlays = avg(maxHeap.peek().plays(), minHeap.peek().plays());
            // new element is less popular than median, add it to the left
            // so the Invariant stands
            if (playCount < medianNumOfPlays) {
                maxHeap.add(newSong);
            }
            // new element is more popular than the median, move element from right to left and add the newSong to the right
            // to maintain the invariant
            else {
                minHeap.add(newSong);
                maxHeap.add(minHeap.poll());
            }
        }
    }

    public boolean isPopular(String title) {
        if (songCountMap.containsKey(title)) {
            int songPlays = songCountMap.get(title);
            double median = maxHeap.size() == minHeap.size() ? avg(maxHeap.peek().plays(), minHeap.peek().plays()) : maxHeap.peek().plays();

            return songPlays > median;
        }
        throw new NoSuchElementException();
    }

    private double avg(int a, int b) {
        return (a + b) / 2.0;
    }
}
