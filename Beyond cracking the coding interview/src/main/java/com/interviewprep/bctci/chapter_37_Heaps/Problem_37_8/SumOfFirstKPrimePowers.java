package com.interviewprep.bctci.chapter_37_Heaps.Problem_37_8;

import java.util.AbstractMap.SimpleEntry;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class SumOfFirstKPrimePowers {
    private static final Integer LARGE_PRIME = 1000000007;

    public static int calculate(int[] primes, int k) {
        PriorityQueue<Entry<Integer, Integer>> minHeap = new PriorityQueue<>(Comparator.comparingInt(Entry::getKey));
        for (int prime : primes) {
            minHeap.add(new SimpleEntry<>(prime, prime));
        }

        int sum = 0;
        for (int i = 0; i < k; i++) {
            Entry<Integer, Integer> minEntry = minHeap.poll();
            int multiple = minEntry.getKey(), multiplier = minEntry.getValue();

            sum = (sum + multiple) % LARGE_PRIME;

            minHeap.add(new SimpleEntry<>((multiple * multiplier) % LARGE_PRIME, multiplier));
        }

        return sum;
    }
}
