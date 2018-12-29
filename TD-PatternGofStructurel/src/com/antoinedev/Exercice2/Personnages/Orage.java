package com.antoinedev.Exercice2.Personnages;

public class Orage extends Pouvoir{

	public Orage(String nom, Personnage personnage) {
		super(nom, personnage);
	}
	
	public String seDeplacer() {
        return super.seDeplacer() + "\n" + nom + " déclenche un orage!!";
    }
}