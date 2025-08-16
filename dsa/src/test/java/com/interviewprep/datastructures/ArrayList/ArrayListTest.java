package com.interviewprep.datastructures.ArrayList;

import org.junit.jupiter.api.*;

public class ArrayListTest {
    private static final int INITIAL_CAPACITY = 5;

    @Test
    public void testAddGetSetAndRemoveOperations() {
        ArrayList<Integer> arrayList = new ArrayList<>(INITIAL_CAPACITY);

        for(int i=0; i<INITIAL_CAPACITY; i++) {
            arrayList.add(2 * i);
            // Test add and get
            Assertions.assertEquals(2 * i, arrayList.get(i));
        }

        int indexToRemove = 2;
        arrayList.set(indexToRemove, 500);
        // Test set
        Assertions.assertEquals(500, arrayList.get(indexToRemove));
        arrayList.remove(indexToRemove);

        // Test remove
        Assertions.assertEquals(INITIAL_CAPACITY - 1, arrayList.size());
        Assertions.assertEquals(2 * (indexToRemove + 1), arrayList.get(indexToRemove));
    }
    @Test
    public void testResizeWhenListIsFull() {
        ArrayList<Integer> arrayList = new ArrayList<>(INITIAL_CAPACITY);
        Assertions.assertEquals(0, arrayList.size());

        for(int i=0; i<INITIAL_CAPACITY; i++) {
            arrayList.add(i);
        }
        // List is at capacity
        Assertions.assertEquals(INITIAL_CAPACITY, arrayList.size());
        Assertions.assertEquals(INITIAL_CAPACITY, arrayList.getCapacity());

        arrayList.add(Integer.MAX_VALUE);

        // List capacity should double
        Assertions.assertEquals(INITIAL_CAPACITY + 1, arrayList.size());
        Assertions.assertEquals(2 * INITIAL_CAPACITY, arrayList.getCapacity());
    }

}


