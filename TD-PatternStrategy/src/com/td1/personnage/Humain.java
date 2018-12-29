package com.td1.personnage;

import com.td1.Deplacement.Deplacement;
import com.td1.Deplacement.DeplacementMarche;
import com.td1.armes.Arme;

public class Humain extends Personnage {

    public Humain(String nom, Arme arme) {
        super(nom, arme);
        this.monDeplacement = new DeplacementMarche();
    }

    @Override
    public String toString() {
        return super.toString()+ "  ( " + this.getClass().getSimpleName() + " ) ";
    }

    public void changerDeplacement(Deplacement dep){
        this.monDeplacement = dep;
    }
}
