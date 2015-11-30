package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

/**
 * Sorts the specified linked list using selection sort algorithm.
 */
public class SelectionSort {
    public static <T extends Comparable<T>> Node<T> sort(Node<T> head) {
        Node<T> dummy = new Node<>(null, head);
        Node<T> sorted = dummy;
        while (sorted.next != null) {
            Node<T> preMin = sorted;
            Node<T> cur = sorted.next;
            while (cur.next != null) {
                if (cur.next.data.compareTo(preMin.next.data) < 0) {
                    preMin = cur;
                }
                cur = cur.next;
            }

            Node<T> min = preMin.next;
            preMin.next = preMin.next.next;
            min.next = sorted.next;
            sorted.next = min;

            sorted = sorted.next;
        }
        return dummy.next;
    }
}
