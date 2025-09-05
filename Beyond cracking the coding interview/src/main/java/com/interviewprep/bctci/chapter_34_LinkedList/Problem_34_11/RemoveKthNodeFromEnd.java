package com.interviewprep.bctci.chapter_34_LinkedList.Problem_34_11;

import com.interviewprep.bctci.chapter_34_LinkedList.Node;

// 1->2->3->4
//          |
// k = 3
public class RemoveKthNodeFromEnd {
    public static <T> Node<T> removeInOnePass(Node<T> head, int k) {
        if (k < 1) {
            return head;
        }

        Node<T> dummy = new Node<>(null);
        dummy.next = head;
        Node<T> fast = dummy;
        // move ahead k steps
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        Node<T> slow = dummy;
        // parse the entire list with fast, and start parsing from head with slow
        // both slow and fast would traverse n-k nodes, and slow would at the node to remove
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }


    public static <T> Node<T> removeInTwoPass(Node<T> head, int k) {
        if (k < 1) {
            return head;
        }

        int len = 0;
        Node<T> curr = head;
        while (curr != null) {
            len++;
            curr = curr.next;
        }

        // remove the first node
        if (len == k) {
            return head.next;
        }

        curr = head;

        for (int i = 0; i < len - k - 1; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;
        return head;
    }
}
