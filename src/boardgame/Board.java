package boardgame;

import java.util.List;

public class Board {
  private int rows;
  private int columns;
  private List<Piece> pieces;

  public Board(int rows, int columns, List<Piece> pieces) {
    this.rows = rows;
    this.columns = columns;
    this.pieces = pieces;
  }

  public int getRows() {
    return rows;
  }

  public void setRows(int rows) {
    this.rows = rows;
  }

  public int getColumns() {
    return columns;
  }

  public void setColumns(int columns) {
    this.columns = columns;
  }

  public List<Piece> getPieces() {
    return pieces;
  }

  public void setPieces(List<Piece> pieces) {
    this.pieces = pieces;
  }

  public Piece piece(int row, int column) {
  }

  public Piece piece(Position pos) {
  }

  public void placePiece(Piece piece, Position pos) {
  }

  public Piece removePiece(Position position) {
  }

  public boolean positionExists(Position pos) {
  }

  public boolean isThereAnyPieces(Position pos) {
  }
}
