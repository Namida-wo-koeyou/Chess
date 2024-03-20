public class Board {
      public Piece[][] board = new Piece[8][8];


      public void newBoard () {
         this.board[0][0] = new Rook("RookR", ChessColor.BLACK);
         this.board[1][0] = new Knight("KnightR", ChessColor.BLACK);
         this.board[2][0] = new Bishop("BishopR", ChessColor.BLACK);
         this.board[3][0] = new King("King", ChessColor.BLACK);
         this.board[4][0] = new Queen("Queen", ChessColor.BLACK);
         this.board[5][0] = new Bishop("BishopL", ChessColor.BLACK);
         this.board[6][0] = new Knight("KnightL", ChessColor.BLACK);
         this.board[7][0] = new Rook("RookL", ChessColor.BLACK);

         this.board[0][1] = new Pawn("Pawn", ChessColor.BLACK);
         this.board[1][1] = new Pawn("Pawn", ChessColor.BLACK);
         this.board[2][1] = new Pawn("Pawn", ChessColor.BLACK);
         this.board[3][1] = new Pawn("Pawn", ChessColor.BLACK);
         this.board[4][1] = new Pawn("Pawn", ChessColor.BLACK);
         this.board[5][1] = new Pawn("Pawn", ChessColor.BLACK);
         this.board[6][1] = new Pawn("Pawn", ChessColor.BLACK);
         this.board[7][1] = new Pawn("Pawn", ChessColor.BLACK);

         this.board[0][7] = new Rook("RookL", ChessColor.WHITE);
         this.board[1][7] = new Knight("KnightL", ChessColor.WHITE);
         this.board[2][7] = new Bishop("BishopL", ChessColor.WHITE);
         this.board[3][7] = new Queen("Queen", ChessColor.WHITE);
         this.board[4][7] = new King("King", ChessColor.WHITE);
         this.board[5][7] = new Bishop("BishopR", ChessColor.WHITE);
         this.board[6][7] = new Knight("KnightR", ChessColor.WHITE);
         this.board[7][7] = new Rook("RookR", ChessColor.WHITE);

         this.board[0][6] = new Pawn("Pawn", ChessColor.WHITE);
         this.board[1][6] = new Pawn("Pawn", ChessColor.WHITE);
         this.board[2][6] = new Pawn("Pawn", ChessColor.WHITE);
         this.board[3][6] = new Pawn("Pawn", ChessColor.WHITE);
         this.board[4][6] = new Pawn("Pawn", ChessColor.WHITE);
         this.board[5][6] = new Pawn("Pawn", ChessColor.WHITE);
         this.board[6][6] = new Pawn("Pawn", ChessColor.WHITE);
         this.board[7][6] = new Pawn("Pawn", ChessColor.WHITE);
      }


   /*public static void showBoard() {
      for (int row = 0; row < board.length; row++) {
         System.out.println();
         System.out.println("-----------------");
         for (int col = 0; col < board[row].length; col++) {
            if (board[row][col] != null) {
               System.out.print("|" + board[row][col]);
            } else {
               System.out.print("| ");

            }
         }
         System.out.print("|");

      }
   }
   public static void main(String[] args) {
      // Initialize the board (empty)
      showBoard();
}*/
}