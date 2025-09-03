package com.interviewprep.bctci.chapter_33_Recursion.Problem_33_4;

public class LegoCastle {
    static int[] roofWidthCache = new int[1001];

    public static int calcBlocksRequired(int stories) {
        if (stories == 1) {
            return 1;
        }

        return 2 * calcBlocksRequired(stories - 1) + roofWidth(stories);
    }

    private static int roofWidth(int story) {
        if (story == 1) {
            return 1;
        }

        if (story < 1001 && roofWidthCache[story] > 0) {
            return roofWidthCache[story];
        }

        roofWidthCache[story] = 2 * roofWidth(story - 1) + 1;
        return roofWidthCache[story];
    }
}
