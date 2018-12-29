package com.antoinedev.Exercice3;

import java.util.ArrayList;

public class Piece {

	private String nom;
	
	private ArrayList<Boite> lesBoites;
	//ArrayList<String> arrList = new ArrayList<String>(); 

    public Piece(String nom, ArrayList<Boite> lesBoites) {
    		this.nom = nom;
    		this.lesBoites = lesBoites;
    		System.out.println("CREATION DE LA PIECE " + nom + " contenant " + lesBoites.size() + " boites");
    		int i = 1;
    		for (Boite b : lesBoites) 
    		{ 
    			System.out.println("- boite N°" + i + " : boite " + b.getClass());
    			i++;
    		}
    }

    public void choisir(int choix) {
        // TODO implement here
    }

	public String getNom() {
		return nom;
	}

	public ArrayList<Boite> getLesBoites() {
		return lesBoites;
	}

}