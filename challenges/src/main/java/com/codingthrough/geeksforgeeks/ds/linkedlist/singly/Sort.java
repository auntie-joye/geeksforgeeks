package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

import javax.print.attribute.IntegerSyntax;

/**
 * Given a linked list of 0s, 1s and 2s, sort it.
 */
public class Sort {
    public static Node<Integer> sort(Node<Integer> head) {
        Node<Integer> dummy = new Node<>(null, head);

        Node<Integer> prev = dummy;
        Node<Integer> lastZero = dummy;
        Node<Integer> firstTwo = null;

        //skips leading zeros
        while(head != null && head.data == 0) {
            lastZero = lastZero.next;
            prev = head;
            head = head.next;
        }

        while(head != null) {
            if(head.data == 1) {
                prev = head;
                head = head.next;
            } else {
                Node<Integer> next = head.next;
                prev.next = next;

                if(head.data == 0) {
                    head.next = lastZero.next;
                    lastZero.next = head;
                    lastZero = lastZero.next;
                } else {
                    head.next = firstTwo;
                    firstTwo = head;
                }

                head = next;
            }
        }

        prev.next = firstTwo;
        return dummy.next;
    }
}
