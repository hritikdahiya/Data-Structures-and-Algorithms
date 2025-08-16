package com.interviewprep.bctci.chapter_25_DynamicArrays.Problem_25_2;

import com.interviewprep.bctci.chapter_25_DynamicArrays.Problem_25_1.DynamicArray;

import java.util.NoSuchElementException;
import java.util.Objects;

public class ExtendedDynamicArray<T> extends DynamicArray<T> {
    public ExtendedDynamicArray(int initialSize) {
        super(initialSize);
    }

    public void insert(int index, T val) {
        // The condition for insert is different from other methods (here if index == size(), it is valid
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }

        if (size() == capacity) {
            int newCapacity = Math.min(2 * capacity, SAFE_MAX_ARRAY_SIZE);
            resize(newCapacity);
        }

        elementCount++;
        for (int i = size() - 1; i > index; i--) {
            set(i, get(i - 1));
        }
        set(index, val);
    }

    public T pop(int index) {
        checkIndexWithinBounds(index);

        for (int i = index; i < size() - 1; i++) {
            set(i, get(i + 1));
        }

        return popBack();
    }

    public void remove(T val) {
        for (int i = 0; i < size(); i++) {
            if (Objects.equals(get(i), val)) {
                pop(i);
                return;
            }
        }
        throw new NoSuchElementException();
    }

    public boolean contains(T val) {
        for (int i = 0; i < size(); i++) {
            if (Objects.equals(get(i), val)) {
                return true;
            }
        }
        return false;
    }
}
