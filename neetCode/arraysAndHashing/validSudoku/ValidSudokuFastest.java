package neetCode.arraysAndHashing.validSudoku;

import java.util.HashSet;
import java.util.Set;

class ValidSudokuFastest {
    public static void main(String[] args) {
        // result is true
        char[][] board = {
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

        // result should be false!
        // char[][] board = {
        // { '.', '.', '4', '.', '.', '.', '6', '3', '.' },
        // { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
        // { '5', '.', '.', '.', '.', '.', '.', '9', '.' },
        // { '.', '.', '.', '5', '6', '.', '.', '.', '.' },
        // { '4', '.', '3', '.', '.', '.', '.', '.', '1' },
        // { '.', '.', '.', '7', '.', '.', '.', '.', '.' },
        // { '.', '.', '.', '5', '.', '.', '.', '.', '.' },
        // { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
        // { '.', '.', '.', '.', '.', '.', '.', '.', '.' }
        // };
        // result is -> false
        // char[][] board = {
        // {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
        // {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
        // {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
        // {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
        // {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
        // {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
        // {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
        // {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
        // {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        // };

        System.out.println(isValidSudoku(board));
    }

    private static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            Set<Character> visitedRows = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != '.') {
                    if (!visitedRows.add(board[i][j])) {
                        return false;
                    }
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            Set<Character> visitedColumns = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] != '.') {
                    if (!visitedColumns.add(board[j][i])) {
                        return false;
                    }
                }
            }
        }

        for (int i = 0; i < board.length; i += 3) {
            for (int j = 0; j < board.length; j += 3) {
                Set<Character> visited = new HashSet<>();
                for (int k = i; k < i + 3; k++) {
                    for (int g = j; g < j + 3; g++) {
                        if (board[k][g] != '.') {
                            if (!visited.add(board[k][g])) {
                                return false;
                            }
                        }
                    }
                }
            }
        }

        return true;
    }
}
