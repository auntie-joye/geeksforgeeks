package com.codingthrough.geeksforgeeks.ds.linkedlist;

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

        Node<T> cur = head;
        while (cur != null) {
            for (int i = 0; i < m - 1 && cur != null; i++) {
                cur = cur.next;
            }
            if (cur == null) {
                continue;
            }
            for (int i = 0; i < n && cur.next != null; i++) {
                cur.next = cur.next.next;
            }

            cur = cur.next;
        }
        return head;
    }
}
