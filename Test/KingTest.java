import org.junit.Test;

import static org.junit.Assert.*;

public class KingTest {

    @Test
    public void kingCantMoveMoreThanOneSpace() {
        Board testBoard = new Board();
        Piece king = new King("King", ChessColor.WHITE, ChessSymbols.WHITE_KING);
        int startRow = 5;
        int startCol = 5;
        int endRow = 7;
        int endCol = 5;
        testBoard.setPiece(king,startRow,startCol);
        Turn turn = new Turn(startRow,startCol,endRow,endCol,king.color);
        assertFalse(king.validMove(turn,testBoard));
    }


}
