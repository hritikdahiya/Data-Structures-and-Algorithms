package com.interviewprep.bctci.chapter_35_Trees.Problem_35_9;

import com.interviewprep.bctci.chapter_35_Trees.Node;

import java.util.LinkedList;
import java.util.Queue;

public class MostProlificLevel {
    // could also be achieved if node count can be precomputed in a hashmap per depth
    public static <T> int getMostProlificLevel(Node<T> root) {
        if (root == null) {
            return -1;
        }

        int mostProlificLevel = 0, currentLevel = 0;
        float maxProlificValue = 0;

        Queue<Node<T>> bfsQueue = new LinkedList<>();
        bfsQueue.add(root);

        while (!bfsQueue.isEmpty()) {
            int currNodes = bfsQueue.size();
            Queue<Node<T>> childrenQueue = new LinkedList<>();
            while (!bfsQueue.isEmpty()) {
                Node<T> node = bfsQueue.poll();
                if (node.left != null) {
                    childrenQueue.add(node.left);
                }
                if (node.right != null) {
                    childrenQueue.add(node.right);
                }
            }
            int childrenCount = childrenQueue.size();

            float prolificness = childrenCount / (float) currNodes;
            if (prolificness > maxProlificValue) {
                maxProlificValue = prolificness;
                mostProlificLevel = currentLevel;
            }

            bfsQueue = childrenQueue;
            currentLevel++;
        }

        return mostProlificLevel;
    }
}
