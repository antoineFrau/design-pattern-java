package com.antoinedev.Exercice2;

public class BaseMilitaire extends Communicaiton{

    private boolean etatBase;
    private String nom;

    public BaseMilitaire(String nom) {
        this.etatBase = false;
        this.nom = nom;
    }

    public boolean getEtatBase() {
        return etatBase;
    }

    public void setEtatBase(boolean etatBase) {
        this.etatBase = etatBase;
        super.notifyDefenseur();
    }

    public String getNom() {
        return nom;
    }

}
