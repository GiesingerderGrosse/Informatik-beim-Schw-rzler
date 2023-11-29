package at.sma.e.g.basics;

import java.util.Random;
import java.util.Scanner;
public class ControlStructurs4 {
    public static void main(String[] args) {

                char[][] board = {
                        {' ', ' ', ' '},
                        {' ', ' ', ' '},
                        {' ', ' ', ' '}
                };

                char currentPlayer = 'X';
                boolean gameWon = false;

                while (!gameWon) {
                    printBoard(board);
                    makeMove(board, currentPlayer);

                    if (checkWin(board, currentPlayer)) {
                        printBoard(board);
                        System.out.println("Spieler " + currentPlayer + " hat gewonnen!");
                        gameWon = true;
                    } else if (isBoardFull(board)) {
                        printBoard(board);
                        System.out.println("Das Spiel endet unentschieden!");
                        gameWon = true;
                    } else {
                        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                    }
                }
            }

            private static void printBoard(char[][] board) {
                System.out.println("-------------");
                for (int i = 0; i < 3; i++) {
                    System.out.print("| ");
                    for (int j = 0; j < 3; j++) {
                        System.out.print(board[i][j] + " | ");
                    }
                    System.out.println();
                    System.out.println("-------------");
                }
            }

            private static void makeMove(char[][] board, char currentPlayer) {
                Scanner scanner = new Scanner(System.in);
                int row, col;

                do {
                    System.out.println("Spieler " + currentPlayer + ", gib die Zeile (0-2) und Spalte (0-2) ein (z.B. 1 2): ");
                    row = scanner.nextInt();
                    col = scanner.nextInt();
                } while (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != ' ');

                board[row][col] = currentPlayer;
            }

            private static boolean checkWin(char[][] board, char currentPlayer) {
                // Überprüfe Zeilen und Spalten
                for (int i = 0; i < 3; i++) {
                    if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
                            (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
                        return true;
                    }
                }

                // Überprüfe Diagonalen
                if ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
                        (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)) {
                    return true;
                }

                return false;
            }

            private static boolean isBoardFull(char[][] board) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (board[i][j] == ' ') {
                            return false;
                        }
                    }
                }
                return true;
            }
        }


