package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

import org.junit.Test;

import static com.codingthrough.geeksforgeeks.ds.linkedlist.singly.IsLinkedListEqual.identicalTo;
import static org.junit.Assert.assertThat;

/**
 * Unit tests for {@link InsertSorted}.
 */
public class InsertSortedTest extends TestSupport {
    @Test
    public void canInsertInEmptyList() {
        Node<Integer> expected = buildLinkedList(1);

        assertThat(InsertSorted.insert(null, 1), identicalTo(expected));
    }

    @Test
    public void canInsertInOneElementListBeforeHead() {
        Node<Integer> head = buildLinkedList(4);
        Node<Integer> expected = buildLinkedList(1, 4);

        assertThat(InsertSorted.insert(head, 1), identicalTo(expected));
    }

    @Test
    public void canInsertInOneElementListAfterHead() {
        Node<Integer> head = buildLinkedList(4);
        Node<Integer> expected = buildLinkedList(4, 6);

        assertThat(InsertSorted.insert(head, 6), identicalTo(expected));
    }

    @Test
    public void canInsertInSeveralElementsListBeforeHead() {
        Node<Integer> head = buildLinkedList(2, 4, 6);
        Node<Integer> expected = buildLinkedList(1, 2, 4, 6);

        assertThat(InsertSorted.insert(head, 1), identicalTo(expected));
    }

    @Test
    public void canInsertInSeveralElementsListAfterTail() {
        Node<Integer> head = buildLinkedList(2, 4, 6);
        Node<Integer> expected = buildLinkedList(2, 4, 6, 8);

        assertThat(InsertSorted.insert(head, 8), identicalTo(expected));
    }

    @Test
    public void canInsertInSeveralElementsListInTheMiddle() {
        Node<Integer> head = buildLinkedList(2, 4, 6);
        Node<Integer> expected = buildLinkedList(2, 4, 5, 6);

        assertThat(InsertSorted.insert(head, 5), identicalTo(expected));
    }
}
