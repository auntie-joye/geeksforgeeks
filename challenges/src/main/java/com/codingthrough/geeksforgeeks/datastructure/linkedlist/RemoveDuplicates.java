package com.codingthrough.geeksforgeeks.datastructure.linkedlist;

/**
 * Removes duplicates from the sorted/unsorted linked list.
 */
public class RemoveDuplicates {
    /**
     * Removes duplicates from the sorted linked list.
     *
     * @param head the first element in the linked list
     * @return the head of the list
     */
    public static Node removeDuplicatesSorted(Node head) {
        Node cur = head;
        while (cur != null && cur.next != null) {
            if (cur.data.equals(cur.next.data)) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }

        return head;
    }

    /**
     * Removes duplicates from the unsorted linked list.
     *
     * @param head the first element in the linked list
     * @return the head of the list
     */
    public static Node removeDuplicatesUnsorted(Node head) {
        Node cur = head;
        while (cur != null && cur.next != null) {
            if (cur.data.equals(cur.next.data)) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }

        return head;
    }
}
