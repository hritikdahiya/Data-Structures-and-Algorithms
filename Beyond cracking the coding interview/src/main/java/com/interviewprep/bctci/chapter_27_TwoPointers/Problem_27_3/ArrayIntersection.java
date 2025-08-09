package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_3;

import java.util.ArrayList;
import java.util.List;

public class ArrayIntersection {
    public static Integer[] findArrayIntersection(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        if (n1 == 0 || n2 == 0) {
            return new Integer[0];
        }

        int it1 = 0, it2 = 0;
        List<Integer> intersection = new ArrayList<>();
        while (it1 < n1 && it2 < n2) {
            if (arr1[it1] == arr2[it2]) {
                intersection.add(arr1[it1]);
                it1++;
                it2++;
            } else if (arr1[it1] < arr2[it2]) {
                it1++;
            } else {
                it2++;
            }
        }
        return intersection.toArray(new Integer[0]);
    }
}
