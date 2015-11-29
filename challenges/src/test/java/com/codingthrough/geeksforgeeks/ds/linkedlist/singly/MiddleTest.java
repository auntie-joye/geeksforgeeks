package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

/**
 * Unit tests for {@link Middle}.
 */
public class MiddleTest extends TestSupport {
    @Test
    public void throwWhenFindMiddleInEmptyList() {
        try {
            Middle.middle(null);
            fail("Should throw when find middle in empty list.");
        } catch (IllegalArgumentException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void canFindMiddleInOneElementList() {
        final Node<Integer> head = buildLinkedList(1);
        assertThat(Middle.middle(head), is(1));
    }

    @Test
    public void canFindMiddleInTwoElementsList() {
        final Node<Integer> head = buildLinkedList(1, 2);
        assertThat(Middle.middle(head), is(1));
    }

    @Test
    public void canFindMiddleInEvenElementsList() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4);
        assertThat(Middle.middle(head), is(2));
    }

    @Test
    public void canFindMiddleInOddElementsList() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4, 5);
        assertThat(Middle.middle(head), is(3));
    }

    @Test
    public void throwWhenFindMiddleRecursiveInEmptyList() {
        try {
            Middle.middleRecursive(null);
            fail("Should throw when find middle in empty list.");
        } catch (IllegalArgumentException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void canFindMiddleRecursiveInOneElementList() {
        final Node<Integer> head = buildLinkedList(1);
        assertThat(Middle.middleRecursive(head), is(1));
    }

    @Test
    public void canFindMiddleRecursiveInTwoElementsList() {
        final Node<Integer> head = buildLinkedList(1, 2);
        assertThat(Middle.middleRecursive(head), is(1));
    }

    @Test
    public void canFindMiddleRecursiveInEvenElementsList() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4);
        assertThat(Middle.middleRecursive(head), is(2));
    }

    @Test
    public void canFindMiddleRecursiveInOddElementsList() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4, 5);
        assertThat(Middle.middleRecursive(head), is(3));
    }
}
