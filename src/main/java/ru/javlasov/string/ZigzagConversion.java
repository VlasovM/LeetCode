package ru.javlasov.string;

/**
 * Complexity: Medium
 * LeetCode: <a href="https://leetcode.com/problems/zigzag-conversion/description/">...</a>
 * Time complexity: O(n) – single pass through the input string, plus O(numRows) for concatenation (numRows ≤ n).
 * Memory complexity: O(n) – stores all characters in StringBuilder array and final result.
 */

public class ZigzagConversion {

    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        StringBuilder[] builderArray = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            builderArray[i] = new StringBuilder();
        }

        int currentRow = 0;
        int direction = 1;

        char[] symbols = s.toCharArray();

        for (char symbol : symbols) {

            builderArray[currentRow].append(symbol);

            if (currentRow == numRows - 1) {
                direction = -1;
            }

            if (currentRow == 0) {
                direction = 1;
            }

            currentRow += direction;
        }

        StringBuilder resultBuilder = new StringBuilder();
        for (StringBuilder row : builderArray) {
            resultBuilder.append(row);
        }

        return resultBuilder.toString();
    }

}
