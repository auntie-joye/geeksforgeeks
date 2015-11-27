package com.codingthrough.geeksforgeeks.ds.linkedlist;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

/**
 * Contains helper methods to create different lists in the unit test.
 */
public class TestSupport {
    @SafeVarargs
    protected static <T> Node<T> buildLinkedList(final T... values) {
        final Node<T> dummy = new Node<>();
        Node<T> prev = dummy;
        for (T value : values) {
            prev.next = new Node<>(value, null);
            prev = prev.next;
        }

        return dummy.next;
    }

    protected static void assertList(Node<Integer> actual, Node<Integer> expected) {
        if (actual == null && expected == null) {
            return;
        }

        if (expected == null) {
            fail("The expected list has less elements than the actual list.");
        }

        if (actual == null) {
            fail("The actual list has less elements than the actual list.");
        }

        while (actual != null && expected != null) {
            assertThat(actual.data, is(expected.data));
            actual = actual.next;
            expected = expected.next;
        }
    }
}
