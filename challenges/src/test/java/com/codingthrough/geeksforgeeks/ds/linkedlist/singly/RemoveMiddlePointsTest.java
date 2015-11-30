package com.codingthrough.geeksforgeeks.ds.linkedlist.singly;

import com.codingthrough.geeksforgeeks.ds.linkedlist.singly.RemoveMiddlePoints.Point;
import org.junit.Test;

import static com.codingthrough.geeksforgeeks.ds.linkedlist.singly.IsLinkedListEqual.identicalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

/**
 * Unit tests for {@link  RemoveMiddlePoints}.
 */
public class RemoveMiddlePointsTest extends TestSupport {
    /**
     * Input:  (0,10)->(1,10)->(5,10)->(7,10)
     * |
     * (7,5)->(20,5)->(40,5)
     * Output:  (0,10)->(7,10)
     * |
     * (7,5)->(40,5)
     */
    @Test
    public void canRemoveMiddlePointsForSeveralHorizontalLines() {
        Node<Point> head = buildLinkedList(
                new Point<>(0, 10), new Point<>(1, 10), new Point<>(5, 10), new Point<>(7, 10),
                new Point<>(7, 5), new Point<>(20, 5), new Point<>(40, 5));
        Node<Point> expected = buildLinkedList(
                new Point<>(0, 10), new Point<>(7, 10),
                new Point<>(7, 5), new Point<>(40, 5));

        assertThat(RemoveMiddlePoints.remove(head), identicalTo(expected));
    }

    /**
     * Input:  (2,3)->(4,3)->(6,3)->(10,3)->(12,3)
     * Output:  (2,3)->(12,3)
     */
    @Test
    public void canRemoveMiddlePointsForOneHorizontalLine() {
        Node<Point> head = buildLinkedList(
                new Point<>(2, 3), new Point<>(4, 3), new Point<>(6, 3), new Point<>(10, 3), new Point<>(12, 3));
        Node<Point> expected = buildLinkedList(
                new Point<>(2, 3), new Point<>(12, 3));

        assertThat(RemoveMiddlePoints.remove(head), identicalTo(expected));
    }

    /**
     * Input:  (2,3)->(4,3)->(6,3)->(10,3)->(12,3)
     * Output:  (2,3)->(12,3)
     */
    @Test
    public void canRemoveMiddlePointsForOneVerticalLine() {
        Node<Point> head = buildLinkedList(
                new Point<>(2, 3), new Point<>(2, 4), new Point<>(2, 6), new Point<>(2, 10), new Point<>(2, 12));
        Node<Point> expected = buildLinkedList(
                new Point<>(2, 3), new Point<>(2, 12));

        assertThat(RemoveMiddlePoints.remove(head), identicalTo(expected));
    }

    @Test
    public void throwWhenLineIsInvalid() {
        Node<Point> head = buildLinkedList(
                new Point<>(2, 3), new Point<>(2, 4), new Point<>(3, 6));

        try {
            RemoveMiddlePoints.remove(head);
            fail("Should throw when line segment is invalid, no end point.");
        } catch (IllegalStateException e) {
            // ok, it's expected exception
        }
    }
}
