package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

/**
 * Adds two numbers that are represented in the following way:
 * 234 is represented by 4->3->2
 * 567 is represented by 7->6->5
 * The output will be 801 represented by 1->0->8
 */
public class Addition {
    /**
     * Adds two numbers.
     *
     * @param a the first number
     * @param b the second number
     * @return the sum of two numbers
     */
    public static Node<Integer> add(Node<Integer> a, Node<Integer> b) {
        Node<Integer> dummy = new Node<>(null, null);

        int carry = 0;
        Node<Integer> prev = dummy;

        while (a != null && b != null) {
            int sum = a.data + b.data + carry;

            carry = sum > 9 ? 1 : 0;
            sum = sum % 10;
            prev.next = new Node<>(sum, null);

            prev = prev.next;
            a = a.next;
            b = b.next;
        }

        while (a != null) {
            int sum = a.data + carry;

            carry = sum > 9 ? 1 : 0;
            sum = sum % 10;
            prev.next = new Node<>(sum, null);

            prev = prev.next;
            a = a.next;
        }

        while (b != null) {
            int sum = b.data + carry;

            carry = sum > 9 ? 1 : 0;
            sum = sum % 10;
            prev.next = new Node<>(sum, null);

            prev = prev.next;
            b = b.next;
        }

        if (carry > 0) {
            prev.next = new Node<>(carry, null);
        }

        return dummy.next;
    }

    /**
     * Adds two numbers.
     *
     * @param a the first number
     * @param b the second number
     * @return the sum of two numbers
     */
    public static Node<Integer> addRecursive(Node<Integer> a, Node<Integer> b) {
        Node<Integer> dummy = new Node<>(null, null);

        addRecursive(dummy, 0, a, b);

        return dummy.next;
    }

    private static void addRecursive(Node<Integer> prev, int carry, Node<Integer> a, Node<Integer> b) {
        if (a == null && b == null) {
            if (carry > 0) {
                prev.next = new Node<>(carry, null);
            }
            return;
        }

        if (a == null) {
            addRecursive(prev, carry, b);
            return;
        }

        if (b == null) {
            addRecursive(prev, carry, a);
            return;
        }

        int sum = a.data + b.data + carry;
        carry = sum > 9 ? 1 : 0;

        prev.next = new Node<>(sum % 10, null);
        addRecursive(prev.next, carry, a.next, b.next);
    }

    private static void addRecursive(Node<Integer> prev, int carry, Node<Integer> a) {
        if (a == null) {
            if (carry > 0) {
                prev.next = new Node<>(carry, null);
            }
            return;
        }

        int sum = a.data + carry;
        carry = sum > 9 ? 1 : 0;
        prev.next = new Node<>(sum % 10, null);

        addRecursive(prev.next, carry, a.next);
    }
}
