package com.chb.entities;

import java.io.Serializable;

public class Formule implements Serializable {
    private Long codeFormule;
    private double poidsActuel;
    private String antFamilliaux;
    private String antMedicaux;
    private Boolean cureEnPause;

    public Formule() {
        super();
    }

    public Formule(double poidsActuel, String antFamilliaux, String antMedicaux, Boolean cureEnPause) {
        super();
        this.poidsActuel = poidsActuel;
        this.antFamilliaux = antFamilliaux;
        this.antMedicaux = antMedicaux;
        this.cureEnPause = cureEnPause;
    }

    public Long getCodeFormule() {
        return codeFormule;
    }

    public void setCodeFormule(Long codeFormule) {
        this.codeFormule = codeFormule;
    }

    public double getPoidsActuel() {
        return poidsActuel;
    }

    public void setPoidsActuel(double poidsActuel) {
        this.poidsActuel = poidsActuel;
    }

    public String getAntFamilliaux() {
        return antFamilliaux;
    }

    public void setAntFamilliaux(String antFamilliaux) {
        this.antFamilliaux = antFamilliaux;
    }

    public String getAntMedicaux() {
        return antMedicaux;
    }

    public void setAntMedicaux(String antMedicaux) {
        this.antMedicaux = antMedicaux;
    }

    public Boolean getCureEnPause() {
        return cureEnPause;
    }

    public void setCureEnPause(Boolean cureEnPause) {
        this.cureEnPause = cureEnPause;
    }
}
