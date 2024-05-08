
import java.util.Scanner;
/*TODO: deny white from moving black's pieces and deny black from moving white's pieces
 */

public class Game {

    public static void main(String[] args) {
        GameState game = new GameState();

        Board board = game.board;
        board.printBoard();


        while (true) {

            Scanner moveSelect = new Scanner(System.in);
            System.out.println("Select the row and column of the piece you would like to move");



            ChessColor currentPlayer = game.currentPlayer;
            System.out.println("the current player's color is "+ currentPlayer);
            if ((game.totalTurnCounter % 2) == 0) {
                game.turnWhiteCounter++;

            } else {
                game.turnBlackCounter++;
            }

            game.totalTurnCounter = game.turnBlackCounter + game.turnWhiteCounter;
            int startRow = moveSelect.nextInt() - 1;
            int startCol = moveSelect.nextInt() - 1;
            while (startCol >= 8|| startRow>=8){

                System.out.println("This selection is invalid");
                if(startRow>=8 && startCol>=8){
                    System.out.println("");
                }
                if (startRow>=8) {
                    System.out.println("type your row value 1-8");
                    startRow= moveSelect.nextInt();
                }else{
                    System.out.println("type your row value 1-8");
                    startCol= moveSelect.nextInt();
                }
            }

            if (board.board[startRow][startCol] != null) {
                Piece piece = board.board[startRow][startCol];
                System.out.println("Select the row and column of where you want your piece to be");


                int endRow = moveSelect.nextInt() - 1;

                int endCol = moveSelect.nextInt() - 1;

               Turn currentTurn = new Turn(startRow, startCol, endRow, endCol, currentPlayer);

                if (board.board[startRow][startCol].color != currentTurn.color) {
                    System.out.println("Only move your own pieces");
                    if (currentTurn.color == ChessColor.BLACK) {game.turnBlackCounter--;
                    } else {game.turnWhiteCounter--;}
                        game.totalTurnCounter--;
                        board.printBoard();
                    continue;
                }
                //change the white turn into a currentTurn which would equal whoever turn it is
                if (piece.validMove(currentTurn, board)) {
                    // store Board.board[startRow][startCol] in a variable to then assign to null
                    Piece i = board.board[startRow][startCol];
                    board.board[endRow][endCol] = board.board[startRow][startCol];
                    board.board[startRow][startCol] = null;
                    System.out.println((board.toString()));
                    game.nextPlayer();
                } else if (currentTurn.color == ChessColor.BLACK) {
                    System.out.println("This move is invalid.");
                    game.turnBlackCounter--;
                    game.totalTurnCounter--;
                    board.printBoard();
                } else {
                    System.out.println("This move is invalid.");
                    game.turnWhiteCounter--;
                    game.totalTurnCounter--;
                    board.printBoard();
                }
            }else if  ((game.totalTurnCounter % 2) == 0) {
                System.out.println("This selection is invalid.");
                game.turnBlackCounter--;
                game.totalTurnCounter--;
                board.printBoard();
            } else {

                game.turnWhiteCounter--;
                game.totalTurnCounter--;
                board.printBoard();
                System.out.println("This selection is invalid.");
        }
    }}}

