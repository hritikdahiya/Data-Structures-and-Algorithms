package com.interviewprep.bctci.chapter_UnionFind.Problem_2;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;

public class CustomUnionFind<V> {
    private int count;
    private final Map<V, V> parent;
    private final Map<V, Integer> rank;

    public CustomUnionFind() {
        this.count = 0;
        this.parent = new HashMap<>();
        this.rank = new HashMap<>();
    }

    public void add(V ele) {
        parent.putIfAbsent(ele, ele);
        rank.putIfAbsent(ele, 1);
        this.count++;
    }

    // Optimization - Path compression
    public V find(V ele) {
        if (!parent.containsKey(ele)) {
            throw new NoSuchElementException();
        }

        V root = ele;
        while (parent.get(root) != root) {
            root = parent.get(root);
        }

        // Path compression - to reduce the tree height for faster finds
        // Set the parent of all the elements in the path (from "ele" to "root") to be "root"
        while (parent.get(ele) != root) {
            V currParent = parent.get(ele);
            parent.put(ele, root);
            ele = currParent;
        }

        return root;
    }

    // Optimization - union by rank (could be by size as well)
    public void union(V x, V y) {
        V xRoot = find(x);
        V yRoot = find(y);

        if (!Objects.equals(xRoot, yRoot)) {
            int xRank = rank.get(xRoot);
            int yRank = rank.get(yRoot);

            if (xRank < yRank) {
                parent.put(xRoot, yRoot);
                rank.remove(xRoot);
            } else if (xRank == yRank) {
                parent.put(xRoot, yRoot);
                rank.put(yRoot, yRank + 1);
                rank.remove(xRoot);
            } else {
                parent.put(yRoot, xRoot);
                rank.remove(yRoot);
            }
        }
    }

    public int size() {
        return count;
    }

    public int numGroups() {
        return rank.size();
    }
}
