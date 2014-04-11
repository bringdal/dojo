package controller;

import enumeration.NomPieceENUM;

/**
 * Created by g.dromer on 09/04/14.
 */
public class Piece {
    private NomPieceENUM nomPieceENUM ;

    public Piece(NomPieceENUM nomPieceENUM) {
        this.nomPieceENUM = nomPieceENUM;
    }

    public NomPieceENUM getNomPieceENUM() {
        return nomPieceENUM;
    }

    public void setNomPieceENUM(NomPieceENUM nomPieceENUM) {
        this.nomPieceENUM = nomPieceENUM;
    }
}
