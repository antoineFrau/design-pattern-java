package com.antoinedev.Exercice3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boite b1 = new Bonus(10000);
		Boite b2 = new Bombe();
		Boite sb1 = new Vide();
		Boite sb2 = new Bonus(5000);
		ArrayList<Boite> lsb = new ArrayList<Boite>();
		lsb.add(sb1);
		lsb.add(sb2);
		Boite b3 = new BoiteRusse(lsb);
		ArrayList<Boite> lb = new ArrayList<Boite>();
		lb.add(b1);
		lb.add(b2);
		lb.add(b3);
		Piece p = new Piece("Cuisine", lb);
		ArrayList<Piece> lp = new ArrayList<Piece>();
		lp.add(p);
		
		System.out.println("");
		System.out.println("MANIPULATION PERSONNAGE DIABLO");
		Personnage p1 = new Personnage("Diablo", lp);
		p1.Rentrer(0);
		p1.Ouvrir(-1);
		
		System.out.println("");
		System.out.println("MANIPULATION PERSONNAGE TORINO");
		Personnage p2 = new Personnage("Torino", lp);
		p2.Rentrer(0);
		p2.Ouvrir(2);
		
		System.out.println("");
		System.out.println("ETAT FINAL DES PERSONNAGES");
		p1.Statut();
		p2.Statut();
	}

}
