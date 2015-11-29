package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

import org.junit.Test;

/**
 * Unit tests for {@link DeleteList}.
 */
public class DeleteListTest extends TestSupport {
    @Test
    public void canDeleteEmptyList() {
        final Node<Integer> head = null;

        DeleteList.delete(head);
    }

    @Test
    public void canDeleteOneElementList() {
        final Node<Integer> head = buildLinkedList(1);

        DeleteList.delete(head);
    }

    @Test
    public void canDeleteSeveralElementsList() {
        final Node<Integer> head = buildLinkedList(1);

        DeleteList.delete(head);
    }

    @Test
    public void canDeleteRecursiveEmptyList() {
        final Node<Integer> head = null;

        DeleteList.deleteRecursive(head);
    }

    @Test
    public void canDeleteRecursiveOneElementList() {
        final Node<Integer> head = buildLinkedList(1);

        DeleteList.deleteRecursive(head);
    }

    @Test
    public void canDeleteRecursiveSeveralElementsList() {
        final Node<Integer> head = buildLinkedList(1);

        DeleteList.deleteRecursive(head);
    }
}
