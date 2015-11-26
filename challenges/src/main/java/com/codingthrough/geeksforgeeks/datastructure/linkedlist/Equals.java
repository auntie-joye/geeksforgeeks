package com.codingthrough.geeksforgeeks.datastructure.linkedlist;

/**
 * Checks either the specified lists are identical or not.
 */
public class Equals {
    /**
     * Checks either the specified lists equal.
     *
     * @param a one list to compare
     * @param b another list to compare
     * @return {@code true} if two lists equal, otherwise - {@code false}
     */
    public static boolean equals(Node a, Node b) {
        while (a != null && b != null) {
            if (!a.data.equals(b.data)) {
                return false;
            }
            a = a.next;
            b = b.next;
        }

        return b == null;
    }

    /**
     * Checks either the specified lists equal.
     *
     * @param a one list to compare
     * @param b another list to compare
     * @return {@code true} if two lists equal, otherwise - {@code false}
     */
    public static boolean equalsRecursive(Node a, Node b) {
        if (a == null) {
            return b == null;
        }

        return a.data.equals(b.data) && equals(a.next, b.next);
    }
}
