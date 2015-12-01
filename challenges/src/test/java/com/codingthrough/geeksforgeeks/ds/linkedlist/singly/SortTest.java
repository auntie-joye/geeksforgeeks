package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

import org.junit.Test;

import static com.codingthrough.geeksforgeeks.ds.linkedlist.singly.IsLinkedListEqual.identicalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

/**
 * Unit tests for {@link  Sort}.
 */
public class SortTest extends TestSupport {
    @Test
    public void canSortNullList() {
        assertThat(Sort.sort(null), is(nullValue()));
    }

    @Test
    public void canSortOneElementList() {
        Node<Integer> head = buildLinkedList(1);
        assertThat(Sort.sort(head), identicalTo(head));
    }

    @Test
    public void canSortTwoElementListWithDifferentValues() {
        Node<Integer> head = buildLinkedList(1, 2);
        assertThat(Sort.sort(head), identicalTo(head));
    }

    @Test
    public void canSortTwoElementListWithSameValues() {
        Node<Integer> head = buildLinkedList(1, 1);
        assertThat(Sort.sort(head), identicalTo(head));
    }

    @Test
    public void shouldJoinZeros() {
        Node<Integer> head = buildLinkedList(0, 1, 0, 2, 0, 0);
        Node<Integer> expected = buildLinkedList(0, 0, 0, 0, 1, 2);
        assertThat(Sort.sort(head), identicalTo(expected));
    }

    @Test
    public void shouldJoinOnes() {
        Node<Integer> head = buildLinkedList(1, 1, 0, 1, 1, 2, 1);
        Node<Integer> expected = buildLinkedList(0, 1, 1, 1, 1, 1, 2);
        assertThat(Sort.sort(head), identicalTo(expected));
    }

    @Test
    public void shouldJoinTwos() {
        Node<Integer> head = buildLinkedList(1, 2, 2, 2, 0, 2, 2);
        Node<Integer> expected = buildLinkedList(0, 1, 2, 2, 2, 2, 2);
        assertThat(Sort.sort(head), identicalTo(expected));
    }

    @Test
    public void shouldJoinZerosOnesTwos() {
        Node<Integer> head = buildLinkedList(0, 0, 1, 2, 0, 1, 2, 0, 2, 0, 1, 1, 2, 1, 0, 2);
        Node<Integer> expected = buildLinkedList(0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2);
        assertThat(Sort.sort(head), identicalTo(expected));
    }
}
