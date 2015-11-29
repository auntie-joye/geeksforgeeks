package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

/**
 * Returns the n-th element from the end of the
 * specified list (index starting from 0 as an array index
 * .
 */
public class GetElementFromTail {
    /**
     * Finds the n-th element from the end of the specified list.
     *
     * @param head the first element of the list
     * @param pos  the list index to find from the end
     * @return n-th element from the end
     * @throws IndexOutOfBoundsException if the specified position is less/greater
     *                                   than list minimum/maximum index respectively.
     */
    public static <T> T getAt(Node<T> head, int pos) {
        Node<T> node = head;
        Node<T> last = head;

        while (pos > 0 && last != null) {
            last = last.next;
            pos--;
        }

        if (pos < 0) {
            throw new IndexOutOfBoundsException("The specified index is leass than the list minimum element index.");
        }
        if (last == null) {
            throw new IndexOutOfBoundsException("The specified index is greater than the list maximum element index.");
        }

        while (last.next != null) {
            last = last.next;
            node = node.next;
        }
        return node.data;
    }

    /**
     * Finds the n-th element from the end of the specified list.
     *
     * @param head the first element of the list
     * @param pos  the list index to find from the end
     * @return n-th element from the end
     * @throws IndexOutOfBoundsException if the specified position is less/greater
     *                                   than list minimum/maximum index respectively.
     */
    public static <T> T getAtRecursive(Node<T> head, int pos) {
        if (pos < 0) {
            throw new IndexOutOfBoundsException("The specified index is leass than the list minimum element index.");
        }
        return getAtRecursive(head, head, pos);
    }

    private static <T> T getAtRecursive(Node<T> node, Node<T> last, int pos) {
        if (pos > 0) {
            if (last == null) {
                throw new IndexOutOfBoundsException("The specified index is greater than the list maximum element index.");
            }

            return getAtRecursive(node, last.next, --pos);
        }

        return last.next == null ? node.data : getAtRecursive(node.next, last.next, pos);
    }
}
