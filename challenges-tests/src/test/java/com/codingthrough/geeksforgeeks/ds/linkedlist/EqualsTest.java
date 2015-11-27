package com.codingthrough.geeksforgeeks.ds.linkedlist;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Unit tests for {@link Equals}.
 */
public class EqualsTest extends TestSupport {
    @Test
    public void canCompareEmptyLists() {
        assertThat(Equals.equals(null, null), is(true));
    }

    @Test
    public void canCompareEmptyListAndNotEmptyList() {
        final Node<Integer> a = buildLinkedList(1);
        assertThat(Equals.equals(a, null), is(false));
        assertThat(Equals.equals(null, a), is(false));
    }

    @Test
    public void canCompareIdenticalOneElementLists() {
        final Node<Integer> a = buildLinkedList(1);
        final Node<Integer> b = buildLinkedList(1);
        assertThat(Equals.equals(a, b), is(true));
        assertThat(Equals.equals(b, a), is(true));
    }

    @Test
    public void canCompareIdenticalEvenElementLists() {
        final Node<Integer> a = buildLinkedList(1, 2, 3, 4);
        final Node<Integer> b = buildLinkedList(1, 2, 3, 4);
        assertThat(Equals.equals(a, b), is(true));
        assertThat(Equals.equals(b, a), is(true));
    }

    @Test
    public void canCompareIdenticalOddElementLists() {
        final Node<Integer> a = buildLinkedList(1, 2, 3, 4, 5);
        final Node<Integer> b = buildLinkedList(1, 2, 3, 4, 5);
        assertThat(Equals.equals(a, b), is(true));
        assertThat(Equals.equals(b, a), is(true));
    }

    @Test
    public void canCompareListsWithSameElementsInDifferentOrder() {
        final Node<Integer> a = buildLinkedList(1, 2, 3, 4, 5);
        final Node<Integer> b = buildLinkedList(5, 4, 3, 2, 1);
        assertThat(Equals.equals(a, b), is(false));
        assertThat(Equals.equals(b, a), is(false));
    }

    @Test
    public void canCompareListsWithDifferentElementsButSameLength() {
        final Node<Integer> a = buildLinkedList(1, 2, 3, 4, 5);
        final Node<Integer> b = buildLinkedList(1, 2, 3, 4, 6);
        assertThat(Equals.equals(a, b), is(false));
        assertThat(Equals.equals(b, a), is(false));
    }

    @Test
    public void canCompareListsWithDifferentElementsAndLength() {
        final Node<Integer> a = buildLinkedList(1, 2, 3, 4, 5);
        final Node<Integer> b = buildLinkedList(1, 2, 3);
        assertThat(Equals.equals(a, b), is(false));
        assertThat(Equals.equals(b, a), is(false));
    }

    @Test
    public void canCompareDifferentListsWithNullElement() {
        final Node<Integer> a = buildLinkedList(1, 2, null, 4, 5);
        final Node<Integer> b = buildLinkedList(1, 2, 3);
        assertThat(Equals.equals(a, b), is(false));
        assertThat(Equals.equals(b, a), is(false));
    }

    @Test
    public void canCompareSameListsWithNullElement() {
        final Node<Integer> a = buildLinkedList(1, 2, null, 4, 5);
        final Node<Integer> b = buildLinkedList(1, 2, null, 4, 5);
        assertThat(Equals.equals(a, b), is(true));
        assertThat(Equals.equals(b, a), is(true));
    }

    @Test
    public void canCompareRecursiveEmptyLists() {
        assertThat(Equals.equalsRecursive(null, null), is(true));
    }

    @Test
    public void canCompareRecursiveEmptyListAndNotEmptyList() {
        final Node<Integer> a = buildLinkedList(1);
        assertThat(Equals.equalsRecursive(a, null), is(false));
        assertThat(Equals.equalsRecursive(null, a), is(false));
    }

    @Test
    public void canCompareRecursiveIdenticalOneElementLists() {
        final Node<Integer> a = buildLinkedList(1);
        final Node<Integer> b = buildLinkedList(1);
        assertThat(Equals.equalsRecursive(a, b), is(true));
        assertThat(Equals.equalsRecursive(b, a), is(true));
    }

    @Test
    public void canCompareRecursiveIdenticalEvenElementLists() {
        final Node<Integer> a = buildLinkedList(1, 2, 3, 4);
        final Node<Integer> b = buildLinkedList(1, 2, 3, 4);
        assertThat(Equals.equalsRecursive(a, b), is(true));
        assertThat(Equals.equalsRecursive(b, a), is(true));
    }

    @Test
    public void canCompareRecursiveIdenticalOddElementLists() {
        final Node<Integer> a = buildLinkedList(1, 2, 3, 4, 5);
        final Node<Integer> b = buildLinkedList(1, 2, 3, 4, 5);
        assertThat(Equals.equalsRecursive(a, b), is(true));
        assertThat(Equals.equalsRecursive(b, a), is(true));
    }

    @Test
    public void canCompareRecursiveListsWithSameElementsInDifferentOrder() {
        final Node<Integer> a = buildLinkedList(1, 2, 3, 4, 5);
        final Node<Integer> b = buildLinkedList(5, 4, 3, 2, 1);
        assertThat(Equals.equalsRecursive(a, b), is(false));
        assertThat(Equals.equalsRecursive(b, a), is(false));
    }

    @Test
    public void canCompareRecursiveListsWithDifferentElementsButSameLength() {
        final Node<Integer> a = buildLinkedList(1, 2, 3, 4, 5);
        final Node<Integer> b = buildLinkedList(1, 2, 3, 4, 6);
        assertThat(Equals.equalsRecursive(a, b), is(false));
        assertThat(Equals.equalsRecursive(b, a), is(false));
    }

    @Test
    public void canCompareRecursiveListsWithDifferentElementsAndLength() {
        final Node<Integer> a = buildLinkedList(1, 2, 3, 4, 5);
        final Node<Integer> b = buildLinkedList(1, 2, 3);
        assertThat(Equals.equalsRecursive(a, b), is(false));
        assertThat(Equals.equalsRecursive(b, a), is(false));
    }

    @Test
    public void canCompareRecursiveDifferentListsWithNullElement() {
        final Node<Integer> a = buildLinkedList(1, 2, null, 4, 5);
        final Node<Integer> b = buildLinkedList(1, 2, 3);
        assertThat(Equals.equalsRecursive(a, b), is(false));
        assertThat(Equals.equalsRecursive(b, a), is(false));
    }

    @Test
    public void canCompareRecursiveSameListsWithNullElement() {
        final Node<Integer> a = buildLinkedList(1, 2, null, 4, 5);
        final Node<Integer> b = buildLinkedList(1, 2, null, 4, 5);
        assertThat(Equals.equalsRecursive(a, b), is(true));
        assertThat(Equals.equalsRecursive(b, a), is(true));
    }
}
