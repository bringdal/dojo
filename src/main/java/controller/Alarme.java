package controller;

/**
 * Created by g.dromer on 09/04/14.
 */
public class Alarme {

    private Piece piece ;

    public Alarme(Piece piece) {
        this.piece = piece;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

}
