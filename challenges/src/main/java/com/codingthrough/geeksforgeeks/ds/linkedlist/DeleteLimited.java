package com.codingthrough.geeksforgeeks.ds.linkedlist;

/**
 * Deletes a given node in the specified linked list under given constraints:
 * 1) It must accept pointer to the start node as first parameter and node to be deleted as second parameter i.e., pointer to head node is not global.
 * 2) It should not return pointer to the head node.
 * 3) It should not accept pointer to pointer to head node.
 * You may assume that the linked list never becomes empty.
 */
public class DeleteLimited {
    public static <T> void delete(Node<T> head, Node<T> deleted) {
        if (head == null || deleted == null) {
            throw new IllegalArgumentException("The specified pointers should not be null values.");
        }

        // deletes the head of the list
        if (head.data == deleted.data) {
            // cannot make the list empty
            if (head.next == null) {
                throw new IllegalStateException("The specified linked list can never become empty.");
            }

            head.data = head.next.data;
            head.next = head.next.next;
            return;
        }

        // finds the deleted node or the tail of the list
        Node<T> prev = head;
        while (prev.next != null && prev.next.data != deleted.data) {
            prev = prev.next;
        }

        // cannot find deleted node in the list
        if (prev.next == null) {
            throw new IllegalStateException("Cannot find deleted node in the list.");
        }

        // deletes node
        prev.next = prev.next.next;
    }
}
