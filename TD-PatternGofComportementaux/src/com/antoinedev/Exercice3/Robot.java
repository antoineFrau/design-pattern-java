package com.antoinedev.Exercice3;

public class Robot {
	private String nom;
	private Position pos;
	public Robot(String nom){
		this.nom=nom;
		this.pos=new Position();
	}
	public void avancer(int distance){
		pos.avancer(distance);
		System.out.println(nom + " avance de " + distance +  " : nouvelle position " + pos);
	}
	public void reculer(int distance){
		pos.reculer(distance);
		System.out.println(nom + " recule de " + distance +  " : nouvelle position " + pos);
	}
	public void tournerGauche(){
		pos.tournerGauche();
		System.out.println(nom + " tourne � gauche : nouvelle position " + pos);
	}
	public void tournerDroite(){
		pos.tournerDroite();
		System.out.println(nom + " tourne � droite : nouvelle position " + pos);

	}
	public String toString(){
		return "Robot " + nom + " : "+ pos;
	}
	public void sauter(int hauteur){
		System.out.println(nom + " saute de " + hauteur +  " : nouvelle position " + pos);
	}



}
