    import org.junit.Test;

    import static org.junit.Assert.*;


public class BoardTest {

    @Test
    public void showsBoard(){
        Board testBoard = new Board();
        testBoard.newBoard();
        String expected =  ("  A B C D E F G H \n" +
                "1 ♜ ♞ ♝ ♚ ♛ ♝ ♞ ♜ \n" +
                "2 ♟ ♟ ♟ ♟ ♟ ♟ ♟ ♟ \n" +
                "3 - - - - - - - - \n" +
                "4 - - - - - - - - \n" +
                "5 - - - - - - - - \n" +
                "6 - - - - - - - - \n" +
                "7 ♙ ♙ ♙ ♙ ♙ ♙ ♙ ♙ \n" +
                "8 ♖ ♘ ♗ ♕ ♔ ♗ ♘ ♖ \n");
        assertEquals(expected, testBoard.toString());
    }

    @Test
    public void obstructedDiagonalPath(){
        Board testBoard = new Board();
        testBoard.newBoard();

        assertFalse(testBoard.unobstructedPathInDiagonalExist(new Turn(0,7,2,5,ChessColor.BLACK)));
    }

    @Test
    public void obstructedPathHorizontally() {
        Board testBoard = new Board();
        testBoard.newBoard();
        assertFalse(testBoard.unobstructedPathInRowExists(new Turn(0,7,0,5,ChessColor.BLACK)));
    }
    @Test
    public void obstructedPathVerticallyDown(){Board testBoard =new Board();
    testBoard.newBoard();

    assertFalse(testBoard.unobstructedPathInColumnExists(new Turn(0,7,2,7,ChessColor.BLACK)));}
    @Test
    public void obstructedPathVerticallyUp(){Board testBoard =new Board();
        testBoard.newBoard();

        assertFalse(testBoard.unobstructedPathInColumnExists(new Turn(7,7,5,7,ChessColor.BLACK)));}
}
