package com.interviewprep.bctci.chapter_35_Trees.Problem_35_17;

import com.interviewprep.bctci.chapter_35_Trees.Node;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class BSTMergeIntoArray {
    public static <T> List<T> merge(Node<T> bst1, Node<T> bst2, Comparator<T> comparator) {
        List<T> bst1Inorder = new ArrayList<>(), bst2Inorder = new ArrayList<>();

        traverseInorder(bst1, bst1Inorder);
        traverseInorder(bst2, bst2Inorder);

        return mergeSortedLists(bst1Inorder, bst2Inorder, comparator);
    }

    private static <T> void traverseInorder(Node<T> root, List<T> list) {
        if (root == null) {
            return;
        }

        traverseInorder(root.left, list);
        list.add(root.val);
        traverseInorder(root.right, list);
    }

    private static <T> List<T> mergeSortedLists(List<T> list1, List<T> list2, Comparator<T> comparator) {
        List<T> mergedList = new ArrayList<>();

        int i = 0, j = 0, n1 = list1.size(), n2 = list2.size();
        while (i < n1 && j < n2) {
            mergedList.add(Objects.compare(list1.get(i), list2.get(j), comparator) < 0 ? list1.get(i++) : list2.get(j++));
        }
        while (i < n1) {
            mergedList.add(list1.get(i++));
        }
        while (j < n2) {
            mergedList.add(list2.get(j++));
        }

        return mergedList;
    }
}
