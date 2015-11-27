package com.codingthrough.geeksforgeeks.ds.linkedlist;

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
 * The idea is to run a loop while there are available positions in first loop and insert nodes
 * of second list by changing pointers. Following are C and Java implementations of this approach.
 */
public class MergeListsAtAlternatePositions {
    private static <T> void merge(Node<T> a, Node<T> b) {

    }
}
