
public class Knight extends Piece {
    public Knight(String rank, ChessColor color, ChessSymbols symbols) {
        super(rank, color, symbols);
    }

    @Override
    public boolean validMove(Turn currentTurn, Board board) {
        Piece targetPos =board.board[currentTurn.endRow][currentTurn.endCol];
        Piece currentPos = board.board[currentTurn.startRow][currentTurn.startCol];
       if (targetPos!=null){
           if (targetPos.color== currentPos.color){
               return false;
           }
       }
        boolean absolutePosition = Math.abs(currentTurn.startCol - currentTurn.endCol) == 2 && Math.abs(currentTurn.startRow - currentTurn.endRow) == 1;
        boolean absolutePosition2 = Math.abs(currentTurn.startCol - currentTurn.endCol) == 1 && Math.abs(currentTurn.startRow - currentTurn.endRow) == 2;
        if (absolutePosition || absolutePosition2) {
            return true;
        }
        return false;
    }
}