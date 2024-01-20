package org.chess;

import org.chess.pieces.*;
import org.chess.pieces.Horizontal;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public class Chessboard {
    HashMap<Coordinates, Piece> pieces = new HashMap<>();

    public void setPiece(Coordinates coordinates, @NotNull Piece piece) {
        piece.coordinates = coordinates;
        pieces.put(coordinates, piece);
    }

    public boolean isSquareEmpty(Coordinates coordinates){
        return !pieces.containsKey(coordinates);
    }

    public Piece getPiece(Coordinates coordinates){
        return pieces.get(coordinates);
    }

    public void setupDefaultPiecePosition {
        for (Horizontal horizontal : Horizontal.values()) {
            setPiece(new Coordinates(horizontal,2), new Pawn(Color.WHITE, new Coordinates(horizontal,2)));
            setPiece(new Coordinates(horizontal,7),new Pawn(Color.BLACK, new Coordinates(horizontal, 7)));
        }
    }
    public static void isSquareDark(){
        return ((coordinates.horizontal.ordinal() + 1)+coordinates.vertical)%2) == 0;
    }
}
