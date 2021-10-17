package pl.edu.agh.mwo.java1.sudoku;

public class SudokuBoardChecker {

    SudokuBoard board;

    public SudokuBoardChecker(SudokuBoard board) {
        this.board = board;

    }

    public boolean verifyBoardStructure() {
        int[][] board = this.board.getBoard();
        for (int i = 0; i < 9; i++) { // przechodzi po wierszach
            for (int j = 0; j < 9; j++) {// przechodzi po kolumnach w wierszu
                if (!(board[i][j] >= 0 && board[i][j] <= 9)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean verifyBoardContent(){
        return verifyBoardCols() && verifyBoardRows() && verifyBoardSquares();
    }

    public boolean verifyBoardRows() {
        int[][] board = this.board.getBoard();
        for(int i = 0; i < 9; i++) {
            // sprawdza czy nie ma duplikatow:
            int[] count = new int[10];
            // [i][j] - i - wiersze, j - kolumny
            for(int j = 0; j < 9; j++) {
                count[board[i][j]]++; // zlicza wystapienia
            }
            // jesli gdziekolwiek jest > 1 to mamy blad
            for (int j = 1; j < 10; j++) { // j = 1 bo liczymy tylko wartosci od 1 do 9
                if (count[j] > 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean verifyBoardCols() {
        int[][] board = this.board.getBoard();
        for(int i = 0; i < 9; i++) {
            int[] count = new int[10];
            for(int j = 0; j < 9; j++) {
                count[board[j][i]]++;
            }
            for (int j = 1; j < 10; j++) {
                if (count[j] > 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean verifyBoardSquares() {
        int row, col;
        row = col = 0;
        int[][] board = this.board.getBoard();
        while(row != 6 && col != 6) {
            int[] count = new int[10];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    count[board[row+i][col+j]]++;
                }
            }
            for(int i = 1; i < 10; i++) {
                if (count[i] > 1) {
                    return false;
                }
            }

            col += 3;
            if (col == 9) {
                row += 3;
                col = 0;
            }
        }
        return true;
    }

    public boolean verifyBoard() {
        return verifyBoardStructure() && verifyBoardContent();
    }
}
