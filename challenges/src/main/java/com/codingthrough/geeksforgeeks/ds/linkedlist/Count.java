package com.codingthrough.geeksforgeeks.ds.linkedlist;

/**
 * Returns the number the specified key is presented in the list.
 */
public class Count {
    /**
     * Returns the number the specified element is presented in the list.
     *
     * @param head the head element of the list
     * @param data the element to count
     * @return number of occurrence
     */
    public static <T> int count(Node<T> head, T data) {
        int count = 0;
        while (head != null) {
            if (equals(head.data, data)) {
                count++;
            }
            head = head.next;
        }
        return count;
    }

    /**
     * Returns the number the specified element is presented in the list.
     *
     * @param head the head element of the list
     * @param data the element to count
     * @return number of occurrence
     */

    public static <T> int countRecursive(Node<T> head, T data) {
        if (head == null) {
            return 0;
        }

        return countRecursive(head.next, data) + (equals(head.data, data) ? 1 : 0);
    }

    private static <T> boolean equals(T a, T b) {
        return ((a == null && b == null) || (a != null && a.equals(b)));
    }
}
