package com.interviewprep.bctci.chapter_37_Heaps.Problem_37_5;

import com.interviewprep.bctci.chapter_37_Heaps.Problem_37_2.Song;

import java.util.*;

public class PopularSongs {
    private final Map<String, Integer> songCountMap;
    // stores the highest played n/2 songs
    private final PriorityQueue<Song> upperMinHeap;
    // stores the least played n/2 songs
    // INVARIANT - lowerMaxHeap will have 1 more element than upperMinHeap if n is odd
    private final PriorityQueue<Song> lowerMaxHeap;

    public PopularSongs() {
        songCountMap = new HashMap<>();
        upperMinHeap = new PriorityQueue<>(Comparator.comparingInt(Song::plays));
        lowerMaxHeap = new PriorityQueue<>(Collections.reverseOrder(Comparator.comparingInt(Song::plays)));
    }

    public void registerPlays(String title, int playCount) {
        songCountMap.put(title, playCount);
        Song newSong = new Song(title, playCount);
        // add element to the lower is it is empty of the new song is less popular than lowerMaxHeap top
        if (lowerMaxHeap.isEmpty() || lowerMaxHeap.peek().plays() > playCount) {
            lowerMaxHeap.add(newSong);
        }
        // add element to the upper if it is popular than lowerMapHeap top
        else {
            upperMinHeap.add(newSong);
        }

        // if the invariant is violated
        // lower has 2 or more elements than upper, move one to upper
        if (lowerMaxHeap.size() > upperMinHeap.size() + 1) {
            upperMinHeap.add(lowerMaxHeap.poll());
        }
        // upper has 1 or more element than lower, move on to lower
        else if (upperMinHeap.size() > lowerMaxHeap.size()) {
            lowerMaxHeap.add(upperMinHeap.poll());
        }
    }

    public boolean isPopular(String title) {
        if (songCountMap.containsKey(title)) {
            int songPlays = songCountMap.get(title);
            double median = lowerMaxHeap.size() == upperMinHeap.size() ? avg(lowerMaxHeap.peek().plays(), upperMinHeap.peek().plays()) : lowerMaxHeap.peek().plays();

            return songPlays > median;
        }
        throw new NoSuchElementException();
    }

    private double avg(int a, int b) {
        return (a + b) / 2.0;
    }
}
