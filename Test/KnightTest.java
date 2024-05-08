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
        Piece knight = new Knight("Knight",ChessColor.WHITE,ChessSymbols.WHITE_KNIGHT);
        int startRow = 4;
        int startCol = 4;
        testBoard.setPiece(knight,startRow,startCol);
        Turn turn = new Turn(startRow,startCol,,,ChessColor.WHITE);






    }
    @Test
    public void knightTopCornerValidMoves() {}
    @Test
    public void knightBottomCornerValidMoves() {}



}
