package ru.javlasov.medium;

/**
 * LetCode:
 * <a href="https://leetcode.com/problems/valid-sudoku/submissions/2012639371/?envType=study-plan-v2&envId=top-interview-150">...</a>
 * <p>
 * In this task I use 2 road to solve it. The first one is really simple, but is not good for the time and memory,
 * the second one it's classic solve use 3 array (or hashSet).
 */

public class ValidSudoku {

//    public static boolean isValidSudoku(char[][] board) {
//        Set<String> seen = new HashSet<>();
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                char currentChar = board[i][j];
//                if (currentChar != '.') {
//
//                    // HashSet return false if value is contains in set yet.
//                    if (!seen.add(currentChar + "@row" + i) ||
//                            !seen.add(currentChar + "@col" + j) ||
//                            !seen.add(currentChar + "@box" + (i/3) + "," + (j/3))) {
//                        return false;
//                    }
//                }
//            }
//        }
//
//        return true;
//    }

    public static boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') continue;

                int num = c - '1';
                int boxIndex = (i / 3) * 3 + (j / 3);

                if (rows[i][num] || cols[j][num] || boxes[boxIndex][num]) {
                    return false;
                }

                rows[i][num] = true;
                cols[j][num] = true;
                boxes[boxIndex][num] = true;
            }
        }
        return true;
    }

}
