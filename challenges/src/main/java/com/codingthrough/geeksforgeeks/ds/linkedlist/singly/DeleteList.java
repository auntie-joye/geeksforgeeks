package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

/**
 * Destroys the specified linked list.
 */
public class DeleteList {
    /**
     * Destroys the specified linked list.
     *
     * @param head the first element of the list
     */
    public static void delete(Node head) {
        while (head != null) {
            Node next = head.next;
            head.next = null;
            head = next;
        }
    }

    /**
     * Destroys the specified linked list.
     *
     * @param head the first element of the list
     */
    public static void deleteRecursive(Node head) {
        if (head == null) {
            return;
        }

        deleteRecursive(head.next);
        head.next = null;
    }
}
