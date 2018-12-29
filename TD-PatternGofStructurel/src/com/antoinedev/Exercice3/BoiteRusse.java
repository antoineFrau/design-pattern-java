package com.antoinedev.Exercice3;

import java.util.ArrayList;

public class BoiteRusse extends Boite {

	private ArrayList<Boite> lesBoites;
	
    public BoiteRusse(ArrayList<Boite> lesBoites) {
    		this.lesBoites = lesBoites;
    }

    public void Ouvrir(Personnage p) {
    		System.out.println(p.getNom() + " ouvre une boite contenant " + lesBoites.size() + " sous-boites");
    		for (Boite b : lesBoites) {
				b.Ouvrir(p);
				if(!p.getStatus())
					return;
			}
    }

}