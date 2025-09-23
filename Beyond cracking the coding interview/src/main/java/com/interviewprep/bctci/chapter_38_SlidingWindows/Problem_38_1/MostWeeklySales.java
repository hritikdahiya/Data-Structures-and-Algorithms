package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_1;

public class MostWeeklySales {
    public static int calculate(int[] sales) {
        int l = 0, r = 0;
        int currSales = 0, maxSales = 0;
        while (r < sales.length) {
            currSales += sales[r++];
            // when the window is achieved, optimize
            if (r - l == 7) {
                maxSales = Math.max(currSales, maxSales);
                currSales -= sales[l++];
            }
        }

        return maxSales;
    }
}
