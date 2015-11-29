package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

/**
 * Provides different ways to remove node from the linked list.
 */
public class Deletion {
    /**
     * Removed element from front of the specified list.
     *
     * @param head the first element of the linked list
     * @return new first element of the linked list
     * @throws IllegalArgumentException if the head of the list is {@code null}
     */
    public static <T> Node<T> deleteFirst(Node<T> head) {
        if (head == null) {
            throw new IllegalArgumentException("You should specify not empty list.");
        }

        Node<T> deleted = head;
        head = head.next;

        deleted.next = null;
        return head;
    }

    /**
     * Removes element from tail of the specified list.
     *
     * @param head the first element of the linked list
     * @return new first element of the linked list
     * @throws IllegalArgumentException if the head of the list is {@code null}
     */
    public static <T> Node<T> deleteLast(Node<T> head) {
        if (head == null) {
            throw new IllegalArgumentException("You should specify not empty list.");
        }

        if (head.next == null) {
            return deleteFirst(head);
        }

        Node<T> cur = head;
        while (cur.next.next != null) {
            cur = cur.next;
        }

        deleteAfter(cur);

        return head;
    }

    /**
     * Removes element after the specified element.
     *
     * @param node element after which new element will be removed
     * @throws IllegalArgumentException if the element after which new element should be removed is {@code null}
     * @throws IllegalArgumentException if there is no element after the specified one
     */
    public static <T> void deleteAfter(Node<T> node) {
        if (node == null) {
            throw new IllegalArgumentException("You should specify not null node pointer.");
        }

        if (node.next == null) {
            throw new IllegalArgumentException("There is no element to be deleted.");
        }

        Node<T> deleted = node.next;
        node.next = node.next.next;

        deleted.next = null;
    }

    /**
     * Removes element before the specified element.
     *
     * @param head the first element of the linked list
     * @param node element before which element will be removed
     * @return first element of the linked list
     * @throws IllegalArgumentException if the element before which new element should be removed is {@code null}
     * @throws IllegalArgumentException if the head of the linked list is {@code null}
     * @throws IllegalStateException    if the element before which new element should be removed is not
     *                                  found in the specified linked list
     */
    public static <T> Node<T> deleteBefore(Node<T> head, Node<T> node) {
        if (node == null) {
            throw new IllegalArgumentException("You should specify not null node pointer.");
        }

        if (head == null) {
            throw new IllegalArgumentException("You should specify not empty list.");
        }

        if (head == node) {
            throw new IllegalArgumentException("There is no element to be deleted.");
        }

        Node<T> cur = head;
        while (cur != null && cur.next != node) {
            cur = cur.next;
        }

        if (cur == null) {
            throw new IllegalStateException("The specified node is not found in the specified linked list.");
        }

        deleteAfter(cur);

        return head;
    }

    /**
     * Removes element at the specified position (started from 0 as array index).
     *
     * @param head the first element of the linked list
     * @param pos  position of the new element to be removed
     * @return first element of the linked list
     * @throws IllegalArgumentException  if the head of the linked list is {@code null}
     * @throws IndexOutOfBoundsException if the specified position is out of bounds on the linked list
     */
    public static <T> Node<T> deleteAt(Node<T> head, int pos) {
        if (pos < 0) {
            throw new IndexOutOfBoundsException("The specified position is less than the minimal list index.");
        }

        if (pos == 0) {
            return deleteFirst(head);
        }

        Node<T> cur = head;
        while (cur != null && pos > 1) {
            cur = cur.next;
            pos--;
        }

        if (cur == null) {
            throw new IndexOutOfBoundsException("The specified position is greater than the maximum list index.");
        }

        deleteAfter(cur);
        return head;
    }

    /**
     * Removes element with the specified data.
     *
     * @param head the first element of the linked list
     * @param data the key to found the deleted element
     * @return first element of the linked list
     * @throws IllegalArgumentException  if the head of the linked list is {@code null}
     * @throws IndexOutOfBoundsException if the specified position is out of bounds on the linked list
     */
    public static <T> Node<T> delete(Node<T> head, T data) {
        if (head == null) {
            throw new IllegalArgumentException("You should specify not empty list.");
        }

        if (data.equals(head.data)) {
            return deleteFirst(head);
        }

        Node<T> cur = head;
        while (cur != null && !data.equals(cur.next.data)) {
            cur = cur.next;
        }

        if (cur == null) {
            throw new IllegalStateException("The specified node is not found in the specified linked list.");
        }

        deleteAfter(cur);

        return head;
    }
}
