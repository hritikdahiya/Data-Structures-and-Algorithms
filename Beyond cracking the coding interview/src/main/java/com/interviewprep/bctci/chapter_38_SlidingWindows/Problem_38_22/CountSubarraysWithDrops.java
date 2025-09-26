package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_22;

public class CountSubarraysWithDrops {
    public static int[] count(int[] arr, int k) {
        return new int[]{
                findAtMostKDrops(arr, k),
                findExactlyKDrops(arr, k),
                findAtLeastKDrops(arr, k),
        };
    }

    private static int findAtMostKDrops(int[] arr, int k) {
        int l = 0, r = 0;
        int drops = 0, count = 0;

        while (r < arr.length) {
            boolean growWindow = r == 0 || arr[r] >= arr[r - 1] || drops < k;
            if (growWindow) {
                if (r > 0 && arr[r] < arr[r - 1]) {
                    drops++;
                }
                r++;
                count += (r - l);
            } else {
                if (arr[l] > arr[l + 1]) {
                    drops--;
                }
                l++;
            }
        }
        return count;
    }

    private static int findExactlyKDrops(int[] arr, int k) {
        if (k == 0) {
            return findAtMostKDrops(arr, 0);
        }

        return findAtMostKDrops(arr, k) - findAtMostKDrops(arr, k - 1);
    }


    private static int findAtLeastKDrops(int[] arr, int k) {
        int n = arr.length;
        int max = Math.floorDiv(n * (n + 1), 2);
        if (k == 0) {
            return max;
        }

        return max - findAtMostKDrops(arr, k - 1);
    }


}
