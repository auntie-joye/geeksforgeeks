package com.codingthrough.geeksforgeeks.ds.linkedlist;

import org.junit.Test;

import static com.codingthrough.geeksforgeeks.ds.linkedlist.IsLinkedListEqual.identicalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;


/**
 * Unit tests for {@link PairwiseSwap}.
 */
public class PairwiseSwapTest extends TestSupport {
    @Test
    public void canSwapDataInEmptyList() {
        assertThat(PairwiseSwap.swapData(null), is(nullValue()));
    }

    @Test
    public void canSwapDataInOneElementList() {
        final Node<Integer> head = buildLinkedList(1);
        final Node<Integer> expected = buildLinkedList(1);
        assertThat(PairwiseSwap.swapData(head), identicalTo(expected));
    }

    @Test
    public void canSwapDataInOddElementList() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4, 5);
        final Node<Integer> expected = buildLinkedList(2, 1, 4, 3, 5);
        assertThat(PairwiseSwap.swapData(head), identicalTo(expected));
    }

    @Test
    public void canSwapDataInEvenElementList() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4);
        final Node<Integer> expected = buildLinkedList(2, 1, 4, 3);
        assertThat(PairwiseSwap.swapData(head), identicalTo(expected));
    }

    @Test
    public void canSwapDataInListWithNullElements() {
        final Node<Integer> head = buildLinkedList(1, null, 3, null);
        final Node<Integer> expected = buildLinkedList(null, 1, null, 3);
        assertThat(PairwiseSwap.swapData(head), identicalTo(expected));
    }

    @Test
    public void canSwapDataInRecursiveEmptyList() {
        assertThat(PairwiseSwap.swapDataRecursive(null), is(nullValue()));
    }

    @Test
    public void canSwapDataInRecursiveOneElementList() {
        final Node<Integer> head = buildLinkedList(1);
        final Node<Integer> expected = buildLinkedList(1);
        assertThat(PairwiseSwap.swapDataRecursive(head), identicalTo(expected));
    }

    @Test
    public void canSwapDataInRecursiveOddElementList() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4, 5);
        final Node<Integer> expected = buildLinkedList(2, 1, 4, 3, 5);
        assertThat(PairwiseSwap.swapDataRecursive(head), identicalTo(expected));
    }

    @Test
    public void canSwapDataInRecursiveEvenElementList() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4);
        final Node<Integer> expected = buildLinkedList(2, 1, 4, 3);
        assertThat(PairwiseSwap.swapDataRecursive(head), identicalTo(expected));
    }

    @Test
    public void canSwapDataInRecursiveListWithNullElements() {
        final Node<Integer> head = buildLinkedList(1, null, 3, null);
        final Node<Integer> expected = buildLinkedList(null, 1, null, 3);
        assertThat(PairwiseSwap.swapDataRecursive(head), identicalTo(expected));
    }

    @Test
    public void canSwapNodeInEmptyList() {
        assertThat(PairwiseSwap.swapNode(null), is(nullValue()));
    }

    @Test
    public void canSwapNodeInOneElementList() {
        final Node<Integer> head = buildLinkedList(1);
        final Node<Integer> expected = buildLinkedList(1);
        assertThat(PairwiseSwap.swapNode(head), identicalTo(expected));
    }

    @Test
    public void canSwapNodeInOddElementList() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4, 5);
        final Node<Integer> expected = buildLinkedList(2, 1, 4, 3, 5);
        assertThat(PairwiseSwap.swapNode(head), identicalTo(expected));
    }

    @Test
    public void canSwapNodeInEvenElementList() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4);
        final Node<Integer> expected = buildLinkedList(2, 1, 4, 3);
        assertThat(PairwiseSwap.swapNode(head), identicalTo(expected));
    }

    @Test
    public void canSwapNodeInListWithNullElements() {
        final Node<Integer> head = buildLinkedList(1, null, 3, null);
        final Node<Integer> expected = buildLinkedList(null, 1, null, 3);
        assertThat(PairwiseSwap.swapNode(head), identicalTo(expected));
    }

    @Test
    public void canSwapNodeInRecursiveEmptyList() {
        assertThat(PairwiseSwap.swapNodeRecursive(null), is(nullValue()));
    }

    @Test
    public void canSwapNodeInRecursiveOneElementList() {
        final Node<Integer> head = buildLinkedList(1);
        final Node<Integer> expected = buildLinkedList(1);
        assertThat(PairwiseSwap.swapNodeRecursive(head), identicalTo(expected));
    }

    @Test
    public void canSwapNodeInRecursiveOddElementList() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4, 5);
        final Node<Integer> expected = buildLinkedList(2, 1, 4, 3, 5);
        assertThat(PairwiseSwap.swapNodeRecursive(head), identicalTo(expected));
    }

    @Test
    public void canSwapNodeInRecursiveEvenElementList() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4);
        final Node<Integer> expected = buildLinkedList(2, 1, 4, 3);
        assertThat(PairwiseSwap.swapNodeRecursive(head), identicalTo(expected));
    }

    @Test
    public void canSwapNodeInRecursiveListWithNullElements() {
        final Node<Integer> head = buildLinkedList(1, null, 3, null);
        final Node<Integer> expected = buildLinkedList(null, 1, null, 3);
        assertThat(PairwiseSwap.swapNodeRecursive(head), identicalTo(expected));
    }
}
