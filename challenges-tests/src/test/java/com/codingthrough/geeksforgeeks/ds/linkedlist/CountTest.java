package com.codingthrough.geeksforgeeks.ds.linkedlist;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Unit tests for {@link Count}.
 */
public class CountTest extends TestSupport {
    @Test
    public void canCountWhenListIsEmpty() {
        final int actual = Count.count(null, 1);
        assertThat(actual, is(0));
    }

    @Test
    public void canCountWhenListHasOneElementAndItIsEqual() {
        final Node<Integer> head = buildLinkedList(1);
        final int actual = Count.count(head, 1);
        assertThat(actual, is(1));
    }

    @Test
    public void canCountWhenListHasOneElementAndItIsNotEqual() {
        final Node<Integer> head = buildLinkedList(2);
        final int actual = Count.count(head, 1);
        assertThat(actual, is(0));
    }

    @Test
    public void canCountWhenListHasSeveralElementsAndOneIsEqual() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4, 5);
        final int actual = Count.count(head, 3);
        assertThat(actual, is(1));
    }

    @Test
    public void canCountWhenListHasSeveralElementsAndNoOneIsEqual() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4, 5);
        final int actual = Count.count(head, 6);
        assertThat(actual, is(0));
    }

    @Test
    public void canCountWhenListHasSeveralElementsAndSeveralAreEqual() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 2, 5);
        final int actual = Count.count(head, 2);
        assertThat(actual, is(2));
    }

    @Test
    public void canCountWhenListHasSeveralElementsAndAllAreEqual() {
        final Node<Integer> head = buildLinkedList(2, 2, 2, 2);
        final int actual = Count.count(head, 2);
        assertThat(actual, is(4));
    }

    @Test
    public void canCountNullElementWhenThereIsNoSuchElementInTheList() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4);
        final int actual = Count.count(head, null);
        assertThat(actual, is(0));
    }

    @Test
    public void canCountNullElementWhenThereAreSeveralSuchElementsInTheList() {
        final Node<Integer> head = buildLinkedList(1, null, 3, null);
        final int actual = Count.count(head, null);
        assertThat(actual, is(2));
    }

    @Test
    public void canCountRecursiveWhenListIsEmpty() {
        final int actual = Count.countRecursive(null, 1);
        assertThat(actual, is(0));
    }

    @Test
    public void canCountRecursiveWhenListHasOneElementAndItIsEqual() {
        final Node<Integer> head = buildLinkedList(1);
        final int actual = Count.countRecursive(head, 1);
        assertThat(actual, is(1));
    }

    @Test
    public void canCountRecursiveWhenListHasOneElementAndItIsNotEqual() {
        final Node<Integer> head = buildLinkedList(2);
        final int actual = Count.countRecursive(head, 1);
        assertThat(actual, is(0));
    }

    @Test
    public void canCountRecursiveWhenListHasSeveralElementsAndOneIsEqual() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4, 5);
        final int actual = Count.countRecursive(head, 3);
        assertThat(actual, is(1));
    }

    @Test
    public void canCountRecursiveWhenListHasSeveralElementsAndNoOneIsEqual() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4, 5);
        final int actual = Count.countRecursive(head, 6);
        assertThat(actual, is(0));
    }

    @Test
    public void canCountRecursiveWhenListHasSeveralElementsAndSeveralAreEqual() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 2, 5);
        final int actual = Count.countRecursive(head, 2);
        assertThat(actual, is(2));
    }

    @Test
    public void canCountRecursiveWhenListHasSeveralElementsAndAllAreEqual() {
        final Node<Integer> head = buildLinkedList(2, 2, 2, 2);
        final int actual = Count.countRecursive(head, 2);
        assertThat(actual, is(4));
    }

    @Test
    public void canCountNullRecursiveElementWhenThereIsNoSuchElementInTheList() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4);
        final int actual = Count.countRecursive(head, null);
        assertThat(actual, is(0));
    }

    @Test
    public void canCountNullRecursiveElementWhenThereAreSeveralSuchElementsInTheList() {
        final Node<Integer> head = buildLinkedList(1, null, 3, null);
        final int actual = Count.countRecursive(head, null);
        assertThat(actual, is(2));
    }
}
