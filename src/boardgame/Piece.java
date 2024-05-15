package boardgame;

public class Piece {
  protected Position position;
  private Board board;

  public Piece(Board board) {
    this.board = board;
  }

  protected Board getBoard() {
    return board;
  }

  public boolean[][] possibleMoves() {
    return new boolean[2][2];
  }

  public boolean possibleMove(Position position) {
    return true;
  }

  public boolean isThereAnyPossibleMove() {
    return true;
  }
}