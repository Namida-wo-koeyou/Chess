public abstract class Piece{
    String rank;
    ChessColor color;
    ChessSymbols symbol;


    public Piece(String rank, ChessColor color, ChessSymbols symbol) {
        this.rank = rank;
        this.color = color;
        this.symbol = symbol;
    }

    public String toString() {
        return Character.toString(this.symbol.getSymbol());
    }
public abstract boolean validMove(Turn currentTurn, Board board);
}

