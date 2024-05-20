package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
  private Board board;

  public ChessMatch() {
    board = new Board(8, 8);
    initialSetup();
  }

  public ChessPiece[][] getPieces() {
    ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
    for (int i = 0; i < board.getRows(); i++) {
      for (int j = 0; j < board.getColumns(); j++) {
        mat[i][j] = (ChessPiece) board.piece(i, j);
      }
    }

    return mat;
  }

  private void placeNewPiece(int row, char column, ChessPiece piece) {
    board.placePiece(piece, new ChessPosition(row, column).toPosition());
  }

  private void initialSetup() {
    placeNewPiece(2, 'c', new King(board, Color.WHITE));
    placeNewPiece(2, 'd', new Rook(board, Color.WHITE));
    placeNewPiece(2, 'e', new Rook(board, Color.WHITE));
    placeNewPiece(2, 'f', new Rook(board, Color.WHITE));
    placeNewPiece(2, 'g', new King(board, Color.WHITE));

    placeNewPiece(7, 'c', new King(board, Color.BLACK));
    placeNewPiece(7, 'd', new Rook(board, Color.BLACK));
    placeNewPiece(7, 'e', new Rook(board, Color.BLACK));
    placeNewPiece(7, 'f', new Rook(board, Color.BLACK));
    placeNewPiece(7, 'g', new King(board, Color.BLACK));

  }
}
