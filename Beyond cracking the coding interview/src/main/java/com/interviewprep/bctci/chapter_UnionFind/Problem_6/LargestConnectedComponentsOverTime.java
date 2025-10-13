package com.interviewprep.bctci.chapter_UnionFind.Problem_6;

import com.interviewprep.bctci.chapter_36_Graphs.Edge;
import lombok.Getter;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LargestConnectedComponentsOverTime {
    public static int[] find(int V, List<Edge> edges, int[] times) {
        edges.sort(Comparator.comparingDouble(Edge::weight));

        UnionFind unionFind = new UnionFind();
        for (int i = 0; i < V; i++) {
            unionFind.add(i);
        }

        int[] numConnectedComps = new int[times.length];
        int k = 0;
        for (int i = 0; i < times.length; i++) {
            int time = times[i];
            while (k < edges.size() && edges.get(k).weight() <= time) {
                int root1 = edges.get(k).sourceNode(), root2 = edges.get(k).destinationNode();
                if (root1 != root2) {
                    unionFind.union(edges.get(k).sourceNode(), edges.get(k).destinationNode());
                }
                k++;
            }

            numConnectedComps[i] = unionFind.getMaxComponentSize();
        }

        return numConnectedComps;
    }
}


class UnionFind {
    private final Map<Integer, Integer> parent;
    private final Map<Integer, Integer> size;
    @Getter
    private int maxComponentSize;

    public UnionFind() {
        parent = new HashMap<>();
        size = new HashMap<>();
        maxComponentSize = 0;
    }

    public void add(int ele) {
        parent.put(ele, ele);
        size.put(ele, 1);
        maxComponentSize = Math.max(maxComponentSize, 1);
    }

    public int find(int ele) {
        int root = ele;
        while (parent.get(root) != root) {
            root = parent.get(root);
        }

        // Path compression
        while (parent.get(ele) != ele) {
            int oldParent = parent.get(ele);
            parent.put(ele, root);
            ele = oldParent;
        }

        return root;
    }

    public void union(int x, int y) {
        int xRoot = find(x), yRoot = find(y);

        if (xRoot != yRoot) {
            Integer xRootSize = size.get(xRoot);
            Integer yRootSize = size.get(yRoot);

            if (xRootSize <= yRootSize) {
                parent.put(xRoot, yRoot);
                size.put(yRoot, yRootSize + xRootSize);
            } else {
                parent.put(yRoot, xRoot);
                size.put(xRoot, xRootSize + yRootSize);
            }
            maxComponentSize = Math.max(maxComponentSize, xRootSize + yRootSize);
        }
    }
}