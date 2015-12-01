package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

import org.junit.Test;

import static com.codingthrough.geeksforgeeks.ds.linkedlist.singly.IsLinkedListEqual.identicalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

/**
 * Unit tests for {@link SortAlternateSorting}.
 */
public class SortAlternateSortingTest extends TestSupport {
    @Test
    public void canSortNullList() {
        Node<Integer> head = null;
        assertThat(SortAlternateSorting.sort(head), is(nullValue()));
    }

    @Test
    public void canSortOneElementList() {
        Node<Integer> head = buildLinkedList(1);
        assertThat(SortAlternateSorting.sort(head), identicalTo(head));
    }

    @Test
    public void canSortAlreadySortedList() {
        Node<Integer> head = buildLinkedList(1, 2, 3, 4, 5);
        assertThat(SortAlternateSorting.sort(head), identicalTo(head));
    }

    @Test
    public void canSortAlternateSorted() {
        Node<Integer> head = buildLinkedList(1, 17, 3, 15, 6, 7, 12, 5, 21);
        Node<Integer> expected = buildLinkedList(1, 3, 5, 7, 6, 12, 15, 17, 21);
        assertThat(SortAlternateSorting.sort(head), identicalTo(head));
    }
}
