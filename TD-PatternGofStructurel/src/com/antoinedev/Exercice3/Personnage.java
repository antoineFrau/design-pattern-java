package com.antoinedev.Exercice3;

import java.util.ArrayList;

public class Personnage {

    private String nom;

    private int argent;

    private boolean status;

    private ArrayList<Piece> lesPieces;

	
    public Personnage(String nom, ArrayList<Piece> lesPieces) {
    		this.nom = nom;
    		argent = 0;
    		status = true;
    		this.lesPieces = lesPieces;
    }
    
    public String getNom() {
		return nom;
	}

    public boolean getStatus() {
		return status;
	}

    public void setStatus(boolean status) {
		this.status = status;
	}
    
    public void setArgent(int i) {
		argent += i;
	}

    public void Statut() {
    		if(status)
    			System.out.println(nom + " est en vie et possède " + argent + " euros");
    		else
    			System.out.println(nom + " est mort");
    }

    public void Rentrer(int choix) {
    		System.out.println(nom + " entre dans la pièce " + lesPieces.get(choix).getNom() + " qui contient " + lesPieces.get(choix).getLesBoites().size() + " boites");
    }
    
    public void Ouvrir(int choix) {
    		if (choix < 0) {
    			System.out.println("Il décide d'ouvrir toutes les boites");
    			int i = 1;
    			ArrayList<Boite> lb = lesPieces.get(0).getLesBoites();
    			for (Boite b : lb) {
    				System.out.println("-Ouverture de la boite N° "+ i);
    				b.Ouvrir(this);
    				if(!status)
    					return;
    				i++;
    			}
    		}
    		else {
    			System.out.println("Il décide d'ouvrir la boite numéro "+ (choix+1));
    			lesPieces.get(0).getLesBoites().get(choix).Ouvrir(this);
    		}
    }

}