package com.grow_my_java.differrent_test.connect.TicTakToe;


public class TicTacToe {

    final char SIGN_X = 'X';
    final char SIGN_O = 'O';
    final char SIGN_EMPTY = '.';
    char[][] table;

    public TicTacToe() {
        // конструктор: инициализация полей
        table = new char[3][3];
        initTable();
    }

    public String checkFinish() {
        // игровая логика
        if (checkWin(SIGN_X) || checkWin(SIGN_O)) {
            return "YOU WIN!\n";
        }
        if (isTableFull()) {
            return "Sorry, table is full!\n";
        }
        return "Next move please!\n";
    }

    private void initTable() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                table[row][col] = SIGN_EMPTY;
            }
        }
    }

    public String printTable() {
        String response = "";
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++)
                response += (table[row][col] + " ");
            response += "\n";
        }
        return response;
    }

    public String makeAMove(int x, int y, char symb) {
        if (!isCellValid(x - 1, y - 1)) {
            if (symb == SIGN_O | symb == SIGN_X) {
                table[x][y] = symb;
            }
        }
        return checkFinish() + printTable();
    }

    private boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= 3 || y >= 3)
            return false;
        return table[y][x] == SIGN_EMPTY;
    }

    private boolean checkWin(char dot) {
        for (int i = 0; i < 3; i++) {
            if ((table[i][0] == dot && table[i][1] == dot && table[i][2] == dot) ||
                    (table[0][i] == dot && table[1][i] == dot && table[2][i] == dot)) {
                return true;
            }
            if ((table[0][0] == dot && table[1][1] == dot && table[2][2] == dot) ||
                    (table[2][0] == dot && table[1][1] == dot && table[0][2] == dot)) {
                return true;
            }
        }
        return false;
    }

    private boolean isTableFull() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (table[row][col] == SIGN_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}
