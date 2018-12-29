package com.td1.personnage;

import com.td1.armes.Arme;

public class Tauren extends Personnage {

    public Tauren(String nom, Arme arme) {
        super(nom, arme);
    }

    @Override
    public String toString() {
        return super.toString()+ " ( " + this.getClass().getSimpleName() + " ) ";
    }
}
