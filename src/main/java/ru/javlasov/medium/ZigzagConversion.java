package ru.javlasov.medium;

/**
 * LeetCode:
 * <a href="https://leetcode.com/problems/zigzag-conversion/?envType=study-plan-v2&envId=top-interview-150">...</a>
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
