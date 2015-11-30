package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

import com.google.common.base.Objects;

/**
 * Given a linked list of co-ordinates where adjacent points either form a
 * vertical line or a horizontal line. Delete points from the linked list
 * which are in the middle of a horizontal or vertical line.
 */
public class RemoveMiddlePoints {
    public static <T extends Point<?>> Node<T> remove(Node<T> head) {
        Node<T> cur = head;
        while (cur != null) {
            Node<T> start = cur;
            Node<T> end = start.next;
            if (end == null) {
                throw new IllegalStateException("Illegal line representation, no end point.");
            }

            while (end.next != null && onLine(start.data, end.data, end.next.data)) {
                end = end.next;
            }

            start.next = end;
            cur = end.next;
        }

        return head;
    }

    private static boolean onLine(Point<?> start, Point<?> end, Point<?> p) {
        return start.x.equals(end.x) ? start.x.equals(p.x) : start.y.equals(p.y);
    }

    public static class Point<T> {
        T x;
        T y;

        Point(T x, T y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Point<?> point = (Point<?>) o;
            return Objects.equal(x, point.x) &&
                    Objects.equal(y, point.y);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(x, y);
        }

        @Override
        public String toString() {
            return Objects.toStringHelper(this)
                    .add("x", x)
                    .add("y", y)
                    .toString();
        }
    }
}
