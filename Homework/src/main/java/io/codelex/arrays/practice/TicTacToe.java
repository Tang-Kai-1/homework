package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char currentMove = 'X';
        initBoard();
        displayBoard();
        while (!isEnd()) {
            System.out.print("'" + currentMove + "', choose your location (row, column): ");
            String[] inputs = keyboard.nextLine().trim().split(" ");
            int inputX = Integer.parseInt(inputs[0]);
            int inputY = Integer.parseInt(inputs[1]);
            if (board[inputX][inputY] == ' ') {
                addMove(currentMove, inputX, inputY);
                if (currentMove == 'X') {
                    currentMove = 'O';
                } else {
                    currentMove = 'X';
                }
                displayBoard();
            } else {
                System.out.println("Location taken. Try again.");
            }
        }
        getResult();
    }

    public static void addMove(char player, int row, int col) {
        board[row][col] = player;
    }

    public static boolean isEnd() {
        int countEmpty = 0;
        for (char[] row : board) {
            for (char cell : row) {
                if (cell == ' ') {
                    countEmpty++;
                }
            }
        }

        if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') return true;
        else if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') return true;
        else if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') return true;
        else if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') return true;
        else if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') return true;
        else if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') return true;
        else if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') return true;
        else if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') return true;
        else if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') return true;
        else if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') return true;
        else if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') return true;
        else if (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') return true;
        else if (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') return true;
        else if (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') return true;
        else if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') return true;
        else if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') return true;
        else return countEmpty == 0;
    }

    public static void getResult() {

        if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') System.out.println("X wins.");
        else if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') System.out.println("X wins.");
        else if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') System.out.println("X wins.");
        else if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') System.out.println("X wins.");
        else if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') System.out.println("X wins.");
        else if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') System.out.println("X wins.");
        else if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') System.out.println("X wins");
        else if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') System.out.println("X wins");
        else if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') System.out.println("O wins.");
        else if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') System.out.println("O wins.");
        else if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') System.out.println("O wins.");
        else if (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') System.out.println("O wins.");
        else if (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') System.out.println("O wins.");
        else if (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') System.out.println("O wins.");
        else if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') System.out.println("O wins");
        else if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') System.out.println("O wins");
        else System.out.println("The game is a tie.");

    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                board[r][c] = ' ';
            }
        }
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }
}