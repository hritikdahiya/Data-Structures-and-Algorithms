package com.interviewprep.bctci.chapter_42_TopologicalSort.Problem_42_7;

import java.util.*;

public class SuperSequence {
    public static boolean isSuperSequencePossible(String[] arr) {
        List<List<Integer>> graphAdjList = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            graphAdjList.add(new ArrayList<>());
        }

        for (String str : arr) {
            if (str.length() > 26) {
                //characters are duplicated in the string itself ==> no supersequence possible
                return false;
            }

            for (int i = 1; i < str.length(); i++) {
                char prev = str.charAt(i - 1), curr = str.charAt(i);
                graphAdjList.get(prev - 'a').add(curr - 'a');
            }
        }

        // Modeled the problem as a DAG.

        // Topologically sort the DAG to detect cycle
        int[] degree = new int[26];
        for (int node = 0; node < 26; node++) {
            for (int neighbor : graphAdjList.get(node)) {
                degree[neighbor]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for (int node = 0; node < 26; node++) {
            if (degree[node] == 0) {
                q.add(node);
            }
        }

        // peel off / kahn algorithm for topological sort. We don't need the sorted order.
        while (!q.isEmpty()) {
            int node = q.poll();
            for (int neighbor : graphAdjList.get(node)) {
                degree[neighbor]--;
                if (degree[neighbor] == 0) {
                    q.add(neighbor);
                }
            }
        }

        // if any item is left with degree 0 --> cycle exists --> supersequence is not possible without repeating characters
        return Arrays.stream(degree).filter(deg -> deg > 0).findAny().isEmpty();
    }
}
