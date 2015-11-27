package com.codingthrough.geeksforgeeks.ds.linkedlist;

/**
 * Provides different ways to add new node into the linked list.
 */
public class Insertion {
    /**
     * Adds new element in front of the specified list.
     *
     * @param head the first element of the linked list
     * @param data the element to be added
     * @return new first element of the linked list
     */
    public static <T> Node<T> insertFirst(Node<T> head, T data) {
        return new Node<>(data, head);
    }

    /**
     * Adds new element as a tail to the specified list.
     *
     * @param head the first element of the linked list
     * @param data the element to be added
     * @return new first element of the linked list
     */
    public static <T> Node<T> insertLast(Node<T> head, T data) {
        if (head == null) {
            return new Node<>(data, null);
        }

        Node<T> cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }

        cur.next = new Node<>(data, null);

        return head;
    }

    /**
     * Adds new element after the specified element.
     *
     * @param node element after which new element will be added
     * @param data new element to be added
     * @throws IllegalArgumentException if the element after which new element should be added is {@code null}
     */
    public static <T> void insertAfter(Node<T> node, T data) {
        if (node == null) {
            throw new IllegalArgumentException("You should specify not null node pointer.");
        }

        node.next = new Node<>(data, node.next);
    }

    /**
     * Adds new element before the specified element.
     *
     * @param head the first element of the linked list
     * @param node element before which new element will be added
     * @param data new element to be added
     * @return first element of the linked list
     * @throws IllegalArgumentException if the element before which new element should be added is {@code null}
     * @throws IllegalArgumentException if the head of the linked list is {@code null}
     * @throws IllegalStateException    if the element before which new element should be added is not
     *                                  found in the specified linked list
     */
    public static <T> Node<T> insertBefore(Node<T> head, Node<T> node, T data) {
        if (node == null) {
            throw new IllegalArgumentException("You should specify not null node pointer.");
        }

        if (head == null) {
            throw new IllegalArgumentException("You should specify not empty list.");
        }

        if (head == node) {
            return new Node<>(data, head);
        }

        Node<T> cur = head;
        while (cur != null && cur.next != node) {
            cur = cur.next;
        }

        if (cur == null) {
            throw new IllegalStateException("The specified node is not found in the specified linked list.");
        }

        cur.next = new Node<>(data, cur.next);
        return head;
    }

    /**
     * Adds new element at the specified position (started from 0 as array index).
     *
     * @param head the first element of the linked list
     * @param pos  position of the new element to be added
     * @param data new element to be added
     * @return first element of the linked list
     * @throws IllegalArgumentException  if the head of the linked list is {@code null}
     * @throws IndexOutOfBoundsException if the specified position is out of bounds on the linked list
     */
    public static <T> Node<T> insertAt(Node<T> head, int pos, T data) {
        if (pos < 0) {
            throw new IndexOutOfBoundsException("The specified position is less than the minimal list index.");
        }

        if (pos == 0) {
            return new Node<>(data, head);
        }

        Node<T> cur = head;
        while (cur != null && pos > 1) {
            cur = cur.next;
            pos--;
        }

        if (cur == null) {
            throw new IndexOutOfBoundsException("The specified position is greater than the maximum list index.");
        }

        cur.next = new Node<>(data, cur.next);
        return head;
    }
}
