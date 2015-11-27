package com.codingthrough.geeksforgeeks.ds.linkedlist;

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
    public static Node reverse(Node head) {
        Node prev = null;
        while (head != null) {
            Node next = head.next;
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
    public static Node reverseRecursive(Node head) {
        return reverseRecursive(null, head);
    }

    private static Node reverseRecursive(Node prev, Node cur) {
        if (cur == null) {
            return prev;
        }

        Node next = cur.next;
        cur.next = prev;
        return reverseRecursive(cur, next);
    }
}
