package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

import java.util.HashSet;
import java.util.Set;

/**
 * Removes duplicates from the sorted/unsorted linked list.
 */
public class RemoveDuplicates {
    /**
     * Removes duplicates from the sorted linked list.
     *
     * @param head the first element in the linked list
     * @return the head of the list
     */
    public static <T> Node<T> removeDuplicatesSorted(Node<T> head) {
        Node<T> cur = head;
        while (cur != null && cur.next != null) {
            if (equals(cur.data, cur.next.data)) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }

        return head;
    }

    /**
     * Removes duplicates from the unsorted linked list.
     *
     * @param head the first element in the linked list
     * @return the head of the list
     */
    public static <T> Node<T> removeDuplicatesUnsorted(Node<T> head) {
        Set<T> set = new HashSet<>();

        Node<T> dummy = new Node<>(null, head);
        Node<T> prev = dummy;
        while (prev.next != null) {
            if (set.contains(prev.next.data)) {
                prev.next = prev.next.next;
            } else {
                set.add(prev.next.data);
                prev = prev.next;
            }
        }
        return dummy.next;
    }

    private static <T> boolean equals(T a, T b) {
        return ((a == null && b == null) || (a != null && a.equals(b)));
    }
}
