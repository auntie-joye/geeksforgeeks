package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

/**
 * Unit tests for {@link Addition}.
 */
public class AdditionTest extends TestSupport {
    @Test
    public void canAddEmptyList() {
        assertThat(Addition.add(null, null), is(nullValue()));
    }

    @Test
    public void canAddEmptyAndNotEmptyList() {
        final Node<Integer> a = null;  // 0
        final Node<Integer> b = buildLinkedList(1, 2); // 21

        final Node<Integer> expected = buildLinkedList(1, 2);  // 21
        assertThat(Addition.add(a, b), IsLinkedListEqual.identicalTo(expected));
    }

    @Test
    public void canAddNotEmptyAndEmptyList() {
        final Node<Integer> a = buildLinkedList(1, 2);  // 21
        final Node<Integer> b = null;  // 0

        final Node<Integer> expected = buildLinkedList(1, 2); // 21
        assertThat(Addition.add(a, b), IsLinkedListEqual.identicalTo(expected));
    }

    @Test
    public void canAddSameLengthLists() {
        final Node<Integer> a = buildLinkedList(1, 2, 3); // 321
        final Node<Integer> b = buildLinkedList(1, 2, 3); // 321

        final Node<Integer> expected = buildLinkedList(2, 4, 6); // 642
        assertThat(Addition.add(a, b), IsLinkedListEqual.identicalTo(expected));
    }

    @Test
    public void canAddSameLengthWithCarryOverLists() {
        final Node<Integer> a = buildLinkedList(9, 9, 9); // 999
        final Node<Integer> b = buildLinkedList(1, 1, 1); // 111

        final Node<Integer> expected = buildLinkedList(0, 1, 1, 1); // 1110
        assertThat(Addition.add(a, b), IsLinkedListEqual.identicalTo(expected));
    }

    @Test
    public void canAddNumbersWithCarryOver() {
        final Node<Integer> a = buildLinkedList(9, 9, 9); // 999
        final Node<Integer> b = buildLinkedList(9); //9

        final Node<Integer> expected = buildLinkedList(8, 0, 0, 1); // 1008
        assertThat(Addition.add(a, b), IsLinkedListEqual.identicalTo(expected));
    }

    @Test
    public void canAddRecursiveEmptyList() {
        assertThat(Addition.add(null, null), is(nullValue()));
    }

    @Test
    public void canAddRecursiveEmptyAndNotEmptyList() {
        final Node<Integer> a = null;  // 0
        final Node<Integer> b = buildLinkedList(1, 2); // 21

        final Node<Integer> expected = buildLinkedList(1, 2);  // 21
        assertThat(Addition.addRecursive(a, b), IsLinkedListEqual.identicalTo(expected));
    }

    @Test
    public void canAddRecursiveNotEmptyAndEmptyList() {
        final Node<Integer> a = buildLinkedList(1, 2);  // 21
        final Node<Integer> b = null;  // 0

        final Node<Integer> expected = buildLinkedList(1, 2); // 21
        assertThat(Addition.addRecursive(a, b), IsLinkedListEqual.identicalTo(expected));
    }

    @Test
    public void canAddRecursiveSameLengthLists() {
        final Node<Integer> a = buildLinkedList(1, 2, 3); // 321
        final Node<Integer> b = buildLinkedList(1, 2, 3); // 321

        final Node<Integer> expected = buildLinkedList(2, 4, 6); // 642
        assertThat(Addition.addRecursive(a, b), IsLinkedListEqual.identicalTo(expected));
    }

    @Test
    public void canAddRecursiveSameLengthWithCarryOverLists() {
        final Node<Integer> a = buildLinkedList(9, 9, 9); // 999
        final Node<Integer> b = buildLinkedList(1, 1, 1); // 111

        final Node<Integer> expected = buildLinkedList(0, 1, 1, 1); // 1110
        assertThat(Addition.addRecursive(a, b), IsLinkedListEqual.identicalTo(expected));
    }

    @Test
    public void canAddRecursiveNumbersWithCarryOver() {
        final Node<Integer> a = buildLinkedList(9, 9, 9); // 999
        final Node<Integer> b = buildLinkedList(9); //9

        final Node<Integer> expected = buildLinkedList(8, 0, 0, 1); // 1008
        assertThat(Addition.addRecursive(a, b), IsLinkedListEqual.identicalTo(expected));
    }
}
