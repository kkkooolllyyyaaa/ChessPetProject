package org.chess.pieces;

import java.util.Objects;

public class Coordinates {
    public final Horizontal horizontal;
    public final Integer vertical;

    public Coordinates(Horizontal horizontal,Integer vertical) {
        this.horizontal = horizontal;
        this.vertical = vertical;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coordinates that)) return false;
        return horizontal == that.horizontal && Objects.equals(vertical, that.vertical);
    }

    @Override
    public int hashCode() {
        return Objects.hash(horizontal, vertical);
    }
}
