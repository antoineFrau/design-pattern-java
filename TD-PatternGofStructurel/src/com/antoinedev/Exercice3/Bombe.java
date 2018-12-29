package com.antoinedev.Exercice3;

public class Bombe extends Boite {

    public Bombe() {
    }

    public void Ouvrir(Personnage p) {
    		System.out.println(p.getNom() + " a malheureusement ouvert une boite BOMBE : il meurt !!");
    		p.setStatus(false);
    }

}