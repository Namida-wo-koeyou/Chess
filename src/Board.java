public class Board {
    public Piece[][] board = new Piece[8][8];


    public void newBoard() {
        board[0][0] = new Rook("RookR", ChessColor.BLACK, ChessSymbols.BLACK_ROOK);
        board[0][1] = new Knight("KnightR", ChessColor.BLACK, ChessSymbols.BLACK_KNIGHT);
        board[0][2] = new Bishop("BishopR", ChessColor.BLACK, ChessSymbols.BLACK_BISHOP);
        board[0][3] = new King("King", ChessColor.BLACK, ChessSymbols.BLACK_KING);
        board[0][4] = new Queen("Queen", ChessColor.BLACK, ChessSymbols.BLACK_QUEEN);
        board[0][5] = new Bishop("BishopL", ChessColor.BLACK, ChessSymbols.BLACK_BISHOP);
        board[0][6] = new Knight("KnightL", ChessColor.BLACK, ChessSymbols.BLACK_KNIGHT);
        board[0][7] = new Rook("RookL", ChessColor.BLACK, ChessSymbols.BLACK_ROOK);

        board[1][0] = new Pawn("PawnB", ChessColor.BLACK, ChessSymbols.BLACK_PAWN);
        board[1][1] = new Pawn("PawnB", ChessColor.BLACK, ChessSymbols.BLACK_PAWN);
        board[1][2] = new Pawn("PawnB", ChessColor.BLACK, ChessSymbols.BLACK_PAWN);
        board[1][3] = new Pawn("PawnB", ChessColor.BLACK, ChessSymbols.BLACK_PAWN);
        board[1][4] = new Pawn("PawnB", ChessColor.BLACK, ChessSymbols.BLACK_PAWN);
        board[1][5] = new Pawn("PawnB", ChessColor.BLACK, ChessSymbols.BLACK_PAWN);
        board[1][6] = new Pawn("PawnB", ChessColor.BLACK, ChessSymbols.BLACK_PAWN);
        board[1][7] = new Pawn("PawnB", ChessColor.BLACK, ChessSymbols.BLACK_PAWN);

        board[7][0] = new Rook("RookL", ChessColor.WHITE, ChessSymbols.WHITE_ROOK);
        board[7][1] = new Knight("KnightL", ChessColor.WHITE, ChessSymbols.WHITE_KNIGHT);
        board[7][2] = new Bishop("BishopL", ChessColor.WHITE, ChessSymbols.WHITE_BISHOP);
        board[7][3] = new Queen("Queen", ChessColor.WHITE, ChessSymbols.WHITE_QUEEN);
        board[7][4] = new King("King", ChessColor.WHITE, ChessSymbols.WHITE_KING);
        board[7][5] = new Bishop("BishopR", ChessColor.WHITE, ChessSymbols.WHITE_BISHOP);
        board[7][6] = new Knight("KnightR", ChessColor.WHITE, ChessSymbols.WHITE_KNIGHT);
        board[7][7] = new Rook("RookR", ChessColor.WHITE, ChessSymbols.WHITE_ROOK);

        board[6][0] = new Pawn("PawnW", ChessColor.WHITE, ChessSymbols.WHITE_PAWN);
        board[6][1] = new Pawn("PawnW", ChessColor.WHITE, ChessSymbols.WHITE_PAWN);
        board[6][2] = new Pawn("PawnW", ChessColor.WHITE, ChessSymbols.WHITE_PAWN);
        board[6][3] = new Pawn("PawnW", ChessColor.WHITE, ChessSymbols.WHITE_PAWN);
        board[6][4] = new Pawn("PawnW", ChessColor.WHITE, ChessSymbols.WHITE_PAWN);
        board[6][5] = new Pawn("PawnW", ChessColor.WHITE, ChessSymbols.WHITE_PAWN);
        board[6][6] = new Pawn("PawnW", ChessColor.WHITE, ChessSymbols.WHITE_PAWN);
        board[6][7] = new Pawn("PawnW", ChessColor.WHITE, ChessSymbols.WHITE_PAWN);
    }
public boolean unobstructedPath(Turn currentTurn){
        if (currentTurn.endCol== currentTurn.startCol && currentTurn.startRow!= currentTurn.endRow){return  unobstructedPathInColumnExists(currentTurn);}
        else if (currentTurn.endCol!= currentTurn.startCol && currentTurn.startRow== currentTurn.endRow){return unobstructedPathInRowExists(currentTurn);}
        else if (Math.abs(currentTurn.endCol-currentTurn.startCol) == Math.abs(currentTurn.endRow-currentTurn.startRow))return unobstructedPathInDiagonalExist(currentTurn);{

        } return false;
}
    public boolean unobstructedPathInColumnExists(Turn currentTurn) {
        //if startRow - endRow >0 use negative for loop, else use positive for loop, i previously only made a positive for loop
        // this will be needed for diagonals too
        if (currentTurn.startRow - currentTurn.endRow > 0) {
            for (int i = currentTurn.startRow - 1; i > currentTurn.endRow; i--) {
                if (board[i][currentTurn.startCol] != null) {
                    return false;
                }
            }
        } else {
            for (int i = currentTurn.startRow+1; i < currentTurn.endRow; i++) {
                if (board[i][currentTurn.startCol] != null) {
                    return false;
                }
            }
        }
        return true;
    }


        public boolean unobstructedPathInRowExists(Turn currentTurn) {
       int start=Math.min(currentTurn.startCol,currentTurn.endCol);
       int end= Math.max(currentTurn.startCol,currentTurn.endCol);


            for (int i = start; i < end; i++) {
            if (this.board[currentTurn.startRow][i] != null) {
                return false;
            }
        }
        return true;
    }

    //for diagonals, add or subtract one to row then column separately then check if it is null repeatedly for
    // every diagonal unit of movement
    //the difference between the position for diagonals can be changed by a positive or negative integer value
    public boolean unobstructedPathInDiagonalExist(Turn currentTurn) { // it works!
        //bottom-left
        if (currentTurn.startRow < currentTurn.endRow && currentTurn.startCol > currentTurn.endCol) {
            int l = currentTurn.startCol;
            for (int i = currentTurn.startRow; i < currentTurn.endRow; i++) {
                if (board[i + 1][l - 1] != null) {

                    return false;
                }
                l--;

            }
        }
        if (currentTurn.startRow > currentTurn.endRow && currentTurn.startCol > currentTurn.endCol) {
            int l = currentTurn.startCol;
            for (int i = currentTurn.startRow; i > currentTurn.endRow; i--) {
                if (board[i - 1][l - 1] != null) {

                    return false;
                }
                l--;

            }
        }
        if (currentTurn.startRow > currentTurn.endRow && currentTurn.startCol < currentTurn.endCol) {
            int l = currentTurn.startCol;
            for (int i = currentTurn.startRow; i > currentTurn.endRow; i--) {
                if (board[i - 1][l + 1] != null) {

                    return false;
                }
                l++;

            }
        }
        if (currentTurn.startRow < currentTurn.endRow && currentTurn.startCol < currentTurn.endCol) {
            int l = currentTurn.startCol;
            for (int i = currentTurn.startRow; i < currentTurn.endRow; i++) {
                if (board[i + 1][l + 1] != null) {

                    return false;
                }
                l++;

            }
        }

        return true;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("  A B C D E F G H \n");
        int i = 1;
        for (Piece[] row : board) {
            sb.append(i).append(" ");
            i++;
            for (Piece piece : row) {
                if (piece != null) {
                    sb.append(piece).append(" ");
                } else {
                    sb.append("-").append(" ");
                }
            }
            sb.append("\n");
            // after the final piece is printed, a /n is placed
            // we need to make an exception for that final line
        }
        return sb.toString();
    }
    public void printBoard(){System.out.println(this.toString());}


    public void setPiece(Piece piece, int row, int col){

        this.board[row][col] = piece;
    }
}