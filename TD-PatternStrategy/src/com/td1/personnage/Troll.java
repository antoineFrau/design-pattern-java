package com.td1.personnage;

import com.td1.armes.Arme;

public class Troll extends Personnage {

    public Troll(String nom, Arme arme) {
        super(nom, arme);
    }

    @Override
    public String toString() {
        return super.toString()+ "  ( " + this.getClass().getSimpleName() + " ) ";
    }
}
