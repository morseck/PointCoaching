package com.chb.entities;

public class Basic extends Formule{
    private int nbrRdv;

    public Basic() {

    }

    public Basic(double poidsActuel, String antFamilliaux, String antMedicaux, Boolean cureEnPause, int nbrRdv) {
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
