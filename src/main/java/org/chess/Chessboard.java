package org.chess;

import org.chess.pieces.Coordinates;
import org.chess.pieces.Piece;
import org.chess.pieces.Vertical;

import java.util.HashMap;

public class Chessboard {
    HashMap<Coordinates, Piece> pieces = new HashMap<>();

    public void setPiece(Coordinates coordinates, Piece piece) {
        piece.coordinates = coordinates;
        pieces.put(coordinates, piece);
    }

    public void setupDefaultPiecePosition {
        for (Vertical vertical : Vertical.values()) {
            setPiece();//Black
            setPiece();//White
        }
    }
}
