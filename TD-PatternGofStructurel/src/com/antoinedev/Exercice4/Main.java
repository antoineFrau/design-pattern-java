package com.antoinedev.Exercice4;

public class Main {

	public static void main(String[] args) {
		System.out.println("Affichage de la fiche vehicule");
		FicheVehicule pp = new PreviewProxy("leFilmeNumero5.jpg");
		System.out.println("Demande de visualisation du film");
		pp.visualiserFilm();
	}

}
