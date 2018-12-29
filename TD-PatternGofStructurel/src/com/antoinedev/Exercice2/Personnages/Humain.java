package com.antoinedev.Exercice2.Personnages;

public class Humain extends Personnage {

    public Humain(String nom) {
    		super(nom);
    }

    public String seDeplacer() {
    		return "L'humain de nom "+ nom + " commence à avancer.";
    }
}