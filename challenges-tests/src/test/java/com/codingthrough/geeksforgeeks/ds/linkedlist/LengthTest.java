package com.codingthrough.geeksforgeeks.ds.linkedlist;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Unit tests for {@link DeleteNAfterM}.
 */
public class LengthTest extends TestSupport {
    @Test
    public void canGetLengthForEmptyList() {
        assertThat(Length.length(null), is(0));
    }

    @Test
    public void canGetLengthForListWithOneElement() {
        final Node<Integer> head = buildLinkedList(1);
        assertThat(Length.length(head), is(1));
    }

    @Test
    public void canGetLengthForListWithEvenNumberOfElements() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4);
        assertThat(Length.length(head), is(4));
    }

    @Test
    public void canGetLengthForListWithOddNumberOfElements() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4, 5);
        assertThat(Length.length(head), is(5));
    }

    @Test
    public void canGetLengthRecursiveForEmptyList() {
        assertThat(Length.lengthRecursive(null), is(0));
    }

    @Test
    public void canGetLengthRecursiveForListWithOneElement() {
        final Node<Integer> head = buildLinkedList(1);
        assertThat(Length.lengthRecursive(head), is(1));
    }

    @Test
    public void canGetLengthRecursiveForListWithEvenNumberOfElements() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4);
        assertThat(Length.lengthRecursive(head), is(4));
    }

    @Test
    public void canGetLengthRecursiveForListWithOddNumberOfElements() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4, 5);
        assertThat(Length.lengthRecursive(head), is(5));
    }
}
