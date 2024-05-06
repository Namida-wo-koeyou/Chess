public class GameState {
    public ChessColor[] players;
    public Board board;
    public ChessColor currentPlayer;

    public int turnWhiteCounter = 0;
    public int turnBlackCounter = 0;
    public int totalTurnCounter = 0;
    public GameState() {
        this.players = new ChessColor[2];
        this.players[0] = ChessColor.WHITE;
        this.players[1] = ChessColor.BLACK;
        this.board = new Board();
        this.board.newBoard();
        this.currentPlayer = this.players[0];
    }
    public  void nextPlayer() {

        if ((totalTurnCounter % 2) == 0) {

        currentPlayer = this.players[0];
                new Turn(0, 0, 0, 0, ChessColor.WHITE);

    } else {
        currentPlayer= this.players[1];
             new Turn(0, 0, 0, 0, ChessColor.BLACK);

    }
        }
        // this checks if move is valid for players; is the location on board and valid start has piece;
       /* public boolean validMove(){
        if (piece.validMove(currentTurn, board)) {
            // store Board.board[startRow][startCol] in a variable to then assign to null


        } else if (currentTurn.color == ChessColor.BLACK) {
            System.out.println("This move is invalid.");
            turnBlackCounter--;
        } else {
            System.out.println("This move is invalid.");
            turnWhiteCounter--;
        }}*/

}
