package com.interviewprep.bctci.chapter_37_Heaps.Problem_37_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class HeapTest {

    @Test
    public void heapTest() {
        // max-heap
        Heap<Integer> maxHeap = new Heap<>(Arrays.asList(1, 8, 2, 6, 4), Collections.reverseOrder(Integer::compareTo));
        Assertions.assertEquals(8, maxHeap.top());
        Assertions.assertEquals(8, maxHeap.pop());
        Assertions.assertEquals(6, maxHeap.pop());
        Assertions.assertEquals(4, maxHeap.pop());


        // min-Heap
        Heap<Integer> minHeap = new Heap<>(List.of(), Integer::compareTo);
        minHeap.push(4);
        minHeap.push(8);
        minHeap.push(2);
        minHeap.push(6);
        minHeap.push(1);

        Assertions.assertEquals(5, minHeap.size());

        Assertions.assertEquals(1, minHeap.pop());
        Assertions.assertEquals(2, minHeap.pop());
        Assertions.assertEquals(4, minHeap.top());
        Assertions.assertEquals(4, minHeap.pop());
        Assertions.assertEquals(6, minHeap.pop());
        Assertions.assertEquals(8, minHeap.top());
        Assertions.assertEquals(8, minHeap.pop());

        Assertions.assertEquals(0, minHeap.size());

        Assertions.assertNull(minHeap.top());
        Assertions.assertNull(minHeap.pop());

    }
}