import org.junit.Test;

import static org.junit.Assert.*;

public class QueenTest {

    @Test
    public void queenMovesVertically(){
        Board testBoard = new Board();
        Piece queen = new Queen("Queen", ChessColor.WHITE, ChessSymbols.WHITE_QUEEN);
        int startRow = 5;
        int startCol = 5;
        int endRow = 3;
        int endCol  =   5;
        testBoard.setPiece(queen,startRow, startCol);
        Turn turn = new Turn(startRow,startCol,endRow,endCol,queen.color);
        assertTrue(queen.validMove(turn,testBoard));
    }
@Test
    public void queenCantDoWhateverItWants(){Board testBoard = new Board();
    Piece queen = new Queen("Queen", ChessColor.WHITE, ChessSymbols.WHITE_QUEEN);
    int startRow = 5;
    int startCol = 5;
    int endRow = 0 ;
    int endCol  =  1;
    testBoard.setPiece(queen,startRow, startCol);
    Turn turn = new Turn(startRow,startCol,endRow,endCol,queen.color);
    assertFalse(queen.validMove(turn,testBoard));

}

    @Test
    public void queenMovesHorizontally(){
        Board testBoard = new Board();
        Piece queen = new Queen("Queen", ChessColor.WHITE, ChessSymbols.WHITE_QUEEN);
        int startRow = 5;
        int startCol = 5;
        int endRow = 5;
        int endCol  = 3;
        testBoard.setPiece(queen,startRow, startCol);
        Turn turn = new Turn(startRow,startCol,endRow,endCol,queen.color);
        assertTrue(queen.validMove(turn,testBoard));
    }

    @Test
    public void queenMovesDiagonallyUp(){
        Board testBoard = new Board();
        Piece queen = new Queen("Queen", ChessColor.WHITE, ChessSymbols.WHITE_QUEEN);
        int startRow = 5;
        int startCol = 5;
        int endRow = 3;
        int endCol  = 3;
        testBoard.setPiece(queen,startRow, startCol);
        Turn turn = new Turn(startRow,startCol,endRow,endCol,queen.color);
        assertTrue(queen.validMove(turn,testBoard));

    }
    @Test
    public void queenMovesDiagonallyDown(){
        Board testBoard = new Board();
        Piece queen = new Queen("Queen", ChessColor.WHITE, ChessSymbols.WHITE_QUEEN);
        int startRow = 5;
        int startCol = 5;
        int endRow = 6;
        int endCol  = 6;
        testBoard.setPiece(queen,startRow, startCol);
        Turn turn = new Turn(startRow,startCol,endRow,endCol,queen.color);
        assertTrue(queen.validMove(turn,testBoard));

    }
    @Test
    public void queenDoesntMoveOverPieces(){Board testBoard = new Board();
        Piece queen = new Queen("Queen", ChessColor.WHITE, ChessSymbols.WHITE_QUEEN);
        Piece pawn = new Pawn("Pawn", ChessColor.WHITE, ChessSymbols.WHITE_PAWN);
        int startRowQueen = 5;
        int startColQueen = 5;
        int startRowPawn=4;
        int startColPawn=4;
        int endRow=3;
        int endCol=3;
        testBoard.setPiece(queen,startRowQueen, startColQueen);
        testBoard.setPiece(pawn, startRowPawn, startColPawn);
        Turn turn = new Turn(startRowQueen,startColQueen,endRow,endCol,queen.color);
        assertFalse(queen.validMove(turn,testBoard));}
    @Test
    public void queenDoesntCaptureOwnPieces(){Board testBoard = new Board();
        Piece queen = new Queen("Queen", ChessColor.WHITE, ChessSymbols.WHITE_QUEEN);
        Piece pawn = new Pawn("Pawn", ChessColor.WHITE, ChessSymbols.WHITE_PAWN);
        int startRowQueen = 5;
        int startColQueen = 5;
        int startRowPawn=3;
        int startColPawn=3;
        int endRow=3;
        int endCol=3;
        testBoard.setPiece(queen,startRowQueen, startColQueen);
        testBoard.setPiece(pawn, startRowPawn, startColPawn);
        Turn turn = new Turn(startRowQueen,startColQueen,endRow,endCol,queen.color);
        assertFalse(queen.validMove(turn,testBoard));}
}
