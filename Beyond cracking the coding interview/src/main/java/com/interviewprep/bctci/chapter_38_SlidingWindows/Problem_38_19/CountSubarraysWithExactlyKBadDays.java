package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_19;

import com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_18.CountSubarraysWithAtMostKBadDays;

public class CountSubarraysWithExactlyKBadDays {
    public static int countReusingAtMostKSolution(int[] sales, int k) {
        if (k == 0) {
            return CountSubarraysWithAtMostKBadDays.count(sales, k);
        }

        return CountSubarraysWithAtMostKBadDays.count(sales, k) - CountSubarraysWithAtMostKBadDays.count(sales, k - 1);
    }

    public static int count(int[] sales, int k) {
        int badDays = 0, subArrayCount = 0;
        int l = 0, r = 0;
        while (true) {
            // good day -> expand window
            if (r < sales.length && sales[r] >= 10) {
                r++;
            }
            // at the end of the window OR bad day but #badDays < k -> expand window
            else if (badDays < k) {
                // break out if at the end of the window and #badDays < k
                if (r == sales.length) {
                    break;
                }
                badDays += 1;
                r++;
            }
            // at the end of the window OR #badDays == k -> shrink window to get smaller subarrays as well
            else {
                if (sales[l] < 10) {
                    badDays -= 1;
                }
                l++;
            }

            if (badDays == k) {
                subArrayCount += 1;
            }
        }

        return subArrayCount;
    }
}