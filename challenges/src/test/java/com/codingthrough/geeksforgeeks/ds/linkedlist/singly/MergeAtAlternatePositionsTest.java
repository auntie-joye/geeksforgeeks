package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

import org.junit.Test;

import static com.codingthrough.geeksforgeeks.ds.linkedlist.singly.IsLinkedListEqual.identicalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

/**
 * Unit tests for {@link MergeAtAlternatePositions}.
 */
public class MergeAtAlternatePositionsTest extends TestSupport {
    @Test
    public void returnsNullWhenOneOFTheListIsNull() {
        Node<Integer> a = buildLinkedList(1);
        assertThat(MergeAtAlternatePositions.merge(a, null), is(nullValue()));
        assertThat(MergeAtAlternatePositions.merge(null, a), is(nullValue()));
    }

    @Test
    public void mergesEqualLengthLists() {
        Node<Integer> a = buildLinkedList(1, 2, 3);
        Node<Integer> b = buildLinkedList(4, 5, 6);
        Node<Integer> expected = buildLinkedList(1, 4, 2, 5, 3, 6);

        assertThat(MergeAtAlternatePositions.merge(a, b), identicalTo(expected));
    }

    @Test
    public void mergesWhenLeftIsOneElementGreater() {
        Node<Integer> a = buildLinkedList(1, 2, 3);
        Node<Integer> b = buildLinkedList(4, 5);
        Node<Integer> expected = buildLinkedList(1, 4, 2, 5);

        assertThat(MergeAtAlternatePositions.merge(a, b), identicalTo(expected));
    }

    @Test
    public void mergesWhenRightIsOneElementGreater() {
        Node<Integer> a = buildLinkedList(1, 2);
        Node<Integer> b = buildLinkedList(4, 5, 6);
        Node<Integer> expected = buildLinkedList(1, 4, 2, 5);

        assertThat(MergeAtAlternatePositions.merge(a, b), identicalTo(expected));
    }

    @Test
    public void mergesWhenLeftIsSeveralElementsGreater() {
        Node<Integer> a = buildLinkedList(1, 2, 3, 6, 7, 8);
        Node<Integer> b = buildLinkedList(4, 5);
        Node<Integer> expected = buildLinkedList(1, 4, 2, 5);

        assertThat(MergeAtAlternatePositions.merge(a, b), identicalTo(expected));
    }

    @Test
    public void mergesWhenRightIsSeveralElementsGreater() {
        Node<Integer> a = buildLinkedList(1, 2);
        Node<Integer> b = buildLinkedList(4, 5, 6, 7, 8);
        Node<Integer> expected = buildLinkedList(1, 4, 2, 5);

        assertThat(MergeAtAlternatePositions.merge(a, b), identicalTo(expected));
    }
}
