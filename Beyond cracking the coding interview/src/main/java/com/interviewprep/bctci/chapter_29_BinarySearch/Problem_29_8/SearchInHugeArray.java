package com.interviewprep.bctci.chapter_29_BinarySearch.Problem_29_8;

interface API {
    long fetch(long index);
}
public class SearchInHugeArray {
    public static long findElementInArray(API api, long target) {
        long s = 0, e = 1;
        // find the length of the array (or at least slightly larger than actual length of array)
        while(api.fetch(e) != -1) {
            e = 2 * e;
        }

        if(api.fetch(s) == target) {
            return s;
        }
        while (e - s > 1) {
            long mid = s + (e-s)/2;
            long valueAtMid = api.fetch(mid);

            if(valueAtMid > -1 && valueAtMid < target) {
                s = mid;
            } else {
                e = mid;
            }
        }

        return api.fetch(e) == target ? e : -1L;
    }
}
