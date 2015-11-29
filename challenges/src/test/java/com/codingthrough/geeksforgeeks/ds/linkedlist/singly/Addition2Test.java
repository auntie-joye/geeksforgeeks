package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

/**
 * Unit tests for {@link Addition2}.
 */
public class Addition2Test extends TestSupport {
    @Test
    public void canAddEmptyList() {
        assertThat(Addition2.add(null, null), is(nullValue()));
    }

    @Test
    public void canAddEmptyAndNotEmptyList() {
        final Node<Integer> a = null;  // 0
        final Node<Integer> b = buildLinkedList(1, 2); // 12

        final Node<Integer> expected = buildLinkedList(1, 2);  // 12
        assertThat(Addition2.add(a, b), IsLinkedListEqual.identicalTo(expected));
    }

    @Test
    public void canAddNotEmptyAndEmptyList() {
        final Node<Integer> a = buildLinkedList(1, 2);  // 12
        final Node<Integer> b = null;  // 0

        final Node<Integer> expected = buildLinkedList(1, 2); // 12
        assertThat(Addition2.add(a, b), IsLinkedListEqual.identicalTo(expected));
    }

    @Test
    public void canAddSameLengthLists() {
        final Node<Integer> a = buildLinkedList(1, 2, 3); // 123
        final Node<Integer> b = buildLinkedList(1, 2, 3); // 123

        final Node<Integer> expected = buildLinkedList(2, 4, 6); // 246
        assertThat(Addition2.add(a, b), IsLinkedListEqual.identicalTo(expected));
    }

    @Test
    public void canAddSameLengthWithCarryOverLists() {
        final Node<Integer> a = buildLinkedList(9, 9, 9); // 999
        final Node<Integer> b = buildLinkedList(1, 1, 1); // 111

        final Node<Integer> expected = buildLinkedList(1, 1, 1, 0); // 1110
        assertThat(Addition2.add(a, b), IsLinkedListEqual.identicalTo(expected));
    }

    @Test
    public void canAddNumbersWithCarryOver() {
        final Node<Integer> a = buildLinkedList(9, 9, 9); // 999
        final Node<Integer> b = buildLinkedList(9); //9

        final Node<Integer> expected = buildLinkedList(1, 0, 0, 8); // 1008
        assertThat(Addition2.add(a, b), IsLinkedListEqual.identicalTo(expected));
    }

    @Test
    public void canAddRecursiveEmptyList() {
        assertThat(Addition2.add(null, null), is(nullValue()));
    }

    @Test
    public void canAddRecursiveEmptyAndNotEmptyList() {
        final Node<Integer> a = null;  // 0
        final Node<Integer> b = buildLinkedList(1, 2); // 12

        final Node<Integer> expected = buildLinkedList(1, 2);  // 12
        assertThat(Addition2.addRecursive(a, b), IsLinkedListEqual.identicalTo(expected));
    }

    @Test
    public void canAddRecursiveNotEmptyAndEmptyList() {
        final Node<Integer> a = buildLinkedList(1, 2);  // 12
        final Node<Integer> b = null;  // 0

        final Node<Integer> expected = buildLinkedList(1, 2); // 12
        assertThat(Addition2.addRecursive(a, b), IsLinkedListEqual.identicalTo(expected));
    }

    @Test
    public void canAddRecursiveSameLengthLists() {
        final Node<Integer> a = buildLinkedList(1, 2, 3); // 123
        final Node<Integer> b = buildLinkedList(1, 2, 3); // 123

        final Node<Integer> expected = buildLinkedList(2, 4, 6); // 246
        assertThat(Addition2.addRecursive(a, b), IsLinkedListEqual.identicalTo(expected));
    }

    @Test
    public void canAddRecursiveSameLengthWithCarryOverLists() {
        final Node<Integer> a = buildLinkedList(9, 9, 9); // 999
        final Node<Integer> b = buildLinkedList(1, 1, 1); // 111

        final Node<Integer> expected = buildLinkedList(1, 1, 1, 0); // 1110
        assertThat(Addition2.addRecursive(a, b), IsLinkedListEqual.identicalTo(expected));
    }

    @Test
    public void canAddRecursiveNumbersWithCarryOver() {
        final Node<Integer> a = buildLinkedList(9, 9, 9); // 999
        final Node<Integer> b = buildLinkedList(9); //9

        final Node<Integer> expected = buildLinkedList(1, 0, 0, 8); // 1008
        assertThat(Addition2.addRecursive(a, b), IsLinkedListEqual.identicalTo(expected));
    }
}
