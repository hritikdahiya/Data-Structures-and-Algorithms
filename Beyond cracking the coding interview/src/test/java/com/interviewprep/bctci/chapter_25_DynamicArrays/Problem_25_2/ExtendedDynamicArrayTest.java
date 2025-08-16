package com.interviewprep.bctci.chapter_25_DynamicArrays.Problem_25_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

class ExtendedDynamicArrayTest {
    @Test
    public void testExtraOperations() {
        int initialSize = 10;
        ExtendedDynamicArray<Integer> eda = new ExtendedDynamicArray<>(initialSize);

        // Insert
        for (int i = 0; i < initialSize; i++) {
            eda.insert(i, 2 * i);
            Assertions.assertEquals(2 * i, eda.get(i));

            // Contains
            Assertions.assertTrue(eda.contains(2 * i));
        }

        Assertions.assertFalse(eda.contains(Integer.MAX_VALUE));

        // Pop
        int indexToPop = 5;
        Assertions.assertEquals(2 * indexToPop, eda.get(indexToPop));
        eda.pop(indexToPop);
        Assertions.assertEquals(2 * (indexToPop + 1), eda.get(indexToPop));
        Assertions.assertEquals(initialSize - 1, eda.size());

        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> eda.pop(-1));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> eda.pop(initialSize));

        eda.insert(indexToPop, 2 * indexToPop); // reverting it back to the original list
        // Remove
        Assertions.assertThrows(NoSuchElementException.class, () -> eda.remove(Integer.MIN_VALUE));

        int valToRemove = 2 * indexToPop;
        eda.remove(valToRemove);

        Assertions.assertEquals(initialSize - 1, eda.size());
    }
}