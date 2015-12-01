package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

import org.junit.Test;

import static com.codingthrough.geeksforgeeks.ds.linkedlist.singly.IsLinkedListEqual.identicalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

/**
 * Unit tests for {@link Deletion}.
 */
public class DeletionTest extends TestSupport {
    @Test
    public void throwWhenDeleteFirstFromEmptyList() {
        try {
            Deletion.deleteFirst(null);
            fail("Should throw when delete first from empty list.");
        } catch (IllegalArgumentException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void canDeleteFirstFromOneElementList() {
        Node<Integer> head = buildLinkedList(1);
        assertThat(Deletion.deleteFirst(head), is(nullValue()));
    }

    @Test
    public void canDeleteFirstFromSeveralElementsList() {
        Node<Integer> head = buildLinkedList(1, 2, 3);
        Node<Integer> expected = buildLinkedList(2, 3);
        assertThat(Deletion.deleteFirst(head), identicalTo(expected));
    }

    @Test
    public void throwWhenDeleteLastFromEmptyList() {
        try {
            Deletion.deleteLast(null);
            fail("Should throw when delete last from empty list.");
        } catch (IllegalArgumentException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void canDeleteLastFromOneElementList() {
        Node<Integer> head = buildLinkedList(1);
        assertThat(Deletion.deleteLast(head), is(nullValue()));
    }

    @Test
    public void canDeleteLastFromSeveralElementsList() {
        Node<Integer> head = buildLinkedList(1, 2, 3);
        Node<Integer> expected = buildLinkedList(1, 2);
        assertThat(Deletion.deleteLast(head), identicalTo(expected));
    }

    @Test
    public void throwWhenDeleteAfterNullNode() {
        try {
            Deletion.deleteAfter(null);
            fail("Should throw when delete after null node.");
        } catch (IllegalArgumentException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void throwWhenDeleteAfterHeadInOneElementList() {
        Node<Integer> head = buildLinkedList(1);

        try {
            Deletion.deleteAfter(head);
            fail("Should throw when delete after head in one element list.");
        } catch (IllegalArgumentException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void throwWhenDeleteAfterLastNode() {
        Node<Integer> head = buildLinkedList(1, 2, 3);
        Node<Integer> last = head.next.next;

        try {
            Deletion.deleteAfter(last);
            fail("Should throw when delete after last node.");
        } catch (IllegalArgumentException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void canDeleteAfterMiddleNode() {
        Node<Integer> head = buildLinkedList(1, 2, 3, 4, 5);
        Node<Integer> middle = head.next.next;
        Node<Integer> expected = buildLinkedList(1, 2, 3, 5);

        Deletion.deleteAfter(middle);
        assertThat(head, identicalTo(expected));
    }

    @Test
    public void canDeleteAfterHeadNode() {
        Node<Integer> head = buildLinkedList(1, 2, 3, 4, 5);
        Node<Integer> expected = buildLinkedList(1, 3, 4, 5);

        Deletion.deleteAfter(head);
        assertThat(head, identicalTo(expected));
    }

    @Test
    public void canDeleteAfterPreLastNode() {
        Node<Integer> head = buildLinkedList(1, 2, 3);
        Node<Integer> preLast = head.next;
        Node<Integer> expected = buildLinkedList(1, 2);

        Deletion.deleteAfter(preLast);
        assertThat(head, identicalTo(expected));
    }
}
