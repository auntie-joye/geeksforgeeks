package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

/**
 * Unit tests for {@link DeleteNAfterM}.
 */
public class DeleteNAfterMTest extends TestSupport {
    @Test
    public void canDeleteEmptyList() {
        assertThat(DeleteNAfterM.delete(null, 1, 1), is(nullValue()));
    }

    @Test
    public void canDeleteWholeListBySkipZeroAndNLessLength() {
        Node<Integer> head = buildLinkedList(1, 2, 3, 4);
        assertThat(DeleteNAfterM.delete(head, 1, 0), is(nullValue()));
    }

    @Test
    public void canDeleteWholeListBySkipZeroAndNEqualLength() {
        Node<Integer> head = buildLinkedList(1, 2, 3, 4);
        assertThat(DeleteNAfterM.delete(head, 4, 0), is(nullValue()));
    }

    @Test
    public void canDeleteWholeListBySkipZeroAndNGreaterLength() {
        Node<Integer> head = buildLinkedList(1, 2, 3, 4);
        assertThat(DeleteNAfterM.delete(head, 5, 0), is(nullValue()));
    }

    @Test
    public void canDeleteWhenMLessRestAndNLessRest() {
        Node<Integer> head = buildLinkedList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Node<Integer> expected = buildLinkedList(1, 2, 5, 6, 9);
        assertThat(DeleteNAfterM.delete(head, 2, 2), IsLinkedListEqual.identicalTo(expected));
    }

    @Test
    public void canDeleteWhenMLessRestAndNEqualRest() {
        Node<Integer> head = buildLinkedList(1, 2, 3, 4, 5, 6, 7, 8);
        Node<Integer> expected = buildLinkedList(1, 2, 5, 6);
        assertThat(DeleteNAfterM.delete(head, 2, 2), IsLinkedListEqual.identicalTo(expected));
    }

    @Test
    public void canDeleteWhenMLessRestAndNGreaterRest() {
        Node<Integer> head = buildLinkedList(1, 2, 3, 4, 5, 6, 7, 8);
        Node<Integer> expected = buildLinkedList(1, 2);
        assertThat(DeleteNAfterM.delete(head, 10, 2), IsLinkedListEqual.identicalTo(expected));
    }

    @Test
    public void canDeleteWhenMGreaterRestAndNLessRest() {
        Node<Integer> head = buildLinkedList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Node<Integer> expected = buildLinkedList(1, 2, 3, 4, 7, 8, 9);
        assertThat(DeleteNAfterM.delete(head, 2, 4), IsLinkedListEqual.identicalTo(expected));
    }

    @Test
    public void canDeleteWhenMGreaterRestAndNEqualRest() {
        Node<Integer> head = buildLinkedList(1, 2, 3, 4, 5, 6);
        Node<Integer> expected = buildLinkedList(1, 2, 3, 4);
        assertThat(DeleteNAfterM.delete(head, 2, 4), IsLinkedListEqual.identicalTo(expected));
    }

    @Test
    public void canDeleteWhenMGreaterRestAndNGreaterRest() {
        Node<Integer> head = buildLinkedList(1, 2, 3, 4, 5, 6);
        Node<Integer> expected = buildLinkedList(1, 2, 3, 4);
        assertThat(DeleteNAfterM.delete(head, 3, 4), IsLinkedListEqual.identicalTo(expected));
    }
}
