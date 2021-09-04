package com.chb.entities;

import java.io.Serializable;

public class Coach implements Serializable {
    private String codeCoach;
    private String nomCoach;

    public Coach() {
        super();
    }

    public Coach(String codeCoach, String nomCoach) {
        super();
        this.codeCoach = codeCoach;
        this.nomCoach = nomCoach;
    }

    public String getCodeCoach() {
        return codeCoach;
    }

    public void setCodeCoach(String codeCoach) {
        this.codeCoach = codeCoach;
    }

    public String getNomCoach() {
        return nomCoach;
    }

    public void setNomCoach(String nomCoach) {
        this.nomCoach = nomCoach;
    }
}
