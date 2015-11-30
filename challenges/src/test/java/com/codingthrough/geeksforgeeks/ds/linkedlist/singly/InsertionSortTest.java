package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

import org.junit.Test;

import static com.codingthrough.geeksforgeeks.ds.linkedlist.singly.IsLinkedListEqual.identicalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

/**
 * Unit tests for {@link InsertionSort}.
 */
public class InsertionSortTest extends TestSupport {
    @Test
    public void canSortEmptyList() {
        Node<Integer> head = null;
        assertThat(InsertionSort.sort(head), is(nullValue()));
    }

    @Test
    public void canSortOneElementList() {
        Node<Integer> head = buildLinkedList(1);
        assertThat(InsertionSort.sort(head), identicalTo(head));
    }

    @Test
    public void canSortTwoElementsUnsortedList() {
        Node<Integer> head = buildLinkedList(2, 1);
        Node<Integer> expected = buildLinkedList(1, 2);
        assertThat(InsertionSort.sort(head), identicalTo(expected));
    }

    @Test
    public void canSortTwoElementsSortedList() {
        Node<Integer> head = buildLinkedList(1, 2);
        Node<Integer> expected = buildLinkedList(1, 2);
        assertThat(InsertionSort.sort(head), identicalTo(expected));
    }

    @Test
    public void canSortSeveralElementsUnsortedList() {
        Node<Integer> head = buildLinkedList(4, 1, 5, 2, 3);
        Node<Integer> expected = buildLinkedList(1, 2, 3, 4, 5);
        assertThat(InsertionSort.sort(head), identicalTo(expected));
    }

    @Test
    public void canSortSeveralElementsSortedList() {
        Node<Integer> head = buildLinkedList(1, 2, 3, 4, 5);
        Node<Integer> expected = buildLinkedList(1, 2, 3, 4, 5);
        assertThat(InsertionSort.sort(head), identicalTo(expected));
    }

    @Test
    public void canSortSeveralElementsReverseSortedList() {
        Node<Integer> head = buildLinkedList(5, 4, 3, 2, 1);
        Node<Integer> expected = buildLinkedList(1, 2, 3, 4, 5);
        assertThat(InsertionSort.sort(head), identicalTo(expected));
    }
}
