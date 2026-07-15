package ru.javlasov.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * LeetCode:
 * <a href="https://leetcode.com/problems/evaluate-reverse-polish-notation/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */

public class EvaluateReversePolishNotation {

    // time and memory complexity is O(n)
    public static int evalRPN(String[] tokens) {
        Deque<String> stack = new ArrayDeque<>();
        for (int i = 0; i <= tokens.length - 1; i++) {
            String token = tokens[i];

            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                Integer second = Integer.valueOf(stack.pop());
                Integer first = Integer.valueOf(stack.pop());

                Integer result = switch (token) {
                    case "+" -> first + second;
                    case "-" -> first - second;
                    case "*" -> first * second;
                    default -> first / second;
                };

                stack.push(String.valueOf(result));
            } else {
                stack.push(token);
            }
        }

        return Integer.parseInt(stack.pop());
    }

}
