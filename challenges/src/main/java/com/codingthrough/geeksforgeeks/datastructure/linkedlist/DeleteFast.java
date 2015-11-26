package com.codingthrough.geeksforgeeks.datastructure.linkedlist;

/**
 * Provides algorithm to delete middle/last node from the list when only pointer to the deleted node is spesified.
 */
public class DeleteFast {
    /**
     * Removed middle node from the linked list.
     *
     * @param node element to be deleted
     */
    public static void delete(Node node) {
        if (node == null) {
            throw new IllegalArgumentException("The deleted node should not be null.");
        }

        Node next = node.next;
        if (next != null) {
            node.data = next.data;
            node.next = next.next;
        }
    }

    /**
     * Removed middle or last node from the double linked list.
     *
     * @param node element to be deleted
     */
    public static void delete(DoubleNode node) {
        if (node == null) {
            throw new IllegalArgumentException("The deleted node should not be null.");
        }

        DoubleNode next = node.next;
        if (next != null) {
            node.data = next.data;
            node.next = next.next;
        } else {
            node.prev.next = null;
            node.prev = null;
        }
    }
}
