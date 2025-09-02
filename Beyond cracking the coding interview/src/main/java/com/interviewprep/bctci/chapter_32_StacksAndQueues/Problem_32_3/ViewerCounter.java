package com.interviewprep.bctci.chapter_32_StacksAndQueues.Problem_32_3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ViewerCounter {
    private final int window;
    private final Map<ViewerType, LinkedList<Integer[]>> viewerTypeDequeueMap;

    ViewerCounter(int window) {
        this.window = window;
        this.viewerTypeDequeueMap = new HashMap<>();
        viewerTypeDequeueMap.put(ViewerType.FOLLOWER, new LinkedList<>());
        viewerTypeDequeueMap.put(ViewerType.GUEST, new LinkedList<>());
        viewerTypeDequeueMap.put(ViewerType.SUBSCRIBER, new LinkedList<>());
    }

    public void join(int timestamp, ViewerType viewerType) {
        cleanOldViewers(timestamp);

        // Add a new timestamp in the dequeue or update the count of viewer if timestamp is duplicate
        LinkedList<Integer[]> dequeue = viewerTypeDequeueMap.get(viewerType);
        if (!dequeue.isEmpty() && dequeue.peekLast()[0] == timestamp) {
            dequeue.peekLast()[1]++;
        } else {
            dequeue.addLast(new Integer[]{timestamp, 1});
        }
    }

    public int getViewers(int timestamp, ViewerType viewerType) {
        cleanOldViewers(timestamp);

        // calculate the count of viewers at every timestamp between [t-window, t]
        return viewerTypeDequeueMap.get(viewerType).stream().mapToInt(value -> value[1]).sum();
    }

    private void cleanOldViewers(int timestamp) {
        for (LinkedList<Integer[]> dequeue : viewerTypeDequeueMap.values()) {
            while (!dequeue.isEmpty() && dequeue.peekFirst()[0] < timestamp - window) {
                dequeue.removeFirst();
            }
        }
    }
}
