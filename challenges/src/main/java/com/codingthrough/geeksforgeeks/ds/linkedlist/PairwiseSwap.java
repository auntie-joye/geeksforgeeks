package com.codingthrough.geeksforgeeks.ds.linkedlist;

/**
 * Swaps elements in the specified linked list pairwise.
 * E.g. 1->2->3->4->5 wil be converted to 2->1->4->3->5
 */
public class PairwiseSwap {
    /**
     * Swaps elements pairwise by swapping data inside between nodes.
     *
     * @param head the head of the list
     * @return the updated head on the list
     */
    public static <T> Node<T> swapData(Node<T> head) {
        Node<T> cur = head;
        while (cur != null && cur.next != null) {
            T data = cur.data;
            cur.data = cur.next.data;
            cur.next.data = data;

            cur = cur.next.next;
        }

        return head;
    }

    /**
     * Swaps elements pairwise by swapping data inside between nodes.
     *
     * @param head the head of the list
     * @return the updated head on the list
     */
    public static <T> Node<T> swapDataRecursive(Node<T> head) {
        return swapDataRecursive(head, head);
    }

    private static <T> Node<T> swapDataRecursive(Node<T> head, Node<T> cur) {
        if (cur == null || cur.next == null) {
            return head;
        }

        T data = cur.data;
        cur.data = cur.next.data;
        cur.next.data = data;

        return swapDataRecursive(head, cur.next.next);
    }

    /**
     * Swaps elements pairwise by swapping data inside between nodes.
     *
     * @param head the head of the list
     * @return the updated head on the list
     */
    public static <T> Node<T> swapNode(Node<T> head) {
        Node<T> dummy = new Node<>(null, head);
        Node<T> prev = dummy;
        while (prev.next != null && prev.next.next != null) {
            Node<T> next = prev.next.next.next;
            prev.next.next.next = prev.next;
            prev.next = prev.next.next;
            prev.next.next.next = next;

            prev = prev.next.next;
        }

        return dummy.next;
    }

    /**
     * Swaps elements pairwise by swapping data inside between nodes.
     *
     * @param head the head of the list
     * @return the updated head on the list
     */
    public static <T> Node<T> swapNodeRecursive(Node<T> head) {
        Node<T> dummy = new Node<>(null, head);
        return swapNodeRecursive(dummy, dummy);
    }

    private static <T> Node<T> swapNodeRecursive(Node<T> dummy, Node<T> prev) {
        if (prev.next == null || prev.next.next == null) {
            return dummy.next;
        }

        Node<T> next = prev.next.next.next;
        prev.next.next.next = prev.next;
        prev.next = prev.next.next;
        prev.next.next.next = next;

        return swapNodeRecursive(dummy, prev.next.next);
    }
}
