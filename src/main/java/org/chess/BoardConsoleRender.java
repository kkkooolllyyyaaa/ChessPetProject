package org.chess;

import org.chess.pieces.Color;
import org.chess.pieces.Coordinates;
import org.chess.pieces.Horizontal;

public class BoardConsoleRender {

    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_WHITE_PIECE_COLOR = "\u001B[97m";
    public static final String ANSI_BLACK_PIECE_COLOR = "\u001B[30m";

    public static final String ANSI_WHITE_SQUARE_BACKGROUND = "\u001B[47m";
    public static final String ANSI_BLACK_SQUARE_BACKGROUND = "\u001B[0;100m";
    public static final String ANSI_HIGHLIGHTED_SQUARE_BACKGROUND = "\u001B[45m";

    public void render(Chessboard chessboard) {
        public void render (Chessboard chessboard) {
            for (int rank = 8; rank >=1; rank--) {
                String line = "";
                for(Horizontal horizontal : Horizontal.values()) {
                    if(chessboard.isSquareEmpty())
                    line+= getSpriteForEmptySqare(new Coordinates(horizontal,vertical));
                }

                line+=ANSI_RESET;
                System.out.println(line);
            }
        }

        private String colorizeSprite(String sprite, Color pieceColor, boolean isSquareDark) {
            String result = sprite;
            if (pieceColor == Color.WHITE) {
                result = ANSI_WHITE_PIECE_COLOR + result;
            } else {
                result = ANSI_BLACK_PIECE_COLOR + result;
            }
            if (isSquareDark){
                result = ANSI_BLACK_SQUARE_BACKGROUND + result;
            }else{
                result = ANSI_WHITE_SQUARE_BACKGROUND + result;
            }
            return result;
        }


        private String getSpriteForEmptySquare(Coordinates coordinates) {
            return " ";
        }
    }
}
