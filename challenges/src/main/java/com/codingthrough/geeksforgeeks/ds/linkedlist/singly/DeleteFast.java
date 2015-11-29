package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

/**
 * Provides algorithm to delete node from the list when only pointer to the deleted node is specified.
 */
public class DeleteFast {
    /**
     * Removes first/middle node from the linked list.
     *
     * @param node element to be deleted
     */
    public static void delete(Node node) {
        if (node == null) {
            throw new IllegalArgumentException("The deleted node should not be null.");
        }

        Node next = node.next;
        if (next == null) {
            throw new IllegalArgumentException("Cannot delete the last element from the list.");
        }

        node.data = next.data;
        node.next = next.next;
    }
}
