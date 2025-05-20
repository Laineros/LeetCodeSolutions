package Medium;

import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < 9; row++) {
            HashSet<Character> setRow = new HashSet<>();
            HashSet<Character> setColumn = new HashSet<>();
            HashSet<Character> setSquare = new HashSet<>();
            for (int col = 0; col < 9; col++) {
                if (board[row][col] != '.') {
                    if (setRow.contains(board[row][col])) {
                        return false;
                    }
                    setRow.add(board[row][col]);
                }

                if (board[col][row] != '.') {
                    if (setColumn.contains(board[col][row])) {
                        return false;
                    }
                    setColumn.add(board[col][row]);
                }

                int blockRow = 3 * (row / 3);
                int blockCol = 3 * (row % 3);
                char cell = board[blockRow + col / 3][blockCol + col % 3];

                if (cell != '.') {
                    if (setSquare.contains(cell)) {
                        return false;
                    }
                    setSquare.add(cell);
                }
            }
        }
        return true;
    }
}
