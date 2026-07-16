package ru.javlasov.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Complexity: Medium
 * LeetCode: <a href="https://leetcode.com/problems/simplify-path/description/">...</a>
 * Time complexity: O(n) – single pass over components after split (which itself is O(n)).
 * Memory complexity: O(n) – stores components array and deque (up to n elements).
 */

public class SimplifyPath {

    public static String simplifyPath(String path) {
        String[] components = path.split("/");
        Deque<String> deque = new ArrayDeque<>();

        for (String component : components) {
            if (component.isEmpty() || component.equals(".")) {
                continue;
            }
            if (component.equals("..")) {
                if (!deque.isEmpty()) {
                    deque.removeLast();
                }
            } else {
                deque.addLast(component);
            }
        }

        if (deque.isEmpty()) {
            return "/";
        }
        StringBuilder result = new StringBuilder();
        for (String dir : deque) {
            result.append("/").append(dir);
        }
        return result.toString();
    }

}
