public class Bishop extends Piece {
    public Bishop(String rank, ChessColor color, ChessSymbols symbols) {
        super(rank, color, symbols);
    }

    @Override
    public boolean validMove(Turn currentTurn, Board board) {
        Piece targetPos = board.board[currentTurn.endCol][currentTurn.endRow];
        Piece currentPos = board.board[currentTurn.startCol][currentTurn.startRow];


        //moves diagonal TODO: check if path is unobstructed
        if (!board.unobstructedPath(currentTurn)){
            return false;
        }
        return Math.abs(currentTurn.endCol - currentTurn.startCol) == Math.abs(currentTurn.endRow - currentTurn.startRow);
    }
}
