package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_6;

public class MergeTwoSortedArrays {
    public static int[] merge(int[] a1, int[] a2) {
        int n1 = a1.length, n2 = a2.length;
        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            merged[k++] = a1[i] < a2[j] ? a1[i++] : a2[j++];
        }
        while (i < n1) {
            merged[k++] = a1[i++];
        }
        while (j < n2) {
            merged[k++] = a2[j++];
        }

        return merged;
    }
}
