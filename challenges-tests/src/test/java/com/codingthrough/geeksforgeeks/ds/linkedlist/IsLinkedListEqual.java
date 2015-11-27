package com.codingthrough.geeksforgeeks.ds.linkedlist;

import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeDiagnosingMatcher;

/**
 * Matches two linked list to be identical.
 */
public class IsLinkedListEqual<T> extends TypeSafeDiagnosingMatcher<Node<T>> {
    private Node<T> expected;
    private Node<T> current;

    public IsLinkedListEqual(Node<T> expected) {
        this.expected = expected;
    }

    @Override
    protected boolean matchesSafely(Node<T> actual, Description mismatchDescription) {
        current = expected;
        while (actual != null && current != null) {
            if (!equals(actual.data, current.data)) {
                mismatchDescription.appendText(" linked list contains ").appendValue(actual.data);
                return false;
            }

            actual = actual.next;
            current = current.next;
        }

        if (actual == null && current == null) {
            return true;
        }

        mismatchDescription.appendValue(actual != null ? " linked list contains more elements " : " linked list contains less elements ");
        return false;
    }

    @Override
    public void describeTo(Description description) {
        description.appendValue(current != null ? current.data : "[no element]");
    }

    @Factory
    public static <T> Matcher<Node<T>> identicalTo(Node<T> node) {
        return new IsLinkedListEqual<>(node);
    }

    private <T> boolean equals(T a, T b) {
        return ((a == null && b == null) || (a != null && a.equals(b)));
    }
}
