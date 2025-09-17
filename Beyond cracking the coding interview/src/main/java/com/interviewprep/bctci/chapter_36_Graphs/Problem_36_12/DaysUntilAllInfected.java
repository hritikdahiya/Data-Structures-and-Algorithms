package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_12;

import java.util.*;

public class DaysUntilAllInfected {
    public static int findDDay(List<List<Integer>> graph, List<Integer> infectedNodes) {
        if (infectedNodes.isEmpty()) {
            return Integer.MAX_VALUE;
        }

        Map<Integer, Integer> distanceMap = new HashMap<>();
        Queue<Integer> bfsQueue = new LinkedList<>();
        for (Integer infected : infectedNodes) {
            bfsQueue.add(infected);
            distanceMap.put(infected, 0);
        }

        int maxValue = 0;
        while (!bfsQueue.isEmpty()) {
            int node = bfsQueue.poll();
            int infectionDay = distanceMap.get(node);
            maxValue = Math.max(maxValue, infectionDay);

            for (int i = 0; i < graph.get(node).size(); i++) {
                int neighbor = graph.get(node).get(i);
                if (!distanceMap.containsKey(neighbor)) {
                    distanceMap.put(neighbor, infectionDay + 1);
                    bfsQueue.add(neighbor);
                }
            }
        }

        return maxValue;
    }
}
