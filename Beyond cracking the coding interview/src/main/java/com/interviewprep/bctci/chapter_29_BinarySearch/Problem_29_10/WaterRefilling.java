package com.interviewprep.bctci.chapter_29_BinarySearch.Problem_29_10;

public class WaterRefilling {
    // CONSTRAINT - Not allowed to use division operator
    public static int findNumberOfPours(int a, int b) {
        // we need to find the largest multiplier for b such that multiplier * b <= a

        // smallest possible multiplier
        int s = 1;
        // find the largest multiplier so that multiplier * b >= a.
        // double the multiplier value to get a big enough number
        int e = 1;
        while(e * b < a) {
            e *= 2;
        }

        // base check - if the end is a multiplier which equals `a`, that is the best possible solution
        if(e * b == a) {
            return e;
        }

        // Binary search between s and e to find the optimal multiplier
        while(e - s > 1) {
            int mid = (s + e) >> 1;

            if(mid * b > a) {
                e = mid;
            } else {
                s = mid;
            }
        }

        return s;
    }

}
