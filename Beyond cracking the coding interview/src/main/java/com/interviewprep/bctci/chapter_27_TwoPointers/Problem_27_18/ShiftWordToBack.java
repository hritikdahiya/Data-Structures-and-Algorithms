package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_18;

public class ShiftWordToBack {
    public static void shift(char[] arr, String word) {
        int n1 = arr.length;
        int n2 = word.length();

        if (n2 < 1) {
            // no changes in the arr required
            return;
        }

        int p1Seeker = 0, p1Writer = 0, p2 = 0;
        while (p1Seeker < n1) {
            if (p2 < n2) {
                if (arr[p1Seeker] == word.charAt(p2)) {
                    p1Seeker++;
                    p2++;
                } else {
                    arr[p1Writer++] = arr[p1Seeker++];
                }
            } else {
                arr[p1Writer++] = arr[p1Seeker++];
            }
        }

        p2 = 0;
        // we are sure that p1Writer has n2 characters left till it's end (exactly the length of word)
        while (p1Writer < n1 && p2 < n2) {
            arr[p1Writer++] = word.charAt(p2++);
        }
    }
}
