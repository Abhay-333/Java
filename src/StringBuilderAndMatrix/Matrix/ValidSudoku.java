package StringBuilderAndMatrix.Matrix;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.SimpleTimeZone;

public class ValidSudoku {
    public static boolean checkKrRow(String[] board) {
        boolean valid = true;
        Set<String> set1 = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            if (board[i].equals(".")) continue;
            if (!set1.contains(board[i])) {
                set1.add(board[i]);
            } else {
                return false;
            }

//            System.out.print(set1 + " ");
        }
        return valid;
    }

    public static boolean checkKrColumn(String[][] board, int column) {
        boolean valid = true;
        Set<String> set1 = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            if (board[i][column].equals(".")) continue;
            if (!set1.contains(board[i][column])) {
                set1.add(board[i][column]);
            } else {
                return false;
            }
        }
        return valid;
    }

    public static boolean checkKrGrid(String[][] board, int row, int column) {
        boolean valid = true;
        for (int i = 0; i < row + 3; i++) {
            Set<String> set1 = new HashSet<>();
            for (int j = 0; j < column + 3; j++) {
                if (board[i][j].equals(".")) continue;
                if (!set1.contains(board[i][j])) {
                    set1.add(board[i][j]);
                } else {
                    return false;
                }
            }
        }
        return valid;
    }

    public static boolean checkKr(String[][] board) {
        boolean valid = true;
        for (int i = 0; i < board.length; i++) {
            if (!checkKrRow(board[i])) return false;
            if (!checkKrColumn(board, i)) return false;
        }
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!checkKrGrid(board, i, j)) return false;
            }
        }
        return valid;
    }

    public static void main(String[] args) {
        String[][] board = {{"8", "3", ".", ".", "7", ".", ".", ".", "."}
                , {"6", ".", ".", "1", "9", "5", ".", ".", "."}
                , {".", "9", "8", ".", ".", ".", ".", "6", "."}
                , {"8", ".", ".", ".", "6", ".", ".", ".", "3"}
                , {"4", ".", ".", "8", ".", "3", ".", ".", "1"}
                , {"7", ".", ".", ".", "2", ".", ".", ".", "6"}
                , {".", "6", ".", ".", ".", ".", "2", "8", "."}
                , {".", ".", ".", "4", "1", "9", ".", ".", "5"}
                , {".", ".", ".", ".", "8", ".", ".", "7", "9"}};

//        String[][] board = {{"5", "3", ".", ".", "7", ".", ".", ".", "."}
//                , {"6", ".", ".", "1", "9", "5", ".", ".", "."}
//                , {".", "9", "8", ".", ".", ".", ".", "6", "."}
//                , {"8", ".", ".", ".", "6", ".", ".", ".", "3"}
//                , {"4", ".", ".", "8", ".", "3", ".", ".", "1"}
//                , {"7", ".", ".", ".", "2", ".", ".", ".", "6"}
//                , {".", "6", ".", ".", ".", ".", "2", "8", "."}
//                , {".", ".", ".", "4", "1", "9", ".", ".", "5"}
//                , {".", ".", ".", ".", "8", ".", ".", "7", "9"}};

        System.out.println(checkKr(board));
    }
}
