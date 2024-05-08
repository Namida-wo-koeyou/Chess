/*Bugs: Rooks can phase through other pieces.  */

public class Rook extends Piece{
    public Rook(String rank, ChessColor color, ChessSymbols symbols) {
        super(rank, color, symbols);
    }

    @Override
    public boolean validMove(Turn currentTurn, Board board) {
        Piece targetPos = board.board[currentTurn.endCol][currentTurn.endRow];
      // can't refuse to move when chosen, probably should be a general thing
        if (!board.unobstructedPath(currentTurn)){
            return false;
        }


        if (currentTurn.endRow == currentTurn.startRow && currentTurn.endCol == currentTurn.startCol) {
            return false;}
            // can't move diagonally
        else  if (currentTurn.endCol != currentTurn.startCol && currentTurn.endRow != currentTurn.startRow) {
            return false;
            // can't move into same color
        } if ( targetPos != null && targetPos.color ==currentTurn.color ) {
            return false;
        }



//else it should return true
        return true;
    }
}
