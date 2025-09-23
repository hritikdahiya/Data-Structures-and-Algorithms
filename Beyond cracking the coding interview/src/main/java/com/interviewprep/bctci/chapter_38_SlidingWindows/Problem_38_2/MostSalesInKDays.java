package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_2;

public class MostSalesInKDays {

    public static int calculate(int[] sales, int k) {
        int l = 0, r = 0;
        int currSales = 0, maxSales = 0, periodStart = -1;
        while (r < sales.length) {
            currSales += sales[r++];
            // when the window is achieved, optimize
            if (r - l == k) {
                if (currSales > maxSales) {
                    maxSales = currSales;
                    periodStart = l;
                }
                currSales -= sales[l++];
            }
        }

        return periodStart;
    }
}
