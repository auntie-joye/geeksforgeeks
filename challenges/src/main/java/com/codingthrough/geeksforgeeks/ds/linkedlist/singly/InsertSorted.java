package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

/**
 * Inserts a new element in the linked list which sorted and does not break ordering.
 */
public class InsertSorted {
    public static <T extends Comparable<T>> Node<T> insert(Node<T> head, T value) {
        if (head == null) {
            return new Node<>(value, null);
        }

        Node<T> prev = null;
        Node<T> cur = head;
        while (cur != null) {
            if (value.compareTo(cur.data) < 0) {
                Node<T> node = new Node<>(value, cur);
                if (prev == null) {
                    head = node;
                } else {
                    prev.next = node;
                }
                break;
            }

            if (cur.next == null) {
                cur.next = new Node<>(value, null);
                break;
            }

            prev = cur;
            cur = cur.next;
        }

        return head;
    }
}
