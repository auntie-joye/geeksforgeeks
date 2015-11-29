package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

import org.junit.Test;

import static com.codingthrough.geeksforgeeks.ds.linkedlist.singly.IsLinkedListEqual.identicalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

/**
 * Unit tests for {@link Reverse}.
 */
public class ReverseTest extends TestSupport {
    @Test
    public void canReverseEmptyList() {
        assertThat(Reverse.reverse(null), is(nullValue()));
    }

    @Test
    public void canReverseOneElementList() {
        Node<Integer> head = buildLinkedList(1);
        Node<Integer> expected = buildLinkedList(1);
        assertThat(Reverse.reverse(head), identicalTo(expected));
    }

    @Test
    public void canReverseEvenElementsList() {
        Node<Integer> head = buildLinkedList(1, 2, 3, 4);
        Node<Integer> expected = buildLinkedList(4, 3, 2, 1);
        assertThat(Reverse.reverse(head), identicalTo(expected));
    }

    @Test
    public void canReverseOddElementsList() {
        Node<Integer> head = buildLinkedList(1, 2, 3);
        Node<Integer> expected = buildLinkedList(3, 2, 1);
        assertThat(Reverse.reverse(head), identicalTo(expected));
    }

    @Test
    public void canReverseRecursiveEmptyList() {
        assertThat(Reverse.reverseRecursive(null), is(nullValue()));
    }

    @Test
    public void canReverseRecursiveOneElementList() {
        Node<Integer> head = buildLinkedList(1);
        Node<Integer> expected = buildLinkedList(1);
        assertThat(Reverse.reverseRecursive(head), identicalTo(expected));
    }

    @Test
    public void canReverseRecursiveEvenElementsList() {
        Node<Integer> head = buildLinkedList(1, 2, 3, 4);
        Node<Integer> expected = buildLinkedList(4, 3, 2, 1);
        assertThat(Reverse.reverseRecursive(head), identicalTo(expected));
    }

    @Test
    public void canReverseRecursiveOddElementsList() {
        Node<Integer> head = buildLinkedList(1, 2, 3);
        Node<Integer> expected = buildLinkedList(3, 2, 1);
        assertThat(Reverse.reverseRecursive(head), identicalTo(expected));
    }
}
