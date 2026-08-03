package ru.javlasov.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

/**
 * Complexity: Medium
 * LeetCode: <a href="https://leetcode.com/problems/min-stack/description/">...</a>
 * Time complexity: O(1) for each operation (push, pop, top, getMin).
 * Memory complexity: O(n) – two stacks store up to n elements in total.
 */

public class MinStack {

    private final Deque<Integer> deque;
    private final Deque<Integer> minimumDeque;

    public MinStack() {
        deque = new ArrayDeque<>();
        minimumDeque = new ArrayDeque<>();
    }

    public void push(int value) {
        deque.push(value);
        if (minimumDeque.isEmpty() || value <= minimumDeque.getFirst()) {
            minimumDeque.push(value);
        }
    }

    public void pop() {
        Integer pop = deque.pop();
        if (Objects.equals(pop, minimumDeque.getFirst())) {
            minimumDeque.pop();
        }
    }

    public int top() {
        return deque.getFirst();
    }

    public int getMin() {
        return minimumDeque.getFirst();
    }

}

