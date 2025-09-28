package com.interviewprep.bctci.chapter_39_BackTracking.Problem_39_2;

import java.util.ArrayList;
import java.util.List;

public class SubsetEnumeration {
    public static <T> List<List<T>> enumerate(List<T> set) {
        List<List<T>> subsets = new ArrayList<>();

        enumerateHelper(set, 0, new ArrayList<>(), subsets);

        return subsets;
    }

    private static <T> void enumerateHelper(List<T> set, int currIndex, List<T> subset, List<List<T>> subsets) {
        // base case, reached to the end of the set
        if (currIndex == set.size()) {
            subsets.add(List.copyOf(subset));
            return;
        }

        // choice 1 - do not include current element in the subset
        enumerateHelper(set, currIndex + 1, subset, subsets);
        // choice 2 - include current element in the subset
        subset.add(set.get(currIndex));
        enumerateHelper(set, currIndex + 1, subset, subsets);
        subset.remove(subset.size() - 1);
    }
}
