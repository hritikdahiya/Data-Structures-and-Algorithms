package com.interviewprep.bctci.chapter_32_StacksAndQueues.Problem_32_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ViewerCounterTest {
    @Test
    public void viewerCounterTest() {
        ViewerCounter viewerCounter = new ViewerCounter(10);

        Assertions.assertEquals(0, viewerCounter.getViewers(5, ViewerType.FOLLOWER));
        Assertions.assertEquals(0, viewerCounter.getViewers(5, ViewerType.GUEST));
        Assertions.assertEquals(0, viewerCounter.getViewers(5, ViewerType.SUBSCRIBER));

        viewerCounter.join(1, ViewerType.SUBSCRIBER);
        viewerCounter.join(1, ViewerType.GUEST);
        viewerCounter.join(2, ViewerType.FOLLOWER);
        viewerCounter.join(2, ViewerType.FOLLOWER);
        viewerCounter.join(2, ViewerType.FOLLOWER);
        viewerCounter.join(3, ViewerType.FOLLOWER);

        Assertions.assertEquals(1, viewerCounter.getViewers(10, ViewerType.SUBSCRIBER));
        Assertions.assertEquals(1, viewerCounter.getViewers(10, ViewerType.GUEST));
        Assertions.assertEquals(4, viewerCounter.getViewers(10, ViewerType.FOLLOWER));
        Assertions.assertEquals(1, viewerCounter.getViewers(13, ViewerType.FOLLOWER));
    }
}