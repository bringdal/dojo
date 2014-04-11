package controller;

/**
 * Created by g.dromer on 09/04/14.
 */
public class Meuble {
    private Piece piece ;

    public Meuble(Piece piece) {
        this.piece = piece;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
