package com.codingthrough.geeksforgeeks.ds.linkedlist;

import org.junit.Test;

import static com.codingthrough.geeksforgeeks.ds.linkedlist.IsLinkedListEqual.identicalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

/**
 * Unit tests for {@link DeleteLimited}.
 */
public class DeleteLimitedTest extends TestSupport {
    @Test
    public void throwsWhenListIsEmpty() {
        final Node<Integer> deleted = new Node<>(3, null);

        try {
            DeleteLimited.delete(null, deleted);
            fail("Should throw when list is empty.");
        } catch (IllegalArgumentException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void throwsWhenDeleteNodeIsNull() {
        final Node<Integer> head = new Node<>(3, null);

        try {
            DeleteLimited.delete(head, null);
            fail("Should throw when deleted node is null.");
        } catch (IllegalArgumentException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void throwsWhenDeleteTheLastElementFromTheList() {
        final Node<Integer> head = new Node<>(3, null);

        try {
            DeleteLimited.delete(head, head);
            fail("Should throw when delete last element from the list.");
        } catch (IllegalStateException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void throwsWhenDeleteNotFoundElement() {
        final Node<Integer> head = buildLinkedList(1, 2, 3);
        final Node<Integer> deleted = new Node<>(4, null);

        try {
            DeleteLimited.delete(head, deleted);
            fail("Should throw when delete not found element.");
        } catch (IllegalStateException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void canDeleteFirstElementInTheList() {
        final Node<Integer> head = buildLinkedList(1, 2, 3);
        final Node<Integer> deleted = new Node<>(1, null);

        final Node<Integer> expected = buildLinkedList(2, 3);
        DeleteLimited.delete(head, deleted);

        assertThat(head, identicalTo(expected));
    }

    @Test
    public void canDeleteLastElementInTheList() {
        final Node<Integer> head = buildLinkedList(1, 2, 3);
        final Node<Integer> deleted = new Node<>(3, null);

        final Node<Integer> expected = buildLinkedList(1, 2);
        DeleteLimited.delete(head, deleted);

        assertThat(head, identicalTo(expected));
    }

    @Test
    public void canDeleteMiddleElementInTheList() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4, 5);
        final Node<Integer> deleted = new Node<>(3, null);

        final Node<Integer> expected = buildLinkedList(1, 2, 4, 5);
        DeleteLimited.delete(head, deleted);

        assertThat(head, identicalTo(expected));
    }
}
