package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

/**
 * Provides different ways to print the linked list.
 */
public class Print {
    /**
     * Prints elements separated by space from the specified list to the output.
     *
     * @param head the first element in the list
     */
    public static void print(Node head) {
        Node cur = head;
        while (cur != null) {
            if (cur != head) {
                System.out.print(" ");
            }
            System.out.print(cur.data);

            cur = cur.next;
        }

        System.out.println();
    }

    /**
     * Prints elements separated by space from the specified list to the output.
     *
     * @param head the first element in the list
     */
    public static void printRecursive(Node head) {
        if (head == null) {
            System.out.println();
            return;
        }

        System.out.print(head.data);
        if (head.next != null) {
            System.out.print(" ");
        }

        printRecursive(head.next);
    }

    /**
     * Prints elements in the reverse order separated by space from the specified list to the output.
     *
     * @param head the first element in the list
     */
    public static void printReverse(Node head) {
        if (head == null) {
            System.out.println();

            return;
        }

        printReverse(head.next);

        if (head.next != null) {
            System.out.print(" ");
        }
        System.out.print(head.data);
    }
}
