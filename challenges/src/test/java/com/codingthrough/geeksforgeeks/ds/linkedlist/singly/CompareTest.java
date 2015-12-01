package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Unit tests for {@link  Compare}.
 */
public class CompareTest extends TestSupport {
    @Test
    public void canCompareNullAndOneElementList() {
        Node<Character> b = buildLinkedList('a');
        assertThat(Compare.compare(null, b), is(-1));
    }

    @Test
    public void canCompareOneElementListAndNull() {
        Node<Character> a = buildLinkedList('a');
        assertThat(Compare.compare(a, null), is(1));
    }

    @Test
    public void canCompareWhenFirstListIsLessInLengthThanSecondList() {
        Node<Character> a = buildLinkedList('a', 'b');
        Node<Character> b = buildLinkedList('a', 'b', 'c');
        assertThat(Compare.compare(a, b), is(-1));
    }

    @Test
    public void canCompareWhenFirstListIsGreaterInLengthThanSecondList() {
        Node<Character> a = buildLinkedList('a', 'b', 'c');
        Node<Character> b = buildLinkedList('a', 'b');
        assertThat(Compare.compare(a, b), is(1));
    }

    @Test
    public void canCompareWhenFirstListIsLessThanSecondList() {
        Node<Character> a = buildLinkedList('a', 'b', 'a');
        Node<Character> b = buildLinkedList('a', 'b', 'c');
        assertThat(Compare.compare(a, b), is(-1));
    }

    @Test
    public void canCompareWhenFirstListIsGreaterThanSecondList() {
        Node<Character> a = buildLinkedList('a', 'b', 'c');
        Node<Character> b = buildLinkedList('a', 'b', 'a');
        assertThat(Compare.compare(a, b), is(1));
    }

    @Test
    public void canCompareWhenBothAreTheSame() {
        Node<Character> a = buildLinkedList('a', 'b', 'c');
        Node<Character> b = buildLinkedList('a', 'b', 'c');
        assertThat(Compare.compare(a, b), is(0));
    }

    @Test
    public void canCompareNullWithNull() {
        assertThat(Compare.compare(null, null), is(0));
    }
}
