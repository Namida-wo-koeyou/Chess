import org.junit.Test;

import static org.junit.Assert.*;
public class RookTest {
    @Test
    public void rookDoesntMoveDiagonally() {
        Board testBoard = new Board();
        Piece rook = new Rook("Rook", ChessColor.WHITE, ChessSymbols.BLACK_ROOK);
        int startRow = 5;
        int startCol = 5;
        int endRow = 2;
        int endCol =2 ;
        testBoard.setPiece(rook,startRow, startCol);
        Turn turn = new Turn(startRow,startCol,endRow,endCol,rook.color);
        assertFalse(rook.validMove(turn,testBoard));
    }
   @Test
    public void rookMovesVertically(){
       Board testBoard = new Board();
       Piece rook = new Rook("Rook", ChessColor.WHITE, ChessSymbols.BLACK_ROOK);
       int startRow = 5;
       int startCol = 5;
       int endRow = 2;
       int endCol = 5;
       testBoard.setPiece(rook,startRow, startCol);
       Turn turn = new Turn(startRow,startCol,endRow,endCol,rook.color);
       assertTrue(rook.validMove(turn,testBoard));}
@Test
   public void rookMovesHorizontally(){

    Board testBoard = new Board();
    Piece rook = new Rook("Rook", ChessColor.WHITE, ChessSymbols.WHITE_ROOK);
    int startRow = 5;
    int startCol = 5;
    int endRow = 5;
    int endCol = 2;
    testBoard.setPiece(rook,startRow, startCol);
    Turn turn = new Turn(startRow,startCol,endRow,endCol,rook.color);
    assertTrue(rook.validMove(turn,testBoard));
    }
@Test
    public void rookDoesntJumpOverPieces(){
    Board testBoard = new Board();
    Piece rook = new Rook("Rook", ChessColor.WHITE, ChessSymbols.WHITE_ROOK);
    Piece pawn = new Pawn("Pawn", ChessColor.WHITE, ChessSymbols.WHITE_PAWN);
    int startRow =5;
    int startCol = 5;
    int endRow = 2;
    int endCol = 5;
    testBoard.setPiece(rook,startRow, startCol);
    testBoard.setPiece(pawn,4, 5);
    Turn turn = new Turn(startRow, startCol, endRow, endCol,rook.color);
    assertFalse(rook.validMove(turn,testBoard));
    }
    @Test
    public void rookCapturesEnemyPieces(){
        Board testBoard = new Board();
        Piece rook = new Rook("Rook", ChessColor.WHITE, ChessSymbols.WHITE_ROOK);
        Piece pawn = new Pawn("Pawn", ChessColor.BLACK, ChessSymbols.BLACK_PAWN);
        int startRow =5;
        int startCol = 5;
        int endRow = 4;
        int endCol = 5;
        testBoard.setPiece(rook,startRow, startCol);
        testBoard.setPiece(pawn,4, 5);
        Turn turn = new Turn(startRow, startCol, endRow, endCol,rook.color);
        assertTrue(rook.validMove(turn,testBoard));
    }
}