package com.td1.personnage;

import com.td1.armes.Arme;

public class Orc extends Personnage {

    public Orc(String nom, Arme arme) {
        super(nom, arme);
    }

    @Override
    public String toString() {
        return super.toString()+ "  ( " + this.getClass().getSimpleName() + " ) ";
    }
}
