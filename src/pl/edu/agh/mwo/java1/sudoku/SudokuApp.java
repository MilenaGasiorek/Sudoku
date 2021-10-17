package pl.edu.agh.mwo.java1.sudoku;

public class SudokuApp {

    public static void main(String[] args) {
        SudokuBoardWriter sbw = new SudokuBoardWriter();
        SudokuBoardGenerator sbg = new SudokuBoardGenerator();

        SudokuBoard sb = sbg.generateCorrectBoard1();
        sbw.writeBoard(sb);
        SudokuBoardChecker sbc = new SudokuBoardChecker(sb);
        System.out.println(sbc.verifyBoard());

        System.out.println();
        sb = sbg.generateCorrectBoard2();
        sbw.writeBoard(sb);
        sbc = new SudokuBoardChecker(sb);
        System.out.println(sbc.verifyBoard());

        System.out.println();
        sb = sbg.generateIncorrectBoard1();
        sbw.writeBoard(sb);
        sbc = new SudokuBoardChecker(sb);
        System.out.println(sbc.verifyBoard());

        System.out.println();
        sb = sbg.generateIncorrectBoard2();
        sbw.writeBoard(sb);
        sbc = new SudokuBoardChecker(sb);
        System.out.println(sbc.verifyBoard());

        System.out.println();
        sb = sbg.generateIncorrectBoard3();
        sbw.writeBoard(sb);
        sbc = new SudokuBoardChecker(sb);
        System.out.println(sbc.verifyBoard());

    }
}
