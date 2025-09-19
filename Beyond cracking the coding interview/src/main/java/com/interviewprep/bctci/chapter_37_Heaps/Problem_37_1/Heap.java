package com.interviewprep.bctci.chapter_37_Heaps.Problem_37_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Heap<T extends Comparable<T>> {
    private final List<T> elements;
    private final Comparator<T> comparator;

    Heap(List<T> elements, Comparator<T> higherPriority) {
        this.comparator = higherPriority;
        if (elements.isEmpty()) {
            this.elements = new ArrayList<>();
        } else {
            this.elements = new ArrayList<>(elements);
            heapify();
        }
    }

    public void push(T ele) {
        elements.add(ele);
        siftUp(size() - 1);
    }

    public T pop() {
        if (size() > 0) {
            // swap the first and last element
            Collections.swap(elements, 0, size() - 1);
            // remove the last element (to be returned)
            T poppedEle = elements.remove(size() - 1);
            // sift the top element down to maintain heap property
            if (!elements.isEmpty()) {
                siftDown(0);
            }
            return poppedEle;
        }
        return null;
    }

    public T top() {
        if (size() > 0) {
            return elements.get(0);
        }
        return null;
    }

    public int size() {
        return elements.size();
    }

    private void siftUp(int index) {
        while (index > 0) {
            int parentIndex = Math.floorDiv(index - 1, 2);
            // if ele at index has higher priority than parent, swap current and parent
            if (comparator.compare(elements.get(index), elements.get(parentIndex)) < 0) {
                Collections.swap(elements, index, parentIndex);
                index = parentIndex;
            }
            // break the process if current element has lower priority than parent (heap property is achieved)
            else {
                break;
            }
        }
    }

    private void siftDown(int index) {
        while (index < size()) {
            int leftChildIndex = 2 * index + 1, rightChildIndex = 2 * index + 2;
            int higherPriorityChildIndex;
            if (rightChildIndex >= size()) {
                // leaf node
                if (leftChildIndex >= size()) {
                    return;
                }
                // only left child available
                higherPriorityChildIndex = leftChildIndex;
            } else {
                // find the child which has higher priority
                higherPriorityChildIndex = comparator.compare(elements.get(leftChildIndex), elements.get(rightChildIndex)) < 0 ? leftChildIndex : rightChildIndex;
            }

            // higher priority child has a higher priority than parent (or index), swap them and check on the left child
            if (comparator.compare(elements.get(higherPriorityChildIndex), elements.get(index)) < 0) {
                Collections.swap(elements, higherPriorityChildIndex, index);
                index = higherPriorityChildIndex;
            }
            // heap property is attained
            else {
                break;
            }
        }
    }

    // start from the last non-eaf node and siftItDown
    // repeat for every node before it
    private void heapify() {
        int parentIndex = Math.floorDiv((size() - 1) - 1, 2);
        while (parentIndex >= 0) {
            siftDown(parentIndex);
            parentIndex--;
        }
    }
}