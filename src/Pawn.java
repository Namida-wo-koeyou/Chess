public class Pawn extends Piece{
    public Pawn(String rank, ChessColor color, ChessSymbols symbol) {
        super(rank, color, symbol);
    }

    @Override
    public boolean validMove(Turn currentTurn, Board board) {
        // if the move is going diagonally and there is a piece at the [endRow][endCol]
        // and that piece is of the opposite ChessColor
        //then it can take and return true
        // else it checks that the [endCol] is equal to [startCol] and if it isn't it returns false
        // this will apply regardless of the starting piece's color
        Piece targetPos =board.board[currentTurn.endRow][currentTurn.endCol];
        Piece currentPos = board.board[currentTurn.startRow][currentTurn.startCol];


        // Capture logic
        if (Math.abs(currentTurn.startCol-currentTurn.endCol) == Math.abs(currentTurn.startRow-currentTurn.endRow) &&
                Math.abs(currentTurn.startCol-currentTurn.endCol) == 1 && targetPos != null) {
            if ((targetPos.color != currentPos.color)) {
                if (targetPos == board.board[currentTurn.startRow + 1][currentTurn.startCol + 1] ||
                        targetPos == board.board[currentTurn.startRow - 1][currentTurn.startCol - 1])
                    return true;
            } // theoretical en passant
            // else if (currentPos.color == ChessColor.WHITE && currentTurn.endCol != currentTurn.startCol){
            // if(Board.board[currentTurn.endRow-1][currentTurn.endCol].ChessColor != currentPos.color){
            //Board.board[currentTurn.endRow-1][currentTurn.endCol] = null
            // return true
            // } else if (currentPos.color == ChessColor.BLACK && currentTurn.endCol != currentTurn.startCol){
            //  if(Board.board[currentTurn.endRow+1][currentTurn.endCol].ChessColor != currentPos.color){
            // Board.board[currentTurn.endRow+1][currentTurn.endCol] = null
            //  return true}}}
            //  else return false


        }
if (currentTurn.endCol!= currentTurn.startCol){return false;}


        if (targetPos!=null) {
            return false;
        }
        if (ChessSymbols.BLACK_PAWN == currentPos.symbol
                    && currentTurn.startRow==1) {
                return currentTurn.endRow == currentTurn.startRow + 2 || currentTurn.endRow == currentTurn.startRow + 1;


            }else if (ChessSymbols.BLACK_PAWN == currentPos.symbol
                && currentTurn.startRow>1){
        return currentTurn.endRow == currentTurn.startRow + 1;}

        if (ChessSymbols.WHITE_PAWN == currentPos.symbol
                && currentTurn.startRow==6) {
            return currentTurn.endRow == currentTurn.startRow - 2 || currentTurn.endRow == currentTurn.startRow - 1;
        } else if ((ChessSymbols.WHITE_PAWN ==currentPos.symbol
                && currentTurn.startRow<6)){
            return currentTurn.endRow == currentTurn.startRow - 1;
    }
        return false;
    }
}

