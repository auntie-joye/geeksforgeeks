package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

import org.junit.Test;

import static com.codingthrough.geeksforgeeks.ds.linkedlist.singly.IsLinkedListEqual.identicalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

/**
 * Unit tests for {@link SortAlternateSorting2}.
 */
public class SortAlternateSorting2Test extends TestSupport {
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
        Node<Integer> head = buildLinkedList(1, 5, 3, 7, 6, 15, 12, 17, 21);
        Node<Integer> expected = buildLinkedList(1, 3, 5, 7, 6, 12, 15, 17, 21);
        assertThat(SortAlternateSorting.sort(head), identicalTo(head));
    }
}
