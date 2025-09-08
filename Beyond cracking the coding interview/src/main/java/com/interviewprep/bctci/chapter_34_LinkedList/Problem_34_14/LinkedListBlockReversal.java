package com.interviewprep.bctci.chapter_34_LinkedList.Problem_34_14;

import com.interviewprep.bctci.chapter_34_LinkedList.Node;

public class LinkedListBlockReversal {
    public static <T> Node<T> reverse(Node<T> list, int k) {
        if (k == 1) {
            return list;
        }

        Node<T> dummy = new Node<>(null);
        dummy.next = list;

        Node<T> curr = dummy;
        // check if k elements are available to reverse, else return the same list
        for (int i = 0; i < k; i++) {
            curr = curr.next;
            if (curr == null) {
                // current block is smaller than k
                // return the original list
                return dummy.next;
            }
        }

        Node<T> nextBlockHead = curr.next;

        // separate the current block
        curr.next = null;

        // reverse the current block
        Node<T> reversedHead = reverseList(dummy.next);

        // reverse the rest of the list
        Node<T> nextBlockReversed = reverse(nextBlockHead, k);

        // concat the rest of the reversed list with current reversed block
        dummy.next.next = nextBlockReversed;

        return reversedHead;
    }


    public static <T> Node<T> reverseIterative(Node<T> list, int k) {
        if (k == 1) {
            return list;
        }

        Node<T> dummy = new Node<>(null);
        dummy.next = list;

        // this will become the last element of every reversed list block
        Node<T> currentBatchHead = dummy.next;
        Node<T> prevBatchLast = dummy;

        while (true) {
            Node<T> currItr = currentBatchHead;
            // move ahead k steps to reach the end of curr k node sublist
            for (int i = 0; i < k - 1 && currItr != null; i++) {
                currItr = currItr.next;
            }
            // less than k elements left, no reversal needed
            if (currItr == null) {
                // join the current unreversed list to preceding list's last node
                prevBatchLast.next = currentBatchHead;
                break;
            }
            // keep track of next batch start
            Node<T> nextBatchStart = currItr.next;
            // separate the current list
            currItr.next = null;

            // reverse the sublist
            Node<T> currentBatchReversedHead = reverseList(currentBatchHead);

            prevBatchLast.next = currentBatchReversedHead;
            prevBatchLast = currentBatchHead;
            currentBatchHead = nextBatchStart;
        }

        return dummy.next;
    }

    private static <T> Node<T> reverseList(Node<T> list) {
        Node<T> curr = list, prev = null, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
