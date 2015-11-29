package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

/**
 * Returns the middle element of the element. If the length of the element is even,
 * then returns element at the position (length-1)/2.
 */
public class Middle {
    /**
     * Finds the middle element of the specified list.
     *
     * @param head te first element of the list
     * @return the middle element
     * @throws IllegalStateException if the specified list is empty
     */
    public static <T> T middle(Node<T> head) {
        if (head == null) {
            throw new IllegalArgumentException("The specified list should not be empty.");
        }

        Node<T> slow = head;
        Node<T> fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    /**
     * Finds the middle element of the specified list.
     *
     * @param head te first element of the list
     * @return the middle element
     * @throws IllegalStateException if the specified list is empty
     */
    public static <T> T middleRecursive(Node<T> head) {
        if (head == null) {
            throw new IllegalArgumentException("The specified list should not be empty.");
        }
        Node<T> node = middleRecursive(head, head);
        return node.data;
    }

    private static <T> Node<T> middleRecursive(Node<T> slow, Node<T> fast) {
        if (fast.next == null || fast.next.next == null) {
            return slow;
        }

        return middleRecursive(slow.next, fast.next.next);
    }
}
