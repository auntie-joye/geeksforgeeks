package com.codingthrough.geeksforgeeks.datastructure.linkedlist;

/**
 * Finds the length of the linked list using iterative/recursive approaches
 */
public class Length {
    /**
     * Returns the length of the specified linked list.
     *
     * @param head the first element of the list
     * @return the number of elements in the list
     */
    public static int length(Node head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    /**
     * Returns the length of the specified linked list.
     *
     * @param head the first element of the list
     * @return the number of elements in the list
     */
    public static int lengthRecursive(Node head) {
        if (head == null) {
            return 0;
        }

        return 1 + length(head.next);
    }
}
