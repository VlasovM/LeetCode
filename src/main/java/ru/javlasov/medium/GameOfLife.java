package ru.javlasov.medium;

public class GameOfLife {

    public static void gameOfLife(int[][] board) {

        // states:
        // 0 -> 0 = state 0
        // 1 -> 0 (die) = state 1
        // 0 -> 1 (born) = state 2
        // 1 -> 1 = state 3

        // calculate corrected state in cells
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[0].length; column++) {
                int countN = calculateNeighbors(row, column, board);
                boolean isAliveNow = board[row][column] == 1;

                if (isAliveNow && (countN == 2 || countN == 3)) {
                    board[row][column] = 3;
                } else if (isAliveNow) {
                    board[row][column] = 1;
                } else if (countN == 3) {
                    board[row][column] = 2;
                } else {
                    board[row][column] = 0;
                }
            }
        }

        // set corrected value (2 -> 1; 3 -> 1)
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[0].length; column++) {
                int currentValue = board[row][column];
                if (currentValue == 2 || currentValue == 3) {
                    board[row][column] = 1;
                } else {
                    board[row][column] = 0;
                }
            }
        }


    }

    private static int calculateNeighbors(int currentRow, int currentColumn, int[][] board) {
        int liveNeighbors = 0;

        // we know that the cell has 3 <= cell >= 8 neighbors
        int[] rows = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] columns = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int k = 0; k < 8; k++) {
            int nr = currentRow + rows[k];
            int nc = currentColumn + columns[k];
            if (nr >= 0 && nr < board.length && nc >= 0 && nc < board[0].length) {
                if (board[nr][nc] == 1 || board[nr][nc] == 3) {
                    liveNeighbors++;
                }
            }
        }
        return liveNeighbors;
    }

}
