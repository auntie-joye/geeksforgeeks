package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

/**
 * Merges a linked list into another linked list at alternate positions.
 * For example, if first list is 5->7->17->13->11 and second is 12->10->2->4->6,
 * first list should become 5->12->7->10->17->2->13->4->11->6 and second list
 * should become empty.
 * The nodes of second list should only be inserted when there are positions available.
 * For example, if the first list is 1->2->3 and second list is 4->5->6->7->8, then first
 * list should become 1->4->2->5->3->6 and second list to 7->8.
 * <p>
 * Use of extra space is not allowed (Not allowed to create additional nodes), i.e.,
 * insertion must be done in-place. Expected time complexity is O(n) where n is number
 * of nodes in first list.
 * <p>
 */
public class MergeAtAlternatePositions {
    public static <T> Node<T> merge(Node<T> a, Node<T> b) {
        Node<T> dummy = new Node<>(null, null);
        Node<T> prev = dummy;
        while (a != null && b != null) {
            prev.next = a;
            a = a.next;
            prev = prev.next;

            prev.next = b;
            b = b.next;
            prev = prev.next;

            prev.next = null;
        }

        return dummy.next;
    }
}
