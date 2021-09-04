package com.chb.entities;

public class Silver extends Formule{
    private int nbrRdv;

    public Silver() {

    }

    public Silver(double poidsActuel, String antFamilliaux, String antMedicaux, Boolean cureEnPause, int nbrRdv) {
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
