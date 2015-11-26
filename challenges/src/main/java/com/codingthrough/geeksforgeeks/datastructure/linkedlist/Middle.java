package com.codingthrough.geeksforgeeks.datastructure.linkedlist;

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
        Node<T> slow = head;
        Node<T> fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (slow == null) {
            throw new IllegalStateException("The specified list should not be empty.");
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
        Node<T> node = middleRecursive(head, head);

        if (node == null) {
            throw new IllegalStateException("The specified list should not be empty.");
        }
        return node.data;
    }

    private static <T> Node<T> middleRecursive(Node<T> slow, Node<T> fast) {
        if (fast == null || fast.next == null) {
            return slow;
        }

        return middleRecursive(slow.next, fast.next.next);
    }
}
