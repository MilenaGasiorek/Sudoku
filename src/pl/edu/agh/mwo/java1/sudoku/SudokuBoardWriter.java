package pl.edu.agh.mwo.java1.sudoku;

import java.util.Arrays;
import java.util.List;

public class SudokuBoardWriter {

    void writeBoard(SudokuBoard board) {
        List<int[]> boardList = Arrays.asList(board.getBoard());

        System.out.println(Arrays.deepToString(
                board.getBoard())
                    .replace("], ", "]\n")
                    .replace("[[", "[")
                    .replace("]]","]"));
    }

}
