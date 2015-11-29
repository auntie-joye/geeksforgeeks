package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

/**
 * Checks if a singly linked list is palindrome
 */
public class Palindrome {
    public static <T> boolean isPalindrome(Node<T> head) {
        if (head == null) {
            return false;
        }

        boolean isPalindrome = true;

        Node<T> middle = middleNode(head);
        Node<T> tail = middle.next;
        middle.next = null;

        Node<T> reversedTail = reverse(tail);

        Node<T> curTail = reversedTail;
        while (curTail != null) {
            if (!equals(curTail.data, head.data)) {
                isPalindrome = false;
                break;
            }

            curTail = curTail.next;
            head = head.next;
        }

        tail = reverse(reversedTail);
        middle.next = tail;

        return isPalindrome;
    }

    private static <T> Node<T> middleNode(Node<T> head) {
        if (head == null) {
            return null;
        }

        Node<T> slow = head;
        Node<T> fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private static <T> Node<T> reverse(Node<T> head) {
        Node<T> prev = null;
        while (head != null) {
            Node<T> next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static <T> boolean isPalindromeRecursive(Node<T> head) {
        if (head == null) {
            return false;
        }

        try {
            isPalindromeRecursive(head, head);
            return true;
        } catch (IllegalStateException e) {
            return false;
        }
    }

    public static <T> Node<T> isPalindromeRecursive(Node<T> head, Node tail) {
        if (tail == null) {
            return head;
        }

        Node<T> cur = isPalindromeRecursive(head, tail.next);
        if (!equals(cur.data, tail.data)) {
            throw new IllegalStateException("It is not a palindrome.");
        }

        return cur.next;
    }

    private static <T> boolean equals(T a, T b) {
        return (a == null && b == null) || (a != null && a.equals(b));
    }
}
