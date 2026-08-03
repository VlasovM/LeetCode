package ru.javlasov.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Complexity: Hard
 * LeetCode: <a href="https://leetcode.com/problems/basic-calculator/description/">...</a>
 * Time complexity: O(n) – single pass through the string, each character processed once.
 * Memory complexity: O(n) – stack may store up to O(n) elements (nested parentheses or many saved contexts).
 */

public class BasicCalculator {

    public static int calculate(String s) {
        int result = 0;
        int sign = 1;
        Deque<Integer> stack = new ArrayDeque<>();

        int i = 0;
        int n = s.length();

        while (i < n) {
            char c = s.charAt(i);

            if (c == ' ') {
                i++;
            } else if (c == '+') {
                sign = 1;
                i++;
            } else if (c == '-') {
                sign = -1;
                i++;
            } else if (c == '(') {
                stack.push(result);
                stack.push(sign);

                result = 0;
                sign = 1;
                i++;
            } else if (c == ')') {
                int prevSign = stack.pop();
                int prevResult = stack.pop();
                result = prevResult + prevSign * result;
                i++;
            } else {
                int num = 0;
                while (i < n && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                result += sign * num;
            }
        }
        return result;
    }

}
