package com.antoinedev.Exercice2.Personnages;

public class Tauren extends Personnage {

    public Tauren(String nom) {
    		super(nom);
    }

    public String seDeplacer() {
    		return "Le tauren de nom "+ nom + " commence à avancer.";
    }

}