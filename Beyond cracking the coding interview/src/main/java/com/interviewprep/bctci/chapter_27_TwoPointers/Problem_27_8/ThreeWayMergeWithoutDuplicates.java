package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_8;

import java.util.ArrayList;
import java.util.List;

public class ThreeWayMergeWithoutDuplicates {
    // Cleaner code implementation
    public static int[] merge(int[] a, int[] b, int[] c) {
        int n1 = a.length, n2 = b.length, n3 = c.length;

        List<Integer> merged = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        while (i < n1 || j < n2 || k < n3) {
            // Find which array has the smallest element at their corresponding iterator (i,j,k) (conscious of index put of bounds)
            int smallestValue = Integer.MAX_VALUE;
            if (i < n1 && a[i] < smallestValue) {
                smallestValue = a[i];
            }
            if (j < n2 && b[j] < smallestValue) {
                smallestValue = b[j];
            }
            if (k < n3 && c[k] < smallestValue) {
                smallestValue = c[k];
            }

            if (i < n1 && smallestValue == a[i]) {
                i++;
            }
            if (j < n2 && smallestValue == b[j]) {
                j++;
            }
            if (k < n3 && smallestValue == c[k]) {
                k++;
            }

            if (merged.isEmpty() || merged.get(merged.size() - 1) != smallestValue) {
                merged.add(smallestValue);
            }
        }

        return merged.stream().mapToInt(Integer::valueOf).toArray();
    }


    /* My default implementation */
//    public static int[] merge(int[] a, int[] b, int[] c) {
//        int n1 = a.length, n2 = b.length, n3 = c.length;
//
//        List<Integer> merged = new ArrayList<>();
//        int i = 0, j = 0, k = 0;
//        while (i < n1 || j < n2 || k < n3) {
//            // Find which array has the smallest element at their corresponding iterator (i,j,k) (conscious of index put of bounds)
//            int[] arrWithSmallestElement;
//            int minValue;
//            if (i < n1) {
//                arrWithSmallestElement = a;
//                minValue = a[i];
//                if (j < n2) {
//                    if (b[j] < a[i]) {
//                        arrWithSmallestElement = b;
//                        minValue = b[j];
//                    }
//                }
//
//                if (k < n3) {
//                    if (c[k] < minValue) {
//                        arrWithSmallestElement = c;
//                        minValue = c[k];                // redundant
//                    }
//                }
//            } else if (j < n2) {
//                arrWithSmallestElement = b;
//                minValue = b[j];
//                if (k < n3) {
//                    if (c[k] < minValue) {
//                        arrWithSmallestElement = c;
//                        minValue = c[k];                // redundant
//                    }
//                }
//            } else {
//                // this condition implicitly implies that k < n3
//                arrWithSmallestElement = c;
//                minValue = c[k];
//            }
//
//            // compare the reference of the array pointer (in O(1) time), not the actual array content
//            if (arrWithSmallestElement == a) {
//                if (merged.isEmpty() || merged.get(merged.size() - 1) != a[i]) {
//                    merged.add(a[i]);
//                }
//                i++;
//            } else if (arrWithSmallestElement == b) {
//                if (merged.isEmpty() || merged.get(merged.size() - 1) != b[j]) {
//                    merged.add(b[j]);
//                }
//                j++;
//            } else {
//                if (merged.isEmpty() || merged.get(merged.size() - 1) != c[k]) {
//                    merged.add(c[k]);
//                }
//                k++;
//            }
//        }
//
//        return merged.stream().mapToInt(Integer::valueOf).toArray();
//    }

}
