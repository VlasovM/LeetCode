package ru.javlasov.easy;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * LeetCode:
 * <a href="https://leetcode.com/problems/valid-parentheses/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */

public class ValidParentheses {

    // Time and memory complexity is O(n)
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
