package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FloorIsLava {
    public static boolean canCrossFloor(List<List<Double>> furniture, double maxJump) {
        List<List<Integer>> graph = buildGraphFromFurnitureCoordinates(furniture, maxJump);

        // DFS from 0 and check if last node is reachable or not
        Set<Integer> visited = new HashSet<>();
        visited.add(0);

        dfs(graph, 0, visited);

        return visited.contains(furniture.size() - 1);
    }

    private static List<List<Integer>> buildGraphFromFurnitureCoordinates(List<List<Double>> furniture, double maxJump) {
        int size = furniture.size();
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (isReachable(furniture.get(i), furniture.get(j), maxJump)) {
                    adjList.get(i).add(j);
                    adjList.get(j).add(i);
                }
            }
        }

        return adjList;
    }

    private static boolean isReachable(List<Double> furnitureA, List<Double> furnitureB, double maxJump) {
        double xMinA = furnitureA.get(0), yMinA = furnitureA.get(1), xMaxA = furnitureA.get(2), yMaxA = furnitureA.get(3);
        double xMinB = furnitureB.get(0), yMinB = furnitureB.get(1), xMaxB = furnitureB.get(2), yMaxB = furnitureB.get(3);

        double xGap = Math.max(0, Math.max(xMinA, xMinB) - Math.min(xMaxA, xMaxB));
        double yGap = Math.max(0, Math.max(yMinA, yMinB) - Math.min(yMaxA, yMaxB));

        double distance = Math.sqrt(Math.pow(xGap, 2) + Math.pow(yGap, 2));

        return distance <= maxJump;
    }

    private static void dfs(List<List<Integer>> graph, Integer currNode, Set<Integer> visited) {
        for (int i = 0; i < graph.get(currNode).size(); i++) {
            Integer neighbor = graph.get(currNode).get(i);
            if (!visited.contains(neighbor)) {
                visited.add(neighbor);
                dfs(graph, neighbor, visited);
            }
        }
    }
}
