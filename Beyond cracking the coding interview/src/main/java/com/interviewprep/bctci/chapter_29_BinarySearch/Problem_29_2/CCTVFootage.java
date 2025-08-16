package com.interviewprep.bctci.chapter_29_BinarySearch.Problem_29_2;

interface API {
    boolean is_stolen(int time);
}

public class CCTVFootage {
    // using int timestamps for the sake of the problem
    // The API object method is passed for testing convenience, ideally is would be an external object.
    // Returns Integer.MIN_VALUE for invalid cases
    public static int findTransitionPoint(final int t1, final int t2, API api) {
        // Enforce assumption that t1 < t2 && is_stolen(t1) == false && is_stolen(t2) == true
        if (t1 >= t2 || api.is_stolen(t1) || !api.is_stolen(t2)) {
            return Integer.MIN_VALUE;
        }

        int startTime = t1, endTime = t2;
        // Run loop till the times are adjacent to each other
        while (endTime - startTime > 1) {
            int midpointTime = startTime + (endTime - startTime) / 2;

            boolean isStolen = api.is_stolen(midpointTime);

            if (isStolen) {
                endTime = midpointTime;
            } else {
                startTime = midpointTime;
            }
        }

        // return the time of bike being stolen i.e. right of the transition point
        return endTime;
    }

    // Deck cut variation problem
    public static int findDeckCutIndex(int[] deck) {
        // Assumption - deck is 52 len.

        // Edge case [1,2,.....51,52] - when the deck is already sorted
        if (deck[0] < deck[51]) {
            return 51;
        }

        // The transition point's left element is 52 and right 1.
        // before transition point, all elements are > deck[s]
        // after transition point, all elements are < deck[s]
        int s = 0, e = 51;
        while (e - s > 1) {
            int mid = s + (e - s) / 2;

            if (deck[mid] > deck[s]) {
                s = mid;
            } else {
                e = mid;
            }
        }

        // we reach a point where s points to 52 and e points to 1
        return s;
    }

}
