package com.antoinedev.Exercice2.Personnages;

public abstract class Personnage {
	
	protected String nom;
	
    public Personnage(String nom) {
    		this.nom = nom;
    }

    public abstract String seDeplacer();

}