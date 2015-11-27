package com.codingthrough.geeksforgeeks.ds.linkedlist;

import org.junit.Test;

import static com.codingthrough.geeksforgeeks.ds.linkedlist.IsLinkedListEqual.identicalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

/**
 * Unit tests for {@link DeleteFast}.
 */
public class DeleteFastTest extends TestSupport {
    @Test
    public void canDeleteFirstElementFromTheList() {
        final Node<Integer> head = buildLinkedList(1, 2, 3);
        final Node<Integer> expected = buildLinkedList(2, 3);

        DeleteFast.delete(head);
        assertThat(head, identicalTo(expected));
    }

    @Test
    public void canDeleteMiddleElementFromTheList() {
        final Node<Integer> head = buildLinkedList(1, 2, 3);
        final Node<Integer> expected = buildLinkedList(1, 3);

        DeleteFast.delete(head.next);
        assertThat(head, identicalTo(expected));
    }

    @Test
    public void throwsWhenDeleteLastElement() {
        final Node<Integer> head = buildLinkedList(1, 2);

        try {
            DeleteFast.delete(head.next);
            fail("Should throw when delete last element from the list.");
        } catch (IllegalArgumentException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void throwsWhenDeleteElementFromOneElementList() {
        final Node<Integer> head = buildLinkedList(1);

        try {
            DeleteFast.delete(head);
            fail("Should throw when delete element from one element list.");
        } catch (IllegalArgumentException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void throwsWhenDeleteNullElement() {
        final Node<Integer> head = null;

        try {
            DeleteFast.delete(head);
            fail("Should throw when delete null element from the list.");
        } catch (IllegalArgumentException e) {
            // ok, it's expected exception
        }
    }
}
