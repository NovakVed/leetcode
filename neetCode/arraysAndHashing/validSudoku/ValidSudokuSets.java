package neetCode.arraysAndHashing.validSudoku;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidSudokuSets {
    public static void main(String[] args) {
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

        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> squares = new HashMap<>(); // key = (r / 3) * 3 + c / 3

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char cell = board[r][c];
                if (cell == '.') {
                    continue;
                }
                if (rows.getOrDefault(r, new HashSet<>()).contains(cell)
                        || cols.getOrDefault(c, new HashSet<>()).contains(cell)
                        || squares.getOrDefault((r / 3) * 3 + c / 3, new HashSet<>()).contains(cell)) {
                    return false;
                }
                cols.computeIfAbsent(c, k -> new HashSet<>()).add(cell);
                rows.computeIfAbsent(r, k -> new HashSet<>()).add(cell);
                squares.computeIfAbsent((r / 3) * 3 + c / 3, k -> new HashSet<>()).add(cell);
            }
        }
        return true;
    }
}
