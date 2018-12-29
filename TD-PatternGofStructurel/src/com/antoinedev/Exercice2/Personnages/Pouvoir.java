package com.antoinedev.Exercice2.Personnages;

public class Pouvoir extends Personnage {

	protected Personnage personnage;
	
    public Pouvoir(String nom, Personnage personnage) {
    		super(nom);
    		this.personnage = personnage;
    }    

    public String seDeplacer() {
        return personnage.seDeplacer();
    }

}