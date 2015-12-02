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

    @Test
    public void throwWhenInsertBeforeNullNode() {
        Node<Integer> head = buildLinkedList(1);
        try {
            Insertion.insertBefore(head, null, 0);
            fail("Should throw when insert before null node.");
        } catch (IllegalArgumentException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void throwWhenInsertBeforeInEmptyList() {
        Node<Integer> node = buildLinkedList(1);

        try {
            Insertion.insertBefore(null, node, 2);
            fail("Should throw when insert before in empty list.");
        } catch (IllegalArgumentException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void throwWhenInsertBeforeNotFoundNode() {
        Node<Integer> head = buildLinkedList(1, 2, 3);
        Node<Integer> node = buildLinkedList(4);

        try {
            Insertion.insertBefore(head, node, 4);
            fail("Should throw when insert before not found node.");
        } catch (IllegalStateException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void canDeleteBeforeMiddleNode() {
        Node<Integer> head = buildLinkedList(0, 1, 3, 4, 5);
        Node<Integer> middle = head.next.next;
        Node<Integer> expected = buildLinkedList(0, 1, 2, 3, 4, 5);

        assertThat(Insertion.insertBefore(head, middle, 2), identicalTo(expected));
    }

    @Test
    public void canDeleteBeforeHeadNode() {
        Node<Integer> head = buildLinkedList(2, 3, 4, 5);
        Node<Integer> expected = buildLinkedList(1, 2, 3, 4, 5);

        assertThat(Insertion.insertBefore(head, head, 1), identicalTo(expected));
    }

    @Test
    public void canInsertBeforeLastNode() {
        Node<Integer> head = buildLinkedList(1, 2, 4);
        Node<Integer> last = head.next.next;
        Node<Integer> expected = buildLinkedList(1, 2, 3, 4);

        assertThat(Insertion.insertBefore(head, last, 3), identicalTo(expected));
    }

    @Test
    public void throwWhenInsertWithPositionLessMinimumIndex() {
        Node<Integer> head = buildLinkedList(1);

        try {
            Insertion.insertAt(head, -1, 0);
            fail("Should throw when try to insert with negative position.");
        } catch (IndexOutOfBoundsException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void throwWhenInsertWithPositionGreaterMaximumIndex() {
        Node<Integer> head = buildLinkedList(1, 2, 3);

        try {
            Insertion.insertAt(head, 4, 4);
            fail("Should throw when try to insert with greater position.");
        } catch (IndexOutOfBoundsException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void canInsertFirstElementToEmptyList() {
        Node<Integer> expected = buildLinkedList(4);

        assertThat(Insertion.insertAt(null, 0, 4), identicalTo(expected));
    }

    @Test
    public void canInsertFirstElementToList() {
        Node<Integer> head = buildLinkedList(4, 3, 2, 1);
        Node<Integer> expected = buildLinkedList(5, 4, 3, 2, 1);

        assertThat(Insertion.insertAt(head, 0, 5), identicalTo(expected));
    }

    @Test
    public void canInsertPostFirstElementToList() {
        Node<Integer> head = buildLinkedList(5, 3, 2, 1);
        Node<Integer> expected = buildLinkedList(5, 4, 3, 2, 1);

        assertThat(Insertion.insertAt(head, 1, 4), identicalTo(expected));
    }

    @Test
    public void canInsertLastElementToList() {
        Node<Integer> head = buildLinkedList(4, 3, 2, 1);
        Node<Integer> expected = buildLinkedList(4, 3, 2, 1, 0);

        assertThat(Insertion.insertAt(head, 4, 0), identicalTo(expected));
    }

    @Test
    public void canInsertPreLastElementToList() {
        Node<Integer> head = buildLinkedList(4, 3, 2, 0);
        Node<Integer> expected = buildLinkedList(4, 3, 2, 1, 0);

        assertThat(Insertion.insertAt(head, 3, 1), identicalTo(expected));
    }

    @Test
    public void canInsertMiddleElementToList() {
        Node<Integer> head = buildLinkedList(1, 2, 4, 5, 6);
        Node<Integer> expected = buildLinkedList(1, 2, 3, 4, 5, 6);

        assertThat(Insertion.insertAt(head, 2, 3), identicalTo(expected));
    }
}
