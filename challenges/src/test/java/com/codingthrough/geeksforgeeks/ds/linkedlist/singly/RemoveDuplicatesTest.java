package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

import org.junit.Test;

import static com.codingthrough.geeksforgeeks.ds.linkedlist.singly.IsLinkedListEqual.identicalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

/**
 * Unit tests for {@link RemoveDuplicates}.
 */
public class RemoveDuplicatesTest extends TestSupport {
    @Test
    public void removeSortedWhenEmptyList() {
        assertThat(RemoveDuplicates.removeDuplicatesSorted(null), is(nullValue()));
    }

    @Test
    public void removeSortedWhenThereISNoDuplicates() {
        Node<Integer> head = buildLinkedList(1, 2, 3, 4, 5);
        Node<Integer> expected = buildLinkedList(1, 2, 3, 4, 5);
        assertThat(RemoveDuplicates.removeDuplicatesSorted(head), identicalTo(expected));
    }

    @Test
    public void removeSortedWhenOnePairOfDuplicates() {
        Node<Integer> head = buildLinkedList(1, 2, 2, 2, 3);
        Node<Integer> expected = buildLinkedList(1, 2, 3);
        assertThat(RemoveDuplicates.removeDuplicatesSorted(head), identicalTo(expected));
    }

    @Test
    public void removeSortedWhenSeveralPairsOfDuplicates() {
        Node<Integer> head = buildLinkedList(1, 2, 2, 3, 4, 4, 5);
        Node<Integer> expected = buildLinkedList(1, 2, 3, 4, 5);
        assertThat(RemoveDuplicates.removeDuplicatesSorted(head), identicalTo(expected));
    }

    @Test
    public void removeSortedWhenFirstElementIsDuplicated() {
        Node<Integer> head = buildLinkedList(1, 1, 1, 2);
        Node<Integer> expected = buildLinkedList(1, 2);
        assertThat(RemoveDuplicates.removeDuplicatesSorted(head), identicalTo(expected));
    }

    @Test
    public void removeSortedWhenLastElementIsDuplicated() {
        Node<Integer> head = buildLinkedList(1, 2, 2, 2);
        Node<Integer> expected = buildLinkedList(1, 2);
        assertThat(RemoveDuplicates.removeDuplicatesSorted(head), identicalTo(expected));
    }

    @Test
    public void removeSortedWhenNullIsDuplicated() {
        Node<Integer> head = buildLinkedList(1, 2, null, null, 3);
        Node<Integer> expected = buildLinkedList(1, 2, null, 3);
        assertThat(RemoveDuplicates.removeDuplicatesSorted(head), identicalTo(expected));
    }

    @Test
    public void removeUnsortedWhenEmptyList() {
        assertThat(RemoveDuplicates.removeDuplicatesUnsorted(null), is(nullValue()));
    }

    @Test
    public void removeUnsortedWhenThereISNoDuplicates() {
        Node<Integer> head = buildLinkedList(2, 4, 3, 1, 5);
        Node<Integer> expected = buildLinkedList(2, 4, 3, 1, 5);
        assertThat(RemoveDuplicates.removeDuplicatesUnsorted(head), identicalTo(expected));
    }

    @Test
    public void removeUnsortedWhenOnePairOfDuplicates() {
        Node<Integer> head = buildLinkedList(1, 2, 1, 3);
        Node<Integer> expected = buildLinkedList(1, 2, 3);
        assertThat(RemoveDuplicates.removeDuplicatesUnsorted(head), identicalTo(expected));
    }

    @Test
    public void removeUnsortedWhenSeveralPairsOfDuplicates() {
        Node<Integer> head = buildLinkedList(1, 3, 1, 4, 2, 2, 5);
        Node<Integer> expected = buildLinkedList(1, 3, 4, 2, 5);
        assertThat(RemoveDuplicates.removeDuplicatesUnsorted(head), identicalTo(expected));
    }

    @Test
    public void removeUnsortedWhenFirstElementIsDuplicated() {
        Node<Integer> head = buildLinkedList(1, 2, 1, 1);
        Node<Integer> expected = buildLinkedList(1, 2);
        assertThat(RemoveDuplicates.removeDuplicatesUnsorted(head), identicalTo(expected));
    }

    @Test
    public void removeUnsortedWhenLastElementIsDuplicated() {
        Node<Integer> head = buildLinkedList(2, 2, 1, 2);
        Node<Integer> expected = buildLinkedList(2, 1);
        assertThat(RemoveDuplicates.removeDuplicatesUnsorted(head), identicalTo(expected));
    }

    @Test
    public void removeUnsortedWhenNullIsDuplicated() {
        Node<Integer> head = buildLinkedList(1, null, 2, null, 3);
        Node<Integer> expected = buildLinkedList(1, null, 2, 3);
        assertThat(RemoveDuplicates.removeDuplicatesUnsorted(head), identicalTo(expected));
    }
}
