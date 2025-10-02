package com.interviewprep.bctci.chapter_43_PrefixSum.Problem_43_9;

public class MostBookedSlot {
    public static int findMostBookedSlot(int[] slots, int[][] bookings) {
        for (int[] booking : bookings) {
            // booking tuple - start, end, #bookings
            int start = booking[0], end = booking[1], count = booking[2];
            slots[start] += count;
            if (end + 1 < slots.length) {
                slots[end + 1] -= count;
            }
        }

        int mostBookedSlotIndex = -1, maxBooking = 0;
        for (int i = 1; i < slots.length; i++) {
            slots[i] += slots[i - 1];
            if (slots[i] > maxBooking) {
                maxBooking = slots[i];
                mostBookedSlotIndex = i;
            }
        }

        return mostBookedSlotIndex;
    }
}
