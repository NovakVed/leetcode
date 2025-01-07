package neetCode.arraysAndHashing.validSudoku.practice;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku1 {
    public static void main(String[] args) {
        char[][] board = new char[][] {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        System.out.println(isValidSudoku(board));
    }

    private static boolean isValidSudoku(char[][] board) {
        Set<String> covered = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != '.')
                    if (!covered.add(board[i][j] + "row: " + i)
                            || !covered.add(board[i][j] + "column" + j)
                            || !covered.add(board[i][j] + "block: " + i / 3 + ", " + j / 3)) {
                        return false;
                    }
            }
        }
        return true;
    }
}
