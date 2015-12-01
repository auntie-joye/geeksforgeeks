package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

import org.junit.Test;

import static com.codingthrough.geeksforgeeks.ds.linkedlist.singly.IsLinkedListEqual.identicalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

/**
 * Unit tests for {@link Insertion}.
 */
public class InsertionTest extends TestSupport {
    @Test
    public void canInsertFirstInEmptyList() {
        Node<Integer> expected = buildLinkedList(1);
        assertThat(Insertion.insertFirst(null, 1), identicalTo(expected));
    }

    @Test
    public void canInsertFirstInOneElementList() {
        Node<Integer> head = buildLinkedList(1);
        Node<Integer> expected = buildLinkedList(2, 1);
        assertThat(Insertion.insertFirst(head, 2), identicalTo(expected));
    }

    @Test
    public void canInsertFirstInSeveralElementsList() {
        Node<Integer> head = buildLinkedList(1, 2, 3);
        Node<Integer> expected = buildLinkedList(4, 1, 2, 3);
        assertThat(Insertion.insertFirst(head, 4), identicalTo(expected));
    }

    @Test
    public void canInsertLastInEmptyList() {
        Node<Integer> expected = buildLinkedList(1);
        assertThat(Insertion.insertLast(null, 1), identicalTo(expected));
    }

    @Test
    public void canInsertLastInOneElementList() {
        Node<Integer> head = buildLinkedList(1);
        Node<Integer> expected = buildLinkedList(1, 2);
        assertThat(Insertion.insertLast(head, 2), identicalTo(expected));
    }

    @Test
    public void canInsertLastInSeveralElementsList() {
        Node<Integer> head = buildLinkedList(1, 2, 3);
        Node<Integer> expected = buildLinkedList(1, 2, 3, 4);
        assertThat(Insertion.insertLast(head, 4), identicalTo(expected));
    }

    @Test
    public void throwWhenInsertAfterNullNode() {
        try {
            Insertion.insertAfter(null, 4);
            fail("Should throw when insert after null node.");
        } catch (IllegalArgumentException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void canInsertAfterHeadNode() {
        Node<Integer> head = buildLinkedList(1);
        Node<Integer> expected = buildLinkedList(1, 2);
        Insertion.insertAfter(head, 2);
        assertThat(head, identicalTo(expected));
    }

    @Test
    public void canInsertAfterLastNodeInTheList() {
        Node<Integer> head = buildLinkedList(1, 2, 3);
        Node<Integer> last = head.next.next;
        Node<Integer> expected = buildLinkedList(1, 2, 3, 4);

        Insertion.insertAfter(last, 4);
        assertThat(head, identicalTo(expected));
    }

    @Test
    public void canInsertAfterMiddleNodeInTheList() {
        Node<Integer> head = buildLinkedList(1, 2, 3);
        Node<Integer> middle = head.next;
        Node<Integer> expected = buildLinkedList(1, 2, 4, 3);

        Insertion.insertAfter(middle, 4);
        assertThat(head, identicalTo(expected));
    }
}
