package controller;

import enumeration.AlimentationTypeENUM;
import enumeration.NomPieceENUM;

/**
 * Created by g.dromer on 09/04/14.
 */
public class Cuisiniere {

    private AlimentationTypeENUM alimentationType ;
    private Piece nomPiece ;

    public Cuisiniere(AlimentationTypeENUM alimentationType, Piece nomPiece) {
        this.alimentationType = alimentationType;
        this.nomPiece = nomPiece;
    }

    public AlimentationTypeENUM getAlimentationType() {
        return alimentationType;
    }

    public void setAlimentationType(AlimentationTypeENUM alimentationType) {
        this.alimentationType = alimentationType;
    }

    public Piece getNomPiece() {
        return nomPiece;
    }

    public void setNomPiece(Piece nomPiece) {
        this.nomPiece = nomPiece;
    }
}
