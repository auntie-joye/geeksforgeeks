package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

/**
 * Sorts the specified linked list using insertion sort algorithm.
 */
public class InsertionSort {
    public static <T extends Comparable<T>> Node<T> sort(Node<T> head) {
        Node<T> sorted = null;
        while (head != null) {
            sorted = insertSorted(sorted, head.data);
            head = head.next;
        }

        return sorted;
    }

    private static <T extends Comparable<T>> Node<T> insertSorted(Node<T> head, T data) {
        if (head == null) {
            return new Node<>(data, null);
        }

        Node<T> prev = null;
        Node<T> cur = head;
        while (cur != null) {
            if (data.compareTo(cur.data) < 0) {
                if (prev == null) {
                    // inserts first
                    head = new Node<>(data, head);
                } else {
                    prev.next = new Node<>(data, cur);
                }
                break;
            }

            prev = cur;
            cur = cur.next;
        }

        // inserts last
        if (cur == null) {
            prev.next = new Node<>(data, null);
        }

        return head;
    }
}
