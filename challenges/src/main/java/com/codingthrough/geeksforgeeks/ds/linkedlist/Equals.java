package com.codingthrough.geeksforgeeks.ds.linkedlist;

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
            if (!equals(a.data, b.data)) {
                return false;
            }
            a = a.next;
            b = b.next;
        }

        return a == null && b == null;
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

        return b != null && equals(a.data, b.data) && equals(a.next, b.next);

    }

    private static <T> boolean equals(T a, T b) {
        return ((a == null && b == null) || (a != null && a.equals(b)));
    }
}
