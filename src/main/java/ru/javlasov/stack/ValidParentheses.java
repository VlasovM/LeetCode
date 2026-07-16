package ru.javlasov.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Complexity: Easy
 * LeetCode: <a href="https://leetcode.com/problems/valid-parentheses/description/">...</a>
 * Time complexity: O(n) – single pass through the string.
 * Memory complexity: O(n) – stack may hold up to n characters in worst case.
 */

public class ValidParentheses {

    public static boolean isValid(String s) {
        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                deque.push(currentChar);
            } else if (deque.isEmpty()) {
                return false;
            } else {
                char top = deque.pop();

                if ((currentChar == ')' && top != '(') ||
                        (currentChar == '}' && top != '{') ||
                        (currentChar == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return deque.isEmpty();
    }

}
