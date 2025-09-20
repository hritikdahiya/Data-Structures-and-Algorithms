package com.interviewprep.bctci.chapter_31_Sorting.Problem_31_6;

import java.util.*;

public class FirstK {
    public static int[] findKSmallestElementsQuickSelect(int[] arr, int k) {
        int kThSmallestNumber = quickSelect(Arrays.stream(arr).boxed().toList(), k);

        int[] smallestKElements = new int[k];
        int index = 0;
        for (int i : arr) {
            if (index < k && i <= kThSmallestNumber) {
                smallestKElements[index++] = i;
            }
        }

        return smallestKElements;
    }

    private static int quickSelect(List<Integer> arr, int k) {
        if (arr.size() == 1) {
            return arr.get(0);
        }

        int randomPivotIndex = new Random().ints(0, arr.size()).findAny().getAsInt();
        int pivot = arr.get(randomPivotIndex);

        List<Integer> smaller = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for (int ele : arr) {
            if (ele < pivot) {
                smaller.add(ele);
            } else if (ele > pivot) {
                greater.add(ele);
            } else {
                equal.add(ele);
            }
        }

        int lessThanEqualElements = smaller.size() + equal.size();

        if (k <= smaller.size()) {
            return quickSelect(smaller, k);
        } else if (k <= lessThanEqualElements) {
            return pivot;
        } else {
            return quickSelect(greater, k - lessThanEqualElements);
        }
    }

    // T - O(n + log n)
    // S - O(n)
    public static int[] findKSmallestElementsWithHeap(int[] arr, int k) {
        if (k >= arr.length) {
            return arr;
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int ele : arr) {
            minHeap.add(ele);
        }

        int[] smallestKElements = new int[k];
        for (int i = 0; i < k; i++) {
            smallestKElements[i] = minHeap.poll();
        }

        return smallestKElements;
    }
}
