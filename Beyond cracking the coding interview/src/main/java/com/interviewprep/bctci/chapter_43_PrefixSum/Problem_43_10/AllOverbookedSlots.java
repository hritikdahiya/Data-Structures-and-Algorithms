package com.interviewprep.bctci.chapter_43_PrefixSum.Problem_43_10;

public class AllOverbookedSlots {
    public static int findCountOfOverbookedSlots(int[] slots, int[][] bookings, int cap) {
        for (int[] booking : bookings) {
            // booking tuple - start, end, #bookings
            int start = booking[0], end = booking[1], count = booking[2];
            slots[start] += count;
            if (end + 1 < slots.length) {
                slots[end + 1] -= count;
            }
        }

        int overbookedSlots = 0;
        for (int i = 1; i < slots.length; i++) {
            slots[i] += slots[i - 1];
            if (slots[i] > cap) {
                overbookedSlots += 1;
            }
        }

        return overbookedSlots;
    }
}
