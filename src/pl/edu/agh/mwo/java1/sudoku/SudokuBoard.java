package pl.edu.agh.mwo.java1.sudoku;

public class SudokuBoard {

    private final int[][] board;

    public SudokuBoard(int[][] board) {
        this.board = board;
    }

    public int[][] getBoard() {
        return board;
    }
}
