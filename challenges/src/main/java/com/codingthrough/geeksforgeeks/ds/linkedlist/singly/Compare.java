package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

/**
 * Given two linked lists, represented as linked lists (every character is a node in linked list).
 * Write a function compare() that works similar to strcmp(), i.e., it returns 0 if both strings
 * are same, 1 if first linked list is lexicographically greater, and -1 if second string is
 * lexicographically greater.
 * Input:
 * list1 = g->e->e->k->s->a
 * list2 = g->e->e->k->s->b
 * Output: -1
 * <p>
 * Input:
 * list1 = g->e->e->k->s->a
 * list2 = g->e->e->k->s
 * Output: 1
 * <p>
 * Input:
 * list1 = g->e->e->k->s
 * list2 = g->e->e->k->s
 * Output: 0
 */
public class Compare {
    public static int compare(Node<Character> a, Node<Character> b) {
        while (a != null && b != null) {
            int cmp = a.data.compareTo(b.data);
            if (cmp < 0) {
                return -1;
            } else if (cmp > 0) {
                return 1;
            }
            a = a.next;
            b = b.next;
        }

        if (b != null) {
            return -1;
        } else if (a != null) {
            return 1;
        }
        return 0;
    }
}
