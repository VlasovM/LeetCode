package ru.javlasov.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

/**
 * LeetCode:
 * <a href="https://leetcode.com/problems/min-stack/?envType=study-plan-v2&envId=top-interview-150">...</a>
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

