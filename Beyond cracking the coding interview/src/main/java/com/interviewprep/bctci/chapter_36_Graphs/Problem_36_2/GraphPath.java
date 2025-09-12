package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_2;

import java.util.*;

public class GraphPath {
    // Create a pth as we search
    public static List<Integer> findSimplePathDFS(List<List<Integer>> graph, Integer source, Integer destination) {
        LinkedList<Integer> path = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        dfsHelper(graph, source, destination, visited, path);

        return path;
    }

    private static boolean dfsHelper(List<List<Integer>> graph, Integer currNode, Integer destination, Set<Integer> visited, LinkedList<Integer> path) {
        if (visited.contains(currNode)) {
            return false;
        }

        visited.add(currNode);
        path.addLast(currNode);
        if (Objects.equals(currNode, destination)) {
            return true;
        }

        for (Integer neighbor : graph.get(currNode)) {
            boolean found = dfsHelper(graph, neighbor, destination, visited, path);
            if (found) {
                return true;
            }
        }

        // if no path from curr, remove it from path
        path.removeLast();
        return false;
    }


    // Create a path after the search from predecessor map
    public static List<Integer> findSimplePathDFSWithPredecessorMap(List<List<Integer>> graph, Integer source, Integer destination) {
        Map<Integer, Integer> predecessorMap = new HashMap<>();

        predecessorMap.put(destination, null);
        // searching from destination to source
        dfsPredecessorHelper(graph, destination, source, predecessorMap);

        // could not find a path from dest to source
        if (!predecessorMap.containsKey(source)) {
            return new ArrayList<>();
        }

        // create path from source to destination using predecessorMap
        List<Integer> path = new ArrayList<>();
        path.add(source);
        while (!Objects.equals(source, destination)) {
            Integer next = predecessorMap.get(source);
            path.add(next);
            source = next;
        }

        return path;
    }

    private static void dfsPredecessorHelper(List<List<Integer>> graph, Integer currNode, Integer destination, Map<Integer, Integer> predecessorMap) {
        if (Objects.equals(currNode, destination)) {
            return;
        }
        for (Integer neighbor : graph.get(currNode)) {
            if (!predecessorMap.containsKey(neighbor)) {
                predecessorMap.put(neighbor, currNode);
                dfsPredecessorHelper(graph, neighbor, destination, predecessorMap);
            }
        }
    }
}
