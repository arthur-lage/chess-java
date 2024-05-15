package boardgame;

public class Piece {
  private Position position;

  public Piece(Position position) {
    this.position = position;
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

  public Position getPosition() {
    return position;
  }

  public void setPosition(Position position) {
    this.position = position;
  }
}