package com.codingthrough.geeksforgeeks.datastructure.linkedlist;

/**
 * Merges two specified linked list in the sorted order.
 */
public class Merge {
    /**
     * Merges two specified linked list in one sorted list.
     *
     * @param a first linked list
     * @param b second linked list
     * @return the head of the new ordered list
     */
    public static <T extends Comparable<T>> Node<T> merge(Node<T> a, Node<T> b) {
        Node<T> dummy = new Node<>();
        Node<T> cur = dummy;
        while (a != null && b != null) {
            if (a.data == null) {
                cur.next = new Node<>(a.data, null);
                cur = cur.next;
                a = a.next;
            } else if (b.data == null) {
                cur.next = new Node<>(b.data, null);
                cur = cur.next;
                b = b.next;
            } else {
                if (a.data.compareTo(b.data) < 0) {
                    cur.next = new Node<>(a.data, null);
                    cur = cur.next;
                    a = a.next;
                } else {
                    cur.next = new Node<>(b.data, null);
                    cur = cur.next;
                    b = b.next;
                }
            }
        }

        if (a != null) {
            cur.next = a;
        }

        if (b != null) {
            cur.next = b;
        }

        return dummy.next;
    }

    /**
     * Merges two specified linked list in one sorted list.
     *
     * @param a first linked list
     * @param b second linked list
     * @return the head of the new ordered list
     */
    public static <T extends Comparable<T>> Node<T> mergeRecursive(Node<T> a, Node<T> b) {
        if (a == null && b == null) {
            return null;
        }

        if (a != null && b != null) {
            if (a.data == null) {
                Node<T> next = mergeRecursive(a.next, b);
                return new Node<>(a.data, next);
            } else if (b.data == null) {
                Node<T> next = mergeRecursive(a, b.next);
                return new Node<>(b.data, next);
            } else {
                if (a.data.compareTo(b.data) < 0) {
                    Node<T> next = mergeRecursive(a.next, b);
                    return new Node<>(a.data, next);
                } else {
                    Node<T> next = mergeRecursive(a, b.next);
                    return new Node<>(b.data, next);
                }
            }
        }

        return a != null ? a : b;
    }
}
