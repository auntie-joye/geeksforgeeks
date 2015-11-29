package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

/**
 * Deletes alternate (every second node) nodes from the linked list.
 * E.g. 1->2->3->4 will be 1->3
 */
public class DeleteAlternate {
    /**
     * Deletes alternate nodes from the linked list using iterative approach.
     *
     * @param head the head of the list
     * @return the head of the updated list
     */
    public static <T> Node<T> delete(Node<T> head) {
        Node<T> cur = head;
        while (cur != null && cur.next != null) {
            cur.next = cur.next.next;
            cur = cur.next;
        }
        return head;
    }

    /**
     * Deletes alternate nodes from the linked list using recursive approach.
     *
     * @param head the head of the list
     * @return the head of the updated list
     */
    public static <T> Node<T> deleteRecursive(Node<T> head) {
        return deleteRecursive(head, head);
    }

    private static <T> Node<T> deleteRecursive(Node<T> head, Node<T> cur) {
        if (cur == null || cur.next == null) {
            return head;
        }

        cur.next = cur.next.next;
        return deleteRecursive(head, cur.next);
    }
}
