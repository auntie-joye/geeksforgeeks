package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

/**
 * Moves last not of the list to the front.
 */
public class MoveTailToFront {
    public static <T> Node<T> move(Node<T> head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node<T> prev = head;
        while (prev.next.next != null) {
            prev = prev.next;
        }

        prev.next.next = head;
        head = prev.next;
        prev.next = null;

        return head;
    }
}
