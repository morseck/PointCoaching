package com.chb.entities;

import java.io.Serializable;
import java.util.Date;

public class Point implements Serializable {
    private Long codePoint;
    private Date datePoint;
    private double poidsPerdus;
    private String semaine;
    private Boolean routineAlimentaire;
    private Boolean mindfulEating;
    private Boolean hydratation;
    private Boolean sport;
    private String infosSupplementaire;
    private Boolean stress;
    private Boolean sommeil;
    private Coach coach;
    private Client client;
    private Formule formule;
    private ResumeRdv resumeRdv;

    public Point() {
        super();
    }

    public Point(Date datePoint, double poidsPerdus, String semaine, Boolean routineAlimentaire, Boolean mindfulEating, Boolean hydratation, Boolean sport, String infosSupplementaire, Boolean stress, Boolean sommeil, Coach coach, Client client, Formule formule, ResumeRdv resumeRdv) {
        super();
        this.datePoint = datePoint;
        this.poidsPerdus = poidsPerdus;
        this.semaine = semaine;
        this.routineAlimentaire = routineAlimentaire;
        this.mindfulEating = mindfulEating;
        this.hydratation = hydratation;
        this.sport = sport;
        this.infosSupplementaire = infosSupplementaire;
        this.stress = stress;
        this.sommeil = sommeil;
        this.coach = coach;
        this.client = client;
        this.formule = formule;
        this.resumeRdv = resumeRdv;
    }

    public Long getCodePoint() {
        return codePoint;
    }

    public void setCodePoint(Long codePoint) {
        this.codePoint = codePoint;
    }

    public Date getDatePoint() {
        return datePoint;
    }

    public void setDatePoint(Date datePoint) {
        this.datePoint = datePoint;
    }

    public double getPoidsPerdus() {
        return poidsPerdus;
    }

    public void setPoidsPerdus(double poidsPerdus) {
        this.poidsPerdus = poidsPerdus;
    }

    public String getSemaine() {
        return semaine;
    }

    public void setSemaine(String semaine) {
        this.semaine = semaine;
    }

    public Boolean getRoutineAlimentaire() {
        return routineAlimentaire;
    }

    public void setRoutineAlimentaire(Boolean routineAlimentaire) {
        this.routineAlimentaire = routineAlimentaire;
    }

    public Boolean getMindfulEating() {
        return mindfulEating;
    }

    public void setMindfulEating(Boolean mindfulEating) {
        this.mindfulEating = mindfulEating;
    }

    public Boolean getHydratation() {
        return hydratation;
    }

    public void setHydratation(Boolean hydratation) {
        this.hydratation = hydratation;
    }

    public Boolean getSport() {
        return sport;
    }

    public void setSport(Boolean sport) {
        this.sport = sport;
    }

    public String getInfosSupplementaire() {
        return infosSupplementaire;
    }

    public void setInfosSupplementaire(String infosSupplementaire) {
        this.infosSupplementaire = infosSupplementaire;
    }

    public Boolean getStress() {
        return stress;
    }

    public void setStress(Boolean stress) {
        this.stress = stress;
    }

    public Boolean getSommeil() {
        return sommeil;
    }

    public void setSommeil(Boolean sommeil) {
        this.sommeil = sommeil;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Formule getFormule() {
        return formule;
    }

    public void setFormule(Formule formule) {
        this.formule = formule;
    }

    public ResumeRdv getResumeRdv() {
        return resumeRdv;
    }

    public void setResumeRdv(ResumeRdv resumeRdv) {
        this.resumeRdv = resumeRdv;
    }
}
