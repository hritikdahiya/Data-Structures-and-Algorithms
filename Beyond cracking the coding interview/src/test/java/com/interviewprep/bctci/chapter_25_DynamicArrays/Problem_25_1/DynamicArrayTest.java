package com.interviewprep.bctci.chapter_25_DynamicArrays.Problem_25_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DynamicArrayTest {
    @Test
    public void testDynamicArrayOptions() {
        int initialSize = 3;
        DynamicArray<Integer> da = new DynamicArray<>(initialSize);

        // size operation
        Assertions.assertEquals(0, da.size());

        // Append
        int newSize = 2 * initialSize;
        for (int i = 0; i < newSize; i++) {
            da.append(i);
        }
        Assertions.assertEquals(newSize, da.size());

        // Get
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> da.get(-1));
        for (int i = 0; i < newSize; i++) {
            Assertions.assertEquals(i, da.get(i));
        }
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> da.get(newSize));

        // Pop
        int itemsToPop = 2;
        for (int i = 0; i < itemsToPop; i++) {
            int lastItem = da.popBack();
            Assertions.assertEquals(lastItem, newSize - 1 - i);
        }
        for (int i = 0; i < newSize; i++) {
            if (i < newSize - itemsToPop) {
                Assertions.assertEquals(i, da.get(i));
            } else {
                int finalI = i;
                Assertions.assertThrows(IndexOutOfBoundsException.class, () -> da.get(finalI));
            }
        }

        // Set
        da.set(0, 100);
        Assertions.assertEquals(100, da.get(0));
    }
}