package com.td1.personnage;
import com.td1.Deplacement.Deplacement;
import com.td1.Deplacement.DeplacementCourse;
import com.td1.armes.Arme;

public class Personnage  {

    private String nom;

    private Arme monArme;
    protected Deplacement monDeplacement;

    public Personnage(String nom, Arme arme) {
         this.monArme = arme;
    	 this.nom = nom;
    	 this.monDeplacement = new DeplacementCourse();
    }

    public String seBattre(){ return this.monArme.seBattre(); }

    public String seDeplace(){ return this.monDeplacement.seDeplace(); }

    public String toString(){ return nom; }

    public void changerArme(Arme arme){
    	 this.monArme = arme;
     }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Arme getMonArme() {
        return monArme;
    }

    public void setMonArme(Arme monArme) {
        this.monArme = monArme;
    }
}
