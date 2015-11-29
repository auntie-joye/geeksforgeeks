package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

/**
 * Provides different ways of finding specified element in the linked list
 */
public class Find {
    /**
     * Find element by the specified index (starting from 0 as array index).
     *
     * @param head the first element of the list
     * @param pos  the position of the element to be returned
     * @return the found element, otherwise - throws exception
     * @throws IllegalArgumentException if the specified list is empty
     * @throws IllegalArgumentException if the specified position is less than minimum list index
     * @throws IllegalArgumentException if te specified position is greater than maximum list index
     */
    public static <T> T getAt(Node<T> head, int pos) {
        if (head == null) {
            throw new IllegalArgumentException("You should specify not empty list.");
        }

        if (pos < 0) {
            throw new IndexOutOfBoundsException("The specified position is less than the minimal list index.");
        }

        while (head != null && pos > 0) {
            pos--;
            head = head.next;
        }

        if (head == null) {
            throw new IndexOutOfBoundsException("The specified position is greater than the maximum list index.");
        }

        return head.data;
    }

    /**
     * Checks is the specified element is presented in the list..
     *
     * @param head the first element of the list
     * @param data the position of the element to be returned
     * @return {@code true} if element is found, otherwise - {@code false}
     */
    public static <T> boolean contains(Node<T> head, T data) {
        while (head != null && !equals(head.data, data)) {
            head = head.next;
        }

        return head != null;
    }

    /**
     * Checks is the specified element is presented in the list..
     *
     * @param head the first element of the list
     * @param data the position of the element to be returned
     * @return {@code true} if element is found, otherwise - {@code false}
     */
    public static <T> boolean containsRecursive(Node<T> head, T data) {
        return head != null && (equals(head.data, data) || containsRecursive(head.next, data));
    }

    private static <T> boolean equals(T a, T b) {
        return ((a == null && b == null) || (a != null && a.equals(b)));
    }
}
