package chess;

import boardgame.Position;

public class ChessPosition {
  private int row;
  private char column;

  public ChessPosition(int row, char column) {
    if (column < 'a' || column > 'h' || row < 1 || row > 8)
      throw new ChessException("Error instantiating ChessPosition: Coordinates must be between A1 and H8");

    this.row = row;
    this.column = column;
  }

  public int getRow() {
    return row;
  }

  public void setRow(int row) {
    this.row = row;
  }

  public char getColumn() {
    return column;
  }

  protected Position toPosition() {
    return new Position(8 - row, column - 'a');
  }

  protected ChessPosition toChessPosition(Position position) {
    return new ChessPosition(8 - position.getRow(), (char) ('a' - position.getColumn()));
  }

  @Override
  public String toString() {
    return String.format("%c%d", column, row);
  }
}
