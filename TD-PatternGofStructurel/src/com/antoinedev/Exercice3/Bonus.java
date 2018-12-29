package com.antoinedev.Exercice3;

public class Bonus extends Boite {

	private int valeur;
	
    public Bonus(int v) {
    		valeur = v;
    }

    public void Ouvrir(Personnage p) {
    		System.out.println(p.getNom() + " a ouvert une boite Bonus : il gagne " + valeur + " euros!!");
		p.setArgent(valeur);
    }

}