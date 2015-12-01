package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

/**
 * Given a Linked List. The Linked List is in alternating ascending and descending orders.
 * Sort the list efficiently.
 * Input List:   10->40->53->30->67->12->89->NULL
 * Output List:  10->12->30->43->53->67->89->NULL
 */
public class SortAlternateSorting {
    public static <T extends Comparable<T>> Node<T> sort(Node<T> head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node<T> a = head;
        Node<T> curA = a;
        Node<T> b = head.next;
        Node<T> curB = b;

        head = head.next.next;
        while (head != null) {
            Node<T> next = head.next;
            curA.next = head;
            curA = curA.next;

            if (next != null) {
                curB.next = next;
                curB = curB.next;
                head = next.next;
            } else {
                head = null;
            }
        }

        curA.next = null;
        curB.next = null;

        Node<T> reversedB = reverse(b);
        return merge(a, reversedB);
    }

    private static <T extends Comparable<T>> Node<T> merge(Node<T> a, Node<T> b) {
        Node<T> dummy = new Node<>(null, null);
        Node<T> cur = dummy;
        while (a != null && b != null) {
            if (b.data.compareTo(a.data) < 0) {
                cur.next = b;
                b = b.next;
            } else {
                cur.next = a;
                a = a.next;
            }
            cur = cur.next;
        }

        if (a != null) {
            cur.next = a;
        } else if (b != null) {
            cur.next = b;
        }

        return dummy.next;
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
}
