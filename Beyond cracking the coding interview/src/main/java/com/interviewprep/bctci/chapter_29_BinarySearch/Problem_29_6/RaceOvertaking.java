package com.interviewprep.bctci.chapter_29_BinarySearch.Problem_29_6;

public class RaceOvertaking {
    // Assumptions:
    // player 2 for sure overtook player 1 once, and remained ahead after it
    public static int findOvertakingPoint(int[] p1, int[] p2) {
        int start = 0, end = p1.length - 1;
        // Find transition point (TP) where for every index before it, p1[i] > p2[i]
        if(p1[start] < p2[start]) {
            // player 2 is ahead at the beginning
            return start;
        }
        if(p1[end] > p2[end]) {
            // player 2 never overtook player 1
            return end + 1;
        }

        // while
        while(end - start > 1) {
            int mid = start + (end- start) / 2;
            if(p1[mid] > p2[mid]) {
                // Mid is before TP
                start = mid;
            } else {
                // Mid is after TP
                end = mid;
            }
        }

        return end;
    }
}
