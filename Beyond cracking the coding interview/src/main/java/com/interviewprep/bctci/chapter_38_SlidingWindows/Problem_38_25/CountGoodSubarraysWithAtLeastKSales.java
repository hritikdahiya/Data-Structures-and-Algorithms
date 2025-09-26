package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_25;

public class CountGoodSubarraysWithAtLeastKSales {
    public static int count(int[] sales, int k) {
        int l = 0, r = 0, totalCount = 0;
        while (r < sales.length) {
            if (sales[r] < 10) {
                if (r > l) {
                    int subArrayLen = r - l;
                    int atLeastKSumCount = Math.floorDiv(subArrayLen * (subArrayLen + 1), 2) - findSubarrayCountWithAtMostKSales(sales, l, r, k - 1);
                    totalCount += atLeastKSumCount;
                }
                l = r = r + 1;
            } else {
                r++;
            }
        }

        if (l < r) {
            int subArrayLen = r - l;
            int atLeastKSumCount = Math.floorDiv(subArrayLen * (subArrayLen + 1), 2) - findSubarrayCountWithAtMostKSales(sales, l, r, k - 1);
            totalCount += atLeastKSumCount;
        }

        return totalCount;
    }

    private static int findSubarrayCountWithAtMostKSales(int[] sales, int s, int e, int k) {
        if (s >= e) {
            return 0;
        }

        int l = s, r = s, sum = 0, count = 0;
        while (r < e) {
            if (sum + sales[r] < k) {
                sum += sales[r];
                r++;
                count += r - l;
            } else {
                sum -= sales[l];
                l++;
            }
        }

        return count;
    }
}
