package com.interviewprep.datastructures.LL;

import lombok.Getter;
import lombok.Setter;

public class LL<T> {
    private Node<T> head;
    @Getter
    private int length;

    LL() {
        this.head = null;
        this.length = 0;
    }

    public void add(T itemValue) {
        if(itemValue == null) {
            // do not add nulls
            return;
        }

        Node<T> newNode = new Node<>(itemValue);
        if(this.head == null) {
            this.head = newNode;
            this.length++;
            return;
        }

        Node<T> curr = this.head;
        while(curr.getNext() != null) {
            curr = curr.getNext();
        }
        curr.setNext(newNode);
        this.length++;
    }

    public void addFirst(T itemValue) {
        if(itemValue == null) {
            // do not add nulls
            return;
        }

        Node<T> newNode = new Node<>(itemValue);
        newNode.setNext(this.head);
        this.head = newNode;
        this.length++;
    }

    public boolean find(T itemValue) {
        Node<T> curr = this.head;
        while(curr != null) {
            if(curr.getValue() == itemValue) {
                return true;
            }
            curr = curr.getNext();
        }

        return false;
    }

    public boolean remove(T itemValue, boolean removeAll) {
        if(itemValue == null) {
            // break early
            return true;
        }

        int removeCount = 0;
        Node<T> curr = this.head;
        Node<T> prev = null;
        while(curr != null) {
            if(curr.getValue() == itemValue) {
                // item is at head, move the head
                if(prev == null) {
                    this.head = curr.getNext();
                } else {
                    // link the previous node to the deleted itemValue's next
                    prev.setNext(curr.getNext());
                }

                removeCount++;
                this.length--;
                // housekeeping
                curr.setNext(null);

                if(removeAll) {
                    // keep going till the end of the queue
                    curr = prev == null ? this.head : prev.getNext();
                } else {
                    // break is removeAll is not set
                    return true;
                }
            } else {
                prev = curr;
                curr = curr.getNext();
            }
        }

        return removeAll && removeCount > 0;
    }
}

@Getter
class Node<T> {
    private final T value;
    @Setter
    private Node<T> next;

    Node(T value) {
        this.value = value;
        this.next = null;
    }
}