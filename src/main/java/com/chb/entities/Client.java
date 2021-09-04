package com.chb.entities;

import java.io.Serializable;
import java.util.Collection;

public class Client implements Serializable {
    private Long codeClient;
    private String nomClient;
    private int ageClient;
    private double poidsClient;
    private double objectif;
    private double taille;
    private String sexe;
    private String emailClient;
    private String numClient;

    private Coach coach;
    private Formule formule;
    private Collection<Point> points;

    public Client() {
        super();
    }

    public Client(String nomClient, int ageClient, double poidsClient, double objectif, double taille, String sexe, String emailClient, String numClient, Coach coach, Formule formule) {
        super();
        this.nomClient = nomClient;
        this.ageClient = ageClient;
        this.poidsClient = poidsClient;
        this.objectif = objectif;
        this.taille = taille;
        this.sexe = sexe;
        this.emailClient = emailClient;
        this.numClient = numClient;
        this.coach = coach;
        this.formule = formule;
    }

    public Long getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(Long codeClient) {
        this.codeClient = codeClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public int getAgeClient() {
        return ageClient;
    }

    public void setAgeClient(int ageClient) {
        this.ageClient = ageClient;
    }

    public double getPoidsClient() {
        return poidsClient;
    }

    public void setPoidsClient(double poidsClient) {
        this.poidsClient = poidsClient;
    }

    public double getObjectif() {
        return objectif;
    }

    public void setObjectif(double objectif) {
        this.objectif = objectif;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    public String getNumClient() {
        return numClient;
    }

    public void setNumClient(String numClient) {
        this.numClient = numClient;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public Formule getFormule() {
        return formule;
    }

    public void setFormule(Formule formule) {
        this.formule = formule;
    }

    public Collection<Point> getPoints() {
        return points;
    }

    public void setPoints(Collection<Point> points) {
        this.points = points;
    }
}
