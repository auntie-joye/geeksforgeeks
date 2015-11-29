package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

/**
 * Adds two numbers that are represented in the following way:
 * 234 is represented by 2->3->4
 * 567 is represented by 5->6->7
 * The output will be 801 represented by 8->0->1
 */
public class Addition2 {
    /**
     * Adds two numbers using reverse lists approach.
     *
     * @param a the first number
     * @param b the second number
     * @return the sum of two numbers
     */
    public static Node<Integer> add(Node<Integer> a, Node<Integer> b) {
        Node<Integer> reversedA = Reverse.reverse(a);
        Node<Integer> reversedB = Reverse.reverse(b);

        Node<Integer> dummy = new Node<>();
        Node<Integer> prev = dummy;
        int carry = 0;
        while (reversedA != null && reversedB != null) {
            int sum = reversedA.data + reversedB.data + carry;
            carry = sum > 9 ? 1 : 0;
            prev.next = new Node<>(sum % 10, null);

            prev = prev.next;
            reversedA = reversedA.next;
            reversedB = reversedB.next;
        }

        while (reversedA != null) {
            int sum = reversedA.data + carry;
            carry = sum > 9 ? 1 : 0;
            prev.next = new Node<>(sum % 10, null);

            prev = prev.next;
            reversedA = reversedA.next;
        }

        while (reversedB != null) {
            int sum = reversedB.data + carry;
            carry = sum > 9 ? 1 : 0;
            prev.next = new Node<>(sum % 10, null);

            prev = prev.next;
            reversedB = reversedB.next;
        }

        if (carry == 1) {
            prev.next = new Node<>(carry, null);
        }

        return Reverse.reverse(dummy.next);
    }

    /**
     * Adds two numbers using length and recursive lists approach.
     *
     * @param a the first number
     * @param b the second number
     * @return the sum of two numbers
     */
    public static Node<Integer> addRecursive(Node<Integer> a, Node<Integer> b) {
        int lenA = Length.length(a);
        int lenB = Length.length(b);

        int gap = lenA - lenB;
        if (gap < 0) {
            Node<Integer> temp = a;
            a = b;
            b = temp;

            gap = lenB - lenA;
        }

        Node<Integer> prev = addRecursive(a, b, gap);
        if (prev != null && prev.data > 9) {
            prev.data = prev.data % 10;
            prev = new Node<>(1, prev);
        }

        return prev;
    }

    private static Node<Integer> addRecursive(Node<Integer> a, Node<Integer> b, int gap) {
        if (a == null && b == null) {
            return null;
        }

        Node<Integer> prev = gap > 0
                ? addRecursive(a.next, b, gap - 1)
                : addRecursive(a.next, b.next, gap);

        int carry = 0;
        if (prev != null && prev.data > 9) {
            prev.data = prev.data % 10;
            carry = 1;
        }

        int sum = gap > 0
                ? a.data + carry
                : a.data + b.data + carry;

        return new Node<>(sum, prev);
    }
}
