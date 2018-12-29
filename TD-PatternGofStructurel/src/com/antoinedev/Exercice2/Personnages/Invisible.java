package com.antoinedev.Exercice2.Personnages;

public class Invisible extends Pouvoir{

	public Invisible(String nom, Personnage personnage) {
		super(nom, personnage);
	}
	
	public String seDeplacer() {
        return super.seDeplacer() + "\n" + nom + " devient invisible!!";
    }

}
