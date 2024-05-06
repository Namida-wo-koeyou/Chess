public class Queen extends Piece {
    public Queen(String rank, ChessColor color, ChessSymbols symbols) {
        super(rank, color, symbols);
    }

    @Override
    public boolean validMove(Turn currentTurn, Board board) {

        if (!board.unobstructedPathInRowExists(currentTurn)){
            return false;
        }
        if (!board.unobstructedPathInColumnExists(currentTurn)){
            return false;
        }
        if (!board.unobstructedPathInDiagonalExist(currentTurn)){
            return false;
        }
//diagonal
        if (Math.abs(currentTurn.endCol - currentTurn.startCol) == Math.abs(currentTurn.endRow-currentTurn.startRow )){
            return true;
        }

//horizontal
        if (currentTurn.endCol != currentTurn.startCol && currentTurn.endRow == currentTurn.startRow){
            return true;
        }
       //vertical
        return currentTurn.endCol == currentTurn.startCol && currentTurn.endRow != currentTurn.startRow;
    }
}
