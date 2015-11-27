package com.codingthrough.geeksforgeeks.ds.linkedlist;

/**
 * Split the specified list by alternate nodes.
 * E.g. 1->2->3->4 will be transformed to 1->3 and 3->4
 */
public class SplitByAlternate {
    /**
     * Splits the specified list into two lists by alternate nodes.
     *
     * @param head the head of the linked list
     * @return split linked list
     */
    public static <T> Split<T> split(Node<T> head) {
        if (head == null || head.next == null) {
            return new Split<>(head, null);
        }

        Node<T> prevA = head;
        Node<T> prevB = head.next;

        Split<T> split = new Split<>(prevA, prevB);

        Node<T> cur = head.next.next;
        while (cur != null) {
            prevA.next = cur;
            prevA = prevA.next;
            cur = cur.next;

            if (cur != null) {
                prevB.next = cur;
                prevB = prevB.next;
                cur = cur.next;
            }
        }

        return split;
    }

    /**
     * Splits the specified list into two lists by alternate nodes.
     *
     * @param head the head of the linked list
     * @return split linked list
     */
    public static <T> Split<T> splitRecursive(Node<T> head) {
        if (head == null || head.next == null) {
            return new Split<>(head, null);
        }

        splitRecursive(head, head.next, head.next.next);

        return new Split<>(head, head.next);
    }

    public static <T> void splitRecursive(Node<T> prevA, Node<T> prevB, Node<T> cur) {
        if (cur == null) {
            return;
        }

        prevA.next = cur;
        prevA = prevA.next;

        if (cur.next == null) {
            return;
        }

        prevB.next = cur.next;
        prevB = prevB.next;

        splitRecursive(prevA, prevB, cur.next.next);
    }

    public static class Split<T> {
        Node<T> a;
        Node<T> b;

        Split(Node<T> a, Node<T> b) {
            this.a = a;
            this.b = b;
        }
    }
}
