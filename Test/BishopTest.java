import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BishopTest {

  @Test
    public void BishopDoesntMoveOverPieces(){Board testBoard = new Board();
        Piece bishop = new Bishop("Bishop", ChessColor.WHITE, ChessSymbols.WHITE_BISHOP);
        Piece pawn = new Pawn("Pawn", ChessColor.WHITE, ChessSymbols.WHITE_PAWN);
        int startRowBishop = 5;
        int startColBishop = 5;
        int startRowPawn=4;
        int startColPawn=4;
        int endRow=3;
        int endCol=3;
        testBoard.setPiece(bishop,startRowBishop, startColBishop);
        testBoard.setPiece(pawn, startRowPawn, startColPawn);
        Turn turn = new Turn(startRowBishop,startColBishop,endRow,endCol,bishop.color);
        assertFalse(bishop.validMove(turn,testBoard));}
    @Test
    public void BishopMovesDiagonally(){Board testBoard = new Board();
        Piece bishop = new Bishop("Bishop", ChessColor.WHITE, ChessSymbols.WHITE_BISHOP);

        int startRowBishop = 5;
        int startColBishop = 5;

        int endRow=3;
        int endCol=3;
        testBoard.setPiece(bishop,startRowBishop, startColBishop);

        Turn turn = new Turn(startRowBishop,startColBishop,endRow,endCol,bishop.color);
      assertTrue(bishop.validMove(turn,testBoard));
  } @Test
  public void BishopDoesntMoveVertically(){Board testBoard = new Board();
        Piece bishop = new Bishop("Bishop", ChessColor.WHITE, ChessSymbols.WHITE_BISHOP);

        int startRowBishop = 5;
        int startColBishop = 5;

        int endRow=3;
        int endCol=5;
        testBoard.setPiece(bishop,startRowBishop, startColBishop);

        Turn turn = new Turn(startRowBishop,startColBishop,endRow,endCol,bishop.color);
        assertFalse(bishop.validMove(turn,testBoard));} @Test
    public void BishopDoesntMoveHorizontally(){Board testBoard = new Board();
        Piece bishop = new Bishop("Bishop", ChessColor.WHITE, ChessSymbols.WHITE_BISHOP);

        int startRowBishop = 5;
        int startColBishop = 5;

        int endRow=5;
        int endCol=3;
        testBoard.setPiece(bishop,startRowBishop, startColBishop);

        Turn turn = new Turn(startRowBishop,startColBishop,endRow,endCol,bishop.color);
        assertFalse(bishop.validMove(turn,testBoard));}
}


