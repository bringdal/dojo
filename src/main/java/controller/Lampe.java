package controller;

import enumeration.CouleurENUM;
import enumeration.LampeENUM;
import enumeration.NomPieceENUM;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by g.dromer on 09/04/14.
 */
public class Lampe {

    @Autowired
    Ampoule ampoule ;

    private boolean alimentation = false;
    private int etage ;
    private LampeENUM type ;
    private CouleurENUM couleur ;
    private Piece nomPiece;

    public Lampe(Ampoule ampoule, boolean alimentation, LampeENUM type, CouleurENUM couleur, int etage, Piece nomPiece) {
        this.ampoule = ampoule;
        this.alimentation = alimentation;
        this.type = type;
        this.couleur = couleur;
        this.etage = etage;
        this.nomPiece = nomPiece;
    }

    public void setAlimentation(boolean alimentation) {
        ampoule.setStatus(alimentation);
        this.alimentation = alimentation;
    }

    public boolean isAlimentation() {
        return alimentation;
    }

    public Ampoule getAmpoule() {
        return ampoule;
    }

    public void setAmpoule(Ampoule ampoule) {
        this.ampoule = ampoule;
    }

    public LampeENUM getType() {
        return type;
    }

    public void setType(LampeENUM type) {
        this.type = type;
    }

    public CouleurENUM getCouleur() {
        return couleur;
    }

    public void setCouleur(CouleurENUM couleur) {
        this.couleur = couleur;
    }

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    public Piece getNomPiece() {
        return nomPiece;
    }

    public void setNomPiece(Piece nomPiece) {
        this.nomPiece = nomPiece;
    }
}
