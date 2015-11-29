package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Unit tests for {@link Find}.
 */
public class FindTest extends TestSupport {
    @Test
    public void shouldNotGetFromEmptyList() {
        try {
            Find.getAt(null, 4);
        } catch (IllegalArgumentException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void shouldNotGetWhenPositionIsLessZer0() {
        final Node<Integer> head = buildLinkedList(1, 2, 3);
        try {
            Find.getAt(head, -1);
        } catch (IndexOutOfBoundsException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void shouldNotGetWhenPositionIsGreaterMAxPosition() {
        final Node<Integer> head = buildLinkedList(1, 2, 3);
        try {
            Find.getAt(head, 3);
        } catch (IndexOutOfBoundsException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void canGetFirstElement() {
        final Node<Integer> head = buildLinkedList(1, 2, 3);
        assertThat(Find.getAt(head, 0), is(1));
    }

    @Test
    public void canGetMiddleElement() {
        final Node<Integer> head = buildLinkedList(1, 2, 3);
        assertThat(Find.getAt(head, 1), is(2));
    }

    @Test
    public void canGetLastElement() {
        final Node<Integer> head = buildLinkedList(1, 2, 3);
        assertThat(Find.getAt(head, 2), is(3));
    }

    @Test
    public void shouldNotFindInEmptyList() {
        final Node<Integer> head = null;

        assertThat(Find.contains(head, 4), is(false));
    }

    @Test
    public void shouldFindInOneElementListWhenElementIsPresented() {
        final Node<Integer> head = buildLinkedList(4);

        assertThat(Find.contains(head, 4), is(true));
    }

    @Test
    public void shouldNotFindInOneElementListWhenElementIsNotPresented() {
        final Node<Integer> head = buildLinkedList(4);

        assertThat(Find.contains(head, 3), is(false));
    }

    @Test
    public void shouldFindInSeveralElementListWhenElementIsPresented() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4);

        assertThat(Find.contains(head, 4), is(true));
    }

    @Test
    public void shouldNotFindInSeveralElementListWhenElementIsNotPresented() {
        final Node<Integer> head = buildLinkedList(1, 2, 4);

        assertThat(Find.contains(head, 3), is(false));
    }

    @Test
    public void canFindInSeveralElementListWhenElementIsNull() {
        final Node<Integer> head = buildLinkedList(1, null, 4);

        assertThat(Find.contains(head, null), is(true));
    }

    @Test
    public void shouldNotFindRecursiveInEmptyList() {
        final Node<Integer> head = null;

        assertThat(Find.containsRecursive(head, 4), is(false));
    }

    @Test
    public void shouldFindRecursiveInOneElementListWhenElementIsPresented() {
        final Node<Integer> head = buildLinkedList(4);

        assertThat(Find.containsRecursive(head, 4), is(true));
    }

    @Test
    public void shouldNotFindRecursiveInOneElementListWhenElementIsNotPresented() {
        final Node<Integer> head = buildLinkedList(4);

        assertThat(Find.containsRecursive(head, 3), is(false));
    }

    @Test
    public void shouldFindRecursiveInSeveralElementListWhenElementIsPresented() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4);

        assertThat(Find.containsRecursive(head, 4), is(true));
    }

    @Test
    public void shouldNotFindRecursiveInSeveralElementListWhenElementIsNotPresented() {
        final Node<Integer> head = buildLinkedList(1, 2, 4);

        assertThat(Find.containsRecursive(head, 3), is(false));
    }

    @Test
    public void canFindRecursiveInSeveralElementListWhenElementIsNull() {
        final Node<Integer> head = buildLinkedList(1, null, 4);

        assertThat(Find.containsRecursive(head, null), is(true));
    }
}
