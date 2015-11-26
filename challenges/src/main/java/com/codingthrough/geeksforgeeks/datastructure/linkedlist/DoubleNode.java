package com.codingthrough.geeksforgeeks.datastructure.linkedlist;

/**
 * Represents one element in the double linked list.
 */
public class DoubleNode<T> {
    T data;
    DoubleNode<T> next;
    DoubleNode<T> prev;

    DoubleNode(T data, DoubleNode<T> next) {
        this.data = data;
        this.next = next;
    }
}
