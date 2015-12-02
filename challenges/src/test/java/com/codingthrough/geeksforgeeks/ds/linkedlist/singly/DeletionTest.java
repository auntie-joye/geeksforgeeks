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

    @Test
    public void throwWhenDeleteFromEmptyList() {
        try {
            Deletion.deleteAt(null, 0);
            fail("Should throw when try to delete from empty list.");
        } catch (IndexOutOfBoundsException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void throwWhenDeleteWithPositionLessMinimumIndex() {
        Node<Integer> head = buildLinkedList(1);

        try {
            Deletion.deleteAt(head, -1);
            fail("Should throw when try to delete with negative position.");
        } catch (IndexOutOfBoundsException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void throwWhenDeleteWithPositionGreaterMaximumIndex() {
        Node<Integer> head = buildLinkedList(1, 2, 3);

        try {
            Deletion.deleteAt(head, 3);
            fail("Should throw when try to delete with greater position.");
        } catch (IndexOutOfBoundsException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void canDeleteFirstElementInOneElementList() {
        Node<Integer> head = buildLinkedList(4);

        assertThat(Deletion.deleteAt(head, 0), is(nullValue()));
    }

    @Test
    public void canDeleteFirstElementFromList() {
        Node<Integer> head = buildLinkedList(4, 3, 2, 1);
        Node<Integer> expected = buildLinkedList(3, 2, 1);

        assertThat(Deletion.deleteAt(head, 0), identicalTo(expected));
    }

    @Test
    public void canDeleteLastElementFromList() {
        Node<Integer> head = buildLinkedList(4, 3, 2, 1);
        Node<Integer> expected = buildLinkedList(4, 3, 2);

        assertThat(Deletion.deleteAt(head, 3), identicalTo(expected));
    }

    @Test
    public void canDeleteMiddleElementFromList() {
        Node<Integer> head = buildLinkedList(5, 4, 3, 2, 1);
        Node<Integer> expected = buildLinkedList(5, 4, 2, 1);

        assertThat(Deletion.deleteAt(head, 2), identicalTo(expected));
    }

    @Test
    public void throwWhenDeleteNodeFromEmptyList() {
        try {
            Deletion.delete(null, 1);
            fail("Should throw when try to delete from empty list.");
        } catch (IllegalArgumentException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void throwWhenDeleteNodeThatNotFound() {
        Node<Integer> head = buildLinkedList(1, 3, 4);

        try {
            Deletion.delete(head, 2);
            fail("Should throw when try to delete not found node.");
        } catch (IllegalStateException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void canDeleteFirstNodeInOneElementList() {
        Node<Integer> head = buildLinkedList(4);

        assertThat(Deletion.delete(head, 4), is(nullValue()));
    }

    @Test
    public void canGetFirstNodeElementFromList() {
        Node<Integer> head = buildLinkedList(4, 3, 2, 1);
        Node<Integer> expected = buildLinkedList(3, 2, 1);

        assertThat(Deletion.delete(head, 4), identicalTo(expected));
    }

    @Test
    public void canGetLastNodeElementFromList() {
        Node<Integer> head = buildLinkedList(4, 3, 2, 1);
        Node<Integer> expected = buildLinkedList(4, 3, 2);

        assertThat(Deletion.delete(head, 1), identicalTo(expected));
    }

    @Test
    public void canGetMiddleNodeElementFromList() {
        Node<Integer> head = buildLinkedList(5, 4, 3, 2, 1);
        Node<Integer> expected = buildLinkedList(5, 4, 2, 1);

        assertThat(Deletion.delete(head, 3), identicalTo(expected));
    }

    @Test
    public void throwWhenDeleteBeforeNullNode() {
        Node<Integer> head = buildLinkedList(1);
        try {
            Deletion.deleteBefore(head, null);
            fail("Should throw when delete before null node.");
        } catch (IllegalArgumentException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void throwWhenDeleteBeforeHead() {
        Node<Integer> head = buildLinkedList(1);

        try {
            Deletion.deleteBefore(head, head);
            fail("Should throw when delete before head.");
        } catch (IllegalArgumentException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void throwWhenDeleteBeforeInEmptyList() {
        Node<Integer> node = buildLinkedList(1);

        try {
            Deletion.deleteBefore(null, node);
            fail("Should throw when delete before in empty list.");
        } catch (IllegalArgumentException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void throwWhenDeleteBeforeNotFoundNode() {
        Node<Integer> head = buildLinkedList(1, 2, 3);
        Node<Integer> node = buildLinkedList(4);

        try {
            Deletion.deleteBefore(head, node);
            fail("Should throw when delete before not found node.");
        } catch (IllegalStateException e) {
            // ok, it's expected exception
        }
    }

    @Test
    public void canDeleteBeforeMiddleNode() {
        Node<Integer> head = buildLinkedList(1, 2, 3, 4, 5);
        Node<Integer> middle = head.next.next;
        Node<Integer> expected = buildLinkedList(1, 3, 4, 5);

        assertThat(Deletion.deleteBefore(head, middle), identicalTo(expected));
    }

    @Test
    public void canDeleteBeforePostHeadNode() {
        Node<Integer> head = buildLinkedList(1, 2, 3, 4, 5);
        Node<Integer> expected = buildLinkedList(2, 3, 4, 5);

        assertThat(Deletion.deleteBefore(head, head.next), identicalTo(expected));
    }

    @Test
    public void canDeleteBeforeLastNode() {
        Node<Integer> head = buildLinkedList(1, 2, 3);
        Node<Integer> last = head.next.next;
        Node<Integer> expected = buildLinkedList(1, 3);

        assertThat(Deletion.deleteBefore(head, last), identicalTo(expected));
    }
}
