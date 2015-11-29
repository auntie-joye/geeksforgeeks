package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Unit tests for {@link Palindrome}.
 */
public class PalindromeTest extends TestSupport {
    @Test
    public void shouldReturnsFalseForEmptyList() {
        assertThat(Palindrome.isPalindrome(null), is(false));
    }

    @Test
    public void shouldReturnsTrueForOneElementList() {
        Node<Integer> head = buildLinkedList(1);
        assertThat(Palindrome.isPalindrome(head), is(true));
    }

    @Test
    public void shouldReturnsTrueForTwoElementListWhenItIsPalindrome() {
        Node<Integer> head = buildLinkedList(1, 1);
        assertThat(Palindrome.isPalindrome(head), is(true));
    }

    @Test
    public void shouldReturnsFalseForTwoElementListWhenItIsNotPalindrome() {
        Node<Integer> head = buildLinkedList(1, 2);
        assertThat(Palindrome.isPalindrome(head), is(false));
    }

    @Test
    public void shouldReturnsTrueForOddElementsListWhenItIsPalindrome() {
        Node<Integer> head = buildLinkedList(1, 2, 3, 2, 1);
        assertThat(Palindrome.isPalindrome(head), is(true));
    }

    @Test
    public void shouldReturnsFalseForOddElementsListWhenItIsNotPalindrome() {
        Node<Integer> head = buildLinkedList(1, 2, 3, 4, 1);
        assertThat(Palindrome.isPalindrome(head), is(false));
    }

    @Test
    public void shouldReturnsTrueForEvenElementsListWhenItIsPalindrome() {
        Node<Integer> head = buildLinkedList(1, 2, 3, 3, 2, 1);
        assertThat(Palindrome.isPalindrome(head), is(true));
    }

    @Test
    public void shouldReturnsFalseForEvenElementsListWhenItIsNotPalindrome() {
        Node<Integer> head = buildLinkedList(1, 2, 4, 3, 2, 1);
        assertThat(Palindrome.isPalindrome(head), is(false));
    }

    @Test
    public void shouldNotThrowWhenDataIsNull() {
        Node<Integer> head = buildLinkedList(1, 2, null, null, 2, 1);
        assertThat(Palindrome.isPalindrome(head), is(true));
    }

    @Test
    public void shouldReturnsFalseForEmptyListWithRecursion() {
        assertThat(Palindrome.isPalindromeRecursive(null), is(false));
    }

    @Test
    public void shouldReturnsTrueForOneElementListWithRecursion() {
        Node<Integer> head = buildLinkedList(1);
        assertThat(Palindrome.isPalindromeRecursive(head), is(true));
    }

    @Test
    public void shouldReturnsTrueForTwoElementListWithRecursionWhenItIsPalindromeRecursive() {
        Node<Integer> head = buildLinkedList(1, 1);
        assertThat(Palindrome.isPalindromeRecursive(head), is(true));
    }

    @Test
    public void shouldReturnsFalseForTwoElementListWithRecursionWhenItIsNotPalindromeRecursive() {
        Node<Integer> head = buildLinkedList(1, 2);
        assertThat(Palindrome.isPalindromeRecursive(head), is(false));
    }

    @Test
    public void shouldReturnsTrueForOddElementsListWhenItIsPalindromeRecursive() {
        Node<Integer> head = buildLinkedList(1, 2, 3, 2, 1);
        assertThat(Palindrome.isPalindromeRecursive(head), is(true));
    }

    @Test
    public void shouldReturnsFalseForOddElementsListWhenItIsNotPalindromeRecursive() {
        Node<Integer> head = buildLinkedList(1, 2, 3, 4, 1);
        assertThat(Palindrome.isPalindromeRecursive(head), is(false));
    }

    @Test
    public void shouldReturnsTrueForEvenElementsListWhenItIsPalindromeRecursive() {
        Node<Integer> head = buildLinkedList(1, 2, 3, 3, 2, 1);
        assertThat(Palindrome.isPalindromeRecursive(head), is(true));
    }

    @Test
    public void shouldReturnsFalseForEvenElementsListWhenItIsNotPalindromeRecursive() {
        Node<Integer> head = buildLinkedList(1, 2, 4, 3, 2, 1);
        assertThat(Palindrome.isPalindromeRecursive(head), is(false));
    }

    @Test
    public void shouldNotThrowWhenDataIsNullWithRecursion() {
        Node<Integer> head = buildLinkedList(1, 2, null, null, 2, 1);
        assertThat(Palindrome.isPalindromeRecursive(head), is(true));
    }
}
