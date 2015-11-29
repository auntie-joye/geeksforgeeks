package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

import org.junit.Test;

import static com.codingthrough.geeksforgeeks.ds.linkedlist.singly.IsLinkedListEqual.identicalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

/**
 * Unit tests for {@link SplitByAlternate}.
 */
public class SplitByAlternateTest extends TestSupport {
    @Test
    public void canSplitEmptyList() {
        SplitByAlternate.Split<Integer> actual = SplitByAlternate.split(null);
        assertThat(actual.a, is(nullValue()));
        assertThat(actual.b, is(nullValue()));
    }

    @Test
    public void canSplitOneElementList() {
        Node<Integer> head = buildLinkedList(1);
        Node<Integer> expectedA = buildLinkedList(1);

        SplitByAlternate.Split<Integer> actual = SplitByAlternate.split(head);
        assertThat(actual.a, identicalTo(expectedA));
        assertThat(actual.b, is(nullValue()));
    }

    @Test
    public void canSplitEvenElementsList() {
        Node<Integer> head = buildLinkedList(1, 2, 3, 4);
        Node<Integer> expectedA = buildLinkedList(1, 3);
        Node<Integer> expectedB = buildLinkedList(2, 4);

        SplitByAlternate.Split<Integer> actual = SplitByAlternate.split(head);
        assertThat(actual.a, identicalTo(expectedA));
        assertThat(actual.b, identicalTo(expectedB));
    }

    @Test
    public void canSplitOddElementsList() {
        Node<Integer> head = buildLinkedList(1, 2, 3, 4, 5);
        Node<Integer> expectedA = buildLinkedList(1, 3, 5);
        Node<Integer> expectedB = buildLinkedList(2, 4);

        SplitByAlternate.Split<Integer> actual = SplitByAlternate.split(head);
        assertThat(actual.a, identicalTo(expectedA));
        assertThat(actual.b, identicalTo(expectedB));
    }

    @Test
    public void canSplitRecursiveEmptyList() {
        SplitByAlternate.Split<Integer> actual = SplitByAlternate.splitRecursive(null);
        assertThat(actual.a, is(nullValue()));
        assertThat(actual.b, is(nullValue()));
    }

    @Test
    public void canSplitRecursiveOneElementList() {
        Node<Integer> head = buildLinkedList(1);
        Node<Integer> expectedA = buildLinkedList(1);

        SplitByAlternate.Split<Integer> actual = SplitByAlternate.splitRecursive(head);
        assertThat(actual.a, identicalTo(expectedA));
        assertThat(actual.b, is(nullValue()));
    }

    @Test
    public void canSplitRecursiveEvenElementsList() {
        Node<Integer> head = buildLinkedList(1, 2, 3, 4);
        Node<Integer> expectedA = buildLinkedList(1, 3);
        Node<Integer> expectedB = buildLinkedList(2, 4);

        SplitByAlternate.Split<Integer> actual = SplitByAlternate.splitRecursive(head);
        assertThat(actual.a, identicalTo(expectedA));
        assertThat(actual.b, identicalTo(expectedB));
    }

    @Test
    public void canSplitRecursiveOddElementsList() {
        Node<Integer> head = buildLinkedList(1, 2, 3, 4, 5);
        Node<Integer> expectedA = buildLinkedList(1, 3, 5);
        Node<Integer> expectedB = buildLinkedList(2, 4);

        SplitByAlternate.Split<Integer> actual = SplitByAlternate.splitRecursive(head);
        assertThat(actual.a, identicalTo(expectedA));
        assertThat(actual.b, identicalTo(expectedB));
    }
}
