package com.codingthrough.geeksforgeeks.ds.linkedlist;

import java.util.Objects;

/**
 * Represents one element in the single linked list.
 */
public class Node<T> {
    T data;
    Node<T> next;

    Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    Node() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Node other = (Node) o;
        return Objects.equals(this.data, other.data);

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.data);
    }
}
