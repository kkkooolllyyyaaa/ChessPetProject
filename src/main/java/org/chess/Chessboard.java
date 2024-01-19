package org.chess;

import org.chess.pieces.Coordinates;
import org.chess.pieces.Piece;

import java.util.HashMap;

public class Chessboard {
    HashMap<Coordinates, Piece> pieces = new HashMap<>();

    public void setPiece(Piece piece, Coordinates coordinates) {
        piece.coordinates = coordinates;
        pieces.put(coordinates, piece);
    }
}
