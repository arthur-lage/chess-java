import chess.ChessMatch;

public class Chess {
  public static void main(String[] args) {
    System.out.println("\nCHESS\n");

    ChessMatch chessMatch = new ChessMatch();

    UI.printBoard(chessMatch.getPieces());
  }
}