package com.interviewprep.bctci.chapter_29_BinarySearch.Problem_29_12;

import java.util.List;

public class TideAerialView {
    // Binary search on pictures to find the drowned to undrowned ratio
    // Transition point being ratio changing from <0.5 to >= 0.5

    // T - O(logK * n * logn), where n = size of a picture, k = number of pictures
    public static int findBalancedPicture(List<Integer[][]> pictures) {
        int numPictures = pictures.size();
        if (numPictures == 1) {
            return 0;
        }

        int s = 0, e = numPictures;
        while (e - s > 1) {
            int mid = s + (e - s) / 2;

            if (drownedRatio(pictures.get(mid)) < 0.5) {
                s = mid;
            } else {
                e = mid;
            }
        }

        float drownedRatioOfS = drownedRatio(pictures.get(s));
        float drownedRatioOfE = drownedRatio(pictures.get(e));

        return Math.abs(drownedRatioOfS - 0.5) <= Math.abs(drownedRatioOfE - 0.5) ? s : e;
    }

    // calculate a drowned ratio in O(nlogn)
    private static float drownedRatio(Integer[][] picture) {
        int n = picture.length;
        int drownedCount = 0;
        for (int r = 0; r < n; r++) {
            int s = 0, e = n - 1;
            if (picture[r][s] == 0) {
                continue;
            }
            if (picture[r][e] == 1) {
                drownedCount += n;
                continue;
            }

            while (e - s > 1) {
                int mid = (s + e) / 2;
                if (picture[r][mid] == 0) {
                    e = mid;
                } else {
                    s = mid;
                }
            }

            drownedCount += e;
        }

        return drownedCount / (1f * n * n);
    }
}
