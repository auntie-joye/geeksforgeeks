package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

import org.junit.Test;

import static com.codingthrough.geeksforgeeks.ds.linkedlist.singly.IsLinkedListEqual.identicalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

/**
 * Unit tests for {@link Merge}.
 */
public class MergeTest extends TestSupport {
    @Test
    public void canMergeEmptyLists() {
        final Node<Integer> a = null;
        final Node<Integer> b = null;

        assertThat(Merge.merge(a, b), is(nullValue()));
    }

    @Test
    public void canMergeEmptyAndNotEmptyList() {
        final Node<Integer> a = null;
        final Node<Integer> b = buildLinkedList(1, 2, 3);
        final Node<Integer> expected = buildLinkedList(1, 2, 3);

        assertThat(Merge.merge(a, b), identicalTo(expected));
    }

    @Test
    public void canMergeNotEmptyListAndEmpty() {
        final Node<Integer> a = buildLinkedList(1, 2, 3);
        final Node<Integer> b = null;
        final Node<Integer> expected = buildLinkedList(1, 2, 3);

        assertThat(Merge.merge(a, b), identicalTo(expected));
    }

    @Test
    public void canMergeNotEmptyListsWithEvenElements() {
        final Node<Integer> a = buildLinkedList(1, 3, 5, 7);
        final Node<Integer> b = buildLinkedList(2, 4, 6, 6);
        final Node<Integer> expected = buildLinkedList(1, 2, 3, 4, 5, 6, 6, 7);

        assertThat(Merge.merge(a, b), identicalTo(expected));
    }

    @Test
    public void canMergeNotEmptyListsWithOddElements() {
        final Node<Integer> a = buildLinkedList(1, 3, 5);
        final Node<Integer> b = buildLinkedList(2, 3, 6);
        final Node<Integer> expected = buildLinkedList(1, 2, 3, 3, 5, 6);

        assertThat(Merge.merge(a, b), identicalTo(expected));
    }

    @Test
    public void canMergeNotEmptyListsWithOddAndEvenElements() {
        final Node<Integer> a = buildLinkedList(1, 3, 5);
        final Node<Integer> b = buildLinkedList(2, 3, 4, 6);
        final Node<Integer> expected = buildLinkedList(1, 2, 3, 3, 4, 5, 6);

        assertThat(Merge.merge(a, b), identicalTo(expected));
    }

    @Test
    public void canMergeNotEmptyListsWithEvenAndOddElements() {
        final Node<Integer> a = buildLinkedList(1, 3, 4, 5);
        final Node<Integer> b = buildLinkedList(2, 3, 4);
        final Node<Integer> expected = buildLinkedList(1, 2, 3, 3, 4, 4, 5);

        assertThat(Merge.merge(a, b), identicalTo(expected));
    }

    @Test
    public void canMergeNotEmptyListsWithNullElements() {
        final Node<Integer> a = buildLinkedList(null, 3, 4, 5);
        final Node<Integer> b = buildLinkedList(null, 3, 4);
        final Node<Integer> expected = buildLinkedList(null, null, 3, 3, 4, 4, 5);

        assertThat(Merge.merge(a, b), identicalTo(expected));
    }

    @Test
    public void canMergeRecursiveEmptyLists() {
        final Node<Integer> a = null;
        final Node<Integer> b = null;

        assertThat(Merge.mergeRecursive(a, b), is(nullValue()));
    }

    @Test
    public void canMergeRecursiveEmptyAndNotEmptyList() {
        final Node<Integer> a = null;
        final Node<Integer> b = buildLinkedList(1, 2, 3);
        final Node<Integer> expected = buildLinkedList(1, 2, 3);

        assertThat(Merge.mergeRecursive(a, b), identicalTo(expected));
    }

    @Test
    public void canMergeRecursiveNotEmptyListAndEmpty() {
        final Node<Integer> a = buildLinkedList(1, 2, 3);
        final Node<Integer> b = null;
        final Node<Integer> expected = buildLinkedList(1, 2, 3);

        assertThat(Merge.mergeRecursive(a, b), identicalTo(expected));
    }

    @Test
    public void canMergeRecursiveNotEmptyListsWithEvenElements() {
        final Node<Integer> a = buildLinkedList(1, 3, 5, 7);
        final Node<Integer> b = buildLinkedList(2, 4, 6, 6);
        final Node<Integer> expected = buildLinkedList(1, 2, 3, 4, 5, 6, 6, 7);

        assertThat(Merge.mergeRecursive(a, b), identicalTo(expected));
    }

    @Test
    public void canMergeRecursiveNotEmptyListsWithOddElements() {
        final Node<Integer> a = buildLinkedList(1, 3, 5);
        final Node<Integer> b = buildLinkedList(2, 3, 6);
        final Node<Integer> expected = buildLinkedList(1, 2, 3, 3, 5, 6);

        assertThat(Merge.mergeRecursive(a, b), identicalTo(expected));
    }

    @Test
    public void canMergeRecursiveNotEmptyListsWithOddAndEvenElements() {
        final Node<Integer> a = buildLinkedList(1, 3, 5);
        final Node<Integer> b = buildLinkedList(2, 3, 4, 6);
        final Node<Integer> expected = buildLinkedList(1, 2, 3, 3, 4, 5, 6);

        assertThat(Merge.mergeRecursive(a, b), identicalTo(expected));
    }

    @Test
    public void canMergeRecursiveNotEmptyListsWithEvenAndOddElements() {
        final Node<Integer> a = buildLinkedList(1, 3, 4, 5);
        final Node<Integer> b = buildLinkedList(2, 3, 4);
        final Node<Integer> expected = buildLinkedList(1, 2, 3, 3, 4, 4, 5);

        assertThat(Merge.mergeRecursive(a, b), identicalTo(expected));
    }

    @Test
    public void canMergeRecursiveNotEmptyListsWithNullElements() {
        final Node<Integer> a = buildLinkedList(null, 3, 4, 5);
        final Node<Integer> b = buildLinkedList(null, 3, 4);
        final Node<Integer> expected = buildLinkedList(null, null, 3, 3, 4, 4, 5);

        assertThat(Merge.mergeRecursive(a, b), identicalTo(expected));
    }
}
