package com.interviewprep.bctci.chapter_25_DynamicArrays.Problem_25_1;

/**
 * doubles the size when array is full
 * Shinks the size by half when the array is 25% full
 *
 * @param <T>
 */
public class DynamicArray<T> {
    protected Holder<T>[] holderArr;
    protected int capacity;
    protected int elementCount;
    protected static final int SAFE_MAX_ARRAY_SIZE = (int) Math.pow(10, 6);

    public DynamicArray() {
        this(10);
    }

    public DynamicArray(int initialSize) {
        this.capacity = initialSize;
        this.elementCount = 0;
        this.holderArr = new Holder[initialSize];
    }

    public void append(T val) {
        if (this.elementCount == this.capacity) {
            int newCapacity = Math.min(2 * this.capacity, SAFE_MAX_ARRAY_SIZE);
            resize(newCapacity);
        }

        this.holderArr[this.elementCount++] = new Holder<>(val);
    }

    public T get(int index) {
        checkIndexWithinBounds(index);

        return this.holderArr[index].val();
    }

    public T popBack() {
        if (this.elementCount == 0) {
            throw new IndexOutOfBoundsException();
        }

        T lastElement = this.holderArr[this.elementCount - 1].val();
        this.elementCount--;

        if (this.elementCount < Math.floor(this.capacity * 0.25)) {
            resize((int) Math.floor(this.capacity * 0.5));
        }

        return lastElement;
    }

    public void set(int index, T val) {
        checkIndexWithinBounds(index);

        this.holderArr[index] = new Holder<>(val);
    }

    public int size() {
        return this.elementCount;
    }

    protected void checkIndexWithinBounds(int index) {
        if (index < 0 || index >= this.elementCount) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    protected void resize(int newSize) {
        Holder<T>[] newHolderArr = new Holder[newSize];
        if (Math.min(newSize, this.elementCount) >= 0)
            System.arraycopy(holderArr, 0, newHolderArr, 0, Math.min(newSize, this.elementCount));
        this.holderArr = newHolderArr;
        this.capacity = newSize;
    }
}