package ru.javlasov.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * LeetCode:
 * <a href="https://leetcode.com/problems/simplify-path/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */

public class SimplifyPath {

    // Time and memory complexity is O(n)
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
