package com.interviewprep.datastructures.ArrayList;

import lombok.Getter;

public class ArrayList<T> {
    private static final int MAX_ARRAY_CAPACITY = Integer.MAX_VALUE - 8;
    private Holder<T>[] holder;
    @Getter
    private int capacity;
    private int elementCount;


    ArrayList(int initialCapacity) {
        this.capacity = (initialCapacity == 0) ? 1 : initialCapacity;
        this.holder = new Holder[this.capacity];
        this.elementCount = 0;
    }

    public int size() {
        return this.elementCount;
    }

    // O(1) amortized
    public void add(T item) {
        if (item == null) {
            throw new NullPointerException();
        }

        if (this.elementCount == this.capacity) {
            resize();
        }

        this.holder[this.elementCount++] = new Holder<>(item);
    }

    // O(1)
    public T get(int index) {
        checkIndexOutOfBound(index, this.elementCount);

        return this.holder[index].item();
    }

    public void set(int index, T value) {
        checkIndexOutOfBound(index, this.elementCount);

        this.holder[index] = new Holder<>(value);
    }

    private void checkIndexOutOfBound(int index, int capacity) {
        if (index < 0 || index >= capacity) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    // O(n)
    public void remove(int index) {
        checkIndexOutOfBound(index, this.elementCount);

        // shift the remaining array left starting from index 'index'
        for (int i = index; i < this.elementCount - 1; i++) {
            this.holder[i] = this.holder[i + 1];
        }
        // reduce the size of array, it will be overwritten in the next add
        this.elementCount--;
    }

    protected void resize() {
        if (this.capacity == MAX_ARRAY_CAPACITY) {
            throw new OutOfMemoryError();
        }

        int newCapacity = Math.min(2 * this.capacity, MAX_ARRAY_CAPACITY);

        Holder<T>[] resizedHolder = new Holder[newCapacity];

        System.arraycopy(this.holder, 0, resizedHolder, 0, this.capacity);

        this.holder = resizedHolder;
        this.capacity = newCapacity;
    }
}

record Holder<T>(T item) {
}