package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

/**
 * Deletes N nodes after M nodes of a linked list.
 * Given a linked list and two integers M and N.
 * Traverse the linked list such that you retain M nodes then delete next N nodes,
 * continue the same till end of the linked list.
 */
public class DeleteNAfterM {
    /**
     * Deletes N nodes after N nodes from the specified list.
     *
     * @param head the head element of the list
     * @param n    number of deleted elements
     * @param m    number of skipped elements
     * @return the head of the updated list
     */
    public static <T> Node<T> delete(Node<T> head, int n, int m) {
        if (m == 0 && n == 0) {
            return head;
        }

        if (m == 0) {
            return null;
        }

        Node<T> dummy = new Node<>(null, head);
        Node<T> prev = dummy;
        while (prev.next != null) {
            for (int i = 0; i < m && prev.next != null; i++) {
                prev = prev.next;
            }
            if (prev.next == null) {
                continue;
            }
            for (int i = 0; i < n && prev.next != null; i++) {
                prev.next = prev.next.next;
            }
        }
        return dummy.next;
    }
}
