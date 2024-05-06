public enum ChessSymbols {
    WHITE_PAWN('♙'),
    WHITE_ROOK('♖'),
    WHITE_KNIGHT('♘'),
    WHITE_BISHOP('♗'),
    WHITE_KING('♔'),
    WHITE_QUEEN('♕'),
    BLACK_PAWN('♟'),
    BLACK_ROOK('♜'),
    BLACK_KNIGHT('♞'),
    BLACK_BISHOP('♝'),
    BLACK_KING('♚'),
    BLACK_QUEEN('♛');

private char symbol;

ChessSymbols(char symbol) {this.symbol = symbol; }

public char getSymbol() {return this.symbol; }


}
