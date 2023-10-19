package Practical6;

import java.util.*;

public class Prac61{
    public static void solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }


        List<List<String>> solutions = new ArrayList<>();
        placeQueens(board, 0, solutions);

        // Print the first solution (if exists)
        if (!solutions.isEmpty()) {
            for (String row : solutions.get(0)) {
                System.out.println(row);
            }
        } else {
            System.out.println("No solution found.");
        }
    }

    private static void placeQueens(char[][] board, int row, List<List<String>> solutions) {
        int n = board.length;
        if (row == n) {
            solutions.add(constructSolution(board));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                placeQueens(board, row + 1, solutions);
                board[row][col] = '.';
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;

        // Check the column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper-left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    private static List<String> constructSolution(char[][] board) {
        List<String> solution = new ArrayList<>();
        for (char[] row : board) {
            solution.add(new String(row));
        }
        return solution;
    }

    public static void main(String[] args) {
        int n = 8;
        solveNQueens(n);
    }
}
