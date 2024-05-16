package boardgame;

public class Board {
  private int rows;
  private int columns;
  private Piece[][] pieces;

  public Board(int rows, int columns) {
    if (rows < 1 || columns < 1) {
      throw new BoardException("Error while creating board: The board must have at least 1 row and column.");
    }

    this.rows = rows;
    this.columns = columns;
    this.pieces = new Piece[rows][columns];
  }

  public int getRows() {
    return rows;
  }

  public int getColumns() {
    return columns;
  }

  public Piece piece(int row, int column) {
    if (!positionExists(row, column)) {
      throw new BoardException("This position does not exist.");
    }

    return pieces[row][column];
  }

  public Piece piece(Position pos) {
    if (!positionExists(pos)) {
      throw new BoardException("This position does not exist.");
    }

    return pieces[pos.getRow()][pos.getColumn()];
  }

  public void placePiece(Piece piece, Position pos) {
    pieces[pos.getRow()][pos.getColumn()] = piece;
    piece.position = pos;
  }

  public Piece removePiece(Position position) {
    Piece piece = pieces[position.getRow()][position.getColumn()];
    pieces[position.getRow()][position.getColumn()] = null;
    return piece;
  }

  private boolean positionExists(int row, int column) {
    return row >= 0 && rows < rows && column >= 0 && column < columns;
  }

  public boolean positionExists(Position pos) {
    return positionExists(pos.getRow(), pos.getColumn());
  }

  public boolean areThereAnyPieces(Position pos) {
    return pieces[pos.getRow()][pos.getColumn()] != null;
  }
}
