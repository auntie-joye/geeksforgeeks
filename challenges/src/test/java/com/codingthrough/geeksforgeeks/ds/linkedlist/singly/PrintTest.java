package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

import org.junit.Test;

/**
 * Unit tests for {@link Print}.
 */
public class PrintTest extends TestSupport {
    @Test
    public void canPrintEmptyList() {
        Print.print(null);
    }

    @Test
    public void canPrintOneElementList() {
        final Node<Integer> head = buildLinkedList(1);
        Print.print(head);
    }

    @Test
    public void canPrintEvenElementsList() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4);
        Print.print(head);
    }

    @Test
    public void canPrintOddElementsList() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4, 5);
        Print.print(head);
    }

    @Test
    public void canPrintRecursiveEmptyList() {
        Print.printRecursive(null);
    }

    @Test
    public void canPrintRecursiveOneElementList() {
        final Node<Integer> head = buildLinkedList(1);
        Print.printRecursive(head);
    }

    @Test
    public void canPrintRecursiveEvenElementsList() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4);
        Print.printRecursive(head);
    }

    @Test
    public void canPrintRecursiveOddElementsList() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4, 5);
        Print.printRecursive(head);
    }

    @Test
    public void canPrintReverseEmptyList() {
        Print.printReverse(null);
    }

    @Test
    public void canPrintReverseOneElementList() {
        final Node<Integer> head = buildLinkedList(1);
        Print.printReverse(head);
    }

    @Test
    public void canPrintReverseEvenElementsList() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4);
        Print.printReverse(head);
    }

    @Test
    public void canPrintReverseOddElementsList() {
        final Node<Integer> head = buildLinkedList(1, 2, 3, 4, 5);
        Print.printReverse(head);
    }
}
