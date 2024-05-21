package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
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

  private void validateSourcePosition(Position sourcePosition) {
    if (!board.areThereAnyPieces(sourcePosition)) {
      throw new ChessException("There are no pieces in the source position.");
    }
  }

  private Piece makeMove(Position sourcePosition, Position targetPosition) {
    Piece piece = board.removePiece(sourcePosition);
    Piece capturedPiece = board.removePiece(targetPosition);

    board.placePiece(piece, targetPosition);

    return capturedPiece;
  }

  public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition) {
    validateSourcePosition(sourcePosition.toPosition());

    Piece capturedPiece = makeMove(sourcePosition.toPosition(), targetPosition.toPosition());

    return (ChessPiece) capturedPiece;
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
