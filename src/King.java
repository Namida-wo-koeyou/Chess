public class King extends Piece{
    public King(String rank, ChessColor color, ChessSymbols symbols) {
        super(rank, color, symbols);
    }

    @Override
    public boolean validMove(Turn currentTurn, Board board) {
        // moves one space at a time
        if (currentTurn.endCol > currentTurn.startCol+1 && currentTurn.endRow > currentTurn.startRow+1 ) return false;
        // cannot move into check




    return false; }
}
