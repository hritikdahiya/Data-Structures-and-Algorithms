package com.interviewprep.bctci.chapter_34_LinkedList.Problem_34_7;

import com.interviewprep.bctci.chapter_34_LinkedList.Node;

//          ----------->--
//         |             |
//    1 -> 2   3 <- 4 <- 5    6 -> null
//             |              |
//             --------->-----


//          ----------->--
//         |             |
//    1 -> 2   3 <- 4 <- 5   null
//             |              |
//             --------->-----


//     ------------>-------
//    |                   |
//    1 <- 2 <- 3 <- 4    5 -> null


//     ------------>-------------
//    |                         |
//    1 <- 2 <- 3 <- 4 <- 5   null


public class SublistReversal {
    public static <T> Node<T> reverse(Node<T> listHead, int start, int end) {
        // reverse start and end if start > end
        if (start > end) {
            return reverse(listHead, end, start);
        }
        // range before list or reverse a single index
        if (end < 0) {
            return listHead;
        }
        // do nothing on empty list
        if (listHead == null) {
            return null;
        }

        // points to the iterating node
        Node<T> curr = listHead;
        // points to the (start-1)th node
        Node<T> startMinus1Node = null;
        int currIndex = 0;
        while (currIndex < start && curr != null) {
            startMinus1Node = curr;
            curr = curr.next;
            currIndex++;
        }

        // start was greater than the list size, no reversal possible
        if (curr == null) {
            // return the original list
            return listHead;
        }

        // currIndex == start
        // Initiate reversal
        Node<T> prev = null;
        while (currIndex <= end && curr != null) {
            Node<T> next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            currIndex++;
        }


        // the next pointer of the startMinus1 node still exists (if it was null, then it was the head of the original list)
        Node<T> lastNodeOfReversedSublist = startMinus1Node == null ? listHead : startMinus1Node.next;


        // join the startMinus1 th node to the start of the reversed sublist (represented by prev)
        if (startMinus1Node != null) {
            startMinus1Node.next = prev;
        } else {
            // if the startMinus1 node is null --> the head of the list has changed
            listHead = prev;
        }

        // join the end of reversed sublist to the rest of the list
        if (lastNodeOfReversedSublist != null) {
            lastNodeOfReversedSublist.next = curr;
        }

        return listHead;
    }
}
