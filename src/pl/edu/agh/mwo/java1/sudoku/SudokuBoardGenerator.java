package pl.edu.agh.mwo.java1.sudoku;

public class SudokuBoardGenerator {

    SudokuBoard generateEmptyBoard() {
        int[][] board = new int[9][9];
        return new SudokuBoard(board);
    }

    SudokuBoard generateCorrectBoard1() {
        int[][] board = {
                {2,0,0,6,0,7,5,0,0},
                {0,0,0,0,0,0,0,9,6},
                {6,0,7,0,0,1,3,0,0},
                {0,5,0,7,3,2,0,0,0},
                {0,7,0,0,0,0,0,2,0},
                {0,0,0,1,8,9,0,7,0},
                {0,0,3,5,0,0,6,0,4},
                {8,4,0,0,0,0,0,0,0},
                {0,0,5,2,0,6,0,0,8}
        };
        return new SudokuBoard(board);
    }

    SudokuBoard generateCorrectBoard2() {
        int[][] board = {
                {1,0,0,6,0,7,5,0,0},
                {0,0,0,0,0,0,0,9,6},
                {6,0,7,0,0,1,3,0,0},
                {0,5,0,7,3,2,0,0,0},
                {0,7,0,0,0,0,0,2,0},
                {0,0,0,1,8,9,0,7,0},
                {0,0,3,5,0,0,6,0,4},
                {8,4,0,0,0,0,0,0,0},
                {0,0,5,2,0,6,0,0,8}
        };
        return new SudokuBoard(board);
    }

    SudokuBoard generateIncorrectBoard1() {
        int[][] board = {
                {2,0,0,6,0,7,5,0,0},
                {0,7,0,0,0,0,0,9,6},
                {6,0,7,0,0,1,3,0,0},
                {0,5,0,7,3,2,0,5,0},
                {0,7,0,0,0,0,0,2,0},
                {0,0,0,1,8,9,0,7,0},
                {0,0,3,5,0,0,6,0,4},
                {8,4,0,0,0,0,0,4,0},
                {0,0,5,2,0,6,0,0,8}
        };
        return new SudokuBoard(board);
    }

    SudokuBoard generateIncorrectBoard2() {
        int[][] board = {
                {2,0,0,6,0,7,5,0,0},
                {0,8,0,0,0,0,0,9,6},
                {6,0,8,0,0,1,3,0,0},
                {0,5,0,8,3,2,0,5,0},
                {0,7,0,0,8,0,0,2,0},
                {0,0,0,1,8,9,0,7,0},
                {0,0,3,5,0,0,6,0,4},
                {8,4,0,0,0,0,0,4,0},
                {0,0,5,2,0,6,0,0,8}
        };
        return new SudokuBoard(board);
    }

    SudokuBoard generateIncorrectBoard3() {
        int[][] board = {
                {2,0,0,6,0,7,5,0,0},
                {0,6,0,0,0,0,0,9,6},
                {6,0,6,0,0,1,3,0,0},
                {0,5,0,6,3,2,0,5,0},
                {0,7,0,0,6,0,0,2,0},
                {0,0,0,1,8,9,0,7,0},
                {0,0,3,5,0,0,6,0,4},
                {8,4,0,0,0,0,0,4,0},
                {0,0,5,2,0,6,0,0,8}
        };
        return new SudokuBoard(board);
    }
}
