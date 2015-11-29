package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

/**
 * Reverses the specified linked list.
 */
public class Reverse {
    /**
     * Reverses linked list.
     *
     * @param head the head of the list
     * @return the head of the reversed list
     */
    public static <T> Node<T> reverse(Node<T> head) {
        Node<T> prev = null;
        while (head != null) {
            Node<T> next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

    /**
     * Reverses linked list.
     *
     * @param head the head of the list
     * @return the head of the reversed list
     */
    public static <T> Node<T> reverseRecursive(Node<T> head) {
        return reverseRecursive(null, head);
    }

    private static <T> Node<T> reverseRecursive(Node<T> prev, Node<T> cur) {
        if (cur == null) {
            return prev;
        }

        Node<T> next = cur.next;
        cur.next = prev;
        return reverseRecursive(cur, next);
    }
}
