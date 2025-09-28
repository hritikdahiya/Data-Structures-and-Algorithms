package com.interviewprep.bctci.chapter_39_BackTracking.Problem_39_3;

import java.util.ArrayList;
import java.util.List;

public class PermutationEnumeration {
    public static <T> List<List<T>> enumerate(List<T> arr) {
        List<List<T>> permutations = new ArrayList<>();
        boolean[] visited = new boolean[arr.size()];

        enumerateHelper(arr, visited, new ArrayList<>(), permutations);

        return permutations;
    }

    private static <T> void enumerateHelper(List<T> arr, boolean[] visited, List<T> permutation, List<List<T>> permutations) {
        if (permutation.size() == arr.size()) {
            permutations.add(List.copyOf(permutation));
            return;
        }

        // for all elements which have not been visited, add them to the permutation, mark them visited and move on
        // clean up after the iteration
        for (int i = 0; i < arr.size(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                permutation.add(arr.get(i));

                enumerateHelper(arr, visited, permutation, permutations);

                permutation.remove(permutation.size() - 1);
                visited[i] = false;
            }
        }

    }

}
