package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_13;

import static com.interviewprep.bctci.chapter_27_TwoPointers.Utility.swap;

public class ParitySorting {
    public static void evenBeforeOdd(int[] arr) {
        // inward pointers approach - both points move in opposite directions
        // l pointer moves to the right till it find an odd number, and
        // r pointer moves to the left till it finds an even number to swap with each other
        int l = 0, r = arr.length - 1;
        while (l < r) {
            if (arr[l] % 2 == 0) {
                l++;
            } else if (arr[r] % 2 == 1) {
                r--;
            } else {
                swap(arr, l, r);
                l++;
                r--;
            }
        }
    }

    public static void evenBeforeOddSlowPointer(int[] arr) {
        // Writer seeker pointer approach - both pointers move in the same direction
        // seeker pointer moves to the right till it find an even number,
        // writer pointer points to the position to swap with seeker pointer
        int writer = 0, seeker = 0;
        while (seeker < arr.length) {
            if (arr[writer] % 2 == 0) {
                writer++;
                seeker++;
            } else if (arr[seeker] % 2 == 1) {
                seeker++;
            } else {
                swap(arr, writer, seeker);
                writer++;
                seeker++;
            }
        }
    }
}
