package org.chess.pieces;
//figura
abstract public class Piece {
    public final Color color;
    public Coordinates coordinates;
    public Piece(Color color, Coordinates coordinates) {
        this.color = color;
        this.coordinates = coordinates;
    }
}
