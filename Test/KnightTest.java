import org.junit.Test;

import static org.junit.Assert.*;
public class KnightTest {

    @Test
    public void knightJumpsOverPieces() {
        Board testBoard = new Board();
        Piece knight = new Knight("Knight",ChessColor.WHITE,ChessSymbols.WHITE_KNIGHT);
        Piece pawn = new Pawn("Pawn",ChessColor.WHITE,ChessSymbols.WHITE_PAWN);
        int startRow= 5;
        int startCol = 5;
        int endRow = 3;
        int endCol = 5;
        testBoard.setPiece(knight,startRow,startCol);
        testBoard.setPiece(pawn,4,5);
        Turn turn = new Turn(startRow,startCol,endRow,endCol,knight.color);
        assertFalse(knight.validMove(turn,testBoard));
    }

    @Test
    public void knightValidMoves() {
        Board testBoard = new Board();
        Piece knight = new Knight("Knight",ChessColor.WHITE,ChessSymbols.WHITE_KNIGHT);
        int startRow = 4;
        int startCol = 4;
        testBoard.setPiece(knight,startRow,startCol);
        Turn turn1 = new Turn(startRow,startCol,3,2,ChessColor.WHITE);
        Turn turn2 = new Turn(startRow,startCol,5,2,ChessColor.WHITE);
        Turn turn3 = new Turn(startRow,startCol,2,3,ChessColor.WHITE);
        Turn turn4 = new Turn(startRow,startCol,6,3,ChessColor.WHITE);
        Turn turn5 = new Turn(startRow,startCol,2,5,ChessColor.WHITE);
        Turn turn6 = new Turn(startRow,startCol,6,5,ChessColor.WHITE);
        Turn turn7 = new Turn(startRow,startCol,3,6,ChessColor.WHITE);
        Turn turn8 = new Turn(startRow,startCol,5,6,ChessColor.WHITE);
        assertTrue(knight.validMove(turn1,testBoard));
        assertTrue(knight.validMove(turn2,testBoard));
        assertTrue(knight.validMove(turn3,testBoard));
        assertTrue(knight.validMove(turn4,testBoard));
        assertTrue(knight.validMove(turn5,testBoard));
        assertTrue(knight.validMove(turn6,testBoard));
        assertTrue(knight.validMove(turn7,testBoard));
        assertTrue(knight.validMove(turn8,testBoard));
    }

    @Test
      public void knightCanCaptureOppositeColor() {
        Board testBoard = new Board();
        Piece knight = new Knight("Knight", ChessColor.WHITE, ChessSymbols.WHITE_KNIGHT);
        Piece pawn = new Pawn("Pawn", ChessColor.BLACK, ChessSymbols.BLACK_PAWN);
        int startRow = 4;
        int startCol = 4;
        int endRow = 2;
        int endCol = 3;
        testBoard.setPiece(knight,startRow,startCol);
        testBoard.setPiece(pawn,endRow,endCol);
        Turn turn = new Turn(startRow, startCol, endRow,endCol, ChessColor.WHITE);
        assertTrue(knight.validMove(turn,testBoard));
    }

    @Test
    public void knightCantCaptureSameColor() {
        Board testBoard = new Board();
        Piece knight = new Knight("Knight", ChessColor.WHITE, ChessSymbols.WHITE_KNIGHT);
        Piece pawn = new Pawn("Pawn", ChessColor.WHITE, ChessSymbols.WHITE_PAWN);
        int startRow = 4;
        int startCol = 4;
        int endRow = 2;
        int endCol = 3;
        testBoard.setPiece(knight,startRow,startCol);
        testBoard.setPiece(pawn,2,3);
        Turn turn = new Turn(startRow, startCol, endRow,endCol, ChessColor.WHITE);
        assertFalse(knight.validMove(turn,testBoard));

    }
}
