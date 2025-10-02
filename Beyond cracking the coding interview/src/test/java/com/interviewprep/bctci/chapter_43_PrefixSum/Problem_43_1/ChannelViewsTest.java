package com.interviewprep.bctci.chapter_43_PrefixSum.Problem_43_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ChannelViewsTest {

    @Test
    public void channelViewsTest() {
        int[] views = new int[]{5};
        int[][] queries = new int[][]{
                new int[]{0, 0}
        };
        int[] expectedResponses = new int[]{5};
        Assertions.assertArrayEquals(expectedResponses, ChannelViews.getViews(views, queries));


        views = new int[]{3, 5, 4, 8, 7, 2, 5, 3, 2, 3};
        queries = new int[][]{
                new int[]{0, 1},
                new int[]{0, 5},
                new int[]{5, 8},
                new int[]{3, 3}
        };
        expectedResponses = new int[]{8, 29, 12, 8};
        Assertions.assertArrayEquals(expectedResponses, ChannelViews.getViews(views, queries));

    }
}