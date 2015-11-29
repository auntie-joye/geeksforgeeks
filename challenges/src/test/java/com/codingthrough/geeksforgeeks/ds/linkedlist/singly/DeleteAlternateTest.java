package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

/**
 * Unit tests for {@link DeleteAlternate}.
 */
public class DeleteAlternateTest extends TestSupport {
    @Test
    public void canDeleteWhenListIsEmpty() {
        final Node actual = DeleteAlternate.delete(null);
        assertThat(actual, is(nullValue()));
    }

    @Test
    public void canDeleteWhenListHasOneElement() {
        final Node<Integer> head = buildLinkedList(1);
        final Node<Integer> expected = buildLinkedList(1);

        final Node<Integer> actual = DeleteAlternate.delete(head);
        assertThat(actual, IsLinkedListEqual.identicalTo(expected));
    }

    @Test
    public void canDeleteWhenListHasTwoElements() {
        final Node<Integer> head = buildLinkedList(1, 2);
        final Node<Integer> expected = buildLinkedList(1);

        final Node<Integer> actual = DeleteAlternate.delete(head);
        assertThat(actual, IsLinkedListEqual.identicalTo(expected));
    }

    @Test
    public void canDeleteWhenListHasOddNumberOfElements() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4, 5);
        final Node<Integer> expected = buildLinkedList(1, 3, 5);

        final Node<Integer> actual = DeleteAlternate.delete(head);
        assertThat(actual, IsLinkedListEqual.identicalTo(expected));
    }

    @Test
    public void canDeleteWhenListHasEvenNumberOfElements() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4);
        final Node<Integer> expected = buildLinkedList(1, 3);

        final Node<Integer> actual = DeleteAlternate.delete(head);
        assertThat(actual, IsLinkedListEqual.identicalTo(expected));
    }

    @Test
    public void canDeleteRecursiveWhenListIsEmpty() {
        final Node actual = DeleteAlternate.deleteRecursive(null);
        assertThat(actual, is(nullValue()));
    }

    @Test
    public void canDeleteRecursiveWhenListHasOneElement() {
        final Node<Integer> head = buildLinkedList(1);
        final Node<Integer> expected = buildLinkedList(1);

        final Node<Integer> actual = DeleteAlternate.deleteRecursive(head);
        assertThat(actual, IsLinkedListEqual.identicalTo(expected));
    }

    @Test
    public void canDeleteRecursiveWhenListHasTwoElements() {
        final Node<Integer> head = buildLinkedList(1, 2);
        final Node<Integer> expected = buildLinkedList(1);

        final Node<Integer> actual = DeleteAlternate.deleteRecursive(head);
        assertThat(actual, IsLinkedListEqual.identicalTo(expected));
    }

    @Test
    public void canDeleteRecursiveWhenListHasOddNumberOfElements() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4, 5);
        final Node<Integer> expected = buildLinkedList(1, 3, 5);

        final Node<Integer> actual = DeleteAlternate.deleteRecursive(head);
        assertThat(actual, IsLinkedListEqual.identicalTo(expected));
    }

    @Test
    public void canDeleteRecursiveWhenListHasEvenNumberOfElements() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4);
        final Node<Integer> expected = buildLinkedList(1, 3);

        final Node<Integer> actual = DeleteAlternate.deleteRecursive(head);
        assertThat(actual, IsLinkedListEqual.identicalTo(expected));
    }
}
