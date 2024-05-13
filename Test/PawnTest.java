import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PawnTest {
@Test
public void PawnCantMoveBackwards() {
        Board testBoard = new Board();
        Piece pawn = new Pawn("Pawn", ChessColor.WHITE, ChessSymbols.WHITE_PAWN);
        int startRow = 5;
        int startCol = 5;
        int endRow = 7;
        int endCol = 5;
        testBoard.setPiece(pawn,startRow,startCol);
        Turn turn = new Turn(startRow,startCol,endRow,endCol,pawn.color);
        assertFalse(pawn.validMove(turn,testBoard));
    }
    @Test
    public void pawnCantMoveTwoSpacesAfterFirstTurn() {
    // validMove checks if black pawns start at 1 and if white pawns start at 6, only in those cases can it move 2 spaces
        Board testBoard = new Board();
        Piece pawn = new Pawn("Pawn", ChessColor.WHITE, ChessSymbols.WHITE_PAWN);
        int startRow = 5;
        int startCol = 5;
        int endRow = 3;
        int endCol = 5;
        testBoard.setPiece(pawn,startRow,startCol);
        Turn turn = new Turn(startRow,startCol,endRow,endCol,pawn.color);
        assertFalse(pawn.validMove(turn,testBoard));
    }
    @Test
    public void whitePawnCanMoveTwoSpacesDuringFirstTurn() {

        Board testBoard = new Board();
        Piece pawn = new Pawn("Pawn", ChessColor.WHITE, ChessSymbols.WHITE_PAWN);
        int startRow = 6;
        int startCol = 6;
        int endRow = 4;
        int endCol = 6;
        testBoard.setPiece(pawn,startRow,startCol);
        Turn turn = new Turn(startRow,startCol,endRow,endCol,pawn.color);
        assertTrue(pawn.validMove(turn,testBoard));}
    @Test
    public void whitePawnCanMoveOneSpaceForward() {

        Board testBoard = new Board();
        Piece pawn = new Pawn("Pawn", ChessColor.WHITE, ChessSymbols.WHITE_PAWN);
        int startRow = 6;
        int startCol = 6;
        int endRow = 5;
        int endCol = 6;
        testBoard.setPiece(pawn,startRow,startCol);
        Turn turn = new Turn(startRow,startCol,endRow,endCol,pawn.color);
        assertTrue(pawn.validMove(turn,testBoard));}
    @Test
    public void blackPawnCanMoveTwoSpacesDuringFirstTurn() {

        Board testBoard = new Board();
        Piece pawn = new Pawn("Pawn", ChessColor.BLACK, ChessSymbols.BLACK_PAWN);
        int startRow = 1;
        int startCol = 1;
        int endRow = 3;
        int endCol = 1;
        testBoard.setPiece(pawn,startRow,startCol);
        Turn turn = new Turn(startRow,startCol,endRow,endCol,pawn.color);
        assertTrue(pawn.validMove(turn,testBoard));}
    @Test
    public void backPawnCanMoveOneSpaceForward() {

        Board testBoard = new Board();
        Piece pawn = new Pawn("Pawn", ChessColor.BLACK, ChessSymbols.BLACK_PAWN);
        int startRow = 1;
        int startCol = 1;
        int endRow = 2;
        int endCol = 1;
        testBoard.setPiece(pawn,startRow,startCol);
        Turn turn = new Turn(startRow,startCol,endRow,endCol,pawn.color);
        assertTrue(pawn.validMove(turn,testBoard));}
    @Test
    public void PawnCantCaptureSameColor() {

        Board testBoard = new Board();
        Piece pawn = new Pawn("Pawn", ChessColor.WHITE, ChessSymbols.WHITE_PAWN);
        Piece friendlyPawn = new Pawn("Pawn", ChessColor.WHITE, ChessSymbols.WHITE_PAWN);
        int startRow = 6;
        int startCol = 6;
        int endRow = 4;
        int endCol = 6;
        testBoard.setPiece(pawn,startRow,startCol);
        testBoard.setPiece(friendlyPawn,endRow,endCol);
        Turn turn = new Turn(startRow,startCol,endRow,endCol,pawn.color);
        assertFalse(pawn.validMove(turn,testBoard));

} @Test
    public void PawnCanDiagonalCapture() {

        Board testBoard = new Board();
        Piece pawn = new Pawn("Pawn", ChessColor.BLACK, ChessSymbols.BLACK_PAWN);
        Piece enemyPawn = new Pawn("Pawn", ChessColor.WHITE, ChessSymbols.BLACK_PAWN);

        int startRow = 1;
        int startCol = 1;
        int endRow = 2;
        int endCol = 2;
        testBoard.setPiece(pawn,startRow,startCol);
        testBoard.setPiece(enemyPawn, 2,2);
        Turn turn = new Turn(startRow,startCol,endRow,endCol,pawn.color);
        assertTrue(pawn.validMove(turn,testBoard));}
}
