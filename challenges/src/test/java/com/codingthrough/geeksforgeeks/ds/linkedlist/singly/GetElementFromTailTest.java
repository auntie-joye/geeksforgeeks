package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

/**
 * Unit tests for {@lonk GetElementFromTail}.
 */
public class GetElementFromTailTest extends TestSupport {
    @Test
    public void throwWhenGetFromEmptyList() {
        try {
            GetElementFromTail.getAt(null, 0);
            fail("Should throw when try to get from empty list.");
        } catch (IndexOutOfBoundsException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void throwWhenPositionLessMinimumIndex() {
        Node<Integer> head = buildLinkedList(1);

        try {
            GetElementFromTail.getAt(head, -1);
            fail("Should throw when try to get with negative position.");
        } catch (IndexOutOfBoundsException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void throwWhenPositionGreaterMaximumIndex() {
        Node<Integer> head = buildLinkedList(1, 2, 3);

        try {
            GetElementFromTail.getAt(head, 3);
            fail("Should throw when try to get with greater position.");
        } catch (IndexOutOfBoundsException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void canGetFirstElementInOneElementList() {
        Node<Integer> head = buildLinkedList(4);

        assertThat(GetElementFromTail.getAt(head, 0), is(4));
    }

    @Test
    public void canGetFirstElementFromList() {
        Node<Integer> head = buildLinkedList(4, 3, 2, 1);

        assertThat(GetElementFromTail.getAt(head, 3), is(4));
    }

    @Test
    public void canGetLastElementFromList() {
        Node<Integer> head = buildLinkedList(4, 3, 2, 1);

        assertThat(GetElementFromTail.getAt(head, 0), is(1));
    }

    @Test
    public void canGetMiddleElementFromList() {
        Node<Integer> head = buildLinkedList(5, 4, 3, 2, 1);

        assertThat(GetElementFromTail.getAt(head, 2), is(3));
    }

    @Test
    public void throwWhenGetRecursiveFromEmptyList() {
        try {
            GetElementFromTail.getAtRecursive(null, 0);
            fail("Should throw when try to get from empty list.");
        } catch (IndexOutOfBoundsException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void throwWhenGetRecursiveWithPositionLessMinimumIndex() {
        Node<Integer> head = buildLinkedList(1);

        try {
            GetElementFromTail.getAtRecursive(head, -1);
            fail("Should throw when try to get with negative position.");
        } catch (IndexOutOfBoundsException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void throwWhenGetRecursiveWithPositionGreaterMaximumIndex() {
        Node<Integer> head = buildLinkedList(1, 2, 3);

        try {
            GetElementFromTail.getAtRecursive(head, 3);
            fail("Should throw when try to get with greater position.");
        } catch (IndexOutOfBoundsException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void canGetRecursiveFirstElementInOneElementList() {
        Node<Integer> head = buildLinkedList(4);

        assertThat(GetElementFromTail.getAtRecursive(head, 0), is(4));
    }

    @Test
    public void canGetRecursiveFirstElementFromList() {
        Node<Integer> head = buildLinkedList(4, 3, 2, 1);

        assertThat(GetElementFromTail.getAtRecursive(head, 3), is(4));
    }

    @Test
    public void canGetRecursiveLastElementFromList() {
        Node<Integer> head = buildLinkedList(4, 3, 2, 1);

        assertThat(GetElementFromTail.getAtRecursive(head, 0), is(1));
    }

    @Test
    public void canGetRecursiveMiddleElementFromList() {
        Node<Integer> head = buildLinkedList(5, 4, 3, 2, 1);

        assertThat(GetElementFromTail.getAtRecursive(head, 2), is(3));
    }
}
