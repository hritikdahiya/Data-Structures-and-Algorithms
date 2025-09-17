package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_12;

import java.util.*;

public class DaysUntilAllInfected {
    public static int findDDay(List<List<Integer>> graph, List<Integer> infectedNodes) {
        if (infectedNodes.isEmpty()) {
            return Integer.MAX_VALUE;
        }

        Map<Integer, Integer> distanceMap = new HashMap<>();
        Queue<Map.Entry<Integer, Integer>> bfsQueue = new LinkedList<>();
        for (Integer infected : infectedNodes) {
            bfsQueue.add(new AbstractMap.SimpleEntry<>(infected, 0));
            distanceMap.put(infected, 0);
        }

        int maxValue = 0;
        while (!bfsQueue.isEmpty()) {
            Map.Entry<Integer, Integer> entry = bfsQueue.poll();
            int node = entry.getKey(), day = entry.getValue();
            maxValue = Math.max(maxValue, day);

            for (int i = 0; i < graph.get(node).size(); i++) {
                int neighbor = graph.get(node).get(i);
                if (!distanceMap.containsKey(neighbor)) {
                    distanceMap.put(neighbor, day + 1);
                    bfsQueue.add(new AbstractMap.SimpleEntry<>(neighbor, day + 1));
                }
            }
        }

        return maxValue;
    }
}
