package com.chb.entities;

public class Gold extends Formule{
    private int nbrRdv;

    public Gold() {

    }

    public Gold(double poidsActuel, String antFamilliaux, String antMedicaux, Boolean cureEnPause, int nbrRdv) {
        super(poidsActuel, antFamilliaux, antMedicaux, cureEnPause);
        this.nbrRdv = nbrRdv;
    }

    public int getNbrRdv() {
        return nbrRdv;
    }

    public void setNbrRdv(int nbrRdv) {
        this.nbrRdv = nbrRdv;
    }
}

