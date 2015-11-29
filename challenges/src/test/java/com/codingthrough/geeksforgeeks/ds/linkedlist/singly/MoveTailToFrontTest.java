package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

import org.junit.Test;

import static com.codingthrough.geeksforgeeks.ds.linkedlist.singly.IsLinkedListEqual.identicalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

/**
 * Unit tests for {@link MoveTailToFront}.
 */
public class MoveTailToFrontTest extends TestSupport {
    @Test
    public void canMoveInEmptyLists() {
        final Node<Integer> head = null;

        assertThat(MoveTailToFront.move(head), is(nullValue()));
    }

    @Test
    public void canMoveInOneElementList() {
        final Node<Integer> head = buildLinkedList(1);
        final Node<Integer> expected = buildLinkedList(1);

        assertThat(MoveTailToFront.move(head), identicalTo(expected));
    }

    @Test
    public void canMoveInTwoElementsList() {
        final Node<Integer> head = buildLinkedList(1, 2);
        final Node<Integer> expected = buildLinkedList(2, 1);

        assertThat(MoveTailToFront.move(head), identicalTo(expected));
    }

    @Test
    public void canMoveInSeveralElementsList() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4, 5);
        final Node<Integer> expected = buildLinkedList(5, 1, 2, 3, 4);

        assertThat(MoveTailToFront.move(head), identicalTo(expected));
    }
}
