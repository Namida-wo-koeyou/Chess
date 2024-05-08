import org.junit.Test;

import static org.junit.Assert.*;
public class KnightTest {

    @Test
    public void knightJumpsOverPieces() {
        Board testBoard = new Board();
        Piece knight = new Knight("Knight",ChessColor.WHITE,ChessSymbols.WHITE_KNIGHT);
        Piece pawn = new Pawn("Pawn",ChessColor.WHITE,ChessSymbols.WHITE_PAWN);
        int startRowKnight = 5;
        int startColKnight = 5;
        int startRowPawn = 4;
        int startColPawn = 5;
        int endRow = 3;
        int endCol = 5;
        testBoard.setPiece(knight,startRowKnight,startColKnight);
        testBoard.setPiece(pawn,startRowPawn,startColPawn);
        Turn turn = new Turn(startRowKnight,startColKnight,endRow,endCol,knight.color);
        assertFalse(knight.validMove(turn,testBoard));


    }

    @Test
    public void knightValidMoves() {
        Board testBoard = new Board();
        Piece knight1 = new Knight("Knight",ChessColor.WHITE,ChessSymbols.WHITE_KNIGHT);
        int startRow1 = 4;
        int startCol1 = 4;
        int startRow2 =7;
        int startCol2 =7;
        int startRow3=0;
        int startCol3=0;
        testBoard.setPiece(knight1,startRow1,startCol1);
        Turn turn1 = new Turn(startRow1,startCol1,0,0,ChessColor.WHITE);
        Turn turn2 = new Turn(startRow2,startCol2,0,0,ChessColor.WHITE);
        Turn turn3 = new Turn(startRow3,startCol3,0,0,ChessColor.WHITE);





    }
    @Test
    public void knightTopCornerValidMoves() {}
    @Test
    public void knightBottomCornerValidMoves() {}



}
